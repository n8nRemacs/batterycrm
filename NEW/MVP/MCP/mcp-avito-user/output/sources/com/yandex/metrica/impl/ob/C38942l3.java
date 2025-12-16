package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.l3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38942l3 {

    /* renamed from: a, reason: collision with root package name */
    private final Lm f380941a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<b> f380942b = new LinkedBlockingQueue();

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<C39042p3<? extends C38992n3>>> f380943c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private WeakHashMap<Object, CopyOnWriteArrayList<d>> f380944d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<Class, C38992n3> f380945e = new ConcurrentHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.l3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                C38942l3.this.getClass();
                try {
                    ((b) C38942l3.this.f380942b.take()).a();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C38992n3 f380947a;

        /* renamed from: b, reason: collision with root package name */
        private final C39042p3<? extends C38992n3> f380948b;

        public /* synthetic */ b(C38992n3 c38992n3, C39042p3 c39042p3, a aVar) {
            this(c38992n3, c39042p3);
        }

        public void a() {
            try {
                if (this.f380948b.a(this.f380947a)) {
                    return;
                }
                this.f380948b.b(this.f380947a);
            } catch (Throwable unused) {
            }
        }

        private b(C38992n3 c38992n3, C39042p3<? extends C38992n3> c39042p3) {
            this.f380947a = c38992n3;
            this.f380948b = c39042p3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private static final C38942l3 f380949a = new C38942l3();
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final CopyOnWriteArrayList<C39042p3<? extends C38992n3>> f380950a;

        /* renamed from: b, reason: collision with root package name */
        final C39042p3<? extends C38992n3> f380951b;

        public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, C39042p3 c39042p3, a aVar) {
            this(copyOnWriteArrayList, c39042p3);
        }

        public void finalize() throws Throwable {
            super.finalize();
            this.f380950a.remove(this.f380951b);
        }

        private d(CopyOnWriteArrayList<C39042p3<? extends C38992n3>> copyOnWriteArrayList, C39042p3<? extends C38992n3> c39042p3) {
            this.f380950a = copyOnWriteArrayList;
            this.f380951b = c39042p3;
        }
    }

    @j.k0
    public C38942l3() {
        Lm lmA = Mm.a("YMM-BD", new a());
        this.f380941a = lmA;
        lmA.start();
    }

    public static final C38942l3 a() {
        return c.f380949a;
    }

    public synchronized void a(C38992n3 c38992n3) {
        synchronized (this) {
            CopyOnWriteArrayList<C39042p3<? extends C38992n3>> copyOnWriteArrayList = this.f380943c.get(c38992n3.getClass());
            if (copyOnWriteArrayList != null) {
                Iterator<C39042p3<? extends C38992n3>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    this.f380942b.add(new b(c38992n3, it.next(), null));
                }
            }
        }
        this.f380945e.put(c38992n3.getClass(), c38992n3);
    }

    public synchronized void a(Object obj, Class cls, C39042p3<? extends C38992n3> c39042p3) {
        try {
            CopyOnWriteArrayList<C39042p3<? extends C38992n3>> copyOnWriteArrayList = this.f380943c.get(cls);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f380943c.put(cls, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(c39042p3);
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f380944d.get(obj);
            if (copyOnWriteArrayList2 == null) {
                copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                this.f380944d.put(obj, copyOnWriteArrayList2);
            }
            a aVar = null;
            copyOnWriteArrayList2.add(new d(copyOnWriteArrayList, c39042p3, aVar));
            C38992n3 c38992n3 = this.f380945e.get(cls);
            if (c38992n3 != null) {
                this.f380942b.add(new b(c38992n3, c39042p3, aVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(Object obj) {
        CopyOnWriteArrayList<d> copyOnWriteArrayListRemove = this.f380944d.remove(obj);
        if (copyOnWriteArrayListRemove != null) {
            for (d dVar : copyOnWriteArrayListRemove) {
                dVar.f380950a.remove(dVar.f380951b);
            }
        }
    }
}
