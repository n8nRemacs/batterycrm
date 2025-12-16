package com.avito.android.select.new_districts.mvi.entity.ui;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DistrictChip.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/mvi/entity/ui/DistrictChip;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DistrictChip implements Parcelable {

    @k
    public static final Parcelable.Creator<DistrictChip> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f265832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f265833c;

    /* renamed from: d, reason: collision with root package name */
    public final int f265834d;

    /* compiled from: DistrictChip.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DistrictChip> {
        @Override // android.os.Parcelable.Creator
        public final DistrictChip createFromParcel(Parcel parcel) {
            return new DistrictChip(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DistrictChip[] newArray(int i12) {
            return new DistrictChip[i12];
        }
    }

    public DistrictChip(@k String str, int i12, int i13) {
        this.f265832b = str;
        this.f265833c = i12;
        this.f265834d = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictChip)) {
            return false;
        }
        DistrictChip districtChip = (DistrictChip) obj;
        return L.f(this.f265832b, districtChip.f265832b) && this.f265833c == districtChip.f265833c && this.f265834d == districtChip.f265834d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265834d) + r.e(this.f265833c, this.f265832b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DistrictChip(title=");
        sb2.append(this.f265832b);
        sb2.append(", districtIndex=");
        sb2.append(this.f265833c);
        sb2.append(", regionStateIndex=");
        return r.t(sb2, this.f265834d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f265832b);
        parcel.writeInt(this.f265833c);
        parcel.writeInt(this.f265834d);
    }
}
