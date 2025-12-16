package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.media3.common.C23088b;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new G();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final FidoAppIdExtension f349692b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzs f349693c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final UserVerificationMethodExtension f349694d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzz f349695e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzab f349696f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzad f349697g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzu f349698h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzag f349699i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final GoogleThirdPartyPaymentExtension f349700j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzak f349701k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzaw f349702l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzai f349703m;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public FidoAppIdExtension f349704a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public UserVerificationMethodExtension f349705b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public zzs f349706c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public zzz f349707d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public zzab f349708e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public zzad f349709f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public zzu f349710g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public zzag f349711h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public GoogleThirdPartyPaymentExtension f349712i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        public zzak f349713j;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        public zzaw f349714k;

        @j.N
        public final AuthenticationExtensions a() {
            return new AuthenticationExtensions(this.f349704a, this.f349706c, this.f349705b, this.f349707d, this.f349708e, this.f349709f, this.f349710g, this.f349711h, this.f349712i, this.f349713j, this.f349714k, null);
        }
    }

    @SafeParcelable.b
    public AuthenticationExtensions(@SafeParcelable.e @j.P FidoAppIdExtension fidoAppIdExtension, @SafeParcelable.e @j.P zzs zzsVar, @SafeParcelable.e @j.P UserVerificationMethodExtension userVerificationMethodExtension, @SafeParcelable.e @j.P zzz zzzVar, @SafeParcelable.e @j.P zzab zzabVar, @SafeParcelable.e @j.P zzad zzadVar, @SafeParcelable.e @j.P zzu zzuVar, @SafeParcelable.e @j.P zzag zzagVar, @SafeParcelable.e @j.P GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, @SafeParcelable.e @j.P zzak zzakVar, @SafeParcelable.e @j.P zzaw zzawVar, @SafeParcelable.e @j.P zzai zzaiVar) {
        this.f349692b = fidoAppIdExtension;
        this.f349694d = userVerificationMethodExtension;
        this.f349693c = zzsVar;
        this.f349695e = zzzVar;
        this.f349696f = zzabVar;
        this.f349697g = zzadVar;
        this.f349698h = zzuVar;
        this.f349699i = zzagVar;
        this.f349700j = googleThirdPartyPaymentExtension;
        this.f349701k = zzakVar;
        this.f349702l = zzawVar;
        this.f349703m = zzaiVar;
    }

    @j.N
    public static AuthenticationExtensions h(@j.N JSONObject jSONObject) throws JSONException {
        a aVar = new a();
        if (jSONObject.has("fidoAppIdExtension")) {
            aVar.f349704a = new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
        }
        if (jSONObject.has(HiAnalyticsConstant.HaKey.BI_KEY_APPID)) {
            aVar.f349704a = new FidoAppIdExtension(jSONObject.getString(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            aVar.f349713j = zzak.h(jSONObject.getJSONObject("prf"), false);
        } else if (jSONObject.has("prfAlreadyHashed")) {
            aVar.f349713j = zzak.h(jSONObject.getJSONObject("prfAlreadyHashed"), true);
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            aVar.f349706c = new zzs(arrayList);
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            aVar.f349705b = new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            aVar.f349707d = new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            aVar.f349708e = new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            aVar.f349709f = new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
            aVar.f349710g = new zzu();
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            aVar.f349711h = new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            aVar.f349712i = new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
        }
        if (jSONObject.has("txAuthSimple")) {
            aVar.f349714k = new zzaw(jSONObject.getString("txAuthSimple"));
        }
        return aVar.a();
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return C36727t.a(this.f349692b, authenticationExtensions.f349692b) && C36727t.a(this.f349693c, authenticationExtensions.f349693c) && C36727t.a(this.f349694d, authenticationExtensions.f349694d) && C36727t.a(this.f349695e, authenticationExtensions.f349695e) && C36727t.a(this.f349696f, authenticationExtensions.f349696f) && C36727t.a(this.f349697g, authenticationExtensions.f349697g) && C36727t.a(this.f349698h, authenticationExtensions.f349698h) && C36727t.a(this.f349699i, authenticationExtensions.f349699i) && C36727t.a(this.f349700j, authenticationExtensions.f349700j) && C36727t.a(this.f349701k, authenticationExtensions.f349701k) && C36727t.a(this.f349702l, authenticationExtensions.f349702l) && C36727t.a(this.f349703m, authenticationExtensions.f349703m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349692b, this.f349693c, this.f349694d, this.f349695e, this.f349696f, this.f349697g, this.f349698h, this.f349699i, this.f349700j, this.f349701k, this.f349702l, this.f349703m});
    }

    @j.N
    public final String toString() {
        String strValueOf = String.valueOf(this.f349692b);
        String strValueOf2 = String.valueOf(this.f349693c);
        String strValueOf3 = String.valueOf(this.f349694d);
        String strValueOf4 = String.valueOf(this.f349695e);
        String strValueOf5 = String.valueOf(this.f349696f);
        String strValueOf6 = String.valueOf(this.f349697g);
        String strValueOf7 = String.valueOf(this.f349698h);
        String strValueOf8 = String.valueOf(this.f349699i);
        String strValueOf9 = String.valueOf(this.f349700j);
        String strValueOf10 = String.valueOf(this.f349701k);
        String strValueOf11 = String.valueOf(this.f349702l);
        StringBuilder sbB = C23088b.b("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        androidx.media3.exoplayer.analytics.m.p(sbB, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        androidx.media3.exoplayer.analytics.m.p(sbB, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        androidx.media3.exoplayer.analytics.m.p(sbB, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        androidx.media3.exoplayer.analytics.m.p(sbB, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return AK.c.s(sbB, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f349692b, i12, false);
        TX0.a.i(parcel, 3, this.f349693c, i12, false);
        TX0.a.i(parcel, 4, this.f349694d, i12, false);
        TX0.a.i(parcel, 5, this.f349695e, i12, false);
        TX0.a.i(parcel, 6, this.f349696f, i12, false);
        TX0.a.i(parcel, 7, this.f349697g, i12, false);
        TX0.a.i(parcel, 8, this.f349698h, i12, false);
        TX0.a.i(parcel, 9, this.f349699i, i12, false);
        TX0.a.i(parcel, 10, this.f349700j, i12, false);
        TX0.a.i(parcel, 11, this.f349701k, i12, false);
        TX0.a.i(parcel, 12, this.f349702l, i12, false);
        TX0.a.i(parcel, 13, this.f349703m, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
