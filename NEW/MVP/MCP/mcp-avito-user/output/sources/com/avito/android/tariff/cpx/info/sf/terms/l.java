package com.avito.android.tariff.cpx.info.sf.terms;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class l extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TariffCpxInfoSfTermsDialogFragment f296890l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BB0.c f296891m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment, BB0.c cVar) {
        super(3);
        this.f296890l = tariffCpxInfoSfTermsDialogFragment;
        this.f296891m = cVar;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, A a12, Integer num) {
        T1 t13 = t12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(t13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            v vVarH = R1.h(a2.b(v.f42878y1, a2.a(a13), true, true), t13);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, vVarH);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
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
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            BB0.c cVar = this.f296891m;
            wZ.l lVar2 = cVar.f1238c;
            TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment = this.f296890l;
            TariffCpxInfoSfTermsDialogFragment.h5(tariffCpxInfoSfTermsDialogFragment, lVar2, null, a13, 4152);
            TariffCpxInfoSfTermsDialogFragment.g5(tariffCpxInfoSfTermsDialogFragment, cVar.f1237b, a13, 4152);
            a13.z();
        }
        return G0.f406611a;
    }
}
