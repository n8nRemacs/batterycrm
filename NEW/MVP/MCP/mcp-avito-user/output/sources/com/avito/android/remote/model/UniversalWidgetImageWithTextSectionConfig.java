package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ExtendedProfileUniversalWidget.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextImageRatio;", "imgRatio", "Lcom/avito/android/remote/model/UniversalWidgetTextPosition;", "textPosition", "<init>", "(Lcom/avito/android/remote/model/UniversalWidgetImageWithTextImageRatio;Lcom/avito/android/remote/model/UniversalWidgetTextPosition;)V", "component1", "()Lcom/avito/android/remote/model/UniversalWidgetImageWithTextImageRatio;", "component2", "()Lcom/avito/android/remote/model/UniversalWidgetTextPosition;", "copy", "(Lcom/avito/android/remote/model/UniversalWidgetImageWithTextImageRatio;Lcom/avito/android/remote/model/UniversalWidgetTextPosition;)Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextImageRatio;", "getImgRatio", "Lcom/avito/android/remote/model/UniversalWidgetTextPosition;", "getTextPosition", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetImageWithTextSectionConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalWidgetImageWithTextSectionConfig> CREATOR = new Creator();

    @c("imgRatio")
    @l
    private final UniversalWidgetImageWithTextImageRatio imgRatio;

    @c("textPosition")
    @l
    private final UniversalWidgetTextPosition textPosition;

    /* compiled from: ExtendedProfileUniversalWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetImageWithTextSectionConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextSectionConfig createFromParcel(@k Parcel parcel) {
            return new UniversalWidgetImageWithTextSectionConfig(parcel.readInt() == 0 ? null : UniversalWidgetImageWithTextImageRatio.valueOf(parcel.readString()), parcel.readInt() != 0 ? UniversalWidgetTextPosition.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextSectionConfig[] newArray(int i12) {
            return new UniversalWidgetImageWithTextSectionConfig[i12];
        }
    }

    public UniversalWidgetImageWithTextSectionConfig(@l UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio, @l UniversalWidgetTextPosition universalWidgetTextPosition) {
        this.imgRatio = universalWidgetImageWithTextImageRatio;
        this.textPosition = universalWidgetTextPosition;
    }

    public static /* synthetic */ UniversalWidgetImageWithTextSectionConfig copy$default(UniversalWidgetImageWithTextSectionConfig universalWidgetImageWithTextSectionConfig, UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio, UniversalWidgetTextPosition universalWidgetTextPosition, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalWidgetImageWithTextImageRatio = universalWidgetImageWithTextSectionConfig.imgRatio;
        }
        if ((i12 & 2) != 0) {
            universalWidgetTextPosition = universalWidgetImageWithTextSectionConfig.textPosition;
        }
        return universalWidgetImageWithTextSectionConfig.copy(universalWidgetImageWithTextImageRatio, universalWidgetTextPosition);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalWidgetImageWithTextImageRatio getImgRatio() {
        return this.imgRatio;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalWidgetTextPosition getTextPosition() {
        return this.textPosition;
    }

    @k
    public final UniversalWidgetImageWithTextSectionConfig copy(@l UniversalWidgetImageWithTextImageRatio imgRatio, @l UniversalWidgetTextPosition textPosition) {
        return new UniversalWidgetImageWithTextSectionConfig(imgRatio, textPosition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetImageWithTextSectionConfig)) {
            return false;
        }
        UniversalWidgetImageWithTextSectionConfig universalWidgetImageWithTextSectionConfig = (UniversalWidgetImageWithTextSectionConfig) other;
        return this.imgRatio == universalWidgetImageWithTextSectionConfig.imgRatio && this.textPosition == universalWidgetImageWithTextSectionConfig.textPosition;
    }

    @l
    public final UniversalWidgetImageWithTextImageRatio getImgRatio() {
        return this.imgRatio;
    }

    @l
    public final UniversalWidgetTextPosition getTextPosition() {
        return this.textPosition;
    }

    public int hashCode() {
        UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio = this.imgRatio;
        int iHashCode = (universalWidgetImageWithTextImageRatio == null ? 0 : universalWidgetImageWithTextImageRatio.hashCode()) * 31;
        UniversalWidgetTextPosition universalWidgetTextPosition = this.textPosition;
        return iHashCode + (universalWidgetTextPosition != null ? universalWidgetTextPosition.hashCode() : 0);
    }

    @k
    public String toString() {
        return "UniversalWidgetImageWithTextSectionConfig(imgRatio=" + this.imgRatio + ", textPosition=" + this.textPosition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio = this.imgRatio;
        if (universalWidgetImageWithTextImageRatio == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetImageWithTextImageRatio.name());
        }
        UniversalWidgetTextPosition universalWidgetTextPosition = this.textPosition;
        if (universalWidgetTextPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetTextPosition.name());
        }
    }
}
