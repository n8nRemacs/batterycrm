package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new C36775t();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String f349829b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final String f349830c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349831d;

    @SafeParcelable.b
    public PublicKeyCredentialRpEntity(@SafeParcelable.e @j.N String str, @SafeParcelable.e @j.N String str2, @SafeParcelable.e @j.P String str3) {
        C36729v.j(str);
        this.f349829b = str;
        C36729v.j(str2);
        this.f349830c = str2;
        this.f349831d = str3;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return C36727t.a(this.f349829b, publicKeyCredentialRpEntity.f349829b) && C36727t.a(this.f349830c, publicKeyCredentialRpEntity.f349830c) && C36727t.a(this.f349831d, publicKeyCredentialRpEntity.f349831d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349829b, this.f349830c, this.f349831d});
    }

    @j.N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f349829b);
        sb2.append("', \n name='");
        sb2.append(this.f349830c);
        sb2.append("', \n icon='");
        return AK.c.s(sb2, this.f349831d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f349829b, false);
        TX0.a.j(parcel, 3, this.f349830c, false);
        TX0.a.j(parcel, 4, this.f349831d, false);
        TX0.a.p(parcel, iO2);
    }
}
