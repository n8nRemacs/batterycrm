package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
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
public class SignResponseData extends ResponseData {

    @N
    public static final Parcelable.Creator<SignResponseData> CREATOR = new n();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[] f349937b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349938c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[] f349939d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[] f349940e;

    @SafeParcelable.b
    public SignResponseData(@SafeParcelable.e @N byte[] bArr, @SafeParcelable.e @N byte[] bArr2, @SafeParcelable.e @N String str, @SafeParcelable.e @N byte[] bArr3) {
        C36729v.j(bArr);
        this.f349937b = bArr;
        C36729v.j(str);
        this.f349938c = str;
        C36729v.j(bArr2);
        this.f349939d = bArr2;
        C36729v.j(bArr3);
        this.f349940e = bArr3;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.f349937b, signResponseData.f349937b) && C36727t.a(this.f349938c, signResponseData.f349938c) && Arrays.equals(this.f349939d, signResponseData.f349939d) && Arrays.equals(this.f349940e, signResponseData.f349940e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f349937b)), this.f349938c, Integer.valueOf(Arrays.hashCode(this.f349939d)), Integer.valueOf(Arrays.hashCode(this.f349940e))});
    }

    @N
    public final String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArr = this.f349937b;
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArr, 0, bArr.length));
        zzbiVarZza.zzb("clientDataString", this.f349938c);
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArr2 = this.f349939d;
        zzbiVarZza.zzb("signatureData", zzgfVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArr3 = this.f349940e;
        zzbiVarZza.zzb("application", zzgfVarZzf3.zzg(bArr3, 0, bArr3.length));
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.b(parcel, 2, this.f349937b, false);
        TX0.a.j(parcel, 3, this.f349938c, false);
        TX0.a.b(parcel, 4, this.f349939d, false);
        TX0.a.b(parcel, 5, this.f349940e, false);
        TX0.a.p(parcel, iO2);
    }
}
