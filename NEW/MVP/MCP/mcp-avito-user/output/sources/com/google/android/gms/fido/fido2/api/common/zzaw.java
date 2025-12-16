package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C36779x();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349863b;

    @SafeParcelable.b
    public zzaw(@SafeParcelable.e @j.P String str) {
        this.f349863b = str;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof zzaw) {
            return C36727t.a(this.f349863b, ((zzaw) obj).f349863b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349863b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f349863b, false);
        TX0.a.p(parcel, iO2);
    }
}
