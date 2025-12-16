package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        Account account = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        int iS2 = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    arrayListJ2 = SafeParcelReader.j(parcel, i12, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.e(parcel, i12, Account.CREATOR);
                    break;
                case 4:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 5:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                case 7:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\t':
                    arrayListJ = SafeParcelReader.j(parcel, i12, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new GoogleSignInOptions(iS2, arrayListJ2, account, zL2, zL3, zL4, strF, strF2, GoogleSignInOptions.i(arrayListJ), strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new GoogleSignInOptions[i12];
    }
}
