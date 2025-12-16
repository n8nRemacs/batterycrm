package com.avito.android.advert_core.price_list.v2;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertPriceListV2Item.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/v2/AdvertPriceListV2Item;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertPriceListV2Item implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdvertPriceListV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f84135b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f84136c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f84137d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f84138e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f84139f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ImvServices f84140g;

    /* compiled from: AdvertPriceListV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertPriceListV2Item> {
        @Override // android.os.Parcelable.Creator
        public final AdvertPriceListV2Item createFromParcel(Parcel parcel) {
            return new AdvertPriceListV2Item(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ImvServices) parcel.readParcelable(AdvertPriceListV2Item.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertPriceListV2Item[] newArray(int i12) {
            return new AdvertPriceListV2Item[i12];
        }
    }

    public AdvertPriceListV2Item(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l ImvServices imvServices) {
        this.f84135b = str;
        this.f84136c = str2;
        this.f84137d = str3;
        this.f84138e = str4;
        this.f84139f = str5;
        this.f84140g = imvServices;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertPriceListV2Item)) {
            return false;
        }
        AdvertPriceListV2Item advertPriceListV2Item = (AdvertPriceListV2Item) obj;
        return L.f(this.f84135b, advertPriceListV2Item.f84135b) && L.f(this.f84136c, advertPriceListV2Item.f84136c) && L.f(this.f84137d, advertPriceListV2Item.f84137d) && L.f(this.f84138e, advertPriceListV2Item.f84138e) && L.f(this.f84139f, advertPriceListV2Item.f84139f) && L.f(this.f84140g, advertPriceListV2Item.f84140g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82737f() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF82736e() {
        return this.f84135b;
    }

    public final int hashCode() {
        int iHashCode = this.f84135b.hashCode() * 31;
        String str = this.f84136c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84137d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84138e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f84139f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ImvServices imvServices = this.f84140g;
        return iHashCode5 + (imvServices != null ? imvServices.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AdvertPriceListV2Item(stringId=" + this.f84135b + ", title=" + this.f84136c + ", subtitle=" + this.f84137d + ", price=" + this.f84138e + ", subprice=" + this.f84139f + ", imvServices=" + this.f84140g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f84135b);
        parcel.writeString(this.f84136c);
        parcel.writeString(this.f84137d);
        parcel.writeString(this.f84138e);
        parcel.writeString(this.f84139f);
        parcel.writeParcelable(this.f84140g, i12);
    }
}
