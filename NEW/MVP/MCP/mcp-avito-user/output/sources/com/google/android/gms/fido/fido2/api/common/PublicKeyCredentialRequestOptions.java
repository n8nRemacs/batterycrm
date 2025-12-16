package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @j.N
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new C36774s();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final byte[] f349810b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Double f349811c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String f349812d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final ArrayList f349813e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Integer f349814f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final TokenBinding f349815g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final UserVerificationRequirement f349816h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AuthenticationExtensions f349817i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Long f349818j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final ResultReceiver f349819k;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f349820a;

        /* renamed from: b, reason: collision with root package name */
        public Double f349821b;

        /* renamed from: c, reason: collision with root package name */
        public String f349822c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f349823d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f349824e;

        /* renamed from: f, reason: collision with root package name */
        public TokenBinding f349825f;

        /* renamed from: g, reason: collision with root package name */
        public UserVerificationRequirement f349826g;

        /* renamed from: h, reason: collision with root package name */
        public AuthenticationExtensions f349827h;

        /* renamed from: i, reason: collision with root package name */
        public Long f349828i;

        @j.N
        public final PublicKeyCredentialRequestOptions a() {
            byte[] bArr = this.f349820a;
            Double d12 = this.f349821b;
            String str = this.f349822c;
            ArrayList arrayList = this.f349823d;
            Integer num = this.f349824e;
            TokenBinding tokenBinding = this.f349825f;
            UserVerificationRequirement userVerificationRequirement = this.f349826g;
            return new PublicKeyCredentialRequestOptions(bArr, d12, str, arrayList, num, tokenBinding, userVerificationRequirement == null ? null : userVerificationRequirement.f349849b, this.f349827h, this.f349828i, null, null);
        }
    }

    @SafeParcelable.b
    public PublicKeyCredentialRequestOptions(@SafeParcelable.e @j.N byte[] bArr, @SafeParcelable.e @j.P Double d12, @SafeParcelable.e @j.N String str, @SafeParcelable.e @j.P ArrayList arrayList, @SafeParcelable.e @j.P Integer num, @SafeParcelable.e @j.P TokenBinding tokenBinding, @SafeParcelable.e @j.P String str2, @SafeParcelable.e @j.P AuthenticationExtensions authenticationExtensions, @SafeParcelable.e @j.P Long l12, @SafeParcelable.e @j.P String str3, @SafeParcelable.e @j.P ResultReceiver resultReceiver) throws JSONException {
        this.f349819k = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            C36729v.j(bArr);
            this.f349810b = bArr;
            this.f349811c = d12;
            C36729v.j(str);
            this.f349812d = str;
            this.f349813e = arrayList;
            this.f349814f = num;
            this.f349815g = tokenBinding;
            this.f349818j = l12;
            if (str2 != null) {
                try {
                    this.f349816h = UserVerificationRequirement.a(str2);
                } catch (zzbc e12) {
                    throw new IllegalArgumentException(e12);
                }
            } else {
                this.f349816h = null;
            }
            this.f349817i = authenticationExtensions;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            a aVar = new a();
            byte[] bArrA = C36749c.a(jSONObject.getString("challenge"));
            C36729v.j(bArrA);
            aVar.f349820a = bArrA;
            if (jSONObject.has("timeout")) {
                aVar.f349821b = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
            } else if (jSONObject.has("timeoutSeconds")) {
                aVar.f349821b = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
            }
            String string = jSONObject.getString("rpId");
            C36729v.j(string);
            aVar.f349822c = string;
            JSONArray jSONArray = jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
            if (jSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    arrayList2.add(PublicKeyCredentialDescriptor.h(jSONArray.getJSONObject(i12)));
                }
                aVar.f349823d = arrayList2;
            }
            if (jSONObject.has("requestId")) {
                aVar.f349824e = Integer.valueOf(jSONObject.getInt("requestId"));
            }
            if (jSONObject.has("tokenBinding")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                aVar.f349825f = new TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null);
            }
            if (jSONObject.has("userVerification")) {
                aVar.f349826g = UserVerificationRequirement.a(jSONObject.getString("userVerification"));
            }
            if (jSONObject.has("authenticationExtensions")) {
                aVar.f349827h = AuthenticationExtensions.h(jSONObject.getJSONObject("authenticationExtensions"));
            } else if (jSONObject.has(AttachMenuItem.File.EXTENSIONS)) {
                aVar.f349827h = AuthenticationExtensions.h(jSONObject.getJSONObject(AttachMenuItem.File.EXTENSIONS));
            }
            if (jSONObject.has("longRequestId")) {
                aVar.f349828i = Long.valueOf(jSONObject.getLong("longRequestId"));
            }
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsA = aVar.a();
            this.f349810b = publicKeyCredentialRequestOptionsA.f349810b;
            this.f349811c = publicKeyCredentialRequestOptionsA.f349811c;
            this.f349812d = publicKeyCredentialRequestOptionsA.f349812d;
            this.f349813e = publicKeyCredentialRequestOptionsA.f349813e;
            this.f349814f = publicKeyCredentialRequestOptionsA.f349814f;
            this.f349815g = publicKeyCredentialRequestOptionsA.f349815g;
            this.f349816h = publicKeyCredentialRequestOptionsA.f349816h;
            this.f349817i = publicKeyCredentialRequestOptionsA.f349817i;
            this.f349818j = publicKeyCredentialRequestOptionsA.f349818j;
        } catch (zzbc e13) {
            e = e13;
            throw new IllegalArgumentException(e);
        } catch (JSONException e14) {
            e = e14;
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@j.N Object obj) {
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (Arrays.equals(this.f349810b, publicKeyCredentialRequestOptions.f349810b) && C36727t.a(this.f349811c, publicKeyCredentialRequestOptions.f349811c) && C36727t.a(this.f349812d, publicKeyCredentialRequestOptions.f349812d)) {
            ArrayList arrayList = this.f349813e;
            ArrayList arrayList2 = publicKeyCredentialRequestOptions.f349813e;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && C36727t.a(this.f349814f, publicKeyCredentialRequestOptions.f349814f) && C36727t.a(this.f349815g, publicKeyCredentialRequestOptions.f349815g) && C36727t.a(this.f349816h, publicKeyCredentialRequestOptions.f349816h) && C36727t.a(this.f349817i, publicKeyCredentialRequestOptions.f349817i) && C36727t.a(this.f349818j, publicKeyCredentialRequestOptions.f349818j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f349810b)), this.f349811c, this.f349812d, this.f349813e, this.f349814f, this.f349815g, this.f349816h, this.f349817i, this.f349818j});
    }

    @j.N
    public final String toString() {
        String strB = C36749c.b(this.f349810b);
        String strValueOf = String.valueOf(this.f349813e);
        String strValueOf2 = String.valueOf(this.f349815g);
        String strValueOf3 = String.valueOf(this.f349816h);
        String strValueOf4 = String.valueOf(this.f349817i);
        StringBuilder sbA = androidx.appcompat.app.r.A("PublicKeyCredentialRequestOptions{\n challenge=", strB, ", \n timeoutSeconds=");
        sbA.append(this.f349811c);
        sbA.append(", \n rpId='");
        androidx.media3.exoplayer.analytics.m.p(sbA, this.f349812d, "', \n allowList=", strValueOf, ", \n requestId=");
        sbA.append(this.f349814f);
        sbA.append(", \n tokenBinding=");
        sbA.append(strValueOf2);
        sbA.append(", \n userVerification=");
        androidx.media3.exoplayer.analytics.m.p(sbA, strValueOf3, ", \n authenticationExtensions=", strValueOf4, ", \n longRequestId=");
        sbA.append(this.f349818j);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.b(parcel, 2, this.f349810b, false);
        TX0.a.c(parcel, 3, this.f349811c);
        TX0.a.j(parcel, 4, this.f349812d, false);
        TX0.a.n(parcel, 5, this.f349813e, false);
        TX0.a.g(parcel, 6, this.f349814f);
        TX0.a.i(parcel, 7, this.f349815g, i12, false);
        UserVerificationRequirement userVerificationRequirement = this.f349816h;
        TX0.a.j(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.f349849b, false);
        TX0.a.i(parcel, 9, this.f349817i, i12, false);
        TX0.a.h(parcel, 10, this.f349818j);
        TX0.a.i(parcel, 12, this.f349819k, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
