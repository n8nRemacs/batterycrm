package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.theme.re23.style.C27547l0;
import com.akita.compose.theme.re23.style.InterfaceC27532i0;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoFlatsTwoColumnDialogScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class p extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f68730l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Y41.a<G0> aVar) {
        super(3);
        this.f68730l = aVar;
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
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.d0(fillElement);
            androidx.compose.ui.v vVarH = R1.h(fillElement, t13);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            long jA2 = androidx.compose.ui.unit.i.a(109, 180);
            String strC = u0.i.c(a13, R.string.advert_details_auto_flats_error_title);
            String strC2 = u0.i.c(a13, R.string.advert_details_auto_flats_error_message);
            String strC3 = u0.i.c(a13, R.string.error_layout_refresh);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.content_placeholder.b.c(R.drawable.placeholders_img_unknown_error, strC, strC2, strC3, this.f68730l, vVarH, com.akita.compose.component.content_placeholder.d.a(((InterfaceC27532i0) a13.o(C27547l0.f66667b)).getF66097a(), null, 0.0f, com.akita.compose.theme.re23.b.f63988f.f65231b, null, 16319), jA2, null, null, false, false, a13, (com.akita.compose.component.content_placeholder.d.f61096o << 18) | 12582912, 0, 3840);
        }
        return G0.f406611a;
    }
}
