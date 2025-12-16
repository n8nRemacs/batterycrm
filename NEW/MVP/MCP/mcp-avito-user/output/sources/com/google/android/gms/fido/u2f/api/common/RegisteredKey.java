package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
@Deprecated
/* loaded from: classes6.dex */
public class RegisteredKey extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new l();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final KeyHandle f349927b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349928c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349929d;

    @SafeParcelable.b
    public RegisteredKey(@SafeParcelable.e @N KeyHandle keyHandle, @SafeParcelable.e @N String str, @SafeParcelable.e @N String str2) {
        C36729v.j(keyHandle);
        this.f349927b = keyHandle;
        this.f349929d = str;
        this.f349928c = str2;
    }

    public final boolean equals(@N Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.f349929d;
        if (str == null) {
            if (registeredKey.f349929d != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.f349929d)) {
            return false;
        }
        if (!this.f349927b.equals(registeredKey.f349927b)) {
            return false;
        }
        String str2 = registeredKey.f349928c;
        String str3 = this.f349928c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f349929d;
        int iHashCode = this.f349927b.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f349928c;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @N
    public final String toString() throws JSONException {
        KeyHandle keyHandle = this.f349927b;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.f349907c, 11));
            ProtocolVersion protocolVersion = keyHandle.f349908d;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.f349912b);
            }
            ArrayList arrayList = keyHandle.f349909e;
            if (arrayList != null) {
                jSONObject.put("transports", arrayList.toString());
            }
            String str = this.f349929d;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f349928c;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f349927b, i12, false);
        TX0.a.j(parcel, 3, this.f349929d, false);
        TX0.a.j(parcel, 4, this.f349928c, false);
        TX0.a.p(parcel, iO2);
    }
}
