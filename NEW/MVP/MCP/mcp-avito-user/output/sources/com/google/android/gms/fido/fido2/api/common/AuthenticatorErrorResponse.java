package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @j.N
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new M();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final ErrorCode f349730b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349731c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349732d;

    @SafeParcelable.b
    public AuthenticatorErrorResponse(@SafeParcelable.e int i12, @SafeParcelable.e @j.P String str, @SafeParcelable.e int i13) {
        try {
            this.f349730b = ErrorCode.a(i12);
            this.f349731c = str;
            this.f349732d = i13;
        } catch (ErrorCode.UnsupportedErrorCodeException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return C36727t.a(this.f349730b, authenticatorErrorResponse.f349730b) && C36727t.a(this.f349731c, authenticatorErrorResponse.f349731c) && C36727t.a(Integer.valueOf(this.f349732d), Integer.valueOf(authenticatorErrorResponse.f349732d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349730b, this.f349731c, Integer.valueOf(this.f349732d)});
    }

    @j.N
    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzbiVarZza.zza("errorCode", this.f349730b.f349762b);
        String str = this.f349731c;
        if (str != null) {
            zzbiVarZza.zzb("errorMessage", str);
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        int i13 = this.f349730b.f349762b;
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(i13);
        TX0.a.j(parcel, 3, this.f349731c, false);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f349732d);
        TX0.a.p(parcel, iO2);
    }
}
