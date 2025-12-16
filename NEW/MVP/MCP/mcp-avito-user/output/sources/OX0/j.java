package OX0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            if (((char) i12) != 1) {
                SafeParcelReader.x(parcel, i12);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i12, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new BeginSignInResult(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new BeginSignInResult[i12];
    }
}
