package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class v extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f68746l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ArrayList arrayList) {
        super(4);
        this.f68746l = arrayList;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        int i12 = (iIntValue2 & 6) == 0 ? (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            U3.d dVar = (U3.d) this.f68746l.get(iIntValue);
            a13.C(-1742219485);
            String str = dVar.f16144a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65234e;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.p.b(str, rVar, R1.m(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 0.0f, 0.0f, 0.0f, 12, 7), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            a13.C(636546373);
            ArrayList<U3.e> arrayList = dVar.f16145b;
            if (arrayList != null) {
                for (U3.e eVar : arrayList) {
                    androidx.compose.ui.v vVarM = R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, 0.0f, 8, 7);
                    String str2 = eVar.f16146a;
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.component.description_list.j f66136b = com.akita.compose.theme.re23.b.g(a13).getF66136b();
                    com.akita.compose.foundation.r rVar2 = com.akita.compose.theme.re23.b.g(a13).getF66136b().f61490a;
                    com.akita.compose.theme.re23.b.f63987e.getClass();
                    com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                    com.akita.compose.component.description_list.d.d(str2, eVar.f16147b, false, null, com.akita.compose.component.description_list.j.a(f66136b, com.akita.compose.foundation.r.a(rVar2, X2.h.f18557e, 0L, 0L, null, 0L, 0L, 1022), 62), vVarM, true, a13, 1772928, 0);
                }
            }
            a13.h();
            com.akita.compose.foundation.ui.g.a(24, null, a13, 6);
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
