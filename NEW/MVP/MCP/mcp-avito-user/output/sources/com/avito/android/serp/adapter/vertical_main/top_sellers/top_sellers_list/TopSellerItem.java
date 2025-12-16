package com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.vertical_main.TopSeller;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: TopSellerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/top_sellers_list/TopSellerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopSellerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<TopSellerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f273262b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f273263c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f273264d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f273265e;

    /* renamed from: f, reason: collision with root package name */
    public final int f273266f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TopSeller f273267g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Analytics f273268h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Map<String, String> f273269i;

    /* compiled from: TopSellerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TopSellerItem> {
        @Override // android.os.Parcelable.Creator
        public final TopSellerItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(TopSellerItem.class.getClassLoader());
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            TopSeller topSeller = (TopSeller) parcel.readParcelable(TopSellerItem.class.getClassLoader());
            Analytics analytics = (Analytics) parcel.readParcelable(TopSellerItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                int iA2 = 0;
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new TopSellerItem(string, string2, image, string3, i12, topSeller, analytics, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TopSellerItem[] newArray(int i12) {
            return new TopSellerItem[i12];
        }
    }

    public TopSellerItem(@k String str, @k String str2, @k Image image, @k String str3, int i12, @k TopSeller topSeller, @l Analytics analytics, @l Map<String, String> map) {
        this.f273262b = str;
        this.f273263c = str2;
        this.f273264d = image;
        this.f273265e = str3;
        this.f273266f = i12;
        this.f273267g = topSeller;
        this.f273268h = analytics;
        this.f273269i = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF221050b() {
        return this.f273262b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f273262b);
        parcel.writeString(this.f273263c);
        parcel.writeParcelable(this.f273264d, i12);
        parcel.writeString(this.f273265e);
        parcel.writeInt(this.f273266f);
        parcel.writeParcelable(this.f273267g, i12);
        parcel.writeParcelable(this.f273268h, i12);
        Map<String, String> map = this.f273269i;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
