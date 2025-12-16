package hu.akarnokd.rxjava3.retrofit;

import io.reactivex.rxjava3.core.H;
import java.lang.reflect.Type;
import retrofit2.InterfaceC47647c;

/* compiled from: RxJava3CallAdapter.java */
/* loaded from: classes8.dex */
final class f<R> implements InterfaceC47647c<R, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final Type f398214a;

    /* renamed from: b, reason: collision with root package name */
    @j41.f
    public final H f398215b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f398216c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f398217d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f398218e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f398219f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f398220g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f398221h;

    public f(Type type, @j41.f H h12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f398214a = type;
        this.f398215b = h12;
        this.f398216c = z12;
        this.f398217d = z13;
        this.f398218e = z14;
        this.f398219f = z15;
        this.f398220g = z16;
        this.f398221h = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // retrofit2.InterfaceC47647c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object adapt(retrofit2.InterfaceC47646b<R> r3) {
        /*
            r2 = this;
            hu.akarnokd.rxjava3.retrofit.c r0 = new hu.akarnokd.rxjava3.retrofit.c
            r0.<init>(r3)
            boolean r3 = r2.f398216c
            if (r3 == 0) goto L10
            hu.akarnokd.rxjava3.retrofit.e r3 = new hu.akarnokd.rxjava3.retrofit.e
            r3.<init>(r0)
        Le:
            r0 = r3
            goto L1a
        L10:
            boolean r3 = r2.f398217d
            if (r3 == 0) goto L1a
            hu.akarnokd.rxjava3.retrofit.a r3 = new hu.akarnokd.rxjava3.retrofit.a
            r3.<init>(r0)
            goto Le
        L1a:
            io.reactivex.rxjava3.core.H r3 = r2.f398215b
            if (r3 == 0) goto L22
            io.reactivex.rxjava3.internal.operators.observable.q1 r0 = r0.x0(r3)
        L22:
            boolean r3 = r2.f398218e
            if (r3 == 0) goto L2d
            io.reactivex.rxjava3.core.BackpressureStrategy r3 = io.reactivex.rxjava3.core.BackpressureStrategy.f401955d
            io.reactivex.rxjava3.core.j r3 = r0.G0(r3)
            return r3
        L2d:
            boolean r3 = r2.f398219f
            if (r3 == 0) goto L38
            io.reactivex.rxjava3.internal.operators.observable.k1 r3 = new io.reactivex.rxjava3.internal.operators.observable.k1
            r1 = 0
            r3.<init>(r0, r1)
            return r3
        L38:
            boolean r3 = r2.f398220g
            if (r3 == 0) goto L42
            io.reactivex.rxjava3.internal.operators.observable.j1 r3 = new io.reactivex.rxjava3.internal.operators.observable.j1
            r3.<init>(r0)
            return r3
        L42:
            boolean r3 = r2.f398221h
            if (r3 == 0) goto L4c
            io.reactivex.rxjava3.internal.operators.observable.s0 r3 = new io.reactivex.rxjava3.internal.operators.observable.s0
            r3.<init>(r0)
            return r3
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.akarnokd.rxjava3.retrofit.f.adapt(retrofit2.b):java.lang.Object");
    }

    @Override // retrofit2.InterfaceC47647c
    /* renamed from: responseType */
    public final Type getSuccessType() {
        return this.f398214a;
    }
}
