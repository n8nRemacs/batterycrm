package androidx.compose.foundation.text;

import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;
import l0.g;

/* compiled from: TextLinkScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class U2 extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22276o0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S2 f30572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22602e.C1684e<androidx.compose.ui.text.C> f30573m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(S2 s22, C22602e.C1684e<androidx.compose.ui.text.C> c1684e) {
        super(1);
        this.f30572l = s22;
        this.f30573m = c1684e;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
        C22277p c22277pK;
        androidx.compose.ui.text.o0 o0Var;
        C22602e.C1684e c1684eC;
        InterfaceC22276o0 interfaceC22276o02 = interfaceC22276o0;
        S2 s22 = this.f30572l;
        s22.getClass();
        if (!((Boolean) new W2(s22).invoke()).booleanValue() || (o0Var = (androidx.compose.ui.text.o0) ((C22082i3) s22.f30522a).getF42167b()) == null || (c1684eC = S2.c(this.f30573m, o0Var)) == null) {
            c22277pK = null;
        } else {
            int i12 = c1684eC.f42139b;
            int i13 = c1684eC.f42140c;
            c22277pK = o0Var.k(i12, i13);
            l0.j jVarB = o0Var.b(i12);
            int i14 = i13 - 1;
            l0.j jVarB2 = o0Var.b(i14);
            androidx.compose.ui.text.G g12 = o0Var.f42527b;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(g12.d(i12) == g12.d(i14) ? Math.min(jVarB2.f413390a, jVarB.f413390a) : 0.0f) << 32) | (Float.floatToRawIntBits(jVarB.f413391b) & 4294967295L);
            g.a aVar = l0.g.f413384b;
            c22277pK.e(jFloatToRawIntBits ^ (-9223372034707292160L));
        }
        V2 v22 = c22277pK != null ? new V2(c22277pK) : null;
        if (v22 != null) {
            interfaceC22276o02.u1(v22);
            interfaceC22276o02.p(true);
        }
        return kotlin.G0.f406611a;
    }
}
