package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @j.N
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new K();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349721b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349722c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349723d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349724e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349725f;

    @SafeParcelable.b
    public AuthenticatorAssertionResponse(@SafeParcelable.e @j.N byte[] bArr, @SafeParcelable.e @j.N byte[] bArr2, @SafeParcelable.e @j.N byte[] bArr3, @SafeParcelable.e @j.N byte[] bArr4, @SafeParcelable.e @j.P byte[] bArr5) {
        C36729v.j(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        C36729v.j(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        C36729v.j(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        C36729v.j(bArr4);
        zzgx zzgxVarZzl4 = zzgx.zzl(bArr4, 0, bArr4.length);
        zzgx zzgxVarZzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        C36729v.j(zzgxVarZzl);
        this.f349721b = zzgxVarZzl;
        C36729v.j(zzgxVarZzl2);
        this.f349722c = zzgxVarZzl2;
        C36729v.j(zzgxVarZzl3);
        this.f349723d = zzgxVarZzl3;
        C36729v.j(zzgxVarZzl4);
        this.f349724e = zzgxVarZzl4;
        this.f349725f = zzgxVarZzl5;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return C36727t.a(this.f349721b, authenticatorAssertionResponse.f349721b) && C36727t.a(this.f349722c, authenticatorAssertionResponse.f349722c) && C36727t.a(this.f349723d, authenticatorAssertionResponse.f349723d) && C36727t.a(this.f349724e, authenticatorAssertionResponse.f349724e) && C36727t.a(this.f349725f, authenticatorAssertionResponse.f349725f);
    }

    @j.N
    public final JSONObject h() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", C36749c.b(this.f349722c.zzm()));
            jSONObject.put("authenticatorData", C36749c.b(this.f349723d.zzm()));
            jSONObject.put("signature", C36749c.b(this.f349724e.zzm()));
            zzgx zzgxVar = this.f349725f;
            if (zzgxVar != null) {
                jSONObject.put("userHandle", C36749c.b(zzgxVar == null ? null : zzgxVar.zzm()));
            }
            return jSONObject;
        } catch (JSONException e12) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e12);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f349721b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f349722c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f349723d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f349724e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f349725f}))});
    }

    @j.N
    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArrZzm = this.f349721b.zzm();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArrZzm, 0, bArrZzm.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArrZzm2 = this.f349722c.zzm();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(bArrZzm2, 0, bArrZzm2.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArrZzm3 = this.f349723d.zzm();
        zzbiVarZza.zzb("authenticatorData", zzgfVarZzf3.zzg(bArrZzm3, 0, bArrZzm3.length));
        zzgf zzgfVarZzf4 = zzgf.zzf();
        byte[] bArrZzm4 = this.f349724e.zzm();
        zzbiVarZza.zzb("signature", zzgfVarZzf4.zzg(bArrZzm4, 0, bArrZzm4.length));
        zzgx zzgxVar = this.f349725f;
        byte[] bArrZzm5 = zzgxVar == null ? null : zzgxVar.zzm();
        if (bArrZzm5 != null) {
            zzbiVarZza.zzb("userHandle", zzgf.zzf().zzg(bArrZzm5, 0, bArrZzm5.length));
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.b(parcel, 2, this.f349721b.zzm(), false);
        TX0.a.b(parcel, 3, this.f349722c.zzm(), false);
        TX0.a.b(parcel, 4, this.f349723d.zzm(), false);
        TX0.a.b(parcel, 5, this.f349724e.zzm(), false);
        zzgx zzgxVar = this.f349725f;
        TX0.a.b(parcel, 6, zzgxVar == null ? null : zzgxVar.zzm(), false);
        TX0.a.p(parcel, iO2);
    }
}
