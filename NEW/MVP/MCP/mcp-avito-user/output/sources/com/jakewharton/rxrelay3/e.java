package com.jakewharton.rxrelay3;

import io.reactivex.rxjava3.core.G;
import j41.InterfaceC42196c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReplayRelay.java */
/* loaded from: classes7.dex */
public final class e<T> extends com.jakewharton.rxrelay3.d<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final c[] f364283d = new c[0];

    /* renamed from: e, reason: collision with root package name */
    public static final Object[] f364284e = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f364285b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<c<T>[]> f364286c = new AtomicReference<>(f364283d);

    /* compiled from: ReplayRelay.java */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* renamed from: b, reason: collision with root package name */
        public final T f364287b;

        public a(T t12) {
            this.f364287b = t12;
        }
    }

    /* compiled from: ReplayRelay.java */
    public interface b<T> {
        void a(c<T> cVar);

        void add(T t12);
    }

    /* compiled from: ReplayRelay.java */
    public static final class c<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f364288b;

        /* renamed from: c, reason: collision with root package name */
        public final e<T> f364289c;

        /* renamed from: d, reason: collision with root package name */
        public Serializable f364290d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f364291e;

        public c(G<? super T> g12, e<T> eVar) {
            this.f364288b = g12;
            this.f364289c = eVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f364291e) {
                return;
            }
            this.f364291e = true;
            this.f364289c.P0(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f364291e;
        }
    }

    /* compiled from: ReplayRelay.java */
    public static final class d<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        @Override // com.jakewharton.rxrelay3.e.b
        public final void a(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            G<? super T> g12 = cVar.f364288b;
            f<T> fVar = (f) cVar.f364290d;
            fVar.getClass();
            int iAddAndGet = 1;
            while (!cVar.f364291e) {
                while (!cVar.f364291e) {
                    f<T> fVar2 = fVar.get();
                    if (fVar2 != null) {
                        g12.onNext(null);
                        fVar = fVar2;
                    } else if (fVar.get() == null) {
                        cVar.f364290d = fVar;
                        iAddAndGet = cVar.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                cVar.f364290d = null;
                return;
            }
            cVar.f364290d = null;
        }

        @Override // com.jakewharton.rxrelay3.e.b
        public final void add(T t12) {
            throw null;
        }
    }

    /* compiled from: ReplayRelay.java */
    /* renamed from: com.jakewharton.rxrelay3.e$e, reason: collision with other inner class name */
    public static final class C10780e<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* renamed from: b, reason: collision with root package name */
        public final int f364292b;

        /* renamed from: c, reason: collision with root package name */
        public int f364293c;

        /* renamed from: d, reason: collision with root package name */
        public volatile a<T> f364294d;

        /* renamed from: e, reason: collision with root package name */
        public a<T> f364295e;

        public C10780e(int i12) {
            if (i12 <= 0) {
                throw new IllegalArgumentException(AK.c.g(i12, "maxSize > 0 required but it was "));
            }
            this.f364292b = i12;
            a<T> aVar = new a<>(null);
            this.f364295e = aVar;
            this.f364294d = aVar;
        }

        @Override // com.jakewharton.rxrelay3.e.b
        public final void a(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            G<? super T> g12 = cVar.f364288b;
            a<T> aVar = (a) cVar.f364290d;
            int iAddAndGet = 1;
            if (aVar == null) {
                aVar = this.f364294d;
            }
            while (!cVar.f364291e) {
                a<T> aVar2 = aVar.get();
                if (aVar2 != null) {
                    g12.onNext(aVar2.f364287b);
                    aVar = aVar2;
                } else if (aVar.get() != null) {
                    continue;
                } else {
                    cVar.f364290d = aVar;
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f364290d = null;
        }

        @Override // com.jakewharton.rxrelay3.e.b
        public final void add(T t12) {
            a<T> aVar = new a<>(t12);
            a<T> aVar2 = this.f364295e;
            this.f364295e = aVar;
            this.f364293c++;
            aVar2.set(aVar);
            int i12 = this.f364293c;
            if (i12 > this.f364292b) {
                this.f364293c = i12 - 1;
                this.f364294d = this.f364294d.get();
            }
        }
    }

    /* compiled from: ReplayRelay.java */
    public static final class f<T> extends AtomicReference<f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        public f() {
            throw null;
        }
    }

    /* compiled from: ReplayRelay.java */
    public static final class g<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f364296b = new ArrayList(16);

        /* renamed from: c, reason: collision with root package name */
        public volatile int f364297c;

        @Override // com.jakewharton.rxrelay3.e.b
        public final void a(c<T> cVar) {
            int iIntValue;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.f364296b;
            G<? super T> g12 = cVar.f364288b;
            Integer num = (Integer) cVar.f364290d;
            int iAddAndGet = 1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                cVar.f364290d = 0;
            }
            while (!cVar.f364291e) {
                int i12 = this.f364297c;
                while (i12 != iIntValue) {
                    if (cVar.f364291e) {
                        cVar.f364290d = null;
                        return;
                    } else {
                        g12.onNext((Object) arrayList.get(iIntValue));
                        iIntValue++;
                    }
                }
                if (iIntValue == this.f364297c) {
                    cVar.f364290d = Integer.valueOf(iIntValue);
                    iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.f364290d = null;
        }

        @Override // com.jakewharton.rxrelay3.e.b
        public final void add(T t12) {
            this.f364296b.add(t12);
            this.f364297c++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(b<T> bVar) {
        this.f364285b = (AtomicReference) bVar;
    }

    @j41.e
    @InterfaceC42196c
    public static <T> e<T> N0() {
        return new e<>(new g());
    }

    @j41.e
    @InterfaceC42196c
    public static <T> e<T> O0(int i12) {
        return new e<>(new C10780e(i12));
    }

    public final void P0(c<T> cVar) {
        while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f364286c;
            c<T>[] cVarArr = atomicReference.get();
            c<T>[] cVarArr2 = f364283d;
            if (cVarArr == cVarArr2) {
                return;
            }
            int length = cVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                } else if (cVarArr[i12] == cVar) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                return;
            }
            if (length != 1) {
                cVarArr2 = new c[length - 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, i12);
                System.arraycopy(cVarArr, i12 + 1, cVarArr2, i12, (length - i12) - 1);
            }
            while (!atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                if (atomicReference.get() != cVarArr) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.jakewharton.rxrelay3.e$b, java.util.concurrent.atomic.AtomicReference] */
    @Override // l41.g
    public final void accept(T t12) {
        if (t12 == null) {
            throw new NullPointerException("value == null");
        }
        ?? r02 = this.f364285b;
        r02.add(t12);
        for (c<T> cVar : this.f364286c.get()) {
            r02.a(cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [com.jakewharton.rxrelay3.e$b, java.util.concurrent.atomic.AtomicReference] */
    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        c<T> cVar = new c<>(g12, this);
        g12.b(cVar);
        if (cVar.f364291e) {
            return;
        }
        loop0: while (true) {
            AtomicReference<c<T>[]> atomicReference = this.f364286c;
            c<T>[] cVarArr = atomicReference.get();
            int length = cVarArr.length;
            c<T>[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            while (!atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                if (atomicReference.get() != cVarArr) {
                    break;
                }
            }
        }
        if (cVar.f364291e) {
            P0(cVar);
        } else {
            this.f364285b.a(cVar);
        }
    }
}
