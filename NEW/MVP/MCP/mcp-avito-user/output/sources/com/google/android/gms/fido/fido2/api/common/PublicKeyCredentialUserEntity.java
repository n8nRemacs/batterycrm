package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new C36777v();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final zzgx f349833b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String f349834c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349835d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String f349836e;

    @SafeParcelable.b
    public PublicKeyCredentialUserEntity(@SafeParcelable.e @j.N String str, @SafeParcelable.e @j.P String str2, @SafeParcelable.e @j.N String str3, @SafeParcelable.e @j.N byte[] bArr) {
        C36729v.j(bArr);
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        C36729v.j(zzgxVarZzl);
        this.f349833b = zzgxVarZzl;
        C36729v.j(str);
        this.f349834c = str;
        this.f349835d = str2;
        C36729v.j(str3);
        this.f349836e = str3;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return C36727t.a(this.f349833b, publicKeyCredentialUserEntity.f349833b) && C36727t.a(this.f349834c, publicKeyCredentialUserEntity.f349834c) && C36727t.a(this.f349835d, publicKeyCredentialUserEntity.f349835d) && C36727t.a(this.f349836e, publicKeyCredentialUserEntity.f349836e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349833b, this.f349834c, this.f349835d, this.f349836e});
    }

    @j.N
    public final String toString() {
        StringBuilder sbA = androidx.appcompat.app.r.A("PublicKeyCredentialUserEntity{\n id=", C36749c.b(this.f349833b.zzm()), ", \n name='");
        sbA.append(this.f349834c);
        sbA.append("', \n icon='");
        sbA.append(this.f349835d);
        sbA.append("', \n displayName='");
        return AK.c.s(sbA, this.f349836e, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.b(parcel, 2, this.f349833b.zzm(), false);
        TX0.a.j(parcel, 3, this.f349834c, false);
        TX0.a.j(parcel, 4, this.f349835d, false);
        TX0.a.j(parcel, 5, this.f349836e, false);
        TX0.a.p(parcel, iO2);
    }
}
