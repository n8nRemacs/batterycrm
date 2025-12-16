package com.avito.android.rating_form.step.dialog;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.step.dialog.BottomSheetDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: BottomSheetDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class b extends H implements Y41.l<PrintableText, G0> {
    @Override // Y41.l
    public final G0 invoke(PrintableText printableText) {
        PrintableText printableText2 = printableText;
        BottomSheetDialogFragment bottomSheetDialogFragment = (BottomSheetDialogFragment) this.receiver;
        BottomSheetDialogFragment.a aVar = BottomSheetDialogFragment.f249322m0;
        bottomSheetDialogFragment.getClass();
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) bottomSheetDialogFragment.getDialog();
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.d(cVar, dVar, printableText2, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
        return G0.f406611a;
    }
}
