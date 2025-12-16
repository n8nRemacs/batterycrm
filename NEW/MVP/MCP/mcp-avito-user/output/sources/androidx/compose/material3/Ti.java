package androidx.compose.material3;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/v;", "modifier", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ti extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f35511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f35512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35513n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Ti(float f12, long j12, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
        super(3);
        this.f35511l = f12;
        this.f35512m = j12;
        this.f35513n = pVar;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.ui.v vVar2 = vVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(vVar2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.a.a(vVar2, this.f35511l);
            a13.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, a13, 0);
            a13.I(-1323940314);
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarA);
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
            C21859s9.f37272a.getClass();
            C21457aj.b(this.f35512m, C21859s9.b(a13).f35316j, this.f35513n, a13, 0, 0);
            a13.O();
            a13.z();
            a13.O();
            a13.O();
        }
        return kotlin.G0.f406611a;
    }
}
