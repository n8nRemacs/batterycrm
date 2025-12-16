package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileUniversalWidget.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionBlock;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/UniversalWidgetTextColor;", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/UniversalWidgetTextColor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/Image;", "component4", "()Lcom/avito/android/remote/model/UniversalWidgetTextColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/UniversalWidgetTextColor;)Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/remote/model/UniversalWidgetTextColor;", "getTextColor", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetImageWithTextSectionBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalWidgetImageWithTextSectionBlock> CREATOR = new Creator();

    @c("description")
    @l
    private final String description;

    @c("image")
    @l
    private final Image image;

    @c("textColor")
    @l
    private final UniversalWidgetTextColor textColor;

    @c("title")
    @l
    private final String title;

    /* compiled from: ExtendedProfileUniversalWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetImageWithTextSectionBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextSectionBlock createFromParcel(@k Parcel parcel) {
            return new UniversalWidgetImageWithTextSectionBlock(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(UniversalWidgetImageWithTextSectionBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : UniversalWidgetTextColor.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextSectionBlock[] newArray(int i12) {
            return new UniversalWidgetImageWithTextSectionBlock[i12];
        }
    }

    public UniversalWidgetImageWithTextSectionBlock(@l String str, @l String str2, @l Image image, @l UniversalWidgetTextColor universalWidgetTextColor) {
        this.title = str;
        this.description = str2;
        this.image = image;
        this.textColor = universalWidgetTextColor;
    }

    public static /* synthetic */ UniversalWidgetImageWithTextSectionBlock copy$default(UniversalWidgetImageWithTextSectionBlock universalWidgetImageWithTextSectionBlock, String str, String str2, Image image, UniversalWidgetTextColor universalWidgetTextColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = universalWidgetImageWithTextSectionBlock.title;
        }
        if ((i12 & 2) != 0) {
            str2 = universalWidgetImageWithTextSectionBlock.description;
        }
        if ((i12 & 4) != 0) {
            image = universalWidgetImageWithTextSectionBlock.image;
        }
        if ((i12 & 8) != 0) {
            universalWidgetTextColor = universalWidgetImageWithTextSectionBlock.textColor;
        }
        return universalWidgetImageWithTextSectionBlock.copy(str, str2, image, universalWidgetTextColor);
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
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalWidgetTextColor getTextColor() {
        return this.textColor;
    }

    @k
    public final UniversalWidgetImageWithTextSectionBlock copy(@l String title, @l String description, @l Image image, @l UniversalWidgetTextColor textColor) {
        return new UniversalWidgetImageWithTextSectionBlock(title, description, image, textColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetImageWithTextSectionBlock)) {
            return false;
        }
        UniversalWidgetImageWithTextSectionBlock universalWidgetImageWithTextSectionBlock = (UniversalWidgetImageWithTextSectionBlock) other;
        return L.f(this.title, universalWidgetImageWithTextSectionBlock.title) && L.f(this.description, universalWidgetImageWithTextSectionBlock.description) && L.f(this.image, universalWidgetImageWithTextSectionBlock.image) && this.textColor == universalWidgetImageWithTextSectionBlock.textColor;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final UniversalWidgetTextColor getTextColor() {
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
        Image image = this.image;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        UniversalWidgetTextColor universalWidgetTextColor = this.textColor;
        return iHashCode3 + (universalWidgetTextColor != null ? universalWidgetTextColor.hashCode() : 0);
    }

    @k
    public String toString() {
        return "UniversalWidgetImageWithTextSectionBlock(title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", textColor=" + this.textColor + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.image, flags);
        UniversalWidgetTextColor universalWidgetTextColor = this.textColor;
        if (universalWidgetTextColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetTextColor.name());
        }
    }
}
