package com.google.android.gms.fido.fido2.api.common;

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
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new I();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349864b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349865c;

    public zzf(@j.P zzgx zzgxVar, @j.P zzgx zzgxVar2) {
        this.f349864b = zzgxVar;
        this.f349865c = zzgxVar2;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return C36727t.a(this.f349864b, zzfVar.f349864b) && C36727t.a(this.f349865c, zzfVar.f349865c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349864b, this.f349865c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        zzgx zzgxVar = this.f349864b;
        TX0.a.b(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.f349865c;
        TX0.a.b(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        TX0.a.p(parcel, iO2);
    }
}
