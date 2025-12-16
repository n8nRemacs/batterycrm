package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        int iS2 = 0;
        int iS3 = 0;
        Account account = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                iS3 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 3) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                account = (Account) SafeParcelReader.e(parcel, i12, Account.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new AccountChangeEventsRequest(iS2, iS3, strF, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new AccountChangeEventsRequest[i12];
    }
}
