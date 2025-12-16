package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @j.N
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new L();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349726b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349727c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349728d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String[] f349729e;

    @SafeParcelable.b
    public AuthenticatorAttestationResponse(@SafeParcelable.e @j.N byte[] bArr, @SafeParcelable.e @j.N byte[] bArr2, @SafeParcelable.e @j.N byte[] bArr3, @SafeParcelable.e @j.N String[] strArr) {
        C36729v.j(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        C36729v.j(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        C36729v.j(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        C36729v.j(zzgxVarZzl);
        this.f349726b = zzgxVarZzl;
        C36729v.j(zzgxVarZzl2);
        this.f349727c = zzgxVarZzl2;
        C36729v.j(zzgxVarZzl3);
        this.f349728d = zzgxVarZzl3;
        C36729v.j(strArr);
        this.f349729e = strArr;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return C36727t.a(this.f349726b, authenticatorAttestationResponse.f349726b) && C36727t.a(this.f349727c, authenticatorAttestationResponse.f349727c) && C36727t.a(this.f349728d, authenticatorAttestationResponse.f349728d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: JSONException -> 0x001b, zzho -> 0x018a, TRY_LEAVE, TryCatch #5 {zzho -> 0x018a, blocks: (B:34:0x00f0, B:40:0x010f, B:42:0x0121, B:47:0x0135, B:50:0x0157, B:52:0x016d, B:54:0x0173, B:57:0x018d, B:58:0x0192, B:59:0x0193, B:60:0x0198, B:65:0x01a3, B:67:0x01b3, B:69:0x01c1, B:70:0x01d4, B:71:0x01d9, B:72:0x01da, B:73:0x01df, B:78:0x0200, B:79:0x0205), top: B:111:0x00f0, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0200 A[Catch: JSONException -> 0x001b, zzho -> 0x018a, TRY_ENTER, TryCatch #5 {zzho -> 0x018a, blocks: (B:34:0x00f0, B:40:0x010f, B:42:0x0121, B:47:0x0135, B:50:0x0157, B:52:0x016d, B:54:0x0173, B:57:0x018d, B:58:0x0192, B:59:0x0193, B:60:0x0198, B:65:0x01a3, B:67:0x01b3, B:69:0x01c1, B:70:0x01d4, B:71:0x01d9, B:72:0x01da, B:73:0x01df, B:78:0x0200, B:79:0x0205), top: B:111:0x00f0, outer: #4 }] */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject h() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.h():org.json.JSONObject");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f349726b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f349727c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f349728d}))});
    }

    @j.N
    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArrZzm = this.f349726b.zzm();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArrZzm, 0, bArrZzm.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArrZzm2 = this.f349727c.zzm();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(bArrZzm2, 0, bArrZzm2.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArrZzm3 = this.f349728d.zzm();
        zzbiVarZza.zzb("attestationObject", zzgfVarZzf3.zzg(bArrZzm3, 0, bArrZzm3.length));
        zzbiVarZza.zzb("transports", Arrays.toString(this.f349729e));
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.b(parcel, 2, this.f349726b.zzm(), false);
        TX0.a.b(parcel, 3, this.f349727c.zzm(), false);
        TX0.a.b(parcel, 4, this.f349728d.zzm(), false);
        TX0.a.k(parcel, 5, this.f349729e, false);
        TX0.a.p(parcel, iO2);
    }
}
