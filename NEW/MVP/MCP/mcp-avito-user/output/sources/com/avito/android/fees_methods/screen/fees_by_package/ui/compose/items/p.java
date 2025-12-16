package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FeesByPackageSnippetItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState.e f158145l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(FeesByPackageState.e eVar) {
        super(2);
        this.f158145l = eVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        FeesByPackageState.e eVar;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            v.a aVar = v.f42878y1;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, aVar);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            Y41.p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.fees_methods_snippet_image_placeholder, 0, a13);
            FeesByPackageState.e eVar2 = this.f158145l;
            Image image = eVar2.f158050a;
            float f12 = 81;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            InterfaceC22374n.f40491a.getClass();
            com.avito.android.mnz_common.compose.i.a(image, f12, f12, "FEES_BY_PACKAGE_SNIPPET_IMAGE_TEST_TAG", androidx.compose.ui.draw.k.a(R1.m(aVar, 0.0f, 0.0f, 12, 0.0f, 11), androidx.compose.foundation.shape.o.a(16)), eVarA, eVarA, null, InterfaceC22374n.a.f40493b, a13, 103026104, 128);
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            v vVarC2 = androidx.compose.ui.n.c(a13, aVar);
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
            R3.b(pVar, a13, iA2);
            R3.b(pVar2, a13, o1Y2);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
            }
            R3.b(pVar4, a13, vVarC2);
            K k12 = K.f28344a;
            a13.C(360867776);
            String str = eVar2.f158052c;
            if (str == null) {
                eVar = eVar2;
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                eVar = eVar2;
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65236g, C22501m2.a(aVar, "FEES_BY_PACKAGE_SNIPPET_PRICE_TEXT_TEST_TAG"), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            }
            a13.h();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65241l;
            androidx.compose.ui.text.style.s.f42720b.getClass();
            FeesByPackageState.e eVar3 = eVar;
            com.akita.compose.foundation.ui.p.b(eVar3.f158051b, rVar, C22501m2.a(aVar, "FEES_BY_PACKAGE_SNIPPET_TITLE_TEXT_TEST_TAG"), false, 0L, null, 1, androidx.compose.ui.text.style.s.f42722d, false, null, a13, 14156160, 824);
            com.akita.compose.foundation.ui.p.b(eVar3.f158053d, iVar.f65241l, C22501m2.a(aVar, "FEES_BY_PACKAGE_SNIPPET_CATEGORY_TEXT_TEST_TAG"), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            com.akita.compose.foundation.ui.p.b(eVar3.f158054e, iVar.f65245p, C22501m2.a(aVar, "FEES_BY_PACKAGE_SNIPPET_REGION_TEXT_TEST_TAG"), false, com.akita.compose.theme.re23.b.f63984b.f63918e0.c(a13), null, 0, 0, false, null, a13, 384, 1000);
            a13.z();
            a13.z();
        }
        return G0.f406611a;
    }
}
