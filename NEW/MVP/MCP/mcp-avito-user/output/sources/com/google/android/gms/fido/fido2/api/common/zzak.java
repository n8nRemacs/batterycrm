package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.internal.fido.zzfv;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new C36769m();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f349861c = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[][] f349862b;

    @SafeParcelable.b
    public zzak(@SafeParcelable.e byte[][] bArr) {
        C36729v.b(bArr != null);
        C36729v.b(1 == ((bArr.length & 1) ^ 1));
        int i12 = 0;
        while (i12 < bArr.length) {
            C36729v.b(i12 == 0 || bArr[i12] != null);
            int i13 = i12 + 1;
            C36729v.b(bArr[i13] != null);
            int length = bArr[i13].length;
            C36729v.b(length == 32 || length == 64);
            i12 += 2;
        }
        this.f349862b = bArr;
    }

    public static zzak h(JSONObject jSONObject, boolean z12) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z12) {
                    arrayList.add(j(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(y(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(C36749c.a(next));
                    if (z12) {
                        arrayList.add(j(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(y(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject i(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
        } else {
            jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
            jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        }
        return jSONObject;
    }

    public static byte[] j(JSONObject jSONObject) throws JSONException {
        byte[] bArrA = C36749c.a(jSONObject.getString("first"));
        if (bArrA.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrA;
        }
        byte[] bArrA2 = C36749c.a(jSONObject.getString("second"));
        if (bArrA2.length == 32) {
            return zzgj.zza(bArrA, bArrA2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] y(JSONObject jSONObject) {
        byte[] bArrA = C36749c.a(jSONObject.getString("first"));
        zzfv zzfvVarZza = zzfx.zza().zza();
        byte[] bArr = f349861c;
        zzfvVarZza.zza(bArr);
        zzfvVarZza.zza(bArrA);
        byte[] bArrZzd = zzfvVarZza.zzc().zzd();
        if (!jSONObject.has("second")) {
            return bArrZzd;
        }
        byte[] bArrA2 = C36749c.a(jSONObject.getString("second"));
        zzfv zzfvVarZza2 = zzfx.zza().zza();
        zzfvVarZza2.zza(bArr);
        zzfvVarZza2.zza(bArrA2);
        return zzgj.zza(bArrZzd, zzfvVarZza2.zzc().zzd());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.f349862b, ((zzak) obj).f349862b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f349862b) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() throws JSONException {
        byte[][] bArr = this.f349862b;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i12 = 0; i12 < bArr.length; i12 += 2) {
                if (bArr[i12] == null) {
                    jSONObject.put("eval", i(bArr[i12 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(C36749c.b(bArr[i12]), i(bArr[i12 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e12) {
            return AK.c.k("PrfExtension{Exception:", e12.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        byte[][] bArr = this.f349862b;
        if (bArr != null) {
            int iO3 = TX0.a.o(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            TX0.a.p(parcel, iO3);
        }
        TX0.a.p(parcel, iO2);
    }
}
