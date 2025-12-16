package OX0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        boolean zL2 = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
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
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF4 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new GetSignInIntentRequest(iS2, strF, strF2, strF3, strF4, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new GetSignInIntentRequest[i12];
    }
}
