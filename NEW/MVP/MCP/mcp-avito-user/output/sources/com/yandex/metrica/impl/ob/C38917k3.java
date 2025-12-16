package com.yandex.metrica.impl.ob;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.yandex.metrica.impl.ob.k3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38917k3 {

    /* renamed from: a, reason: collision with root package name */
    private final c f380909a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC38961lm<Thread, StackTraceElement[], E6> f380910b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC38712bm f380911c;

    /* renamed from: com.yandex.metrica.impl.ob.k3$a */
    public class a implements c {
    }

    /* renamed from: com.yandex.metrica.impl.ob.k3$b */
    public class b implements Comparator<Thread> {
        public b(C38917k3 c38917k3) {
        }

        @Override // java.util.Comparator
        public int compare(Thread thread, Thread thread2) {
            Thread thread3 = thread;
            Thread thread4 = thread2;
            if (thread3 != thread4) {
                String name = thread3.getName();
                String name2 = thread4.getName();
                if (name != null) {
                    if (name2 == null) {
                        return 1;
                    }
                    return name.compareTo(name2);
                }
                if (name2 != null) {
                    return -1;
                }
            }
            return 0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.k3$c */
    public interface c {
    }

    public C38917k3() {
        this(new a(), new C38892j3(), P.g().j());
    }

    public C39212w6 a() {
        StackTraceElement[] stackTrace;
        ((a) this.f380909a).getClass();
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTrace = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTrace = null;
        }
        return new C39212w6(this.f380910b.a(thread, stackTrace), a(thread, null), ((Xl) this.f380911c).b());
    }

    @j.k0
    public C38917k3(@j.N c cVar, @j.N InterfaceC38961lm<Thread, StackTraceElement[], E6> interfaceC38961lm, @j.N InterfaceC38712bm interfaceC38712bm) {
        this.f380909a = cVar;
        this.f380910b = interfaceC38961lm;
        this.f380911c = interfaceC38712bm;
    }

    public List<E6> a(@j.P Thread thread) {
        StackTraceElement[] stackTrace;
        ((a) this.f380909a).getClass();
        Thread thread2 = Looper.getMainLooper().getThread();
        List<E6> listA = a(thread2, thread);
        if (thread != thread2) {
            try {
                stackTrace = thread2.getStackTrace();
            } catch (SecurityException unused) {
                stackTrace = null;
            }
            ((ArrayList) listA).add(0, this.f380910b.a(thread2, stackTrace));
        }
        return listA;
    }

    private List<E6> a(@j.N Thread thread, @j.P Thread thread2) {
        Map<Thread, StackTraceElement[]> allStackTraces;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new b(this));
        try {
            ((a) this.f380909a).getClass();
            allStackTraces = Thread.getAllStackTraces();
        } catch (SecurityException unused) {
            allStackTraces = null;
        }
        if (allStackTraces != null) {
            treeMap.putAll(allStackTraces);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add(this.f380910b.a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
