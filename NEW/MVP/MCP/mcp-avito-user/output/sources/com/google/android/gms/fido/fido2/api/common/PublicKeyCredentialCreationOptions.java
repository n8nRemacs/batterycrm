package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.internal.fido.zzbl;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @j.N
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new C36771o();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final PublicKeyCredentialRpEntity f349783b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final PublicKeyCredentialUserEntity f349784c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final byte[] f349785d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final ArrayList f349786e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Double f349787f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final ArrayList f349788g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AuthenticatorSelectionCriteria f349789h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Integer f349790i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final TokenBinding f349791j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AttestationConveyancePreference f349792k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AuthenticationExtensions f349793l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349794m;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final ResultReceiver f349795n;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public PublicKeyCredentialRpEntity f349796a;

        /* renamed from: b, reason: collision with root package name */
        public PublicKeyCredentialUserEntity f349797b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f349798c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f349799d;

        /* renamed from: e, reason: collision with root package name */
        public Double f349800e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f349801f;

        /* renamed from: g, reason: collision with root package name */
        public AuthenticatorSelectionCriteria f349802g;

        /* renamed from: h, reason: collision with root package name */
        public AttestationConveyancePreference f349803h;

        /* renamed from: i, reason: collision with root package name */
        public AuthenticationExtensions f349804i;

        @j.N
        public final PublicKeyCredentialCreationOptions a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f349796a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f349797b;
            byte[] bArr = this.f349798c;
            ArrayList arrayList = this.f349799d;
            Double d12 = this.f349800e;
            ArrayList arrayList2 = this.f349801f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f349802g;
            AttestationConveyancePreference attestationConveyancePreference = this.f349803h;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d12, arrayList2, authenticatorSelectionCriteria, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.f349691b, this.f349804i, null, null);
        }
    }

    @SafeParcelable.b
    public PublicKeyCredentialCreationOptions(@SafeParcelable.e @j.N PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @SafeParcelable.e @j.N PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @SafeParcelable.e @j.N byte[] bArr, @SafeParcelable.e @j.N ArrayList arrayList, @SafeParcelable.e @j.P Double d12, @SafeParcelable.e @j.P ArrayList arrayList2, @SafeParcelable.e @j.P AuthenticatorSelectionCriteria authenticatorSelectionCriteria, @SafeParcelable.e @j.P Integer num, @SafeParcelable.e @j.P TokenBinding tokenBinding, @SafeParcelable.e @j.P String str, @SafeParcelable.e @j.P AuthenticationExtensions authenticationExtensions, @SafeParcelable.e @j.P String str2, @SafeParcelable.e @j.P ResultReceiver resultReceiver) {
        this.f349795n = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsH = h(new JSONObject(str2));
                this.f349783b = publicKeyCredentialCreationOptionsH.f349783b;
                this.f349784c = publicKeyCredentialCreationOptionsH.f349784c;
                this.f349785d = publicKeyCredentialCreationOptionsH.f349785d;
                this.f349786e = publicKeyCredentialCreationOptionsH.f349786e;
                this.f349787f = publicKeyCredentialCreationOptionsH.f349787f;
                this.f349788g = publicKeyCredentialCreationOptionsH.f349788g;
                this.f349789h = publicKeyCredentialCreationOptionsH.f349789h;
                this.f349790i = publicKeyCredentialCreationOptionsH.f349790i;
                this.f349791j = publicKeyCredentialCreationOptionsH.f349791j;
                this.f349792k = publicKeyCredentialCreationOptionsH.f349792k;
                this.f349793l = publicKeyCredentialCreationOptionsH.f349793l;
                this.f349794m = str2;
                return;
            } catch (JSONException e12) {
                throw new IllegalArgumentException(e12);
            }
        }
        C36729v.j(publicKeyCredentialRpEntity);
        this.f349783b = publicKeyCredentialRpEntity;
        C36729v.j(publicKeyCredentialUserEntity);
        this.f349784c = publicKeyCredentialUserEntity;
        C36729v.j(bArr);
        this.f349785d = bArr;
        C36729v.j(arrayList);
        this.f349786e = arrayList;
        this.f349787f = d12;
        this.f349788g = arrayList2;
        this.f349789h = authenticatorSelectionCriteria;
        this.f349790i = num;
        this.f349791j = tokenBinding;
        if (str != null) {
            try {
                this.f349792k = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e13) {
                throw new IllegalArgumentException(e13);
            }
        } else {
            this.f349792k = null;
        }
        this.f349793l = authenticationExtensions;
        this.f349794m = null;
    }

    @j.N
    public static PublicKeyCredentialCreationOptions h(@j.N JSONObject jSONObject) throws JSONException {
        zzbl zzblVarZzc;
        a aVar = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        aVar.f349796a = new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject(ChannelContext.UserToUser.TYPE);
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        aVar.f349797b = new PublicKeyCredentialUserEntity(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), C36749c.a(jSONObject3.getString("id")));
        byte[] bArrA = C36749c.a(jSONObject.getString("challenge"));
        C36729v.j(bArrA);
        aVar.f349798c = bArrA;
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i12);
            try {
                zzblVarZzc = zzbl.zzd(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzblVarZzc = zzbl.zzc();
            }
            if (zzblVarZzc.zzb()) {
                arrayList.add(zzblVarZzc.zza());
            }
        }
        aVar.f349799d = arrayList;
        if (jSONObject.has("timeout")) {
            aVar.f349800e = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                arrayList2.add(PublicKeyCredentialDescriptor.h(jSONArray2.getJSONObject(i13)));
            }
            aVar.f349801f = arrayList2;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator3 = AuthenticatorSelectionCriteria.CREATOR;
            aVar.f349802g = new AuthenticatorSelectionCriteria(jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null);
        }
        if (jSONObject.has(AttachMenuItem.File.EXTENSIONS)) {
            aVar.f349804i = AuthenticationExtensions.h(jSONObject.getJSONObject(AttachMenuItem.File.EXTENSIONS));
        }
        if (jSONObject.has("attestation")) {
            try {
                aVar.f349803h = AttestationConveyancePreference.a(jSONObject.getString("attestation"));
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException unused2) {
                aVar.f349803h = AttestationConveyancePreference.NONE;
            }
        }
        return aVar.a();
    }

    public final boolean equals(@j.N Object obj) {
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (C36727t.a(this.f349783b, publicKeyCredentialCreationOptions.f349783b) && C36727t.a(this.f349784c, publicKeyCredentialCreationOptions.f349784c) && Arrays.equals(this.f349785d, publicKeyCredentialCreationOptions.f349785d) && C36727t.a(this.f349787f, publicKeyCredentialCreationOptions.f349787f)) {
            ArrayList arrayList = this.f349786e;
            ArrayList arrayList2 = publicKeyCredentialCreationOptions.f349786e;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
                ArrayList arrayList3 = this.f349788g;
                ArrayList arrayList4 = publicKeyCredentialCreationOptions.f349788g;
                if (((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && C36727t.a(this.f349789h, publicKeyCredentialCreationOptions.f349789h) && C36727t.a(this.f349790i, publicKeyCredentialCreationOptions.f349790i) && C36727t.a(this.f349791j, publicKeyCredentialCreationOptions.f349791j) && C36727t.a(this.f349792k, publicKeyCredentialCreationOptions.f349792k) && C36727t.a(this.f349793l, publicKeyCredentialCreationOptions.f349793l) && C36727t.a(this.f349794m, publicKeyCredentialCreationOptions.f349794m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349783b, this.f349784c, Integer.valueOf(Arrays.hashCode(this.f349785d)), this.f349786e, this.f349787f, this.f349788g, this.f349789h, this.f349790i, this.f349791j, this.f349792k, this.f349793l, this.f349794m});
    }

    @j.N
    public final String toString() {
        String strValueOf = String.valueOf(this.f349783b);
        String strValueOf2 = String.valueOf(this.f349784c);
        String strB = C36749c.b(this.f349785d);
        String strValueOf3 = String.valueOf(this.f349786e);
        String strValueOf4 = String.valueOf(this.f349788g);
        String strValueOf5 = String.valueOf(this.f349789h);
        String strValueOf6 = String.valueOf(this.f349791j);
        String strValueOf7 = String.valueOf(this.f349792k);
        String strValueOf8 = String.valueOf(this.f349793l);
        StringBuilder sbB = C23088b.b("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        androidx.media3.exoplayer.analytics.m.p(sbB, strB, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbB.append(this.f349787f);
        sbB.append(", \n excludeList=");
        sbB.append(strValueOf4);
        sbB.append(", \n authenticatorSelection=");
        sbB.append(strValueOf5);
        sbB.append(", \n requestId=");
        sbB.append(this.f349790i);
        sbB.append(", \n tokenBinding=");
        sbB.append(strValueOf6);
        sbB.append(", \n attestationConveyancePreference=");
        return androidx.camera.camera2.internal.G.h(sbB, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f349783b, i12, false);
        TX0.a.i(parcel, 3, this.f349784c, i12, false);
        TX0.a.b(parcel, 4, this.f349785d, false);
        TX0.a.n(parcel, 5, this.f349786e, false);
        TX0.a.c(parcel, 6, this.f349787f);
        TX0.a.n(parcel, 7, this.f349788g, false);
        TX0.a.i(parcel, 8, this.f349789h, i12, false);
        TX0.a.g(parcel, 9, this.f349790i);
        TX0.a.i(parcel, 10, this.f349791j, i12, false);
        AttestationConveyancePreference attestationConveyancePreference = this.f349792k;
        TX0.a.j(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.f349691b, false);
        TX0.a.i(parcel, 12, this.f349793l, i12, false);
        TX0.a.j(parcel, 13, this.f349794m, false);
        TX0.a.i(parcel, 14, this.f349795n, i12, false);
        TX0.a.p(parcel, iO2);
    }

    public PublicKeyCredentialCreationOptions(@j.N String str) {
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsH = h(new JSONObject(str));
            this.f349783b = publicKeyCredentialCreationOptionsH.f349783b;
            this.f349784c = publicKeyCredentialCreationOptionsH.f349784c;
            this.f349785d = publicKeyCredentialCreationOptionsH.f349785d;
            this.f349786e = publicKeyCredentialCreationOptionsH.f349786e;
            this.f349787f = publicKeyCredentialCreationOptionsH.f349787f;
            this.f349788g = publicKeyCredentialCreationOptionsH.f349788g;
            this.f349789h = publicKeyCredentialCreationOptionsH.f349789h;
            this.f349790i = publicKeyCredentialCreationOptionsH.f349790i;
            this.f349791j = publicKeyCredentialCreationOptionsH.f349791j;
            this.f349792k = publicKeyCredentialCreationOptionsH.f349792k;
            this.f349793l = publicKeyCredentialCreationOptionsH.f349793l;
            this.f349794m = str;
        } catch (JSONException e12) {
            throw new IllegalArgumentException(e12);
        }
    }
}
