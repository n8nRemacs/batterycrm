package jY0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ConnectionResult connectionResult = null;
        int iS2 = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.e(parcel, i12, ConnectionResult.CREATOR);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                zavVar = (zav) SafeParcelReader.e(parcel, i12, zav.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zak(iS2, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zak[i12];
    }
}
