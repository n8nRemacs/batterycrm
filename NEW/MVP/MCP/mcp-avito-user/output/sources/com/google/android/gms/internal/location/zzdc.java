package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzdc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        IBinder iBinderR = null;
        IBinder iBinderR2 = null;
        PendingIntent pendingIntent = null;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    iBinderR = SafeParcelReader.r(parcel, i12);
                    break;
                case 3:
                    iBinderR2 = SafeParcelReader.r(parcel, i12);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i12, PendingIntent.CREATOR);
                    break;
                case 5:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzdb(iS2, iBinderR, iBinderR2, pendingIntent, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzdb[i12];
    }
}
