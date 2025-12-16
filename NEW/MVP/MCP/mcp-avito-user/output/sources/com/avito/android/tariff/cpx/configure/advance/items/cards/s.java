package com.avito.android.tariff.cpx.configure.advance.items.cards;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.selector_card.SelectorCardType;
import com.akita.compose.theme.re23.style.C27535i3;
import com.akita.compose.theme.re23.style.InterfaceC27530h3;
import com.avito.android.tariff.cpx.configure.advance.items.cards.a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class s extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f295680l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f295681m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f295682n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(List list, InterfaceC22196w1 interfaceC22196w1, w wVar) {
        super(4);
        this.f295680l = list;
        this.f295681m = interfaceC22196w1;
        this.f295682n = wVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            a aVar = (a) this.f295680l.get(iIntValue);
            a13.C(1960783437);
            boolean z12 = aVar instanceof a.b ? ((a.b) aVar).f295651b : false;
            Y41.l lVar = aVar instanceof a.C8994a ? o.f295677l : p.f295678l;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.selector_card.h f66671b = ((InterfaceC27530h3) a13.o(C27535i3.f66637b)).getF66671b();
            SelectorCardType selectorCardType = SelectorCardType.f62627c;
            androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.ui.v.f42878y1, "CPX_CONFIGURE_ADVANCE_CARDS_ADVANCE_CARD_TAG_" + iIntValue);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarV = C20588k2.v((float) 148, 0.0f, 2, vVarA);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a13.o(Q0.f41199h);
            InterfaceC22196w1 interfaceC22196w1 = this.f295681m;
            androidx.compose.ui.v vVarH = C20588k2.h(androidx.compose.ui.unit.h.a(dVar.J(interfaceC22196w1.e())).f42852b, 0.0f, 2, vVarV);
            a13.C(-490893971);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new l(interfaceC22196w1);
                a13.H(objT);
            }
            a13.h();
            com.akita.compose.component.selector_card.g.a(z12, new m(this.f295682n, aVar), f66671b, C22392w0.a(vVarH, (Y41.l) objT), true, selectorCardType, null, null, androidx.compose.runtime.internal.r.c(-1367526672, new n(aVar, lVar), a13), a13, 100884480, 192);
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
