package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList<String> arrayListH = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 5:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 6:
                    arrayListH = SafeParcelReader.h(parcel, i12);
                    break;
                case 7:
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zL2, strF, strF2, zL3, strF3, arrayListH, zL4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i12];
    }
}
