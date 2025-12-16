package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import j41.InterfaceC42196c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ReplaySubject.java */
/* loaded from: classes8.dex */
public final class f<T> extends i<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final c[] f405002e = new c[0];

    /* renamed from: f, reason: collision with root package name */
    public static final c[] f405003f = new c[0];

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f405004g = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final g f405005b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<c<T>[]> f405006c = new AtomicReference<>(f405002e);

    /* renamed from: d, reason: collision with root package name */
    public boolean f405007d;

    /* compiled from: ReplaySubject.java */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
    }

    /* compiled from: ReplaySubject.java */
    public interface b<T> {
    }

    /* compiled from: ReplaySubject.java */
    public static final class c<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f405008b;

        /* renamed from: c, reason: collision with root package name */
        public final f<T> f405009c;

        /* renamed from: d, reason: collision with root package name */
        public Serializable f405010d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f405011e;

        public c(G<? super T> g12, f<T> fVar) {
            this.f405008b = g12;
            this.f405009c = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f405011e) {
                return;
            }
            this.f405011e = true;
            this.f405009c.O0(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f405011e;
        }
    }

    /* compiled from: ReplaySubject.java */
    public static final class d<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -8056260896137901749L;
    }

    /* compiled from: ReplaySubject.java */
    public static final class e<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = 1107649250281456395L;
    }

    /* compiled from: ReplaySubject.java */
    /* renamed from: io.reactivex.rxjava3.subjects.f$f, reason: collision with other inner class name */
    public static final class C11526f<T> extends AtomicReference<C11526f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
    }

    /* compiled from: ReplaySubject.java */
    public static final class g<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f405012b = new ArrayList(16);

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f405013c;

        /* renamed from: d, reason: collision with root package name */
        public volatile int f405014d;

        public final void a(Serializable serializable) {
            this.f405012b.add(serializable);
            this.f405014d++;
            this.f405013c = true;
        }

        public final void b(c<T> cVar) {
            int iIntValue;
            int i12;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.f405012b;
            G<? super T> g12 = cVar.f405008b;
            Integer num = (Integer) cVar.f405010d;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                cVar.f405010d = 0;
            }
            int iAddAndGet = 1;
            while (!cVar.f405011e) {
                int i13 = this.f405014d;
                while (i13 != iIntValue) {
                    if (cVar.f405011e) {
                        cVar.f405010d = null;
                        return;
                    }
                    A00.a aVar = (Object) arrayList.get(iIntValue);
                    if (this.f405013c && (i12 = iIntValue + 1) == i13 && i12 == (i13 = this.f405014d)) {
                        if (NotificationLite.h(aVar)) {
                            g12.e();
                        } else {
                            g12.onError(NotificationLite.f(aVar));
                        }
                        cVar.f405010d = null;
                        cVar.f405011e = true;
                        return;
                    }
                    g12.onNext(aVar);
                    iIntValue++;
                }
                if (iIntValue == this.f405014d) {
                    cVar.f405010d = Integer.valueOf(iIntValue);
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f405010d = null;
        }
    }

    public f(g gVar) {
        this.f405005b = gVar;
    }

    @j41.e
    @InterfaceC42196c
    public static <T> f<T> N0() {
        return new f<>(new g());
    }

    public final void O0(c<T> cVar) {
        c<T>[] cVarArr;
        while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f405006c;
            c<T>[] cVarArr2 = atomicReference.get();
            if (cVarArr2 == f405003f || cVarArr2 == (cVarArr = f405002e)) {
                return;
            }
            int length = cVarArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                } else if (cVarArr2[i12] == cVar) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                return;
            }
            if (length != 1) {
                cVarArr = new c[length - 1];
                System.arraycopy(cVarArr2, 0, cVarArr, 0, i12);
                System.arraycopy(cVarArr2, i12 + 1, cVarArr, i12, (length - i12) - 1);
            }
            while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                if (atomicReference.get() != cVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f405007d) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        if (this.f405007d) {
            return;
        }
        this.f405007d = true;
        NotificationLite notificationLite = NotificationLite.f404825b;
        g gVar = this.f405005b;
        gVar.a(notificationLite);
        gVar.compareAndSet(null, notificationLite);
        for (c<T> cVar : this.f405006c.getAndSet(f405003f)) {
            gVar.b(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        if (this.f405007d) {
            C47998a.b(th2);
            return;
        }
        this.f405007d = true;
        Serializable serializable = (Serializable) NotificationLite.e(th2);
        g gVar = this.f405005b;
        gVar.a(serializable);
        gVar.compareAndSet(null, serializable);
        for (c<T> cVar : this.f405006c.getAndSet(f405003f)) {
            gVar.b(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        if (this.f405007d) {
            return;
        }
        g gVar = this.f405005b;
        gVar.f405012b.add(t12);
        gVar.f405014d++;
        for (c<T> cVar : this.f405006c.get()) {
            gVar.b(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        c<T> cVar = new c<>(g12, this);
        g12.b(cVar);
        while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f405006c;
            c<T>[] cVarArr = atomicReference.get();
            if (cVarArr == f405003f) {
                break;
            }
            int length = cVarArr.length;
            c<T>[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            while (!atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                if (atomicReference.get() != cVarArr) {
                    break;
                }
            }
            if (cVar.f405011e) {
                O0(cVar);
                return;
            }
        }
        this.f405005b.b(cVar);
    }
}
