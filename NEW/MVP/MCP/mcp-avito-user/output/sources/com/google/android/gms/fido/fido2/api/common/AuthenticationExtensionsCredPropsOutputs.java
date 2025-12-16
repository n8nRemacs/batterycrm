package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new H();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349720b;

    @SafeParcelable.b
    public AuthenticationExtensionsCredPropsOutputs(@SafeParcelable.e boolean z12) {
        this.f349720b = z12;
    }

    public final boolean equals(@j.P Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f349720b == ((AuthenticationExtensionsCredPropsOutputs) obj).f349720b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f349720b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349720b ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
