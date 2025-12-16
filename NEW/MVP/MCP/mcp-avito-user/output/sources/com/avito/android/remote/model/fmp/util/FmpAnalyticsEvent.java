package com.avito.android.remote.model.fmp.util;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: FmpAnalyticsEvent.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000fR-\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0014¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/fmp/util/FmpAnalyticsEvent;", "Landroid/os/Parcelable;", "", "id", "", "", "", "LK51/e;", "params", "version", "", "hasSensitiveData", "<init>", "(JLjava/util/Map;JLjava/lang/Boolean;)V", "component1", "()J", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(JLjava/util/Map;JLjava/lang/Boolean;)Lcom/avito/android/remote/model/fmp/util/FmpAnalyticsEvent;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/util/Map;", "getParams", "getVersion", "Ljava/lang/Boolean;", "getHasSensitiveData", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FmpAnalyticsEvent implements Parcelable {

    @k
    public static final Parcelable.Creator<FmpAnalyticsEvent> CREATOR = new Creator();

    @c("hasSensitiveData")
    @l
    private final Boolean hasSensitiveData;

    @c("id")
    private final long id;

    @c("params")
    @l
    private final Map<String, Object> params;

    @c("version")
    private final long version;

    /* compiled from: FmpAnalyticsEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FmpAnalyticsEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FmpAnalyticsEvent createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf;
            long j12 = parcel.readLong();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(FmpAnalyticsEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            long j13 = parcel.readLong();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FmpAnalyticsEvent(j12, linkedHashMap, j13, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FmpAnalyticsEvent[] newArray(int i12) {
            return new FmpAnalyticsEvent[i12];
        }
    }

    public FmpAnalyticsEvent(long j12, @l Map<String, ? extends Object> map, long j13, @l Boolean bool) {
        this.id = j12;
        this.params = map;
        this.version = j13;
        this.hasSensitiveData = bool;
    }

    public static /* synthetic */ FmpAnalyticsEvent copy$default(FmpAnalyticsEvent fmpAnalyticsEvent, long j12, Map map, long j13, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = fmpAnalyticsEvent.id;
        }
        long j14 = j12;
        if ((i12 & 2) != 0) {
            map = fmpAnalyticsEvent.params;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            j13 = fmpAnalyticsEvent.version;
        }
        long j15 = j13;
        if ((i12 & 8) != 0) {
            bool = fmpAnalyticsEvent.hasSensitiveData;
        }
        return fmpAnalyticsEvent.copy(j14, map2, j15, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    public final Map<String, Object> component2() {
        return this.params;
    }

    /* renamed from: component3, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    @k
    public final FmpAnalyticsEvent copy(long id2, @l Map<String, ? extends Object> params, long version, @l Boolean hasSensitiveData) {
        return new FmpAnalyticsEvent(id2, params, version, hasSensitiveData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FmpAnalyticsEvent)) {
            return false;
        }
        FmpAnalyticsEvent fmpAnalyticsEvent = (FmpAnalyticsEvent) other;
        return this.id == fmpAnalyticsEvent.id && L.f(this.params, fmpAnalyticsEvent.params) && this.version == fmpAnalyticsEvent.version && L.f(this.hasSensitiveData, fmpAnalyticsEvent.hasSensitiveData);
    }

    @l
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    public final long getId() {
        return this.id;
    }

    @l
    public final Map<String, Object> getParams() {
        return this.params;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        Map<String, Object> map = this.params;
        int iG2 = r.g((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.version);
        Boolean bool = this.hasSensitiveData;
        return iG2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FmpAnalyticsEvent(id=");
        sb2.append(this.id);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", hasSensitiveData=");
        return C0.g(sb2, this.hasSensitiveData, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.id);
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
        parcel.writeLong(this.version);
        Boolean bool = this.hasSensitiveData;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
