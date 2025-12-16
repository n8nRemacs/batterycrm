package androidx.compose.material3;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class T4 extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC21692l2 f35463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C21784p2 f35464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, kotlin.G0> f35465n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C21669k2 f35466o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Long f35467p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21648j4 f35468q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Ce f35469r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y3 f35470s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public T4(AbstractC21692l2 abstractC21692l2, C21784p2 c21784p2, Y41.l<? super Long, kotlin.G0> lVar, C21669k2 c21669k2, Long l12, InterfaceC21648j4 interfaceC21648j4, Ce ce2, Y3 y32) {
        super(4);
        this.f35463l = abstractC21692l2;
        this.f35464m = c21784p2;
        this.f35465n = lVar;
        this.f35466o = c21669k2;
        this.f35467p = l12;
        this.f35468q = interfaceC21648j4;
        this.f35469r = ce2;
        this.f35470s = y32;
    }

    @Override // Y41.r
    public final kotlin.G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((i12 & 147) == 146 && a13.c()) {
            a13.f();
        } else {
            C21784p2 c21784p2K = this.f35463l.k(this.f35464m, iIntValue);
            androidx.compose.ui.v vVarC = interfaceC20793y2.c(androidx.compose.ui.v.f42878y1);
            a13.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, a13, 0);
            a13.I(-1323940314);
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarC);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar);
            } else {
                a13.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0E);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            androidx.compose.foundation.H.x(0, c22096nC, androidx.compose.runtime.J2.a(a13), a13, 2058660585);
            C20644z c20644z = C20644z.f28804a;
            V4.d(c21784p2K, this.f35465n, this.f35466o.f36702e, this.f35467p, null, null, this.f35468q, this.f35469r, this.f35470s, a13, 221184);
            a13.O();
            a13.z();
            a13.O();
            a13.O();
        }
        return kotlin.G0.f406611a;
    }
}
