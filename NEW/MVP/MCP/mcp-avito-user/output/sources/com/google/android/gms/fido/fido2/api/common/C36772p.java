package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.fido.zzgx;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36772p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        byte[] bArrC = null;
        String strF = null;
        String strF2 = null;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
        AuthenticatorErrorResponse authenticatorErrorResponse = null;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
        String strF3 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    bArrC = SafeParcelReader.c(parcel, i12);
                    break;
                case 4:
                    authenticatorAttestationResponse = (AuthenticatorAttestationResponse) SafeParcelReader.e(parcel, i12, AuthenticatorAttestationResponse.CREATOR);
                    break;
                case 5:
                    authenticatorAssertionResponse = (AuthenticatorAssertionResponse) SafeParcelReader.e(parcel, i12, AuthenticatorAssertionResponse.CREATOR);
                    break;
                case 6:
                    authenticatorErrorResponse = (AuthenticatorErrorResponse) SafeParcelReader.e(parcel, i12, AuthenticatorErrorResponse.CREATOR);
                    break;
                case 7:
                    authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) SafeParcelReader.e(parcel, i12, AuthenticationExtensionsClientOutputs.CREATOR);
                    break;
                case '\b':
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\t':
                    SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new PublicKeyCredential(strF, strF2, bArrC != null ? zzgx.zzl(bArrC, 0, bArrC.length) : null, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new PublicKeyCredential[i12];
    }
}
