package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;
import java.util.Arrays;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new o();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354383b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final C36817a f354384c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Float f354385d;

    public Cap(int i12, @P C36817a c36817a, @P Float f12) {
        boolean z12 = false;
        boolean z13 = f12 != null && f12.floatValue() > 0.0f;
        if (i12 != 3 || (c36817a != null && z13)) {
            z12 = true;
        }
        C36729v.a("Invalid Cap: type=" + i12 + " bitmapDescriptor=" + c36817a + " bitmapRefWidth=" + f12, z12);
        this.f354383b = i12;
        this.f354384c = c36817a;
        this.f354385d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f354383b == cap.f354383b && C36727t.a(this.f354384c, cap.f354384c) && C36727t.a(this.f354385d, cap.f354385d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354383b), this.f354384c, this.f354385d});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("[Cap: type=");
        sb2.append(this.f354383b);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354383b);
        C36817a c36817a = this.f354384c;
        TX0.a.e(parcel, 3, c36817a == null ? null : c36817a.f354484a.asBinder());
        TX0.a.d(parcel, 4, this.f354385d);
        TX0.a.p(parcel, iO2);
    }
}
