package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36698d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Account account = null;
        int iS2 = 0;
        int iS3 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                account = (Account) SafeParcelReader.e(parcel, i12, Account.CREATOR);
            } else if (c12 == 3) {
                iS3 = SafeParcelReader.s(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, i12, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zat(iS2, account, iS3, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zat[i12];
    }
}
