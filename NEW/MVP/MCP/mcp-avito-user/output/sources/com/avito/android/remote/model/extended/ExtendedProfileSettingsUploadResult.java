package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsUploadResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsUploadResult;", "", "imageId", "", "(J)V", "getImageId", "()J", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileSettingsUploadResult {

    @c("imageId")
    private final long imageId;

    public ExtendedProfileSettingsUploadResult(long j12) {
        this.imageId = j12;
    }

    public static /* synthetic */ ExtendedProfileSettingsUploadResult copy$default(ExtendedProfileSettingsUploadResult extendedProfileSettingsUploadResult, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = extendedProfileSettingsUploadResult.imageId;
        }
        return extendedProfileSettingsUploadResult.copy(j12);
    }

    /* renamed from: component1, reason: from getter */
    public final long getImageId() {
        return this.imageId;
    }

    @k
    public final ExtendedProfileSettingsUploadResult copy(long imageId) {
        return new ExtendedProfileSettingsUploadResult(imageId);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExtendedProfileSettingsUploadResult) && this.imageId == ((ExtendedProfileSettingsUploadResult) other).imageId;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public int hashCode() {
        return Long.hashCode(this.imageId);
    }

    @k
    public String toString() {
        return r.u(new StringBuilder("ExtendedProfileSettingsUploadResult(imageId="), this.imageId, ')');
    }
}
