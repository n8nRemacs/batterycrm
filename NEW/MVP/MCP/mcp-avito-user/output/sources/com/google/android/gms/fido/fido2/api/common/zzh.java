package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new J();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349866b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349867c;

    public zzh(boolean z12, @j.P zzgx zzgxVar) {
        this.f349866b = z12;
        this.f349867c = zzgxVar;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f349866b == zzhVar.f349866b && C36727t.a(this.f349867c, zzhVar.f349867c);
    }

    public final JSONObject h() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f349866b) {
                jSONObject.put("enabled", true);
            }
            zzgx zzgxVar = this.f349867c;
            byte[] bArrZzm = zzgxVar == null ? null : zzgxVar.zzm();
            if (bArrZzm != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrZzm, 32), 11));
                if (bArrZzm.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrZzm, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e12) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e12);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f349866b), this.f349867c});
    }

    public final String toString() {
        return AK.c.k("AuthenticationExtensionsPrfOutputs{", h().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349866b ? 1 : 0);
        zzgx zzgxVar = this.f349867c;
        TX0.a.b(parcel, 2, zzgxVar == null ? null : zzgxVar.zzm(), false);
        TX0.a.p(parcel, iO2);
    }
}
