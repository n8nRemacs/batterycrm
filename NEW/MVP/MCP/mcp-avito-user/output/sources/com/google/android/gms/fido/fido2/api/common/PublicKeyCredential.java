package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new C36772p();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349774b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String f349775c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349776d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AuthenticatorAttestationResponse f349777e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AuthenticatorAssertionResponse f349778f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AuthenticatorErrorResponse f349779g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AuthenticationExtensionsClientOutputs f349780h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349781i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public String f349782j;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class a {
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return C36727t.a(this.f349774b, publicKeyCredential.f349774b) && C36727t.a(this.f349775c, publicKeyCredential.f349775c) && C36727t.a(this.f349776d, publicKeyCredential.f349776d) && C36727t.a(this.f349777e, publicKeyCredential.f349777e) && C36727t.a(this.f349778f, publicKeyCredential.f349778f) && C36727t.a(this.f349779g, publicKeyCredential.f349779g) && C36727t.a(this.f349780h, publicKeyCredential.f349780h) && C36727t.a(this.f349781i, publicKeyCredential.f349781i);
    }

    @j.N
    public final JSONObject h() throws JSONException {
        JSONObject jSONObjectH;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.f349776d;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject.put("rawId", C36749c.b(zzgxVar.zzm()));
            }
            String str = this.f349781i;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f349775c;
            AuthenticatorErrorResponse authenticatorErrorResponse = this.f349779g;
            if (str2 != null && authenticatorErrorResponse == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.f349774b;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f349778f;
            boolean z12 = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectH = authenticatorAssertionResponse.h();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f349777e;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectH = authenticatorAttestationResponse.h();
                } else {
                    z12 = false;
                    if (authenticatorErrorResponse != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", authenticatorErrorResponse.f349730b.f349762b);
                            String str5 = authenticatorErrorResponse.f349731c;
                            if (str5 != null) {
                                jSONObject2.put("message", str5);
                            }
                            jSONObjectH = jSONObject2;
                            str4 = "error";
                        } catch (JSONException e12) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e12);
                        }
                    } else {
                        jSONObjectH = null;
                    }
                }
            }
            if (jSONObjectH != null) {
                jSONObject.put(str4, jSONObjectH);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f349780h;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.h());
            } else if (z12) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e13) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e13);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349774b, this.f349775c, this.f349776d, this.f349778f, this.f349777e, this.f349779g, this.f349780h, this.f349781i});
    }

    @j.N
    public final String toString() {
        zzgx zzgxVar = this.f349776d;
        String strB = C36749c.b(zzgxVar == null ? null : zzgxVar.zzm());
        String strValueOf = String.valueOf(this.f349777e);
        String strValueOf2 = String.valueOf(this.f349778f);
        String strValueOf3 = String.valueOf(this.f349779g);
        String strValueOf4 = String.valueOf(this.f349780h);
        StringBuilder sb2 = new StringBuilder("PublicKeyCredential{\n id='");
        sb2.append(this.f349774b);
        sb2.append("', \n type='");
        androidx.media3.exoplayer.analytics.m.p(sb2, this.f349775c, "', \n rawId=", strB, ", \n registerResponse=");
        androidx.media3.exoplayer.analytics.m.p(sb2, strValueOf, ", \n signResponse=", strValueOf2, ", \n errorResponse=");
        androidx.media3.exoplayer.analytics.m.p(sb2, strValueOf3, ", \n extensionsClientOutputs=", strValueOf4, ", \n authenticatorAttachment='");
        return AK.c.s(sb2, this.f349781i, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        if (zzia.zzc()) {
            this.f349782j = h().toString();
        }
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f349774b, false);
        TX0.a.j(parcel, 2, this.f349775c, false);
        zzgx zzgxVar = this.f349776d;
        TX0.a.b(parcel, 3, zzgxVar == null ? null : zzgxVar.zzm(), false);
        TX0.a.i(parcel, 4, this.f349777e, i12, false);
        TX0.a.i(parcel, 5, this.f349778f, i12, false);
        TX0.a.i(parcel, 6, this.f349779g, i12, false);
        TX0.a.i(parcel, 7, this.f349780h, i12, false);
        TX0.a.j(parcel, 8, this.f349781i, false);
        TX0.a.j(parcel, 9, this.f349782j, false);
        TX0.a.p(parcel, iO2);
        this.f349782j = null;
    }

    public PublicKeyCredential(@j.P String str, @j.N String str2, @j.P zzgx zzgxVar, @j.P AuthenticatorAttestationResponse authenticatorAttestationResponse, @j.P AuthenticatorAssertionResponse authenticatorAssertionResponse, @j.P AuthenticatorErrorResponse authenticatorErrorResponse, @j.P AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @j.P String str3) {
        boolean z12 = false;
        C36729v.a("Must provide a response object.", (authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null));
        if (authenticatorErrorResponse != null || (str != null && zzgxVar != null)) {
            z12 = true;
        }
        C36729v.a("Must provide id and rawId if not an error response.", z12);
        this.f349774b = str;
        this.f349775c = str2;
        this.f349776d = zzgxVar;
        this.f349777e = authenticatorAttestationResponse;
        this.f349778f = authenticatorAssertionResponse;
        this.f349779g = authenticatorErrorResponse;
        this.f349780h = authenticationExtensionsClientOutputs;
        this.f349781i = str3;
        this.f349782j = null;
    }
}
