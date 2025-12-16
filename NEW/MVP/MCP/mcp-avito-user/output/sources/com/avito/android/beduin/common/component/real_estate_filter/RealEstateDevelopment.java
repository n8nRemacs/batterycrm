package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b\u0006\u0010\u000f¨\u0006%"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateDevelopment;", "Landroid/os/Parcelable;", "", "id", "name", "", "isDefaultFilterValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "needToCountInFilter", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateDevelopment;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Boolean;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealEstateDevelopment implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealEstateDevelopment> CREATOR = new a();

    @Y61.k
    private final String id;

    @Y61.l
    private final Boolean isDefaultFilterValue;

    @Y61.k
    private final String name;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealEstateDevelopment> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateDevelopment createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RealEstateDevelopment(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateDevelopment[] newArray(int i12) {
            return new RealEstateDevelopment[i12];
        }
    }

    public RealEstateDevelopment(@Y61.k String str, @Y61.k String str2, @Y61.l Boolean bool) {
        this.id = str;
        this.name = str2;
        this.isDefaultFilterValue = bool;
    }

    public static /* synthetic */ RealEstateDevelopment copy$default(RealEstateDevelopment realEstateDevelopment, String str, String str2, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = realEstateDevelopment.id;
        }
        if ((i12 & 2) != 0) {
            str2 = realEstateDevelopment.name;
        }
        if ((i12 & 4) != 0) {
            bool = realEstateDevelopment.isDefaultFilterValue;
        }
        return realEstateDevelopment.copy(str, str2, bool);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsDefaultFilterValue() {
        return this.isDefaultFilterValue;
    }

    @Y61.k
    public final RealEstateDevelopment copy(@Y61.k String id2, @Y61.k String name, @Y61.l Boolean isDefaultFilterValue) {
        return new RealEstateDevelopment(id2, name, isDefaultFilterValue);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealEstateDevelopment)) {
            return false;
        }
        RealEstateDevelopment realEstateDevelopment = (RealEstateDevelopment) other;
        return L.f(this.id, realEstateDevelopment.id) && L.f(this.name, realEstateDevelopment.name) && L.f(this.isDefaultFilterValue, realEstateDevelopment.isDefaultFilterValue);
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.name);
        Boolean bool = this.isDefaultFilterValue;
        return iD2 + (bool == null ? 0 : bool.hashCode());
    }

    @Y61.l
    public final Boolean isDefaultFilterValue() {
        return this.isDefaultFilterValue;
    }

    public final boolean needToCountInFilter() {
        Boolean bool = this.isDefaultFilterValue;
        return bool == null || L.f(bool, Boolean.FALSE);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RealEstateDevelopment(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", isDefaultFilterValue=");
        return C0.g(sb2, this.isDefaultFilterValue, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        Boolean bool = this.isDefaultFilterValue;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
