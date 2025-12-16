package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new W();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String f349763b;

    @SafeParcelable.b
    public FidoAppIdExtension(@SafeParcelable.e @j.N String str) {
        C36729v.j(str);
        this.f349763b = str;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f349763b.equals(((FidoAppIdExtension) obj).f349763b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349763b});
    }

    @j.N
    public final String toString() {
        return AK.c.s(new StringBuilder("FidoAppIdExtension{appid='"), this.f349763b, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f349763b, false);
        TX0.a.p(parcel, iO2);
    }
}
