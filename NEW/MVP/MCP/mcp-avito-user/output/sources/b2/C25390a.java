package b2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.avito.android.R;
import j.N;
import j.P;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: AppInitializer.java */
/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C25390a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C25390a f56818d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f56819e = new Object();

    /* renamed from: c, reason: collision with root package name */
    @N
    public final Context f56822c;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final HashSet f56821b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    @N
    public final HashMap f56820a = new HashMap();

    public C25390a(@N Context context) {
        this.f56822c = context.getApplicationContext();
    }

    @N
    public static C25390a c(@N Context context) {
        if (f56818d == null) {
            synchronized (f56819e) {
                try {
                    if (f56818d == null) {
                        f56818d = new C25390a(context);
                    }
                } finally {
                }
            }
        }
        return f56818d;
    }

    public final void a(@P Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f56822c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f56821b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC25391b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e12) {
                throw new StartupException(e12);
            }
        }
    }

    @N
    public final Object b(@N Class cls, @N HashSet hashSet) {
        Object objA;
        if (androidx.tracing.b.d()) {
            try {
                Trace.beginSection(androidx.tracing.b.e(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f56820a;
        if (map.containsKey(cls)) {
            objA = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC25391b interfaceC25391b = (InterfaceC25391b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends InterfaceC25391b<?>>> listB = interfaceC25391b.b();
                if (!listB.isEmpty()) {
                    for (Class<? extends InterfaceC25391b<?>> cls2 : listB) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objA = interfaceC25391b.a(this.f56822c);
                hashSet.remove(cls);
                map.put(cls, objA);
            } catch (Throwable th3) {
                throw new StartupException(th3);
            }
        }
        Trace.endSection();
        return objA;
    }
}
