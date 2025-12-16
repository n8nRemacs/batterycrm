package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.media3.common.C23088b;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final PublicKeyCredentialType f349805b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349806c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final ArrayList f349807d;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    static {
        zzcf.zzm(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);
        CREATOR = new C36773q();
    }

    public PublicKeyCredentialDescriptor() {
        throw null;
    }

    @SafeParcelable.b
    public PublicKeyCredentialDescriptor(@SafeParcelable.e @j.N String str, @SafeParcelable.e @j.N byte[] bArr, @SafeParcelable.e @j.P ArrayList arrayList) {
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        C36729v.j(str);
        try {
            this.f349805b = PublicKeyCredentialType.a(str);
            C36729v.j(zzgxVarZzl);
            this.f349806c = zzgxVarZzl;
            this.f349807d = arrayList;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    @j.N
    public static PublicKeyCredentialDescriptor h(@j.N JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("type");
        byte[] bArrDecode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports")) {
            JSONArray jSONArray = jSONObject.getJSONArray("transports");
            Transport transport = Transport.HYBRID;
            if (jSONArray != null) {
                HashSet hashSet = new HashSet(jSONArray.length());
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    String string2 = jSONArray.getString(i12);
                    if (string2 != null && !string2.isEmpty()) {
                        try {
                            hashSet.add(Transport.a(string2));
                        } catch (Transport.UnsupportedTransportException unused) {
                            "Ignoring unrecognized transport ".concat(string2);
                        }
                    }
                }
                arrayList = new ArrayList(hashSet);
            }
        }
        return new PublicKeyCredentialDescriptor(string, bArrDecode, arrayList);
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f349805b.equals(publicKeyCredentialDescriptor.f349805b) || !C36727t.a(this.f349806c, publicKeyCredentialDescriptor.f349806c)) {
            return false;
        }
        ArrayList arrayList = this.f349807d;
        ArrayList arrayList2 = publicKeyCredentialDescriptor.f349807d;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349805b, this.f349806c, this.f349807d});
    }

    @j.N
    public final String toString() {
        String strValueOf = String.valueOf(this.f349805b);
        String strB = C36749c.b(this.f349806c.zzm());
        return AK.c.s(C23088b.b("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strB, ", \n transports="), String.valueOf(this.f349807d), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        this.f349805b.getClass();
        TX0.a.j(parcel, 2, "public-key", false);
        TX0.a.b(parcel, 3, this.f349806c.zzm(), false);
        TX0.a.n(parcel, 4, this.f349807d, false);
        TX0.a.p(parcel, iO2);
    }
}
