package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new X();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349764b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349765c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349766d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349767e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349768f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349769g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final long f349770h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Account f349771i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349772j;

    @SafeParcelable.b
    public FidoCredentialDetails(@SafeParcelable.e @j.P String str, @SafeParcelable.e @j.P String str2, @SafeParcelable.e @j.P byte[] bArr, @SafeParcelable.e @j.N byte[] bArr2, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e long j12, @SafeParcelable.e @j.P Account account, @SafeParcelable.e boolean z14) {
        zzgx zzgxVarZzl = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        this.f349764b = str;
        this.f349765c = str2;
        this.f349766d = zzgxVarZzl;
        this.f349767e = zzgxVarZzl2;
        this.f349768f = z12;
        this.f349769g = z13;
        this.f349770h = j12;
        this.f349771i = account;
        this.f349772j = z14;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return C36727t.a(this.f349764b, fidoCredentialDetails.f349764b) && C36727t.a(this.f349765c, fidoCredentialDetails.f349765c) && C36727t.a(this.f349766d, fidoCredentialDetails.f349766d) && C36727t.a(this.f349767e, fidoCredentialDetails.f349767e) && this.f349768f == fidoCredentialDetails.f349768f && this.f349769g == fidoCredentialDetails.f349769g && this.f349772j == fidoCredentialDetails.f349772j && this.f349770h == fidoCredentialDetails.f349770h && C36727t.a(this.f349771i, fidoCredentialDetails.f349771i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349764b, this.f349765c, this.f349766d, this.f349767e, Boolean.valueOf(this.f349768f), Boolean.valueOf(this.f349769g), Boolean.valueOf(this.f349772j), Long.valueOf(this.f349770h), this.f349771i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f349764b, false);
        TX0.a.j(parcel, 2, this.f349765c, false);
        zzgx zzgxVar = this.f349766d;
        TX0.a.b(parcel, 3, zzgxVar == null ? null : zzgxVar.zzm(), false);
        TX0.a.b(parcel, 4, this.f349767e.zzm(), false);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f349768f ? 1 : 0);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f349769g ? 1 : 0);
        TX0.a.q(parcel, 7, 8);
        parcel.writeLong(this.f349770h);
        TX0.a.i(parcel, 8, this.f349771i, i12, false);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(this.f349772j ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
