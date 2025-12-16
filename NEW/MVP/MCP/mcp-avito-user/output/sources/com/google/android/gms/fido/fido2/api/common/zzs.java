package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new T();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final ArrayList f349872b;

    @SafeParcelable.b
    public zzs(@SafeParcelable.e @j.N ArrayList arrayList) {
        C36729v.j(arrayList);
        this.f349872b = arrayList;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        ArrayList arrayList = zzsVar.f349872b;
        ArrayList arrayList2 = this.f349872b;
        return arrayList2.containsAll(arrayList) && zzsVar.f349872b.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f349872b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f349872b, false);
        TX0.a.p(parcel, iO2);
    }
}
