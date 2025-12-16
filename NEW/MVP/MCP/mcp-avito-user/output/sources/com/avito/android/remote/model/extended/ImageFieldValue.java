package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/ImageFieldValue;", "", "valueId", "", "value", "Lcom/avito/android/remote/model/Image;", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Lcom/avito/android/remote/model/Image;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImageFieldValue {

    @c("status")
    @l
    private final FieldModerationStatus status;

    @c("value")
    @k
    private final Image value;

    @c("valueId")
    @k
    private final String valueId;

    public ImageFieldValue(@k String str, @k Image image, @l FieldModerationStatus fieldModerationStatus) {
        this.valueId = str;
        this.value = image;
        this.status = fieldModerationStatus;
    }

    public static /* synthetic */ ImageFieldValue copy$default(ImageFieldValue imageFieldValue, String str, Image image, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imageFieldValue.valueId;
        }
        if ((i12 & 2) != 0) {
            image = imageFieldValue.value;
        }
        if ((i12 & 4) != 0) {
            fieldModerationStatus = imageFieldValue.status;
        }
        return imageFieldValue.copy(str, image, fieldModerationStatus);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getValueId() {
        return this.valueId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Image getValue() {
        return this.value;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final FieldModerationStatus getStatus() {
        return this.status;
    }

    @k
    public final ImageFieldValue copy(@k String valueId, @k Image value, @l FieldModerationStatus status) {
        return new ImageFieldValue(valueId, value, status);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageFieldValue)) {
            return false;
        }
        ImageFieldValue imageFieldValue = (ImageFieldValue) other;
        return L.f(this.valueId, imageFieldValue.valueId) && L.f(this.value, imageFieldValue.value) && L.f(this.status, imageFieldValue.status);
    }

    @l
    public final FieldModerationStatus getStatus() {
        return this.status;
    }

    @k
    public final Image getValue() {
        return this.value;
    }

    @k
    public final String getValueId() {
        return this.valueId;
    }

    public int hashCode() {
        int iG2 = a.g(this.value, this.valueId.hashCode() * 31, 31);
        FieldModerationStatus fieldModerationStatus = this.status;
        return iG2 + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode());
    }

    @k
    public String toString() {
        return "ImageFieldValue(valueId=" + this.valueId + ", value=" + this.value + ", status=" + this.status + ')';
    }
}
