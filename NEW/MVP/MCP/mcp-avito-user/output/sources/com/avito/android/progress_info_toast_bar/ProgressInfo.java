package com.avito.android.progress_info_toast_bar;

import Y61.k;
import androidx.annotation.Keep;
import kotlin.Metadata;

/* compiled from: ProgressBarResponse.kt */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressInfo;", "", "count", "", "totalCount", "title", "", "subtitle", "(IILjava/lang/String;Ljava/lang/String;)V", "getCount", "()I", "getSubtitle", "()Ljava/lang/String;", "getTitle", "getTotalCount", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProgressInfo {
    private final int count;

    @k
    private final String subtitle;

    @k
    private final String title;
    private final int totalCount;

    public ProgressInfo(int i12, int i13, @k String str, @k String str2) {
        this.count = i12;
        this.totalCount = i13;
        this.title = str;
        this.subtitle = str2;
    }

    public final int getCount() {
        return this.count;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }
}
