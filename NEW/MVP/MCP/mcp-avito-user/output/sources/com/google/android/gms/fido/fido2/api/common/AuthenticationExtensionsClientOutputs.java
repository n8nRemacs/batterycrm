package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new F();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final UvmEntries f349715b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzf f349716c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final AuthenticationExtensionsCredPropsOutputs f349717d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzh f349718e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349719f;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {
    }

    @SafeParcelable.b
    public AuthenticationExtensionsClientOutputs(@SafeParcelable.e @j.P UvmEntries uvmEntries, @SafeParcelable.e @j.P zzf zzfVar, @SafeParcelable.e @j.P AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, @SafeParcelable.e @j.P zzh zzhVar, @SafeParcelable.e @j.P String str) {
        this.f349715b = uvmEntries;
        this.f349716c = zzfVar;
        this.f349717d = authenticationExtensionsCredPropsOutputs;
        this.f349718e = zzhVar;
        this.f349719f = str;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return C36727t.a(this.f349715b, authenticationExtensionsClientOutputs.f349715b) && C36727t.a(this.f349716c, authenticationExtensionsClientOutputs.f349716c) && C36727t.a(this.f349717d, authenticationExtensionsClientOutputs.f349717d) && C36727t.a(this.f349718e, authenticationExtensionsClientOutputs.f349718e) && C36727t.a(this.f349719f, authenticationExtensionsClientOutputs.f349719f);
    }

    @j.N
    public final JSONObject h() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f349717d;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.f349720b);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e12) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e12);
                }
            }
            UvmEntries uvmEntries = this.f349715b;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.h());
            }
            zzh zzhVar = this.f349718e;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.h());
            }
            String str = this.f349719f;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e13) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e13);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349715b, this.f349716c, this.f349717d, this.f349718e, this.f349719f});
    }

    @j.N
    public final String toString() {
        return AK.c.k("AuthenticationExtensionsClientOutputs{", h().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f349715b, i12, false);
        TX0.a.i(parcel, 2, this.f349716c, i12, false);
        TX0.a.i(parcel, 3, this.f349717d, i12, false);
        TX0.a.i(parcel, 4, this.f349718e, i12, false);
        TX0.a.j(parcel, 5, this.f349719f, false);
        TX0.a.p(parcel, iO2);
    }
}
