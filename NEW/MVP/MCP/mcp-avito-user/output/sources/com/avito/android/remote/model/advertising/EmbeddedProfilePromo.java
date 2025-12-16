package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmbeddedProfilePromo.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000eR\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromo;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromoCreative;", "creative", "", "", "analyticParams", "", "uniqueId", "<init>", "(Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromoCreative;Ljava/util/Map;J)V", "component1", "()Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromoCreative;", "component2", "()Ljava/util/Map;", "component3", "()J", "copy", "(Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromoCreative;Ljava/util/Map;J)Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromo;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromoCreative;", "getCreative", "Ljava/util/Map;", "getAnalyticParams", "J", "getUniqueId", "setUniqueId", "(J)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EmbeddedProfilePromo implements SerpElement {

    @k
    public static final Parcelable.Creator<EmbeddedProfilePromo> CREATOR = new Creator();

    @c("analyticParams")
    @l
    private final Map<String, String> analyticParams;

    @c("creative")
    @k
    private final EmbeddedProfilePromoCreative creative;
    private long uniqueId;

    /* compiled from: EmbeddedProfilePromo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmbeddedProfilePromo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmbeddedProfilePromo createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            EmbeddedProfilePromoCreative embeddedProfilePromoCreativeCreateFromParcel = EmbeddedProfilePromoCreative.CREATOR.createFromParcel(parcel);
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
            return new EmbeddedProfilePromo(embeddedProfilePromoCreativeCreateFromParcel, linkedHashMap, parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmbeddedProfilePromo[] newArray(int i12) {
            return new EmbeddedProfilePromo[i12];
        }
    }

    public EmbeddedProfilePromo(@k EmbeddedProfilePromoCreative embeddedProfilePromoCreative, @l Map<String, String> map, long j12) {
        this.creative = embeddedProfilePromoCreative;
        this.analyticParams = map;
        this.uniqueId = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmbeddedProfilePromo copy$default(EmbeddedProfilePromo embeddedProfilePromo, EmbeddedProfilePromoCreative embeddedProfilePromoCreative, Map map, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            embeddedProfilePromoCreative = embeddedProfilePromo.creative;
        }
        if ((i12 & 2) != 0) {
            map = embeddedProfilePromo.analyticParams;
        }
        if ((i12 & 4) != 0) {
            j12 = embeddedProfilePromo.uniqueId;
        }
        return embeddedProfilePromo.copy(embeddedProfilePromoCreative, map, j12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final EmbeddedProfilePromoCreative getCreative() {
        return this.creative;
    }

    @l
    public final Map<String, String> component2() {
        return this.analyticParams;
    }

    /* renamed from: component3, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    @k
    public final EmbeddedProfilePromo copy(@k EmbeddedProfilePromoCreative creative, @l Map<String, String> analyticParams, long uniqueId) {
        return new EmbeddedProfilePromo(creative, analyticParams, uniqueId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedProfilePromo)) {
            return false;
        }
        EmbeddedProfilePromo embeddedProfilePromo = (EmbeddedProfilePromo) other;
        return L.f(this.creative, embeddedProfilePromo.creative) && L.f(this.analyticParams, embeddedProfilePromo.analyticParams) && this.uniqueId == embeddedProfilePromo.uniqueId;
    }

    @l
    public final Map<String, String> getAnalyticParams() {
        return this.analyticParams;
    }

    @k
    public final EmbeddedProfilePromoCreative getCreative() {
        return this.creative;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        int iHashCode = this.creative.hashCode() * 31;
        Map<String, String> map = this.analyticParams;
        return Long.hashCode(this.uniqueId) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EmbeddedProfilePromo(creative=");
        sb2.append(this.creative);
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
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
        parcel.writeLong(this.uniqueId);
    }

    public /* synthetic */ EmbeddedProfilePromo(EmbeddedProfilePromoCreative embeddedProfilePromoCreative, Map map, long j12, int i12, C42822w c42822w) {
        this(embeddedProfilePromoCreative, map, (i12 & 4) != 0 ? 0L : j12);
    }
}
