package PX0;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundleB = null;
        byte[] bArrC = null;
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS3 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i12, PendingIntent.CREATOR);
            } else if (c12 == 3) {
                iS4 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 4) {
                bundleB = SafeParcelReader.b(parcel, i12);
            } else if (c12 == 5) {
                bArrC = SafeParcelReader.c(parcel, i12);
            } else if (c12 != 1000) {
                SafeParcelReader.x(parcel, i12);
            } else {
                iS2 = SafeParcelReader.s(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ProxyResponse(iS2, iS3, pendingIntent, iS4, bundleB, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new ProxyResponse[i12];
    }
}
