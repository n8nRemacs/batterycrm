package androidx.compose.material3;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.lazy.grid.C20672g;
import androidx.compose.foundation.lazy.grid.InterfaceC20662b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: DatePicker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21900u5 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC21692l2 f37403l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f37404m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f37405n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y3 f37406o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f37407p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, kotlin.G0> f37408q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Ce f37409r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21900u5(AbstractC21692l2 abstractC21692l2, long j12, kotlin.ranges.l lVar, Y3 y32, androidx.compose.ui.v vVar, Y41.l<? super Integer, kotlin.G0> lVar2, Ce ce2) {
        super(2);
        this.f37403l = abstractC21692l2;
        this.f37404m = j12;
        this.f37405n = lVar;
        this.f37406o = y32;
        this.f37407p = vVar;
        this.f37408q = lVar2;
        this.f37409r = ce2;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        InterfaceC20662b.C1591b c1591b;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            AbstractC21692l2 abstractC21692l2 = this.f37403l;
            C21784p2 c21784p2G = abstractC21692l2.g(abstractC21692l2.h());
            C21784p2 c21784p2F = abstractC21692l2.f(this.f37404m);
            kotlin.ranges.l lVar = this.f37405n;
            int i12 = lVar.f406905b;
            int i13 = c21784p2F.f37010a;
            androidx.compose.foundation.lazy.grid.I0 i0A = androidx.compose.foundation.lazy.grid.M0.a(Math.max(0, (i13 - i12) - 3), 2, a13);
            C21859s9.f37272a.getClass();
            C21942w3 c21942w3A = C21859s9.a(a13);
            Y3 y32 = this.f37406o;
            long jE2 = y32.f35861a;
            float f12 = ((androidx.compose.ui.unit.h) a13.o(Qg.f35355a)).f42852b;
            boolean zBooleanValue = ((Boolean) a13.o(C21964x3.f37698b)).booleanValue();
            if (androidx.compose.ui.graphics.T.d(jE2, c21942w3A.f37667p) && zBooleanValue) {
                jE2 = C21964x3.e(c21942w3A, f12);
            }
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
            int i14 = Ng.f35206b;
            String strA = Og.a(a13, R.string.m3c_date_picker_scroll_to_earlier_years);
            String strA2 = Og.a(a13, R.string.m3c_date_picker_scroll_to_later_years);
            InterfaceC20662b.C1591b c1591b2 = new InterfaceC20662b.C1591b(3);
            androidx.compose.ui.v vVarB = androidx.compose.ui.semantics.r.b(androidx.compose.foundation.A.b(this.f37407p, jE2, androidx.compose.ui.graphics.Y0.f39346a), false, C21741n5.f36879l);
            C20585k.f28659a.getClass();
            C20585k.i iVar = C20585k.f28665g;
            C20585k.j jVarG = C20585k.g(V4.f35605e);
            a13.I(-969328877);
            boolean zU2 = a13.u(lVar) | a13.B(i0A) | a13.u(t12) | a13.B(strA) | a13.B(strA2) | a13.m(i13);
            int i15 = c21784p2G.f37010a;
            boolean zM2 = zU2 | a13.m(i15) | a13.B(this.f37408q) | a13.B(this.f37409r) | a13.B(y32);
            Object objT2 = a13.t();
            if (zM2 || objT2 == c1651a) {
                c1591b = c1591b2;
                objT2 = new C21878t5(this.f37405n, i0A, t12, strA, strA2, i13, i15, this.f37408q, this.f37409r, this.f37406o);
                a13.H(objT2);
            } else {
                c1591b = c1591b2;
            }
            a13.O();
            C20672g.b(c1591b, vVarB, i0A, null, jVarG, iVar, null, false, (Y41.l) objT2, a13, 1769472);
        }
        return kotlin.G0.f406611a;
    }
}
