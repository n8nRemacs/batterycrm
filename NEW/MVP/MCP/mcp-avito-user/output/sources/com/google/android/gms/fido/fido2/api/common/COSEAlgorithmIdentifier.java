package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @j.N
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new Q();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Enum f349746b;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedAlgorithmIdentifierException extends Exception {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public COSEAlgorithmIdentifier(@j.N InterfaceC36757a interfaceC36757a) {
        this.f349746b = (Enum) interfaceC36757a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.N
    public static COSEAlgorithmIdentifier a(int i12) throws UnsupportedAlgorithmIdentifierException {
        RSAAlgorithm rSAAlgorithm;
        if (i12 == -262) {
            rSAAlgorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] rSAAlgorithmArrValues = RSAAlgorithm.values();
            int length = rSAAlgorithmArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    for (EC2Algorithm eC2Algorithm : EC2Algorithm.values()) {
                        if (eC2Algorithm.f349748b == i12) {
                            rSAAlgorithm = eC2Algorithm;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(androidx.camera.camera2.internal.G.e(i12, "Algorithm with COSE value ", " not supported"));
                }
                RSAAlgorithm rSAAlgorithm2 = rSAAlgorithmArrValues[i13];
                if (rSAAlgorithm2.f349839b == i12) {
                    rSAAlgorithm = rSAAlgorithm2;
                    break;
                }
                i13++;
            }
        }
        return new COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    public final boolean equals(@j.P Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f349746b.a() == ((COSEAlgorithmIdentifier) obj).f349746b.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349746b});
    }

    @j.N
    public final String toString() {
        return AK.c.k("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f349746b), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        parcel.writeInt(this.f349746b.a());
    }
}
