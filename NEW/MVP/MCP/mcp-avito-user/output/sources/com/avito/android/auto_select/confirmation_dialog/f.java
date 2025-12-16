package com.avito.android.auto_select.confirmation_dialog;

import androidx.core.os.C22777e;
import cf.c;
import com.avito.android.auto_select.booking.domain.models.AutoSelectConfirmationDialogData;
import com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetV2;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;

/* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class f extends H implements Y41.l<cf.c, G0> {
    @Override // Y41.l
    public final G0 invoke(cf.c cVar) {
        cf.c cVar2 = cVar;
        AutoSelectConfirmationBottomSheetV2 autoSelectConfirmationBottomSheetV2 = (AutoSelectConfirmationBottomSheetV2) this.receiver;
        AutoSelectConfirmationBottomSheetV2.a aVar = AutoSelectConfirmationBottomSheetV2.f95869m0;
        autoSelectConfirmationBottomSheetV2.getClass();
        if (cVar2 instanceof c.b) {
            AutoSelectConfirmationDialogData autoSelectConfirmationDialogDataG5 = autoSelectConfirmationBottomSheetV2.g5();
            autoSelectConfirmationBottomSheetV2.getParentFragmentManager().o0(C22777e.b(new Q("redirect_link_v2", ((c.b) cVar2).f58077a)), autoSelectConfirmationDialogDataG5.f95833d);
            autoSelectConfirmationBottomSheetV2.dismissAllowingStateLoss();
        } else if (cVar2 instanceof c.C2054c) {
            com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
            com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) autoSelectConfirmationBottomSheetV2.getDialog();
            PrintableText printableTextF = com.avito.android.printable_text.b.f(((c.C2054c) cVar2).f58078a);
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.d(cVar3, dVar, printableTextF, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
        } else if (cVar2 instanceof c.a) {
            autoSelectConfirmationBottomSheetV2.f5(((c.a) cVar2).f58076a);
        }
        return G0.f406611a;
    }
}
