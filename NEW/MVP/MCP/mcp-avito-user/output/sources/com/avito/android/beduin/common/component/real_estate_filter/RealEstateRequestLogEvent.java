package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\rR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0012¨\u0006*"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequestLogEvent;", "Landroid/os/Parcelable;", "", "id", "version", "", "", "params", "", "hasSensitiveData", "<init>", "(IILjava/util/Map;Ljava/lang/Boolean;)V", "component1", "()I", "component2", "component3", "()Ljava/util/Map;", "component4", "()Ljava/lang/Boolean;", "copy", "(IILjava/util/Map;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequestLogEvent;", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "getVersion", "Ljava/util/Map;", "getParams", "Ljava/lang/Boolean;", "getHasSensitiveData", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealEstateRequestLogEvent implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealEstateRequestLogEvent> CREATOR = new a();

    @Y61.l
    private final Boolean hasSensitiveData;
    private final int id;

    @Y61.l
    private final Map<String, String> params;
    private final int version;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealEstateRequestLogEvent> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateRequestLogEvent createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RealEstateRequestLogEvent(i12, i13, linkedHashMap, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateRequestLogEvent[] newArray(int i12) {
            return new RealEstateRequestLogEvent[i12];
        }
    }

    public RealEstateRequestLogEvent(int i12, int i13, @Y61.l Map<String, String> map, @Y61.l Boolean bool) {
        this.id = i12;
        this.version = i13;
        this.params = map;
        this.hasSensitiveData = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RealEstateRequestLogEvent copy$default(RealEstateRequestLogEvent realEstateRequestLogEvent, int i12, int i13, Map map, Boolean bool, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = realEstateRequestLogEvent.id;
        }
        if ((i14 & 2) != 0) {
            i13 = realEstateRequestLogEvent.version;
        }
        if ((i14 & 4) != 0) {
            map = realEstateRequestLogEvent.params;
        }
        if ((i14 & 8) != 0) {
            bool = realEstateRequestLogEvent.hasSensitiveData;
        }
        return realEstateRequestLogEvent.copy(i12, i13, map, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Y61.l
    public final Map<String, String> component3() {
        return this.params;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    @Y61.k
    public final RealEstateRequestLogEvent copy(int id2, int version, @Y61.l Map<String, String> params, @Y61.l Boolean hasSensitiveData) {
        return new RealEstateRequestLogEvent(id2, version, params, hasSensitiveData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealEstateRequestLogEvent)) {
            return false;
        }
        RealEstateRequestLogEvent realEstateRequestLogEvent = (RealEstateRequestLogEvent) other;
        return this.id == realEstateRequestLogEvent.id && this.version == realEstateRequestLogEvent.version && L.f(this.params, realEstateRequestLogEvent.params) && L.f(this.hasSensitiveData, realEstateRequestLogEvent.hasSensitiveData);
    }

    @Y61.l
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    public final int getId() {
        return this.id;
    }

    @Y61.l
    public final Map<String, String> getParams() {
        return this.params;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.version, Integer.hashCode(this.id) * 31, 31);
        Map<String, String> map = this.params;
        int iHashCode = (iE2 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.hasSensitiveData;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RealEstateRequestLogEvent(id=");
        sb2.append(this.id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", hasSensitiveData=");
        return C0.g(sb2, this.hasSensitiveData, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.version);
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
        Boolean bool = this.hasSensitiveData;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
