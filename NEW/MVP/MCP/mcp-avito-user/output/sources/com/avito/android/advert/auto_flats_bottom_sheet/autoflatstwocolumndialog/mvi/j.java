package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.entity.AutoFlatsTwoColumnDialogInternalAction;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoFlatsTwoColumnDialogReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "LU3/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements u<AutoFlatsTwoColumnDialogInternalAction, U3.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final U3.c a(AutoFlatsTwoColumnDialogInternalAction autoFlatsTwoColumnDialogInternalAction, U3.c cVar) {
        AutoFlatsTwoColumnDialogInternalAction autoFlatsTwoColumnDialogInternalAction2 = autoFlatsTwoColumnDialogInternalAction;
        U3.c cVar2 = cVar;
        if (!(autoFlatsTwoColumnDialogInternalAction2 instanceof AutoFlatsTwoColumnDialogInternalAction.ShowContent)) {
            return autoFlatsTwoColumnDialogInternalAction2 instanceof AutoFlatsTwoColumnDialogInternalAction.ShowErrorScreen ? U3.c.a(cVar2, true, false) : autoFlatsTwoColumnDialogInternalAction2 instanceof AutoFlatsTwoColumnDialogInternalAction.Loading ? U3.c.a(cVar2, false, true) : cVar2;
        }
        AutoFlatsTwoColumnDialogInternalAction.ShowContent showContent = (AutoFlatsTwoColumnDialogInternalAction.ShowContent) autoFlatsTwoColumnDialogInternalAction2;
        return new U3.c(showContent.f68718b, showContent.f68719c, false, false);
    }
}
