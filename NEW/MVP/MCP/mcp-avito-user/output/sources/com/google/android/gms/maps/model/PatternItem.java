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
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new v();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354430b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Float f354431c;

    @SafeParcelable.b
    public PatternItem(@SafeParcelable.e int i12, @SafeParcelable.e @P Float f12) {
        boolean z12 = true;
        if (i12 != 1 && (f12 == null || f12.floatValue() < 0.0f)) {
            z12 = false;
        }
        String strValueOf = String.valueOf(f12);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 45);
        sb2.append("Invalid PatternItem: type=");
        sb2.append(i12);
        sb2.append(" length=");
        sb2.append(strValueOf);
        C36729v.a(sb2.toString(), z12);
        this.f354430b = i12;
        this.f354431c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f354430b == patternItem.f354430b && C36727t.a(this.f354431c, patternItem.f354431c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354430b), this.f354431c});
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f354431c);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39);
        sb2.append("[PatternItem: type=");
        sb2.append(this.f354430b);
        sb2.append(" length=");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354430b);
        TX0.a.d(parcel, 3, this.f354431c);
        TX0.a.p(parcel, iO2);
    }
}
