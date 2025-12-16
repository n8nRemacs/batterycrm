package OX0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        SignInPassword signInPassword = null;
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                signInPassword = (SignInPassword) SafeParcelReader.e(parcel, i12, SignInPassword.CREATOR);
            } else if (c12 == 2) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                iS2 = SafeParcelReader.s(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new SavePasswordRequest(signInPassword, strF, iS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new SavePasswordRequest[i12];
    }
}
