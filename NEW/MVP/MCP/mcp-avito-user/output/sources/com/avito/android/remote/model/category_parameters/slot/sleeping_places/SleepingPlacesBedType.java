package com.avito.android.remote.model.category_parameters.slot.sleeping_places;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SleepingPlacesSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JJ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesBedType;", "Landroid/os/Parcelable;", "", "id", "", "title", "subtitle", "Lcom/avito/android/remote/model/Image;", "defaultIcon", "activeIcon", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesBedType;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/Image;", "getDefaultIcon", "getActiveIcon", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SleepingPlacesBedType implements Parcelable {

    @k
    public static final Parcelable.Creator<SleepingPlacesBedType> CREATOR = new Creator();

    @c("activeIcon")
    @l
    private final Image activeIcon;

    @c("defaultIcon")
    @l
    private final Image defaultIcon;

    @c("id")
    private final int id;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: SleepingPlacesSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SleepingPlacesBedType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SleepingPlacesBedType createFromParcel(@k Parcel parcel) {
            return new SleepingPlacesBedType(parcel.readInt(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(SleepingPlacesBedType.class.getClassLoader()), (Image) parcel.readParcelable(SleepingPlacesBedType.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SleepingPlacesBedType[] newArray(int i12) {
            return new SleepingPlacesBedType[i12];
        }
    }

    public SleepingPlacesBedType(int i12, @l String str, @l String str2, @l Image image, @l Image image2) {
        this.id = i12;
        this.title = str;
        this.subtitle = str2;
        this.defaultIcon = image;
        this.activeIcon = image2;
    }

    public static /* synthetic */ SleepingPlacesBedType copy$default(SleepingPlacesBedType sleepingPlacesBedType, int i12, String str, String str2, Image image, Image image2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = sleepingPlacesBedType.id;
        }
        if ((i13 & 2) != 0) {
            str = sleepingPlacesBedType.title;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = sleepingPlacesBedType.subtitle;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            image = sleepingPlacesBedType.defaultIcon;
        }
        Image image3 = image;
        if ((i13 & 16) != 0) {
            image2 = sleepingPlacesBedType.activeIcon;
        }
        return sleepingPlacesBedType.copy(i12, str3, str4, image3, image2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getDefaultIcon() {
        return this.defaultIcon;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Image getActiveIcon() {
        return this.activeIcon;
    }

    @k
    public final SleepingPlacesBedType copy(int id2, @l String title, @l String subtitle, @l Image defaultIcon, @l Image activeIcon) {
        return new SleepingPlacesBedType(id2, title, subtitle, defaultIcon, activeIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepingPlacesBedType)) {
            return false;
        }
        SleepingPlacesBedType sleepingPlacesBedType = (SleepingPlacesBedType) other;
        return this.id == sleepingPlacesBedType.id && L.f(this.title, sleepingPlacesBedType.title) && L.f(this.subtitle, sleepingPlacesBedType.subtitle) && L.f(this.defaultIcon, sleepingPlacesBedType.defaultIcon) && L.f(this.activeIcon, sleepingPlacesBedType.activeIcon);
    }

    @l
    public final Image getActiveIcon() {
        return this.activeIcon;
    }

    @l
    public final Image getDefaultIcon() {
        return this.defaultIcon;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.defaultIcon;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.activeIcon;
        return iHashCode4 + (image2 != null ? image2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SleepingPlacesBedType(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", defaultIcon=");
        sb2.append(this.defaultIcon);
        sb2.append(", activeIcon=");
        return AK.c.o(sb2, this.activeIcon, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.defaultIcon, flags);
        parcel.writeParcelable(this.activeIcon, flags);
    }
}
