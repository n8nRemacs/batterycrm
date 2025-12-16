package com.avito.android.tariff.cpx.configure.advance.items.cards;

import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.h;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.configure.advance.items.cards.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CpxConfigureAdvanceCardsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Landroidx/compose/foundation/layout/T1;", "paddingValues", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class n extends N implements Y41.r<InterfaceC20640y, T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f295675l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f295676m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(a aVar, Y41.l<? super com.avito.android.lib.design.text_view.a, G0> lVar) {
        super(4);
        this.f295675l = aVar;
        this.f295676m = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.r
    public final G0 invoke(InterfaceC20640y interfaceC20640y, T1 t12, A a12, Integer num) {
        int i12;
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        T1 t13 = t12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            i12 = (a13.B(interfaceC20640y2) ? 4 : 2) | iIntValue;
        } else {
            i12 = iIntValue;
        }
        if ((iIntValue & 112) == 0) {
            i12 |= a13.B(t13) ? 32 : 16;
        }
        if ((i12 & 731) == 146 && a13.c()) {
            a13.f();
        } else {
            a aVar = this.f295675l;
            AttributedText f295650a = aVar.getF295650a();
            androidx.compose.ui.v vVarD = androidx.compose.ui.v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(R1.h(vVarD, t13), 0.0f, 0.0f, 0.0f, 4, 7);
            if (aVar instanceof a.C8994a) {
                InterfaceC22215f.f39074a.getClass();
                vVarD = interfaceC20640y2.d(vVarD, InterfaceC22215f.a.f39080f);
            }
            com.avito.android.lib.compose.design.component.attributedtext.a.b(f295650a, vVarM.d0(vVarD), 0, this.f295676m, null, 0, a13, 8, 52);
        }
        return G0.f406611a;
    }
}
