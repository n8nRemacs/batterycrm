package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.e(parcel, i12, GoogleSignInOptions.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new SignInConfiguration(strF, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new SignInConfiguration[i12];
    }
}
