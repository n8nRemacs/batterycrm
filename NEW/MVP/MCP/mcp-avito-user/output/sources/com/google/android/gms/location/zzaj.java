package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
@InterfaceC36733z
/* loaded from: classes6.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new z();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354284b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354285c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354286d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354287e;

    @SafeParcelable.b
    public zzaj(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15) {
        C36729v.l("Start hour must be in range [0, 23].", i12 >= 0 && i12 <= 23);
        C36729v.l("Start minute must be in range [0, 59].", i13 >= 0 && i13 <= 59);
        C36729v.l("End hour must be in range [0, 23].", i14 >= 0 && i14 <= 23);
        C36729v.l("End minute must be in range [0, 59].", i15 >= 0 && i15 <= 59);
        C36729v.l("Parameters can't be all 0.", ((i12 + i13) + i14) + i15 > 0);
        this.f354284b = i12;
        this.f354285c = i13;
        this.f354286d = i14;
        this.f354287e = i15;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        return this.f354284b == zzajVar.f354284b && this.f354285c == zzajVar.f354285c && this.f354286d == zzajVar.f354286d && this.f354287e == zzajVar.f354287e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354284b), Integer.valueOf(this.f354285c), Integer.valueOf(this.f354286d), Integer.valueOf(this.f354287e)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserPreferredSleepWindow [startHour=");
        sb2.append(this.f354284b);
        sb2.append(", startMinute=");
        sb2.append(this.f354285c);
        sb2.append(", endHour=");
        sb2.append(this.f354286d);
        sb2.append(", endMinute=");
        return AK.c.i(this.f354287e, "]", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f354284b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354285c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354286d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f354287e);
        TX0.a.p(parcel, iO2);
    }
}
