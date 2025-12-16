package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C36765i();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349855b;

    @SafeParcelable.b
    public zzad(@SafeParcelable.e boolean z12) {
        this.f349855b = Boolean.valueOf(z12).booleanValue();
    }

    public final boolean equals(@j.P Object obj) {
        return (obj instanceof zzad) && this.f349855b == ((zzad) obj).f349855b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f349855b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349855b ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
