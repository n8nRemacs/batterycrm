package sberid.sdk.ui.screens.compose.elk.root;

import androidx.compose.foundation.a2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.T;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import sberid.sdk.ui.models.root.ELKRootTypes;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f437813l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i12) {
        super(2);
        this.f437813l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f437813l | 1);
        List<InterfaceC40658b> list = i.f437814a;
        B bE2 = a12.E(-1987165268);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            F31.e.a(null, bE2, 0);
            List listU = C42745f0.U(new InterfaceC40658b.o("ПрофильКлиента О.", "https://www.pngaaa.com/api-download/3018884", "https://www.pngaaa.com/api-download/3018884", null, "ПО", "+7 (999) 999-99-99 999-99", new C40657a((String) null, (String) null, (String) null, (gc1.g) null, (Boolean) null, 31, (C42822w) null), null, null, null, i.f437816c, 904, null), new InterfaceC40658b.i(null, null, null, null, null, i.f437815b, 31, null), new InterfaceC40658b.h(null, null, null, null, null, i.f437814a, 31, null));
            androidx.compose.ui.v vVarB = a2.b(androidx.compose.ui.v.f42878y1, a2.a(bE2), true, true);
            InterfaceC40658b.k kVar = new InterfaceC40658b.k(null, null, null, null, listU, ELKRootTypes.f437784b, 12, null);
            T.f39320b.getClass();
            i.b(vVarB, kVar, T.f39324f, g.f437812l, bE2, 3456);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(iA2);
        }
        return G0.f406611a;
    }
}
