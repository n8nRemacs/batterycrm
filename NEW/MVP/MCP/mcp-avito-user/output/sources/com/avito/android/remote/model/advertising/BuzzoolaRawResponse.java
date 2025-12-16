package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaRawResponse.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0018¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/advertising/BuzzoolaRawResponse;", "Landroid/os/Parcelable;", "", "adNetworkName", "Lcom/avito/android/remote/model/advertising/BuzzoolaAdType;", "adType", "", "Lcom/avito/android/remote/model/advertising/BuzzoolaRawAsset;", "assets", "Lcom/avito/android/remote/model/advertising/BuzzoolaRawEventUrls;", "eventUrls", "Lcom/avito/android/remote/model/advertising/BuzzoolaRawConfig;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/advertising/BuzzoolaAdType;Ljava/util/List;Lcom/avito/android/remote/model/advertising/BuzzoolaRawEventUrls;Lcom/avito/android/remote/model/advertising/BuzzoolaRawConfig;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/advertising/BuzzoolaAdType;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/advertising/BuzzoolaRawEventUrls;", "component5", "()Lcom/avito/android/remote/model/advertising/BuzzoolaRawConfig;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/advertising/BuzzoolaAdType;Ljava/util/List;Lcom/avito/android/remote/model/advertising/BuzzoolaRawEventUrls;Lcom/avito/android/remote/model/advertising/BuzzoolaRawConfig;)Lcom/avito/android/remote/model/advertising/BuzzoolaRawResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAdNetworkName", "Lcom/avito/android/remote/model/advertising/BuzzoolaAdType;", "getAdType", "Ljava/util/List;", "getAssets", "Lcom/avito/android/remote/model/advertising/BuzzoolaRawEventUrls;", "getEventUrls", "Lcom/avito/android/remote/model/advertising/BuzzoolaRawConfig;", "getConfig", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BuzzoolaRawResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<BuzzoolaRawResponse> CREATOR = new Creator();

    @c("ad_network_name")
    @l
    private final String adNetworkName;

    @c("ad_type")
    @l
    private final BuzzoolaAdType adType;

    @c("assets")
    @l
    private final List<BuzzoolaRawAsset> assets;

    @c(Navigation.CONFIG)
    @l
    private final BuzzoolaRawConfig config;

    @c("event_urls")
    @l
    private final BuzzoolaRawEventUrls eventUrls;

    /* compiled from: BuzzoolaRawResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuzzoolaRawResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuzzoolaRawResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            BuzzoolaAdType buzzoolaAdTypeCreateFromParcel = parcel.readInt() == 0 ? null : BuzzoolaAdType.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(BuzzoolaRawAsset.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new BuzzoolaRawResponse(string, buzzoolaAdTypeCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : BuzzoolaRawEventUrls.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BuzzoolaRawConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuzzoolaRawResponse[] newArray(int i12) {
            return new BuzzoolaRawResponse[i12];
        }
    }

    public BuzzoolaRawResponse(@l String str, @l BuzzoolaAdType buzzoolaAdType, @l List<BuzzoolaRawAsset> list, @l BuzzoolaRawEventUrls buzzoolaRawEventUrls, @l BuzzoolaRawConfig buzzoolaRawConfig) {
        this.adNetworkName = str;
        this.adType = buzzoolaAdType;
        this.assets = list;
        this.eventUrls = buzzoolaRawEventUrls;
        this.config = buzzoolaRawConfig;
    }

    public static /* synthetic */ BuzzoolaRawResponse copy$default(BuzzoolaRawResponse buzzoolaRawResponse, String str, BuzzoolaAdType buzzoolaAdType, List list, BuzzoolaRawEventUrls buzzoolaRawEventUrls, BuzzoolaRawConfig buzzoolaRawConfig, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = buzzoolaRawResponse.adNetworkName;
        }
        if ((i12 & 2) != 0) {
            buzzoolaAdType = buzzoolaRawResponse.adType;
        }
        BuzzoolaAdType buzzoolaAdType2 = buzzoolaAdType;
        if ((i12 & 4) != 0) {
            list = buzzoolaRawResponse.assets;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            buzzoolaRawEventUrls = buzzoolaRawResponse.eventUrls;
        }
        BuzzoolaRawEventUrls buzzoolaRawEventUrls2 = buzzoolaRawEventUrls;
        if ((i12 & 16) != 0) {
            buzzoolaRawConfig = buzzoolaRawResponse.config;
        }
        return buzzoolaRawResponse.copy(str, buzzoolaAdType2, list2, buzzoolaRawEventUrls2, buzzoolaRawConfig);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getAdNetworkName() {
        return this.adNetworkName;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BuzzoolaAdType getAdType() {
        return this.adType;
    }

    @l
    public final List<BuzzoolaRawAsset> component3() {
        return this.assets;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BuzzoolaRawEventUrls getEventUrls() {
        return this.eventUrls;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BuzzoolaRawConfig getConfig() {
        return this.config;
    }

    @k
    public final BuzzoolaRawResponse copy(@l String adNetworkName, @l BuzzoolaAdType adType, @l List<BuzzoolaRawAsset> assets, @l BuzzoolaRawEventUrls eventUrls, @l BuzzoolaRawConfig config) {
        return new BuzzoolaRawResponse(adNetworkName, adType, assets, eventUrls, config);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuzzoolaRawResponse)) {
            return false;
        }
        BuzzoolaRawResponse buzzoolaRawResponse = (BuzzoolaRawResponse) other;
        return L.f(this.adNetworkName, buzzoolaRawResponse.adNetworkName) && this.adType == buzzoolaRawResponse.adType && L.f(this.assets, buzzoolaRawResponse.assets) && L.f(this.eventUrls, buzzoolaRawResponse.eventUrls) && L.f(this.config, buzzoolaRawResponse.config);
    }

    @l
    public final String getAdNetworkName() {
        return this.adNetworkName;
    }

    @l
    public final BuzzoolaAdType getAdType() {
        return this.adType;
    }

    @l
    public final List<BuzzoolaRawAsset> getAssets() {
        return this.assets;
    }

    @l
    public final BuzzoolaRawConfig getConfig() {
        return this.config;
    }

    @l
    public final BuzzoolaRawEventUrls getEventUrls() {
        return this.eventUrls;
    }

    public int hashCode() {
        String str = this.adNetworkName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BuzzoolaAdType buzzoolaAdType = this.adType;
        int iHashCode2 = (iHashCode + (buzzoolaAdType == null ? 0 : buzzoolaAdType.hashCode())) * 31;
        List<BuzzoolaRawAsset> list = this.assets;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BuzzoolaRawEventUrls buzzoolaRawEventUrls = this.eventUrls;
        int iHashCode4 = (iHashCode3 + (buzzoolaRawEventUrls == null ? 0 : buzzoolaRawEventUrls.hashCode())) * 31;
        BuzzoolaRawConfig buzzoolaRawConfig = this.config;
        return iHashCode4 + (buzzoolaRawConfig != null ? buzzoolaRawConfig.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BuzzoolaRawResponse(adNetworkName=" + this.adNetworkName + ", adType=" + this.adType + ", assets=" + this.assets + ", eventUrls=" + this.eventUrls + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.adNetworkName);
        BuzzoolaAdType buzzoolaAdType = this.adType;
        if (buzzoolaAdType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buzzoolaAdType.writeToParcel(parcel, flags);
        }
        List<BuzzoolaRawAsset> list = this.assets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((BuzzoolaRawAsset) itA.next()).writeToParcel(parcel, flags);
            }
        }
        BuzzoolaRawEventUrls buzzoolaRawEventUrls = this.eventUrls;
        if (buzzoolaRawEventUrls == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buzzoolaRawEventUrls.writeToParcel(parcel, flags);
        }
        BuzzoolaRawConfig buzzoolaRawConfig = this.config;
        if (buzzoolaRawConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buzzoolaRawConfig.writeToParcel(parcel, flags);
        }
    }
}
