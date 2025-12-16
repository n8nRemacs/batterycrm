package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SerpElement;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MyTargetNetworkBannerItem.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Bw\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\f\u0012\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\"\u0010\u001eR-\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R-\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b&\u0010%R\"\u0010(\u001a\u00020'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/advertising/MyTargetNetworkBannerItem;", "Lcom/avito/android/remote/model/advertising/AdNetworkBannerItem;", "", "Lcom/avito/android/remote/model/SerpElement;", "blockId", "", "alid", "bannerCode", "categoryId", "microCategoryId", SearchParamsConverterKt.LOCATION_ID, "", "LK51/e;", "params", "analyticParams", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getBlockId", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getAlid", "()Ljava/lang/String;", "getBannerCode", "getCategoryId", "getMicroCategoryId", "getLocationId", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getAnalyticParams", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MyTargetNetworkBannerItem implements AdNetworkBannerItem<Integer>, SerpElement {

    @k
    public static final Parcelable.Creator<MyTargetNetworkBannerItem> CREATOR = new Creator();

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
    private final int blockId;

    @c("categoryId")
    @l
    private final String categoryId;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    @c("microCategoryId")
    @l
    private final String microCategoryId;

    @c("params")
    @l
    private final Map<String, String> params;
    private long uniqueId;

    /* compiled from: MyTargetNetworkBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MyTargetNetworkBannerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyTargetNetworkBannerItem createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int iA2 = 0;
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                int iA3 = 0;
                while (iA3 != i13) {
                    iA3 = C0.a(parcel, linkedHashMap, parcel.readString(), iA3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i14);
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
            }
            return new MyTargetNetworkBannerItem(i12, string, string2, string3, string4, string5, linkedHashMap, linkedHashMap2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyTargetNetworkBannerItem[] newArray(int i12) {
            return new MyTargetNetworkBannerItem[i12];
        }
    }

    public MyTargetNetworkBannerItem(int i12, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l Map<String, String> map, @l Map<String, String> map2) {
        this.blockId = i12;
        this.alid = str;
        this.bannerCode = str2;
        this.categoryId = str3;
        this.microCategoryId = str4;
        this.locationId = str5;
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

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.blockId);
        parcel.writeString(this.alid);
        parcel.writeString(this.bannerCode);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.microCategoryId);
        parcel.writeString(this.locationId);
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.advertising.AdNetworkBannerItem
    @k
    public Integer getBlockId() {
        return Integer.valueOf(this.blockId);
    }
}
