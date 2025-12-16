package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class tw0 {
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;
    public final String c;
    public final q85 d;
    public final v1a e;
    public final rw0 f;
    public final rw0 g;
    public final ConcurrentHashMap h;

    public tw0() {
        q85 q85Var = q85.z0;
        v1a v1aVar = v1a.w0;
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.f = new rw0(0);
        this.g = new rw0(1);
        this.h = new ConcurrentHashMap();
        this.d = q85Var;
        this.c = "default";
        this.e = v1aVar;
    }

    public static void a(Object obj, di5 di5Var) throws IllegalAccessException, IllegalArgumentException {
        try {
            di5Var.a(obj);
        } catch (InvocationTargetException e) {
            e("Could not dispatch event: " + obj.getClass() + " to handler " + di5Var, e);
            throw null;
        }
    }

    public static void b(di5 di5Var, oi5 oi5Var) throws IllegalAccessException, IllegalArgumentException {
        try {
            Object objA = oi5Var.a();
            if (objA == null) {
                return;
            }
            a(objA, di5Var);
        } catch (InvocationTargetException e) {
            e("Producer " + oi5Var + " threw an exception.", e);
            throw null;
        }
    }

    public static void e(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            StringBuilder sbO = ho7.o(str, ": ");
            sbO.append(cause.getMessage());
            throw new RuntimeException(sbO.toString(), cause);
        }
        StringBuilder sbO2 = ho7.o(str, ": ");
        sbO2.append(invocationTargetException.getMessage());
        throw new RuntimeException(sbO2.toString(), invocationTargetException);
    }

    public void c(Object obj) {
        rw0 rw0Var;
        if (obj == null) {
            throw new NullPointerException("Event to post must not be null.");
        }
        en8 en8Var = (en8) this;
        this.d.n(en8Var);
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.h;
        Set set = (Set) concurrentHashMap.get(cls);
        boolean z = false;
        if (set == null) {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(cls);
            while (!linkedList.isEmpty()) {
                Class cls2 = (Class) linkedList.remove(0);
                hashSet.add(cls2);
                Class superclass = cls2.getSuperclass();
                if (superclass != null) {
                    linkedList.add(superclass);
                }
            }
            set = (Set) concurrentHashMap.putIfAbsent(cls, hashSet);
            if (set == null) {
                set = hashSet;
            }
        }
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            rw0Var = this.f;
            if (!zHasNext) {
                break;
            }
            Set set2 = (Set) this.a.get((Class) it.next());
            if (set2 != null && !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    ((ConcurrentLinkedQueue) rw0Var.get()).offer(new sw0(obj, (di5) it2.next()));
                }
                z = true;
            }
        }
        if (!z && !(obj instanceof fg4)) {
            c(new fg4(en8Var, obj));
        }
        rw0 rw0Var2 = this.g;
        if (((Boolean) rw0Var2.get()).booleanValue()) {
            return;
        }
        rw0Var2.set(Boolean.TRUE);
        while (true) {
            try {
                sw0 sw0Var = (sw0) ((ConcurrentLinkedQueue) rw0Var.get()).poll();
                if (sw0Var == null) {
                    return;
                }
                di5 di5Var = sw0Var.b;
                if (di5Var.d) {
                    a(sw0Var.a, di5Var);
                }
            } finally {
                rw0Var2.set(Boolean.FALSE);
            }
        }
    }

    public void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Object to register must not be null.");
        }
        this.d.n((en8) this);
        v1a v1aVar = this.e;
        HashMap mapO = v1aVar.o(obj);
        Iterator it = mapO.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ConcurrentHashMap concurrentHashMap = this.b;
            ConcurrentHashMap concurrentHashMap2 = this.a;
            if (!zHasNext) {
                HashMap mapT = v1aVar.t(obj);
                for (Class cls : mapT.keySet()) {
                    Set copyOnWriteArraySet = (Set) concurrentHashMap2.get(cls);
                    if (copyOnWriteArraySet == null) {
                        copyOnWriteArraySet = new CopyOnWriteArraySet();
                        Set set = (Set) concurrentHashMap2.putIfAbsent(cls, copyOnWriteArraySet);
                        if (set != null) {
                            copyOnWriteArraySet = set;
                        }
                    }
                    if (!copyOnWriteArraySet.addAll((Set) mapT.get(cls))) {
                        throw new IllegalArgumentException("Object already registered.");
                    }
                }
                for (Map.Entry entry : mapT.entrySet()) {
                    oi5 oi5Var = (oi5) concurrentHashMap.get((Class) entry.getKey());
                    if (oi5Var != null && oi5Var.d) {
                        for (di5 di5Var : (Set) entry.getValue()) {
                            if (!oi5Var.d) {
                                break;
                            } else if (di5Var.d) {
                                b(di5Var, oi5Var);
                            }
                        }
                    }
                }
                return;
            }
            Class cls2 = (Class) it.next();
            oi5 oi5Var2 = (oi5) mapO.get(cls2);
            oi5 oi5Var3 = (oi5) concurrentHashMap.putIfAbsent(cls2, oi5Var2);
            if (oi5Var3 != null) {
                throw new IllegalArgumentException("Producer method for type " + cls2 + " found on type " + oi5Var2.a.getClass() + ", but already registered by type " + oi5Var3.a.getClass() + ".");
            }
            Set set2 = (Set) concurrentHashMap2.get(cls2);
            if (set2 != null && !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    b((di5) it2.next(), oi5Var2);
                }
            }
        }
    }

    public void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Object to unregister must not be null.");
        }
        this.d.n((en8) this);
        v1a v1aVar = this.e;
        for (Map.Entry entry : v1aVar.o(obj).entrySet()) {
            Class cls = (Class) entry.getKey();
            ConcurrentHashMap concurrentHashMap = this.b;
            oi5 oi5Var = (oi5) concurrentHashMap.get(cls);
            oi5 oi5Var2 = (oi5) entry.getValue();
            if (oi5Var2 == null || !oi5Var2.equals(oi5Var)) {
                throw new IllegalArgumentException("Missing event producer for an annotated method. Is " + obj.getClass() + " registered?");
            }
            ((oi5) concurrentHashMap.remove(cls)).d = false;
        }
        for (Map.Entry entry2 : v1aVar.t(obj).entrySet()) {
            Set<di5> set = (Set) this.a.get((Class) entry2.getKey());
            Collection<?> collection = (Collection) entry2.getValue();
            if (set == null || !set.containsAll(collection)) {
                throw new IllegalArgumentException("Missing event handler for an annotated method. Is " + obj.getClass() + " registered?");
            }
            for (di5 di5Var : set) {
                if (collection.contains(di5Var)) {
                    di5Var.d = false;
                }
            }
            set.removeAll(collection);
        }
    }

    public final String toString() {
        return ho7.l(new StringBuilder("[Bus \""), this.c, "\"]");
    }
}
