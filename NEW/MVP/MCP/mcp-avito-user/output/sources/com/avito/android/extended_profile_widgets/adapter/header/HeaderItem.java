package com.avito.android.extended_profile_widgets.adapter.header;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ProfileRating;
import com.avito.android.remote.model.SubscribeInfo;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/header/HeaderItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeaderItem implements ExtendedProfileWidgetItem {

    @Y61.k
    public static final Parcelable.Creator<HeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f154417b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GridElementType f154418c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f154419d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f154420e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f154421f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AvatarShape f154422g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Image f154423h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ProfileRating f154424i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final SubscribeInfo f154425j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f154426k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f154427l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f154428m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f154429n;

    /* compiled from: HeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final HeaderItem createFromParcel(Parcel parcel) {
            return new HeaderItem(parcel.readString(), (GridElementType) parcel.readParcelable(HeaderItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), AvatarShape.valueOf(parcel.readString()), (Image) parcel.readParcelable(HeaderItem.class.getClassLoader()), (ProfileRating) parcel.readParcelable(HeaderItem.class.getClassLoader()), (SubscribeInfo) parcel.readParcelable(HeaderItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderItem[] newArray(int i12) {
            return new HeaderItem[i12];
        }
    }

    public HeaderItem(@Y61.k String str, @Y61.k GridElementType gridElementType, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.k AvatarShape avatarShape, @Y61.l Image image, @Y61.l ProfileRating profileRating, @Y61.l SubscribeInfo subscribeInfo, boolean z12, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7) {
        this.f154417b = str;
        this.f154418c = gridElementType;
        this.f154419d = str2;
        this.f154420e = str3;
        this.f154421f = str4;
        this.f154422g = avatarShape;
        this.f154423h = image;
        this.f154424i = profileRating;
        this.f154425j = subscribeInfo;
        this.f154426k = z12;
        this.f154427l = str5;
        this.f154428m = str6;
        this.f154429n = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderItem)) {
            return false;
        }
        HeaderItem headerItem = (HeaderItem) obj;
        return L.f(this.f154417b, headerItem.f154417b) && L.f(this.f154418c, headerItem.f154418c) && L.f(this.f154419d, headerItem.f154419d) && L.f(this.f154420e, headerItem.f154420e) && L.f(this.f154421f, headerItem.f154421f) && this.f154422g == headerItem.f154422g && L.f(this.f154423h, headerItem.f154423h) && L.f(this.f154424i, headerItem.f154424i) && L.f(this.f154425j, headerItem.f154425j) && this.f154426k == headerItem.f154426k && L.f(this.f154427l, headerItem.f154427l) && L.f(this.f154428m, headerItem.f154428m) && L.f(this.f154429n, headerItem.f154429n);
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154919c() {
        return this.f154418c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF138457b() {
        return this.f154417b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154418c, this.f154417b.hashCode() * 31, 31), 31, this.f154419d), 31, this.f154420e);
        String str = this.f154421f;
        int iHashCode = (this.f154422g.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Image image = this.f154423h;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        ProfileRating profileRating = this.f154424i;
        int iHashCode3 = (iHashCode2 + (profileRating == null ? 0 : profileRating.hashCode())) * 31;
        SubscribeInfo subscribeInfo = this.f154425j;
        int i12 = r.i((iHashCode3 + (subscribeInfo == null ? 0 : subscribeInfo.hashCode())) * 31, 31, this.f154426k);
        String str2 = this.f154427l;
        int iHashCode4 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f154428m;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f154429n;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f154417b);
        sb2.append(", gridType=");
        sb2.append(this.f154418c);
        sb2.append(", userKey=");
        sb2.append(this.f154419d);
        sb2.append(", name=");
        sb2.append(this.f154420e);
        sb2.append(", description=");
        sb2.append(this.f154421f);
        sb2.append(", avatarShape=");
        sb2.append(this.f154422g);
        sb2.append(", avatar=");
        sb2.append(this.f154423h);
        sb2.append(", rating=");
        sb2.append(this.f154424i);
        sb2.append(", subscribeInfo=");
        sb2.append(this.f154425j);
        sb2.append(", isSubscriptionProgress=");
        sb2.append(this.f154426k);
        sb2.append(", contextId=");
        sb2.append(this.f154427l);
        sb2.append(", profileSession=");
        sb2.append(this.f154428m);
        sb2.append(", companyName=");
        return C22026a.c(sb2, this.f154429n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f154417b);
        parcel.writeParcelable(this.f154418c, i12);
        parcel.writeString(this.f154419d);
        parcel.writeString(this.f154420e);
        parcel.writeString(this.f154421f);
        parcel.writeString(this.f154422g.name());
        parcel.writeParcelable(this.f154423h, i12);
        parcel.writeParcelable(this.f154424i, i12);
        parcel.writeParcelable(this.f154425j, i12);
        parcel.writeInt(this.f154426k ? 1 : 0);
        parcel.writeString(this.f154427l);
        parcel.writeString(this.f154428m);
        parcel.writeString(this.f154429n);
    }

    public /* synthetic */ HeaderItem(String str, GridElementType gridElementType, String str2, String str3, String str4, AvatarShape avatarShape, Image image, ProfileRating profileRating, SubscribeInfo subscribeInfo, boolean z12, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, str3, str4, avatarShape, image, profileRating, subscribeInfo, z12, str5, str6, str7);
    }
}
