package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SerpElement;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: YandexNetworkBannerItem.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B³\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0019\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u0013\u0012\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b(\u0010#R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b)\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b*\u0010#R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b+\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b,\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R-\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105R-\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0002\b\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b6\u00105R\"\u00108\u001a\u0002078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/advertising/YandexNetworkBannerItem;", "Lcom/avito/android/remote/model/advertising/AdNetworkBannerItem;", "", "Lcom/avito/android/remote/model/SerpElement;", "blockId", "alid", "bannerCode", "categoryId", "microCategoryId", SearchParamsConverterKt.LOCATION_ID, "partnerId", "hash", "statId", "query", "Lcom/avito/android/remote/model/Coordinates;", "location", "", "contextTags", "", "LK51/e;", "params", "analyticParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBlockId", "()Ljava/lang/String;", "getAlid", "getBannerCode", "getCategoryId", "getMicroCategoryId", "getLocationId", "getPartnerId", "getHash", "getStatId", "getQuery", "Lcom/avito/android/remote/model/Coordinates;", "getLocation", "()Lcom/avito/android/remote/model/Coordinates;", "Ljava/util/List;", "getContextTags", "()Ljava/util/List;", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getAnalyticParams", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class YandexNetworkBannerItem implements AdNetworkBannerItem<String>, SerpElement {

    @k
    public static final Parcelable.Creator<YandexNetworkBannerItem> CREATOR = new Creator();

    @c("alid")
    @l
    private final String alid;

    @c("analyticParams")
    @l
    private final Map<String, String> analyticParams;

    @c("bannerCode")
    @l
    private final String bannerCode;

    @c("id")
    @k
    private final String blockId;

    @c("categoryId")
    @l
    private final String categoryId;

    @com.avito.android.gson.c
    @c("contextTags")
    @k
    private final List<String> contextTags;

    @c("hash")
    @l
    private final String hash;

    @c("location")
    @l
    private final Coordinates location;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    @c("microCategoryId")
    @l
    private final String microCategoryId;

    @c("params")
    @l
    private final Map<String, String> params;

    @c("partnerId")
    @k
    private final String partnerId;

    @c("query")
    @l
    private final String query;

    @c("statId")
    @k
    private final String statId;
    private long uniqueId;

    /* compiled from: YandexNetworkBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YandexNetworkBannerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final YandexNetworkBannerItem createFromParcel(@k Parcel parcel) {
            ArrayList<String> arrayList;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            Coordinates coordinatesCreateFromParcel = parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = arrayListCreateStringArrayList;
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap4, parcel.readString(), iA2, 1);
                    i12 = i12;
                    arrayListCreateStringArrayList = arrayListCreateStringArrayList;
                }
                arrayList = arrayListCreateStringArrayList;
                linkedHashMap = linkedHashMap4;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = linkedHashMap;
                linkedHashMap2 = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i13);
                int iA3 = 0;
                while (iA3 != i13) {
                    iA3 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA3, 1);
                    i13 = i13;
                    linkedHashMap = linkedHashMap;
                }
                linkedHashMap3 = linkedHashMap;
            }
            return new YandexNetworkBannerItem(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, coordinatesCreateFromParcel, arrayList, linkedHashMap3, linkedHashMap2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final YandexNetworkBannerItem[] newArray(int i12) {
            return new YandexNetworkBannerItem[i12];
        }
    }

    public YandexNetworkBannerItem(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @k String str7, @l String str8, @k String str9, @l String str10, @l Coordinates coordinates, @k List<String> list, @l Map<String, String> map, @l Map<String, String> map2) {
        this.blockId = str;
        this.alid = str2;
        this.bannerCode = str3;
        this.categoryId = str4;
        this.microCategoryId = str5;
        this.locationId = str6;
        this.partnerId = str7;
        this.hash = str8;
        this.statId = str9;
        this.query = str10;
        this.location = coordinates;
        this.contextTags = list;
        this.params = map;
        this.analyticParams = map2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.advertising.AdNetworkBannerItem
    @l
    public String getAlid() {
        return this.alid;
    }

    @l
    public final Map<String, String> getAnalyticParams() {
        return this.analyticParams;
    }

    @Override // com.avito.android.remote.model.advertising.AdNetworkBannerItem
    @l
    public String getBannerCode() {
        return this.bannerCode;
    }

    @Override // com.avito.android.remote.model.advertising.AdNetworkBannerItem
    @l
    public String getCategoryId() {
        return this.categoryId;
    }

    @k
    public final List<String> getContextTags() {
        return this.contextTags;
    }

    @l
    public final String getHash() {
        return this.hash;
    }

    @l
    public final Coordinates getLocation() {
        return this.location;
    }

    @Override // com.avito.android.remote.model.advertising.AdNetworkBannerItem
    @l
    public String getLocationId() {
        return this.locationId;
    }

    @Override // com.avito.android.remote.model.advertising.AdNetworkBannerItem
    @l
    public String getMicroCategoryId() {
        return this.microCategoryId;
    }

    @l
    public final Map<String, String> getParams() {
        return this.params;
    }

    @k
    public final String getPartnerId() {
        return this.partnerId;
    }

    @l
    public final String getQuery() {
        return this.query;
    }

    @k
    public final String getStatId() {
        return this.statId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public long getF231611b() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.blockId);
        parcel.writeString(this.alid);
        parcel.writeString(this.bannerCode);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.microCategoryId);
        parcel.writeString(this.locationId);
        parcel.writeString(this.partnerId);
        parcel.writeString(this.hash);
        parcel.writeString(this.statId);
        parcel.writeString(this.query);
        Coordinates coordinates = this.location;
        if (coordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coordinates.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.contextTags);
        Map<String, String> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Map<String, String> map2 = this.analyticParams;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH2 = C0.h(parcel, 1, map2);
        while (itH2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }

    @Override // com.avito.android.remote.model.advertising.AdNetworkBannerItem
    @k
    public String getBlockId() {
        return this.blockId;
    }
}
