package com.avito.android.publish.items.alert_banner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AlertBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/alert_banner/AlertBannerItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlertBannerItem implements com.avito.conveyor_item.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AlertBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f236743b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f236744c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f236745d;

    /* renamed from: e, reason: collision with root package name */
    public final int f236746e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f236747f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final DeepLink f236748g;

    /* compiled from: AlertBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AlertBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AlertBannerItem createFromParcel(Parcel parcel) {
            return new AlertBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(AlertBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AlertBannerItem[] newArray(int i12) {
            return new AlertBannerItem[i12];
        }
    }

    public AlertBannerItem(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @InterfaceC42150f int i12, @InterfaceC42165v @Y61.l Integer num, @Y61.l DeepLink deepLink) {
        this.f236743b = str;
        this.f236744c = str2;
        this.f236745d = str3;
        this.f236746e = i12;
        this.f236747f = num;
        this.f236748g = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertBannerItem)) {
            return false;
        }
        AlertBannerItem alertBannerItem = (AlertBannerItem) obj;
        return L.f(this.f236743b, alertBannerItem.f236743b) && L.f(this.f236744c, alertBannerItem.f236744c) && L.f(this.f236745d, alertBannerItem.f236745d) && this.f236746e == alertBannerItem.f236746e && L.f(this.f236747f, alertBannerItem.f236747f) && L.f(this.f236748g, alertBannerItem.f236748g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return getF200592b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200592b() {
        return this.f236743b;
    }

    public final int hashCode() {
        int iHashCode = this.f236743b.hashCode() * 31;
        String str = this.f236744c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f236745d;
        int iE2 = r.e(this.f236746e, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f236747f;
        int iHashCode3 = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        DeepLink deepLink = this.f236748g;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AlertBannerItem(stringId=");
        sb2.append(this.f236743b);
        sb2.append(", title=");
        sb2.append(this.f236744c);
        sb2.append(", body=");
        sb2.append(this.f236745d);
        sb2.append(", styleAttr=");
        sb2.append(this.f236746e);
        sb2.append(", drawableRes=");
        sb2.append(this.f236747f);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f236748g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f236743b);
        parcel.writeString(this.f236744c);
        parcel.writeString(this.f236745d);
        parcel.writeInt(this.f236746e);
        Integer num = this.f236747f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f236748g, i12);
    }
}
