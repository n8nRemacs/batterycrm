package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36866e implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final zzae createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        zznb zznbVar = null;
        String strF3 = null;
        zzbe zzbeVar = null;
        zzbe zzbeVar2 = null;
        zzbe zzbeVar3 = null;
        long jU2 = 0;
        long jU3 = 0;
        long jU4 = 0;
        boolean zL2 = false;
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
                    zznbVar = (zznb) SafeParcelReader.e(parcel, i12, zznb.CREATOR);
                    break;
                case 5:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 6:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    zzbeVar = (zzbe) SafeParcelReader.e(parcel, i12, zzbe.CREATOR);
                    break;
                case '\t':
                    jU3 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\n':
                    zzbeVar2 = (zzbe) SafeParcelReader.e(parcel, i12, zzbe.CREATOR);
                    break;
                case 11:
                    jU4 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\f':
                    zzbeVar3 = (zzbe) SafeParcelReader.e(parcel, i12, zzbe.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzae(strF, strF2, zznbVar, jU2, zL2, strF3, zzbeVar, jU3, zzbeVar2, jU4, zzbeVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i12) {
        return new zzae[i12];
    }
}
