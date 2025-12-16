package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi;

import U3.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.entity.AutoFlatsTwoColumnDialogInternalAction;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoFlatsTwoColumnDialogOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "LU3/b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements t<AutoFlatsTwoColumnDialogInternalAction, U3.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final U3.b b(AutoFlatsTwoColumnDialogInternalAction autoFlatsTwoColumnDialogInternalAction) {
        if (autoFlatsTwoColumnDialogInternalAction instanceof AutoFlatsTwoColumnDialogInternalAction.CloseScreen) {
            return b.a.f16137a;
        }
        return null;
    }
}
