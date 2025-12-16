package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new r();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final PublicKeyCredentialType f349808b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final COSEAlgorithmIdentifier f349809c;

    @SafeParcelable.b
    public PublicKeyCredentialParameters(@SafeParcelable.e @j.N String str, @SafeParcelable.e int i12) {
        C36729v.j(str);
        try {
            this.f349808b = PublicKeyCredentialType.a(str);
            try {
                this.f349809c = COSEAlgorithmIdentifier.a(i12);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e12) {
                throw new IllegalArgumentException(e12);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f349808b.equals(publicKeyCredentialParameters.f349808b) && this.f349809c.equals(publicKeyCredentialParameters.f349809c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349808b, this.f349809c});
    }

    @j.N
    public final String toString() {
        return androidx.camera.core.Q.a("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f349808b), ", \n algorithm=", String.valueOf(this.f349809c), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        this.f349808b.getClass();
        TX0.a.j(parcel, 2, "public-key", false);
        TX0.a.g(parcel, 3, Integer.valueOf(this.f349809c.f349746b.a()));
        TX0.a.p(parcel, iO2);
    }
}
