package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ2\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\t¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateCompletionDate;", "Landroid/os/Parcelable;", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toStringId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateCompletionDate;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFrom", "getTo", "getName", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealEstateCompletionDate implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealEstateCompletionDate> CREATOR = new a();

    @Y61.l
    private final String from;

    @Y61.k
    private final String name;

    @Y61.l
    private final String to;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealEstateCompletionDate> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateCompletionDate createFromParcel(Parcel parcel) {
            return new RealEstateCompletionDate(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateCompletionDate[] newArray(int i12) {
            return new RealEstateCompletionDate[i12];
        }
    }

    public RealEstateCompletionDate(@Y61.l String str, @Y61.l String str2, @Y61.k String str3) {
        this.from = str;
        this.to = str2;
        this.name = str3;
    }

    public static /* synthetic */ RealEstateCompletionDate copy$default(RealEstateCompletionDate realEstateCompletionDate, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = realEstateCompletionDate.from;
        }
        if ((i12 & 2) != 0) {
            str2 = realEstateCompletionDate.to;
        }
        if ((i12 & 4) != 0) {
            str3 = realEstateCompletionDate.name;
        }
        return realEstateCompletionDate.copy(str, str2, str3);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.k
    public final RealEstateCompletionDate copy(@Y61.l String from, @Y61.l String to2, @Y61.k String name) {
        return new RealEstateCompletionDate(from, to2, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealEstateCompletionDate)) {
            return false;
        }
        RealEstateCompletionDate realEstateCompletionDate = (RealEstateCompletionDate) other;
        return L.f(this.from, realEstateCompletionDate.from) && L.f(this.to, realEstateCompletionDate.to) && L.f(this.name, realEstateCompletionDate.name);
    }

    @Y61.l
    public final String getFrom() {
        return this.from;
    }

    @Y61.k
    public final String getName() {
        return this.name;
    }

    @Y61.l
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        String str = this.from;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.to;
        return this.name.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RealEstateCompletionDate(from=");
        sb2.append(this.from);
        sb2.append(", to=");
        sb2.append(this.to);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }

    @Y61.k
    public final String toStringId() {
        return D.a(this.from, this.to);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.name);
    }
}
