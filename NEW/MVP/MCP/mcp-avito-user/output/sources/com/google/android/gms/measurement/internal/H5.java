package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class H5 implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final zzo createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolValueOf = null;
        ArrayList<String> arrayListH = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        long jU2 = 0;
        long jU3 = 0;
        long jU4 = 0;
        long jU5 = 0;
        long jU6 = 0;
        long jU7 = 0;
        long jU8 = 0;
        boolean zL2 = true;
        boolean zL3 = true;
        boolean zL4 = false;
        int iS2 = 0;
        boolean zL5 = false;
        boolean zL6 = false;
        int iS3 = 0;
        long jU9 = -2147483648L;
        String strF11 = "";
        String strF12 = strF11;
        String strF13 = strF12;
        int iS4 = 100;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
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
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 7:
                    jU3 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\b':
                    strF5 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\t':
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\n':
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                case 11:
                    jU9 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\f':
                    strF6 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\r':
                    jU4 = SafeParcelReader.u(parcel, i12);
                    break;
                case 14:
                    jU5 = SafeParcelReader.u(parcel, i12);
                    break;
                case 15:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 16:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 17:
                case 20:
                case '!':
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
                case 18:
                    zL5 = SafeParcelReader.l(parcel, i12);
                    break;
                case 19:
                    strF7 = SafeParcelReader.f(parcel, i12);
                    break;
                case 21:
                    int iW2 = SafeParcelReader.w(parcel, i12);
                    if (iW2 != 0) {
                        SafeParcelReader.z(parcel, iW2, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        boolValueOf = null;
                        break;
                    }
                case 22:
                    jU6 = SafeParcelReader.u(parcel, i12);
                    break;
                case 23:
                    arrayListH = SafeParcelReader.h(parcel, i12);
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    strF8 = SafeParcelReader.f(parcel, i12);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    strF11 = SafeParcelReader.f(parcel, i12);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    strF12 = SafeParcelReader.f(parcel, i12);
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    strF9 = SafeParcelReader.f(parcel, i12);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    zL6 = SafeParcelReader.l(parcel, i12);
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    jU7 = SafeParcelReader.u(parcel, i12);
                    break;
                case 30:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 31:
                    strF13 = SafeParcelReader.f(parcel, i12);
                    break;
                case ' ':
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\"':
                    jU8 = SafeParcelReader.u(parcel, i12);
                    break;
                case '#':
                    strF10 = SafeParcelReader.f(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzo(strF, strF2, strF3, strF4, jU2, jU3, strF5, zL2, zL4, jU9, strF6, jU4, jU5, iS2, zL3, zL5, strF7, boolValueOf, jU6, arrayListH, strF8, strF11, strF12, strF9, zL6, jU7, iS4, strF13, iS3, jU8, strF10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i12) {
        return new zzo[i12];
    }
}
