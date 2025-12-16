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
import org.webrtc.h;

/* compiled from: CreativeNetworkBannerItem.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u001b\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0002\b\r\u0012\u001b\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b#\u0010\u001dR/\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0002\b\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R/\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0002\b\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b'\u0010&R\"\u0010)\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/advertising/CreativeNetworkBannerItem;", "Lcom/avito/android/remote/model/advertising/AdNetworkBannerItem;", "", "Lcom/avito/android/remote/model/SerpElement;", "blockId", "alid", "bannerCode", "categoryId", "microCategoryId", SearchParamsConverterKt.LOCATION_ID, "creativeId", "", "", "LK51/e;", "params", "analyticParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBlockId", "()Ljava/lang/String;", "getAlid", "getBannerCode", "getCategoryId", "getMicroCategoryId", "getLocationId", "getCreativeId", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getAnalyticParams", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CreativeNetworkBannerItem implements AdNetworkBannerItem<String>, SerpElement {

    @k
    public static final Parcelable.Creator<CreativeNetworkBannerItem> CREATOR = new Creator();

    @c("alid")
    @l
    private final String alid;

    @c("analyticParams")
    @l
    private final Map<String, Object> analyticParams;

    @c("bannerCode")
    @l
    private final String bannerCode;

    @c("id")
    @k
    private final String blockId;

    @c("categoryId")
    @l
    private final String categoryId;

    @c("creativeId")
    @l
    private final String creativeId;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    @c("microCategoryId")
    @l
    private final String microCategoryId;

    @c("params")
    @l
    private final Map<String, Object> params;
    private long uniqueId;

    /* compiled from: CreativeNetworkBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreativeNetworkBannerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CreativeNetworkBannerItem createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(CreativeNetworkBannerItem.class, parcel, linkedHashMap3, parcel.readString(), iC2, 1);
                    linkedHashMap3 = linkedHashMap3;
                }
                linkedHashMap = linkedHashMap3;
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = h.c(CreativeNetworkBannerItem.class, parcel, linkedHashMap4, parcel.readString(), iC3, 1);
                    linkedHashMap4 = linkedHashMap4;
                }
                linkedHashMap2 = linkedHashMap4;
            }
            return new CreativeNetworkBannerItem(string, string2, string3, string4, string5, string6, string7, linkedHashMap, linkedHashMap2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CreativeNetworkBannerItem[] newArray(int i12) {
            return new CreativeNetworkBannerItem[i12];
        }
    }

    public CreativeNetworkBannerItem(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l Map<String, ? extends Object> map, @l Map<String, ? extends Object> map2) {
        this.blockId = str;
        this.alid = str2;
        this.bannerCode = str3;
        this.categoryId = str4;
        this.microCategoryId = str5;
        this.locationId = str6;
        this.creativeId = str7;
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
    public final Map<String, Object> getAnalyticParams() {
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

    @l
    public final String getCreativeId() {
        return this.creativeId;
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
    public final Map<String, Object> getParams() {
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
        parcel.writeString(this.blockId);
        parcel.writeString(this.alid);
        parcel.writeString(this.bannerCode);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.microCategoryId);
        parcel.writeString(this.locationId);
        parcel.writeString(this.creativeId);
        Map<String, Object> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        Map<String, Object> map2 = this.analyticParams;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH2 = C0.h(parcel, 1, map2);
        while (itH2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH2.next();
            h.h(parcel, (String) entry2.getKey(), entry2);
        }
    }

    @Override // com.avito.android.remote.model.advertising.AdNetworkBannerItem
    @k
    public String getBlockId() {
        return this.blockId;
    }
}
