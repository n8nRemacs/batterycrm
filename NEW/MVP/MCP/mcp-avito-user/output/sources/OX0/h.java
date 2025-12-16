package OX0;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        Account account = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleB = null;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    arrayListJ = SafeParcelReader.j(parcel, i12, Scope.CREATOR);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 4:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 5:
                    account = (Account) SafeParcelReader.e(parcel, i12, Account.CREATOR);
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\t':
                    bundleB = SafeParcelReader.b(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new AuthorizationRequest(arrayListJ, strF, zL2, zL3, account, strF2, strF3, zL4, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new AuthorizationRequest[i12];
    }
}
