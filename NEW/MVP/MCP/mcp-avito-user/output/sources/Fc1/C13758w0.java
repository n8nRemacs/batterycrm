package Fc1;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.v;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.w0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13758w0 {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k InterfaceC22204y1 interfaceC22204y1, @Y61.k C13600e3 c13600e3, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1413767438);
        if ((((bE2.u(c13600e3) ? 32 : 16) | i12) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
            bE2.I(-492369756);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C20274e.a(1.0f);
                bE2.H(objT);
            }
            bE2.X(false);
            C20268c c20268c = (C20268c) objT;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            C22187u0.d(new C13722s0(c20268c, null), bE2, g02);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            androidx.compose.ui.v vVarA = C22274n0.a(fillElement, new C13731t0(c20268c));
            androidx.compose.ui.graphics.T.f39320b.getClass();
            C20632w.a(androidx.compose.foundation.A.b(vVarA, androidx.compose.ui.graphics.T.f39323e, androidx.compose.ui.graphics.Y0.f39346a), bE2, 0);
            if (((Number) c20268c.f()).floatValue() == 0.0f) {
                bE2.I(1157296644);
                boolean zB2 = bE2.B(c13600e3);
                Object objT2 = bE2.t();
                if (zB2 || objT2 == c1651a) {
                    objT2 = new C13740u0(c13600e3, null);
                    bE2.H(objT2);
                }
                bE2.X(false);
                C22187u0.d((Y41.p) objT2, bE2, g02);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13749v0(interfaceC22204y1, c13600e3, i12);
    }
}
