package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.material.C21105a7;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PullRefreshIndicator.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "refreshing", "Lkotlin/G0;", "invoke", "(ZLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class g extends N implements Y41.q<Boolean, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f33936l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f33937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j12, t tVar) {
        super(3);
        this.f33936l = j12;
        this.f33937m = tVar;
    }

    @Override // Y41.q
    public final G0 invoke(Boolean bool, A a12, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.j(zBooleanValue) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.d0(fillElement);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, fillElement);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            float f12 = j.f33947c;
            float f13 = j.f33948d;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            float f14 = (f12 + f13) * 2;
            long j12 = this.f33936l;
            if (zBooleanValue) {
                a13.C(-1566007818);
                C21105a7.a(C20588k2.o(aVar, f14), j12, f13, 0L, 0, a13, 390, 24);
                a13.h();
            } else {
                a13.C(-1565760097);
                j.b(this.f33937m, j12, C20588k2.o(aVar, f14), a13, 384);
                a13.h();
            }
            a13.z();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
