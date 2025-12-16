package com.avito.android.sbc.create.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/model/ExpiresAtDto;", "Landroid/os/Parcelable;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExpiresAtDto implements Parcelable {

    @k
    public static final Parcelable.Creator<ExpiresAtDto> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f259186b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f259187c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f259188d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f259189e;

    /* compiled from: CreateDiscountDispatchData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpiresAtDto> {
        @Override // android.os.Parcelable.Creator
        public final ExpiresAtDto createFromParcel(Parcel parcel) {
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ExpiresAtDto(lValueOf, lValueOf2, lValueOf3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ExpiresAtDto[] newArray(int i12) {
            return new ExpiresAtDto[i12];
        }
    }

    public ExpiresAtDto(@l Long l12, @l Long l13, @l Long l14, @l Boolean bool) {
        this.f259186b = l12;
        this.f259187c = l13;
        this.f259188d = l14;
        this.f259189e = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpiresAtDto)) {
            return false;
        }
        ExpiresAtDto expiresAtDto = (ExpiresAtDto) obj;
        return L.f(this.f259186b, expiresAtDto.f259186b) && L.f(this.f259187c, expiresAtDto.f259187c) && L.f(this.f259188d, expiresAtDto.f259188d) && L.f(this.f259189e, expiresAtDto.f259189e);
    }

    public final int hashCode() {
        Long l12 = this.f259186b;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        Long l13 = this.f259187c;
        int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f259188d;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool = this.f259189e;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpiresAtDto(default=");
        sb2.append(this.f259186b);
        sb2.append(", min=");
        sb2.append(this.f259187c);
        sb2.append(", max=");
        sb2.append(this.f259188d);
        sb2.append(", readOnly=");
        return C0.g(sb2, this.f259189e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f259186b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f259187c;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Long l14 = this.f259188d;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l14);
        }
        Boolean bool = this.f259189e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
