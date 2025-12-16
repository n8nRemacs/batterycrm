package com.avito.android.sbc;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/sbc/ExpiresAtDto;", "Landroid/os/Parcelable;", "", "default", "min", "max", "", "readOnly", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "Ljava/lang/Long;", "getDefault", "()Ljava/lang/Long;", "getMin", "getMax", "Ljava/lang/Boolean;", "getReadOnly", "()Ljava/lang/Boolean;", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExpiresAtDto implements Parcelable {

    @k
    public static final Parcelable.Creator<ExpiresAtDto> CREATOR;

    @c("default")
    @l
    private final Long default;

    @c("max")
    @l
    private final Long max;

    @c("min")
    @l
    private final Long min;

    @c("readOnly")
    @l
    private final Boolean readOnly;

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/sbc/ExpiresAtDto$a;", "", "<init>", "()V", "", "DEFAULT", "Ljava/lang/String;", "MAX", "MIN", "READ_ONLY", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ExpiresAtDto> {
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

    static {
        new a(null);
        CREATOR = new b();
    }

    public ExpiresAtDto(@l Long l12, @l Long l13, @l Long l14, @l Boolean bool) {
        this.default = l12;
        this.min = l13;
        this.max = l14;
        this.readOnly = bool;
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
        return L.f(this.default, expiresAtDto.default) && L.f(this.min, expiresAtDto.min) && L.f(this.max, expiresAtDto.max) && L.f(this.readOnly, expiresAtDto.readOnly);
    }

    public final int hashCode() {
        Long l12 = this.default;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        Long l13 = this.min;
        int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.max;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool = this.readOnly;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpiresAtDto(default=");
        sb2.append(this.default);
        sb2.append(", min=");
        sb2.append(this.min);
        sb2.append(", max=");
        sb2.append(this.max);
        sb2.append(", readOnly=");
        return C0.g(sb2, this.readOnly, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.default;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.min;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Long l14 = this.max;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l14);
        }
        Boolean bool = this.readOnly;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
