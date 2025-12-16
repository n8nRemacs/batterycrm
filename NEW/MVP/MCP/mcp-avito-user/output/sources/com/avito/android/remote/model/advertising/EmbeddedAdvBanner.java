package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerRaw;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmbeddedAdvBanner.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/advertising/EmbeddedAdvBanner;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick;", "creative", "", "", "analyticParams", "size", "", "uniqueId", "<init>", "(Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick;Ljava/util/Map;Ljava/lang/String;J)V", "component1", "()Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/lang/String;", "component4", "()J", "copy", "(Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick;Ljava/util/Map;Ljava/lang/String;J)Lcom/avito/android/remote/model/advertising/EmbeddedAdvBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$Outclick;", "getCreative", "Ljava/util/Map;", "getAnalyticParams", "Ljava/lang/String;", "getSize", "J", "getUniqueId", "setUniqueId", "(J)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EmbeddedAdvBanner implements SerpElement {

    @k
    public static final Parcelable.Creator<EmbeddedAdvBanner> CREATOR = new Creator();

    @c("analyticParams")
    @l
    private final Map<String, String> analyticParams;

    @c("creative")
    @k
    private final AvitoNetworkBannerRaw.Outclick creative;

    @c("size")
    @k
    private final String size;
    private long uniqueId;

    /* compiled from: EmbeddedAdvBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmbeddedAdvBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmbeddedAdvBanner createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            AvitoNetworkBannerRaw.Outclick outclickCreateFromParcel = AvitoNetworkBannerRaw.Outclick.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new EmbeddedAdvBanner(outclickCreateFromParcel, linkedHashMap, parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmbeddedAdvBanner[] newArray(int i12) {
            return new EmbeddedAdvBanner[i12];
        }
    }

    public EmbeddedAdvBanner(@k AvitoNetworkBannerRaw.Outclick outclick, @l Map<String, String> map, @k String str, long j12) {
        this.creative = outclick;
        this.analyticParams = map;
        this.size = str;
        this.uniqueId = j12;
    }

    public static /* synthetic */ EmbeddedAdvBanner copy$default(EmbeddedAdvBanner embeddedAdvBanner, AvitoNetworkBannerRaw.Outclick outclick, Map map, String str, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            outclick = embeddedAdvBanner.creative;
        }
        if ((i12 & 2) != 0) {
            map = embeddedAdvBanner.analyticParams;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            str = embeddedAdvBanner.size;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            j12 = embeddedAdvBanner.uniqueId;
        }
        return embeddedAdvBanner.copy(outclick, map2, str2, j12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AvitoNetworkBannerRaw.Outclick getCreative() {
        return this.creative;
    }

    @l
    public final Map<String, String> component2() {
        return this.analyticParams;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    @k
    public final EmbeddedAdvBanner copy(@k AvitoNetworkBannerRaw.Outclick creative, @l Map<String, String> analyticParams, @k String size, long uniqueId) {
        return new EmbeddedAdvBanner(creative, analyticParams, size, uniqueId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedAdvBanner)) {
            return false;
        }
        EmbeddedAdvBanner embeddedAdvBanner = (EmbeddedAdvBanner) other;
        return L.f(this.creative, embeddedAdvBanner.creative) && L.f(this.analyticParams, embeddedAdvBanner.analyticParams) && L.f(this.size, embeddedAdvBanner.size) && this.uniqueId == embeddedAdvBanner.uniqueId;
    }

    @l
    public final Map<String, String> getAnalyticParams() {
        return this.analyticParams;
    }

    @k
    public final AvitoNetworkBannerRaw.Outclick getCreative() {
        return this.creative;
    }

    @k
    public final String getSize() {
        return this.size;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        int iHashCode = this.creative.hashCode() * 31;
        Map<String, String> map = this.analyticParams;
        return Long.hashCode(this.uniqueId) + H.d((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.size);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EmbeddedAdvBanner(creative=");
        sb2.append(this.creative);
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", uniqueId=");
        return r.u(sb2, this.uniqueId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.creative.writeToParcel(parcel, flags);
        Map<String, String> map = this.analyticParams;
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
        parcel.writeString(this.size);
        parcel.writeLong(this.uniqueId);
    }

    public /* synthetic */ EmbeddedAdvBanner(AvitoNetworkBannerRaw.Outclick outclick, Map map, String str, long j12, int i12, C42822w c42822w) {
        this(outclick, map, str, (i12 & 8) != 0 ? 0L : j12);
    }
}
