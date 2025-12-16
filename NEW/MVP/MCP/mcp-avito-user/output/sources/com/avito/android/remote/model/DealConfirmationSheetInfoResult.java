package com.avito.android.remote.model;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DealConfirmationSheetInfoResult.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/DealConfirmationSheetInfoResult;", "", "bottomSheet", "Lcom/avito/android/remote/model/DealConfirmationSheet;", "(Lcom/avito/android/remote/model/DealConfirmationSheet;)V", "getBottomSheet", "()Lcom/avito/android/remote/model/DealConfirmationSheet;", "_avito-discouraged_avito-api_deal-confirmation"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DealConfirmationSheetInfoResult {

    @c("bottomSheet")
    @l
    private final DealConfirmationSheet bottomSheet;

    public DealConfirmationSheetInfoResult(@l DealConfirmationSheet dealConfirmationSheet) {
        this.bottomSheet = dealConfirmationSheet;
    }

    @l
    public final DealConfirmationSheet getBottomSheet() {
        return this.bottomSheet;
    }
}
