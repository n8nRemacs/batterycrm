package com.avito.android.progress_info_toast_bar;

import Y61.l;
import androidx.annotation.Keep;
import kotlin.Metadata;

/* compiled from: ProgressBarResponse.kt */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressBarResponse;", "", "success", "Lcom/avito/android/progress_info_toast_bar/ProgressInfo;", "(Lcom/avito/android/progress_info_toast_bar/ProgressInfo;)V", "getSuccess", "()Lcom/avito/android/progress_info_toast_bar/ProgressInfo;", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProgressBarResponse {

    @l
    private final ProgressInfo success;

    public ProgressBarResponse(@l ProgressInfo progressInfo) {
        this.success = progressInfo;
    }

    @l
    public final ProgressInfo getSuccess() {
        return this.success;
    }
}
