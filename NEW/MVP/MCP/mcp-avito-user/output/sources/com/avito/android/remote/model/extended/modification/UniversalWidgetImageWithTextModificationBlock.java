package com.avito.android.remote.model.extended.modification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.extended.UniversalWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetSectionModification.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModificationBlock;", "Landroid/os/Parcelable;", "", "title", "description", "", "imageId", "desktopImageId", "mobileImageId", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;)Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModificationBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/lang/Long;", "getImageId", "getDesktopImageId", "getMobileImageId", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextColor;", "getTextColor", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetImageWithTextModificationBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalWidgetImageWithTextModificationBlock> CREATOR = new Creator();

    @l
    private final String description;

    @l
    private final Long desktopImageId;

    @l
    private final Long imageId;

    @l
    private final Long mobileImageId;

    @l
    private final UniversalWidget.UniversalWidgetTextColor textColor;

    @l
    private final String title;

    /* compiled from: UniversalWidgetSectionModification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetImageWithTextModificationBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextModificationBlock createFromParcel(@k Parcel parcel) {
            return new UniversalWidgetImageWithTextModificationBlock(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : UniversalWidget.UniversalWidgetTextColor.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextModificationBlock[] newArray(int i12) {
            return new UniversalWidgetImageWithTextModificationBlock[i12];
        }
    }

    public UniversalWidgetImageWithTextModificationBlock(@l String str, @l String str2, @l Long l12, @l Long l13, @l Long l14, @l UniversalWidget.UniversalWidgetTextColor universalWidgetTextColor) {
        this.title = str;
        this.description = str2;
        this.imageId = l12;
        this.desktopImageId = l13;
        this.mobileImageId = l14;
        this.textColor = universalWidgetTextColor;
    }

    public static /* synthetic */ UniversalWidgetImageWithTextModificationBlock copy$default(UniversalWidgetImageWithTextModificationBlock universalWidgetImageWithTextModificationBlock, String str, String str2, Long l12, Long l13, Long l14, UniversalWidget.UniversalWidgetTextColor universalWidgetTextColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = universalWidgetImageWithTextModificationBlock.title;
        }
        if ((i12 & 2) != 0) {
            str2 = universalWidgetImageWithTextModificationBlock.description;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            l12 = universalWidgetImageWithTextModificationBlock.imageId;
        }
        Long l15 = l12;
        if ((i12 & 8) != 0) {
            l13 = universalWidgetImageWithTextModificationBlock.desktopImageId;
        }
        Long l16 = l13;
        if ((i12 & 16) != 0) {
            l14 = universalWidgetImageWithTextModificationBlock.mobileImageId;
        }
        Long l17 = l14;
        if ((i12 & 32) != 0) {
            universalWidgetTextColor = universalWidgetImageWithTextModificationBlock.textColor;
        }
        return universalWidgetImageWithTextModificationBlock.copy(str, str3, l15, l16, l17, universalWidgetTextColor);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Long getImageId() {
        return this.imageId;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Long getDesktopImageId() {
        return this.desktopImageId;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Long getMobileImageId() {
        return this.mobileImageId;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UniversalWidget.UniversalWidgetTextColor getTextColor() {
        return this.textColor;
    }

    @k
    public final UniversalWidgetImageWithTextModificationBlock copy(@l String title, @l String description, @l Long imageId, @l Long desktopImageId, @l Long mobileImageId, @l UniversalWidget.UniversalWidgetTextColor textColor) {
        return new UniversalWidgetImageWithTextModificationBlock(title, description, imageId, desktopImageId, mobileImageId, textColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetImageWithTextModificationBlock)) {
            return false;
        }
        UniversalWidgetImageWithTextModificationBlock universalWidgetImageWithTextModificationBlock = (UniversalWidgetImageWithTextModificationBlock) other;
        return L.f(this.title, universalWidgetImageWithTextModificationBlock.title) && L.f(this.description, universalWidgetImageWithTextModificationBlock.description) && L.f(this.imageId, universalWidgetImageWithTextModificationBlock.imageId) && L.f(this.desktopImageId, universalWidgetImageWithTextModificationBlock.desktopImageId) && L.f(this.mobileImageId, universalWidgetImageWithTextModificationBlock.mobileImageId) && this.textColor == universalWidgetImageWithTextModificationBlock.textColor;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Long getDesktopImageId() {
        return this.desktopImageId;
    }

    @l
    public final Long getImageId() {
        return this.imageId;
    }

    @l
    public final Long getMobileImageId() {
        return this.mobileImageId;
    }

    @l
    public final UniversalWidget.UniversalWidgetTextColor getTextColor() {
        return this.textColor;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.imageId;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.desktopImageId;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.mobileImageId;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        UniversalWidget.UniversalWidgetTextColor universalWidgetTextColor = this.textColor;
        return iHashCode5 + (universalWidgetTextColor != null ? universalWidgetTextColor.hashCode() : 0);
    }

    @k
    public String toString() {
        return "UniversalWidgetImageWithTextModificationBlock(title=" + this.title + ", description=" + this.description + ", imageId=" + this.imageId + ", desktopImageId=" + this.desktopImageId + ", mobileImageId=" + this.mobileImageId + ", textColor=" + this.textColor + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Long l12 = this.imageId;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.desktopImageId;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Long l14 = this.mobileImageId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l14);
        }
        UniversalWidget.UniversalWidgetTextColor universalWidgetTextColor = this.textColor;
        if (universalWidgetTextColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetTextColor.name());
        }
    }
}
