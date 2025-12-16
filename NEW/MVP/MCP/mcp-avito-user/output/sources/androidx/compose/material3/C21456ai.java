package androidx.compose.material3;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import androidx.compose.ui.InterfaceC22215f;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: TabRow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ai, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21456ai extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.d2 f36043l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f36044m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36045n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36046o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.q<List<Jh>, androidx.compose.runtime.A, Integer, kotlin.G0> f36047p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f36048q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21456ai(androidx.compose.foundation.d2 d2Var, float f12, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar2, Y41.q<? super List<Jh>, ? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> qVar, int i12) {
        super(2);
        this.f36043l = d2Var;
        this.f36044m = f12;
        this.f36045n = pVar;
        this.f36046o = pVar2;
        this.f36047p = qVar;
        this.f36048q = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            a13.I(773894976);
            a13.I(-492369756);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                androidx.compose.runtime.X x12 = new androidx.compose.runtime.X(C22187u0.h(EmptyCoroutineContext.INSTANCE, a13));
                a13.H(x12);
                objT = x12;
            }
            a13.O();
            kotlinx.coroutines.T t12 = ((androidx.compose.runtime.X) objT).f38164b;
            a13.O();
            a13.I(121290627);
            androidx.compose.foundation.d2 d2Var = this.f36043l;
            boolean zB2 = a13.B(d2Var) | a13.B(t12);
            Object objT2 = a13.t();
            if (zB2 || objT2 == c1651a) {
                objT2 = new Ad(d2Var, t12);
                a13.H(objT2);
            }
            Ad ad2 = (Ad) objT2;
            a13.O();
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.v vVarB = androidx.compose.ui.draw.k.b(androidx.compose.foundation.selection.a.a(androidx.compose.foundation.a2.b(C20588k2.x(vVarD, InterfaceC22215f.a.f39079e, 2), d2Var, false, true)));
            a13.I(121291080);
            boolean zK2 = a13.k(this.f36044m) | a13.B(this.f36045n) | a13.B(this.f36046o) | a13.B(this.f36047p) | a13.u(ad2) | a13.m(this.f36048q);
            Object objT3 = a13.t();
            if (zK2 || objT3 == c1651a) {
                objT3 = new Zh(this.f36044m, this.f36045n, this.f36046o, ad2, this.f36048q, this.f36047p);
                a13.H(objT3);
            }
            a13.O();
            androidx.compose.ui.layout.V0.a(vVarB, (Y41.p) objT3, a13, 0, 0);
        }
        return kotlin.G0.f406611a;
    }
}
