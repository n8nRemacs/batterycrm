package com.avito.android.location_picker.view;

import com.avito.android.location_picker.O0;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_location-picker_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.view.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31589k {

    /* compiled from: LocationPickerViewChanger.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.view.k$a */
    public static final class a implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f182654b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f182654b = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f182654b.invoke(obj);
        }
    }

    @Y61.k
    public static final io.reactivex.rxjava3.disposables.c a(@Y61.k InterfaceC31579a interfaceC31579a, @Y61.k io.reactivex.rxjava3.core.z zVar, @Y61.k O0 o02) {
        io.reactivex.rxjava3.disposables.d dVarT0 = b(zVar, C31599v.f182799l).t0(interfaceC31579a.A());
        io.reactivex.rxjava3.disposables.d dVarT02 = zVar.N(G.f182513b).d0(J.f182516b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(interfaceC31579a.I());
        io.reactivex.rxjava3.disposables.d dVarT03 = b(zVar, K.f182517l).t0(interfaceC31579a.L());
        io.reactivex.rxjava3.disposables.d dVarT04 = b(zVar, L.f182518l).t0(interfaceC31579a.B());
        io.reactivex.rxjava3.disposables.d dVarT05 = b(zVar, M.f182523l).N(N.f182524b).d0(O.f182525b).t0(interfaceC31579a.x());
        io.reactivex.rxjava3.disposables.d dVarT06 = b(zVar, P.f182526l).t0(interfaceC31579a.k());
        io.reactivex.rxjava3.disposables.d dVarT07 = zVar.N(C31590l.f182655b).d0(C31591m.f182656b).t0(interfaceC31579a.n());
        io.reactivex.rxjava3.disposables.d dVarT08 = b(zVar, C31592n.f182657l).t0(interfaceC31579a.f());
        io.reactivex.rxjava3.disposables.d dVarT09 = zVar.N(C31593o.f182658b).N(C31594p.f182659b).d0(C31595q.f182780b).B(r.f182781a).d0(new C31596s(o02)).t0(interfaceC31579a.C());
        io.reactivex.rxjava3.disposables.d dVarT010 = zVar.N(C31597t.f182797b).B(C31598u.f182798a).d0(C31600w.f182800b).t0(interfaceC31579a.o());
        io.reactivex.rxjava3.disposables.d dVarT011 = zVar.N(C31601x.f182801b).B(y.f182802a).d0(z.f182803b).t0(interfaceC31579a.r());
        io.reactivex.rxjava3.internal.operators.observable.W wN2 = zVar.N(A.f182507b);
        l41.o oVar = B.f182508b;
        Objects.requireNonNull(oVar, "mapper is null");
        return new io.reactivex.rxjava3.disposables.c(dVarT0, dVarT02, dVarT03, dVarT04, dVarT05, dVarT06, dVarT07, dVarT08, dVarT09, dVarT010, dVarT011, new io.reactivex.rxjava3.internal.jdk8.x(wN2, oVar).t0(interfaceC31579a.K()), zVar.B(C.f182509a).d0(new D(o02)).t0(interfaceC31579a.q()), b(zVar, E.f182511l).t0(interfaceC31579a.M()), zVar.N(F.f182512b).d0(H.f182514b).t0(interfaceC31579a.d()), b(zVar, I.f182515l).t0(interfaceC31579a.J()));
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.L b(io.reactivex.rxjava3.core.z zVar, Y41.l lVar) {
        return zVar.d0(new a(lVar)).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }
}
