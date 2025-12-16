package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36771o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        Double dO2 = null;
        ArrayList arrayListJ2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numT = null;
        TokenBinding tokenBinding = null;
        String strF = null;
        AuthenticationExtensions authenticationExtensions = null;
        String strF2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) SafeParcelReader.e(parcel, i12, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) SafeParcelReader.e(parcel, i12, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrC = SafeParcelReader.c(parcel, i12);
                    break;
                case 5:
                    arrayListJ = SafeParcelReader.j(parcel, i12, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dO2 = SafeParcelReader.o(parcel, i12);
                    break;
                case 7:
                    arrayListJ2 = SafeParcelReader.j(parcel, i12, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case '\b':
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) SafeParcelReader.e(parcel, i12, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case '\t':
                    numT = SafeParcelReader.t(parcel, i12);
                    break;
                case '\n':
                    tokenBinding = (TokenBinding) SafeParcelReader.e(parcel, i12, TokenBinding.CREATOR);
                    break;
                case 11:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case '\f':
                    authenticationExtensions = (AuthenticationExtensions) SafeParcelReader.e(parcel, i12, AuthenticationExtensions.CREATOR);
                    break;
                case '\r':
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) SafeParcelReader.e(parcel, i12, ResultReceiver.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrC, arrayListJ, dO2, arrayListJ2, authenticatorSelectionCriteria, numT, tokenBinding, strF, authenticationExtensions, strF2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new PublicKeyCredentialCreationOptions[i12];
    }
}
