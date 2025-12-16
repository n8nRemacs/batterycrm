package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@InterfaceC36733z
@Deprecated
/* loaded from: classes6.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C36798t();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354280b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354281c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354282d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354283e;

    @SafeParcelable.b
    public zzac(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e long j12, @SafeParcelable.e long j13) {
        this.f354280b = i12;
        this.f354281c = i13;
        this.f354282d = j12;
        this.f354283e = j13;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (this.f354280b == zzacVar.f354280b && this.f354281c == zzacVar.f354281c && this.f354282d == zzacVar.f354282d && this.f354283e == zzacVar.f354283e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354281c), Integer.valueOf(this.f354280b), Long.valueOf(this.f354283e), Long.valueOf(this.f354282d)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f354280b + " Cell status: " + this.f354281c + " elapsed time NS: " + this.f354283e + " system time ms: " + this.f354282d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f354280b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354281c);
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(this.f354282d);
        TX0.a.q(parcel, 4, 8);
        parcel.writeLong(this.f354283e);
        TX0.a.p(parcel, iO2);
    }
}
