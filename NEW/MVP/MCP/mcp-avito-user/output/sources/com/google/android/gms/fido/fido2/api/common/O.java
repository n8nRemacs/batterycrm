package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        Uri uri = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) SafeParcelReader.e(parcel, i12, PublicKeyCredentialCreationOptions.CREATOR);
            } else if (c12 == 3) {
                uri = (Uri) SafeParcelReader.e(parcel, i12, Uri.CREATOR);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bArrC = SafeParcelReader.c(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new BrowserPublicKeyCredentialCreationOptions[i12];
    }
}
