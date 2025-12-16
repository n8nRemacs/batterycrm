package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new S();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final long f349868b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349869c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349870d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349871e;

    @SafeParcelable.b
    public zzq(@SafeParcelable.e long j12, @SafeParcelable.e @j.N byte[] bArr, @SafeParcelable.e @j.N byte[] bArr2, @SafeParcelable.e @j.N byte[] bArr3) {
        C36729v.j(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        C36729v.j(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        C36729v.j(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        this.f349868b = j12;
        C36729v.j(zzgxVarZzl);
        this.f349869c = zzgxVarZzl;
        C36729v.j(zzgxVarZzl2);
        this.f349870d = zzgxVarZzl2;
        C36729v.j(zzgxVarZzl3);
        this.f349871e = zzgxVarZzl3;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f349868b == zzqVar.f349868b && C36727t.a(this.f349869c, zzqVar.f349869c) && C36727t.a(this.f349870d, zzqVar.f349870d) && C36727t.a(this.f349871e, zzqVar.f349871e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f349868b), this.f349869c, this.f349870d, this.f349871e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 8);
        parcel.writeLong(this.f349868b);
        TX0.a.b(parcel, 2, this.f349869c.zzm(), false);
        TX0.a.b(parcel, 3, this.f349870d.zzm(), false);
        TX0.a.b(parcel, 4, this.f349871e.zzm(), false);
        TX0.a.p(parcel, iO2);
    }
}
