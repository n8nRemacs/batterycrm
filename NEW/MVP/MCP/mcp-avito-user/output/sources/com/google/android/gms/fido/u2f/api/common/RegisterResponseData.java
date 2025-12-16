package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
@Deprecated
/* loaded from: classes6.dex */
public class RegisterResponseData extends ResponseData {

    @N
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new k();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[] f349924b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final ProtocolVersion f349925c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f349926d;

    @SafeParcelable.b
    public RegisterResponseData(@SafeParcelable.e byte[] bArr, @SafeParcelable.e String str, @SafeParcelable.e @P String str2) {
        this.f349924b = bArr;
        try {
            this.f349925c = ProtocolVersion.a(str);
            this.f349926d = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return C36727t.a(this.f349925c, registerResponseData.f349925c) && Arrays.equals(this.f349924b, registerResponseData.f349924b) && C36727t.a(this.f349926d, registerResponseData.f349926d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349925c, Integer.valueOf(Arrays.hashCode(this.f349924b)), this.f349926d});
    }

    @N
    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzbiVarZza.zzb("protocolVersion", this.f349925c);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArr = this.f349924b;
        zzbiVarZza.zzb("registerData", zzgfVarZzf.zzg(bArr, 0, bArr.length));
        String str = this.f349926d;
        if (str != null) {
            zzbiVarZza.zzb("clientDataString", str);
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.b(parcel, 2, this.f349924b, false);
        TX0.a.j(parcel, 3, this.f349925c.f349912b, false);
        TX0.a.j(parcel, 4, this.f349926d, false);
        TX0.a.p(parcel, iO2);
    }
}
