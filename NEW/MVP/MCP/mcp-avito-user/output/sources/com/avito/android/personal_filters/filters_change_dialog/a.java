package com.avito.android.personal_filters.filters_change_dialog;

import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.personal_filters.filters_change_dialog.PersonalFiltersChangeDialogFragment;
import com.avito.android.printable_text.PrintableText;
import g70.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: PersonalFiltersChangeDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class a extends H implements l<g70.c, G0> {
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, com.avito.android.lib.design.modal.a$d] */
    @Override // Y41.l
    public final G0 invoke(g70.c cVar) {
        com.avito.android.lib.design.modal.a aVar;
        g70.c cVar2 = cVar;
        PersonalFiltersChangeDialogFragment personalFiltersChangeDialogFragment = (PersonalFiltersChangeDialogFragment) this.receiver;
        PersonalFiltersChangeDialogFragment.a aVar2 = PersonalFiltersChangeDialogFragment.f215702o0;
        personalFiltersChangeDialogFragment.getClass();
        if (L.f(cVar2, c.a.f396330a)) {
            personalFiltersChangeDialogFragment.dismiss();
        } else if (L.f(cVar2, c.b.f396331a) && (aVar = personalFiltersChangeDialogFragment.f215710n0) != null) {
            com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(personalFiltersChangeDialogFragment.requireContext().getString(R.string.personal_preset_request_error));
            f.c.f125255c.getClass();
            f.c cVarB = f.c.a.b();
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            cVar3.getClass();
            ?? r02 = aVar.f179706c;
            View touchOutsideView = r02 != 0 ? r02.getTouchOutsideView() : null;
            if (touchOutsideView != null) {
                com.avito.android.component.toast.c.b(cVar3, touchOutsideView, printableTextF, null, null, null, cVarB, 2750, toastBarPosition, null, true, false, null, null, 2176);
            }
        }
        return G0.f406611a;
    }
}
