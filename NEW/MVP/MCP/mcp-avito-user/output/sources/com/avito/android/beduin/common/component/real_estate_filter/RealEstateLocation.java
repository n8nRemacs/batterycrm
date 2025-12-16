package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateLocation;", "Landroid/os/Parcelable;", "", "id", "name", "namePrepositional", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateLocation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "getNamePrepositional", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealEstateLocation implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealEstateLocation> CREATOR = new a();

    @Y61.k
    private final String id;

    @Y61.k
    private final String name;

    @Y61.k
    private final String namePrepositional;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealEstateLocation> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateLocation createFromParcel(Parcel parcel) {
            return new RealEstateLocation(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateLocation[] newArray(int i12) {
            return new RealEstateLocation[i12];
        }
    }

    public RealEstateLocation(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.id = str;
        this.name = str2;
        this.namePrepositional = str3;
    }

    public static /* synthetic */ RealEstateLocation copy$default(RealEstateLocation realEstateLocation, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = realEstateLocation.id;
        }
        if ((i12 & 2) != 0) {
            str2 = realEstateLocation.name;
        }
        if ((i12 & 4) != 0) {
            str3 = realEstateLocation.namePrepositional;
        }
        return realEstateLocation.copy(str, str2, str3);
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

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final String getNamePrepositional() {
        return this.namePrepositional;
    }

    @Y61.k
    public final RealEstateLocation copy(@Y61.k String id2, @Y61.k String name, @Y61.k String namePrepositional) {
        return new RealEstateLocation(id2, name, namePrepositional);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealEstateLocation)) {
            return false;
        }
        RealEstateLocation realEstateLocation = (RealEstateLocation) other;
        return L.f(this.id, realEstateLocation.id) && L.f(this.name, realEstateLocation.name) && L.f(this.namePrepositional, realEstateLocation.namePrepositional);
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final String getName() {
        return this.name;
    }

    @Y61.k
    public final String getNamePrepositional() {
        return this.namePrepositional;
    }

    public int hashCode() {
        return this.namePrepositional.hashCode() + H.d(this.id.hashCode() * 31, 31, this.name);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RealEstateLocation(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", namePrepositional=");
        return C22026a.c(sb2, this.namePrepositional, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.namePrepositional);
    }
}
