package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jU2 = 0;
        int iS2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, i12);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, i12, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\t':
                    strF6 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\n':
                    arrayListJ = SafeParcelReader.j(parcel, i12, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\f':
                    strF8 = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new GoogleSignInAccount(iS2, strF, strF2, strF3, strF4, uri, strF5, jU2, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new GoogleSignInAccount[i12];
    }
}
