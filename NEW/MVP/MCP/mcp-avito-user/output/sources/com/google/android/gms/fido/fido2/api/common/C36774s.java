package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36774s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        byte[] bArrC = null;
        Double dO2 = null;
        String strF = null;
        ArrayList arrayListJ = null;
        Integer numT = null;
        TokenBinding tokenBinding = null;
        String strF2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long lV2 = null;
        String strF3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    bArrC = SafeParcelReader.c(parcel, i12);
                    break;
                case 3:
                    dO2 = SafeParcelReader.o(parcel, i12);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    arrayListJ = SafeParcelReader.j(parcel, i12, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    numT = SafeParcelReader.t(parcel, i12);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) SafeParcelReader.e(parcel, i12, TokenBinding.CREATOR);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\t':
                    authenticationExtensions = (AuthenticationExtensions) SafeParcelReader.e(parcel, i12, AuthenticationExtensions.CREATOR);
                    break;
                case '\n':
                    lV2 = SafeParcelReader.v(parcel, i12);
                    break;
                case 11:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\f':
                    resultReceiver = (ResultReceiver) SafeParcelReader.e(parcel, i12, ResultReceiver.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new PublicKeyCredentialRequestOptions(bArrC, dO2, strF, arrayListJ, numT, tokenBinding, strF2, authenticationExtensions, lV2, strF3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new PublicKeyCredentialRequestOptions[i12];
    }
}
