package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        String strF = null;
        String strF2 = null;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        Account account = null;
        long jU2 = 0;
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
                    bArrC2 = SafeParcelReader.c(parcel, i12);
                    break;
                case 5:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 7:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.e(parcel, i12, Account.CREATOR);
                    break;
                case '\t':
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new FidoCredentialDetails(strF, strF2, bArrC, bArrC2, zL2, zL3, jU2, account, zL4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new FidoCredentialDetails[i12];
    }
}
