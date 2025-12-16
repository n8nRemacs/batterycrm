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

/* compiled from: BuzzoolaNetworkBannerItem.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B{\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u001b\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0002\b\f\u0012\u001b\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b!\u0010\u001cR/\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0002\b\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$R/\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0002\b\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b%\u0010$R\"\u0010'\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/advertising/BuzzoolaNetworkBannerItem;", "Lcom/avito/android/remote/model/advertising/AdNetworkBannerItem;", "", "Lcom/avito/android/remote/model/SerpElement;", "blockId", "alid", "bannerCode", "categoryId", "microCategoryId", SearchParamsConverterKt.LOCATION_ID, "", "", "LK51/e;", "params", "analyticParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBlockId", "()Ljava/lang/String;", "getAlid", "getBannerCode", "getCategoryId", "getMicroCategoryId", "getLocationId", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getAnalyticParams", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuzzoolaNetworkBannerItem implements AdNetworkBannerItem<String>, SerpElement {

    @k
    public static final Parcelable.Creator<BuzzoolaNetworkBannerItem> CREATOR = new Creator();

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

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    @c("microCategoryId")
    @l
    private final String microCategoryId;

    @c("params")
    @l
    private final Map<String, Object> params;
    private transient long uniqueId;

    /* compiled from: BuzzoolaNetworkBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuzzoolaNetworkBannerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuzzoolaNetworkBannerItem createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(BuzzoolaNetworkBannerItem.class, parcel, linkedHashMap3, parcel.readString(), iC2, 1);
                    linkedHashMap3 = linkedHashMap3;
                }
                linkedHashMap = linkedHashMap3;
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = h.c(BuzzoolaNetworkBannerItem.class, parcel, linkedHashMap2, parcel.readString(), iC3, 1);
                }
            }
            return new BuzzoolaNetworkBannerItem(string, string2, string3, string4, string5, string6, linkedHashMap, linkedHashMap2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuzzoolaNetworkBannerItem[] newArray(int i12) {
            return new BuzzoolaNetworkBannerItem[i12];
        }
    }

    public BuzzoolaNetworkBannerItem(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l Map<String, ? extends Object> map, @l Map<String, ? extends Object> map2) {
        this.blockId = str;
        this.alid = str2;
        this.bannerCode = str3;
        this.categoryId = str4;
        this.microCategoryId = str5;
        this.locationId = str6;
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
    /* renamed from: getUniqueId, reason: from getter */
    public long getF105229b() {
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
