package ru.mts.biometry.api.entity.state.screen;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: ApiPhotoCaptureState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0006\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureUiSettings;", "", "", "isCropImageEnabled", "Z", "()Z", "isDesktopCaptureEnabled", "isUploadFromFileEnabled", "isDetectionBackButtonEnabled", "isUploadFromFileDesktopEnabled", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiPhotoCaptureUiSettings {
    private final boolean isCropImageEnabled;
    private final boolean isDesktopCaptureEnabled;
    private final boolean isDetectionBackButtonEnabled;
    private final boolean isUploadFromFileDesktopEnabled;
    private final boolean isUploadFromFileEnabled;

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiPhotoCaptureUiSettings)) {
            return false;
        }
        ApiPhotoCaptureUiSettings apiPhotoCaptureUiSettings = (ApiPhotoCaptureUiSettings) obj;
        return this.isCropImageEnabled == apiPhotoCaptureUiSettings.isCropImageEnabled && this.isDesktopCaptureEnabled == apiPhotoCaptureUiSettings.isDesktopCaptureEnabled && this.isUploadFromFileEnabled == apiPhotoCaptureUiSettings.isUploadFromFileEnabled && this.isDetectionBackButtonEnabled == apiPhotoCaptureUiSettings.isDetectionBackButtonEnabled && this.isUploadFromFileDesktopEnabled == apiPhotoCaptureUiSettings.isUploadFromFileDesktopEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isUploadFromFileDesktopEnabled) + r.i(r.i(r.i(Boolean.hashCode(this.isCropImageEnabled) * 31, 31, this.isDesktopCaptureEnabled), 31, this.isUploadFromFileEnabled), 31, this.isDetectionBackButtonEnabled);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiPhotoCaptureUiSettings(isCropImageEnabled=");
        sb2.append(this.isCropImageEnabled);
        sb2.append(", isDesktopCaptureEnabled=");
        sb2.append(this.isDesktopCaptureEnabled);
        sb2.append(", isUploadFromFileEnabled=");
        sb2.append(this.isUploadFromFileEnabled);
        sb2.append(", isDetectionBackButtonEnabled=");
        sb2.append(this.isDetectionBackButtonEnabled);
        sb2.append(", isUploadFromFileDesktopEnabled=");
        return r.x(sb2, this.isUploadFromFileDesktopEnabled, ')');
    }
}
