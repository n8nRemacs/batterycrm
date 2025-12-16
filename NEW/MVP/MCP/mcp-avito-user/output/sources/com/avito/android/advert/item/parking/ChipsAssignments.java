package com.avito.android.advert.item.parking;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsParkingAddressItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/parking/ChipsAssignments;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChipsAssignments implements com.avito.android.lib.design.chips.h, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ChipsAssignments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f78142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f78143c;

    /* compiled from: AdvertDetailsParkingAddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChipsAssignments> {
        @Override // android.os.Parcelable.Creator
        public final ChipsAssignments createFromParcel(Parcel parcel) {
            return new ChipsAssignments(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChipsAssignments[] newArray(int i12) {
            return new ChipsAssignments[i12];
        }
    }

    public ChipsAssignments(int i12, @Y61.k String str) {
        this.f78142b = i12;
        this.f78143c = str;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@Y61.k Object obj) {
        if (obj instanceof ChipsAssignments) {
            return this.f78142b == ((ChipsAssignments) obj).f78142b;
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF114848c() {
        return this.f78143c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipsAssignments)) {
            return false;
        }
        ChipsAssignments chipsAssignments = (ChipsAssignments) obj;
        return this.f78142b == chipsAssignments.f78142b && L.f(this.f78143c, chipsAssignments.f78143c);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF262143e() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        return this.f78143c.hashCode() + (Integer.hashCode(this.f78142b) * 31);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF15843e() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipsAssignments(id=");
        sb2.append(this.f78142b);
        sb2.append(", chipTitle=");
        return C22026a.c(sb2, this.f78143c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f78142b);
        parcel.writeString(this.f78143c);
    }
}
