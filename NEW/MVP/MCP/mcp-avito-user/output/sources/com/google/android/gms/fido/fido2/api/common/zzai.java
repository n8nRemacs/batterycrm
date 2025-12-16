package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C23088b;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C36768l();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349857b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349858c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final zzgx f349859d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349860e;

    static {
        zzhp.zzg(1L);
        zzhp.zzg(2L);
        zzhp.zzg(3L);
        zzhp.zzg(4L);
    }

    public zzai(@j.P zzgx zzgxVar, @j.P zzgx zzgxVar2, @j.P zzgx zzgxVar3, int i12) {
        this.f349857b = zzgxVar;
        this.f349858c = zzgxVar2;
        this.f349859d = zzgxVar3;
        this.f349860e = i12;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return C36727t.a(this.f349857b, zzaiVar.f349857b) && C36727t.a(this.f349858c, zzaiVar.f349858c) && C36727t.a(this.f349859d, zzaiVar.f349859d) && this.f349860e == zzaiVar.f349860e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349857b, this.f349858c, this.f349859d, Integer.valueOf(this.f349860e)});
    }

    public final String toString() {
        zzgx zzgxVar = this.f349857b;
        String strB = C36749c.b(zzgxVar == null ? null : zzgxVar.zzm());
        zzgx zzgxVar2 = this.f349858c;
        String strB2 = C36749c.b(zzgxVar2 == null ? null : zzgxVar2.zzm());
        zzgx zzgxVar3 = this.f349859d;
        String strB3 = C36749c.b(zzgxVar3 != null ? zzgxVar3.zzm() : null);
        StringBuilder sbB = C23088b.b("HmacSecretExtension{coseKeyAgreement=", strB, ", saltEnc=", strB2, ", saltAuth=");
        sbB.append(strB3);
        sbB.append(", getPinUvAuthProtocol=");
        return AK.c.i(this.f349860e, "}", sbB);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        zzgx zzgxVar = this.f349857b;
        TX0.a.b(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.f349858c;
        TX0.a.b(parcel, 2, zzgxVar2 == null ? null : zzgxVar2.zzm(), false);
        zzgx zzgxVar3 = this.f349859d;
        TX0.a.b(parcel, 3, zzgxVar3 != null ? zzgxVar3.zzm() : null, false);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f349860e);
        TX0.a.p(parcel, iO2);
    }
}
