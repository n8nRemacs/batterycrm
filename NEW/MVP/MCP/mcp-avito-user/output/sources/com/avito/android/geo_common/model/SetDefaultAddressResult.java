package com.avito.android.geo_common.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SetDefaultAddressResult.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/geo_common/model/SetDefaultAddressResult;", "Landroid/os/Parcelable;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SetDefaultAddressResult implements Parcelable {

    @k
    public static final Parcelable.Creator<SetDefaultAddressResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f159411b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159412c;

    /* compiled from: SetDefaultAddressResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SetDefaultAddressResult> {
        @Override // android.os.Parcelable.Creator
        public final SetDefaultAddressResult createFromParcel(Parcel parcel) {
            return new SetDefaultAddressResult(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SetDefaultAddressResult[] newArray(int i12) {
            return new SetDefaultAddressResult[i12];
        }
    }

    public SetDefaultAddressResult(int i12, @l Integer num) {
        this.f159411b = num;
        this.f159412c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetDefaultAddressResult)) {
            return false;
        }
        SetDefaultAddressResult setDefaultAddressResult = (SetDefaultAddressResult) obj;
        return L.f(this.f159411b, setDefaultAddressResult.f159411b) && this.f159412c == setDefaultAddressResult.f159412c;
    }

    public final int hashCode() {
        Integer num = this.f159411b;
        return Integer.hashCode(this.f159412c) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetDefaultAddressResult(prevAddressId=");
        sb2.append(this.f159411b);
        sb2.append(", curAddressId=");
        return r.t(sb2, this.f159412c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f159411b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f159412c);
    }
}
