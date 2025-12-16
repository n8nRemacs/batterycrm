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

/* compiled from: AvitoTargetingRawResponse.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0018¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoTargetingRawResponse;", "Landroid/os/Parcelable;", "", "adNetworkName", "Lcom/avito/android/remote/model/advertising/AvitoAdType;", "adType", "", "Lcom/avito/android/remote/model/advertising/AvitoTargetingRawAsset;", "assets", "Lcom/avito/android/remote/model/advertising/AvitoTargetingRawEventUrls;", "eventUrls", "Lcom/avito/android/remote/model/advertising/AvitoTargetingRawConfig;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/advertising/AvitoAdType;Ljava/util/List;Lcom/avito/android/remote/model/advertising/AvitoTargetingRawEventUrls;Lcom/avito/android/remote/model/advertising/AvitoTargetingRawConfig;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/advertising/AvitoAdType;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/advertising/AvitoTargetingRawEventUrls;", "component5", "()Lcom/avito/android/remote/model/advertising/AvitoTargetingRawConfig;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/advertising/AvitoAdType;Ljava/util/List;Lcom/avito/android/remote/model/advertising/AvitoTargetingRawEventUrls;Lcom/avito/android/remote/model/advertising/AvitoTargetingRawConfig;)Lcom/avito/android/remote/model/advertising/AvitoTargetingRawResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAdNetworkName", "Lcom/avito/android/remote/model/advertising/AvitoAdType;", "getAdType", "Ljava/util/List;", "getAssets", "Lcom/avito/android/remote/model/advertising/AvitoTargetingRawEventUrls;", "getEventUrls", "Lcom/avito/android/remote/model/advertising/AvitoTargetingRawConfig;", "getConfig", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvitoTargetingRawResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoTargetingRawResponse> CREATOR = new Creator();

    @c("ad_network_name")
    @l
    private final String adNetworkName;

    @c("ad_type")
    @l
    private final AvitoAdType adType;

    @c("assets")
    @l
    private final List<AvitoTargetingRawAsset> assets;

    @c(Navigation.CONFIG)
    @l
    private final AvitoTargetingRawConfig config;

    @c("event_urls")
    @l
    private final AvitoTargetingRawEventUrls eventUrls;

    /* compiled from: AvitoTargetingRawResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoTargetingRawResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoTargetingRawResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AvitoAdType avitoAdTypeCreateFromParcel = parcel.readInt() == 0 ? null : AvitoAdType.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AvitoTargetingRawAsset.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AvitoTargetingRawResponse(string, avitoAdTypeCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : AvitoTargetingRawEventUrls.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AvitoTargetingRawConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoTargetingRawResponse[] newArray(int i12) {
            return new AvitoTargetingRawResponse[i12];
        }
    }

    public AvitoTargetingRawResponse(@l String str, @l AvitoAdType avitoAdType, @l List<AvitoTargetingRawAsset> list, @l AvitoTargetingRawEventUrls avitoTargetingRawEventUrls, @l AvitoTargetingRawConfig avitoTargetingRawConfig) {
        this.adNetworkName = str;
        this.adType = avitoAdType;
        this.assets = list;
        this.eventUrls = avitoTargetingRawEventUrls;
        this.config = avitoTargetingRawConfig;
    }

    public static /* synthetic */ AvitoTargetingRawResponse copy$default(AvitoTargetingRawResponse avitoTargetingRawResponse, String str, AvitoAdType avitoAdType, List list, AvitoTargetingRawEventUrls avitoTargetingRawEventUrls, AvitoTargetingRawConfig avitoTargetingRawConfig, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = avitoTargetingRawResponse.adNetworkName;
        }
        if ((i12 & 2) != 0) {
            avitoAdType = avitoTargetingRawResponse.adType;
        }
        AvitoAdType avitoAdType2 = avitoAdType;
        if ((i12 & 4) != 0) {
            list = avitoTargetingRawResponse.assets;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            avitoTargetingRawEventUrls = avitoTargetingRawResponse.eventUrls;
        }
        AvitoTargetingRawEventUrls avitoTargetingRawEventUrls2 = avitoTargetingRawEventUrls;
        if ((i12 & 16) != 0) {
            avitoTargetingRawConfig = avitoTargetingRawResponse.config;
        }
        return avitoTargetingRawResponse.copy(str, avitoAdType2, list2, avitoTargetingRawEventUrls2, avitoTargetingRawConfig);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getAdNetworkName() {
        return this.adNetworkName;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AvitoAdType getAdType() {
        return this.adType;
    }

    @l
    public final List<AvitoTargetingRawAsset> component3() {
        return this.assets;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AvitoTargetingRawEventUrls getEventUrls() {
        return this.eventUrls;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AvitoTargetingRawConfig getConfig() {
        return this.config;
    }

    @k
    public final AvitoTargetingRawResponse copy(@l String adNetworkName, @l AvitoAdType adType, @l List<AvitoTargetingRawAsset> assets, @l AvitoTargetingRawEventUrls eventUrls, @l AvitoTargetingRawConfig config) {
        return new AvitoTargetingRawResponse(adNetworkName, adType, assets, eventUrls, config);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoTargetingRawResponse)) {
            return false;
        }
        AvitoTargetingRawResponse avitoTargetingRawResponse = (AvitoTargetingRawResponse) other;
        return L.f(this.adNetworkName, avitoTargetingRawResponse.adNetworkName) && this.adType == avitoTargetingRawResponse.adType && L.f(this.assets, avitoTargetingRawResponse.assets) && L.f(this.eventUrls, avitoTargetingRawResponse.eventUrls) && L.f(this.config, avitoTargetingRawResponse.config);
    }

    @l
    public final String getAdNetworkName() {
        return this.adNetworkName;
    }

    @l
    public final AvitoAdType getAdType() {
        return this.adType;
    }

    @l
    public final List<AvitoTargetingRawAsset> getAssets() {
        return this.assets;
    }

    @l
    public final AvitoTargetingRawConfig getConfig() {
        return this.config;
    }

    @l
    public final AvitoTargetingRawEventUrls getEventUrls() {
        return this.eventUrls;
    }

    public int hashCode() {
        String str = this.adNetworkName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AvitoAdType avitoAdType = this.adType;
        int iHashCode2 = (iHashCode + (avitoAdType == null ? 0 : avitoAdType.hashCode())) * 31;
        List<AvitoTargetingRawAsset> list = this.assets;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AvitoTargetingRawEventUrls avitoTargetingRawEventUrls = this.eventUrls;
        int iHashCode4 = (iHashCode3 + (avitoTargetingRawEventUrls == null ? 0 : avitoTargetingRawEventUrls.hashCode())) * 31;
        AvitoTargetingRawConfig avitoTargetingRawConfig = this.config;
        return iHashCode4 + (avitoTargetingRawConfig != null ? avitoTargetingRawConfig.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AvitoTargetingRawResponse(adNetworkName=" + this.adNetworkName + ", adType=" + this.adType + ", assets=" + this.assets + ", eventUrls=" + this.eventUrls + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.adNetworkName);
        AvitoAdType avitoAdType = this.adType;
        if (avitoAdType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoAdType.writeToParcel(parcel, flags);
        }
        List<AvitoTargetingRawAsset> list = this.assets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AvitoTargetingRawAsset) itA.next()).writeToParcel(parcel, flags);
            }
        }
        AvitoTargetingRawEventUrls avitoTargetingRawEventUrls = this.eventUrls;
        if (avitoTargetingRawEventUrls == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoTargetingRawEventUrls.writeToParcel(parcel, flags);
        }
        AvitoTargetingRawConfig avitoTargetingRawConfig = this.config;
        if (avitoTargetingRawConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoTargetingRawConfig.writeToParcel(parcel, flags);
        }
    }
}
