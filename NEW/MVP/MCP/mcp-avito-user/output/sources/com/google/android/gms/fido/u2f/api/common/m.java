package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Integer numT = null;
        Double dO2 = null;
        Uri uri = null;
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        ChannelIdValue channelIdValue = null;
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    numT = SafeParcelReader.t(parcel, i12);
                    break;
                case 3:
                    dO2 = SafeParcelReader.o(parcel, i12);
                    break;
                case 4:
                    uri = (Uri) SafeParcelReader.e(parcel, i12, Uri.CREATOR);
                    break;
                case 5:
                    bArrC = SafeParcelReader.c(parcel, i12);
                    break;
                case 6:
                    arrayListJ = SafeParcelReader.j(parcel, i12, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) SafeParcelReader.e(parcel, i12, ChannelIdValue.CREATOR);
                    break;
                case '\b':
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new SignRequestParams(numT, dO2, uri, bArrC, arrayListJ, channelIdValue, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new SignRequestParams[i12];
    }
}
