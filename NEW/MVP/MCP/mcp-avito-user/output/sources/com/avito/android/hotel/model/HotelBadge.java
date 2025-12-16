package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotel.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/hotel/model/HotelBadge;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "titleColor", "subtitleColor", "", "title", "subtitle", "icon", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getTitleColor", "c", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getIcon", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelBadge> CREATOR = new a();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("icon")
    @l
    private final String icon;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("subtitleColor")
    @l
    private final UniversalColor subtitleColor;

    @c("title")
    @l
    private final String title;

    @c("titleColor")
    @l
    private final UniversalColor titleColor;

    /* compiled from: AdvertHotel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBadge> {
        @Override // android.os.Parcelable.Creator
        public final HotelBadge createFromParcel(Parcel parcel) {
            return new HotelBadge((UniversalColor) parcel.readParcelable(HotelBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(HotelBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(HotelBadge.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBadge[] newArray(int i12) {
            return new HotelBadge[i12];
        }
    }

    public HotelBadge(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @l String str, @l String str2, @l String str3) {
        this.backgroundColor = universalColor;
        this.titleColor = universalColor2;
        this.subtitleColor = universalColor3;
        this.title = str;
        this.subtitle = str2;
        this.icon = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalColor getSubtitleColor() {
        return this.subtitleColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBadge)) {
            return false;
        }
        HotelBadge hotelBadge = (HotelBadge) obj;
        return L.f(this.backgroundColor, hotelBadge.backgroundColor) && L.f(this.titleColor, hotelBadge.titleColor) && L.f(this.subtitleColor, hotelBadge.subtitleColor) && L.f(this.title, hotelBadge.title) && L.f(this.subtitle, hotelBadge.subtitle) && L.f(this.icon, hotelBadge.icon);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final String getIcon() {
        return this.icon;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final UniversalColor getTitleColor() {
        return this.titleColor;
    }

    public final int hashCode() {
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        UniversalColor universalColor2 = this.titleColor;
        int iHashCode2 = (iHashCode + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        UniversalColor universalColor3 = this.subtitleColor;
        int iHashCode3 = (iHashCode2 + (universalColor3 == null ? 0 : universalColor3.hashCode())) * 31;
        String str = this.title;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBadge(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", titleColor=");
        sb2.append(this.titleColor);
        sb2.append(", subtitleColor=");
        sb2.append(this.subtitleColor);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.backgroundColor, i12);
        parcel.writeParcelable(this.titleColor, i12);
        parcel.writeParcelable(this.subtitleColor, i12);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.icon);
    }
}
