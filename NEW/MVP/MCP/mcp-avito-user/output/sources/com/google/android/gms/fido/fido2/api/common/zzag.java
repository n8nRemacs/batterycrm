package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C36767k();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String f349856b;

    @SafeParcelable.b
    public zzag(@SafeParcelable.e @j.N String str) {
        C36729v.j(str);
        this.f349856b = str;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof zzag) {
            return this.f349856b.equals(((zzag) obj).f349856b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349856b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f349856b, false);
        TX0.a.p(parcel, iO2);
    }
}
