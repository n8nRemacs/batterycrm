package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36779x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            if (((char) i12) != 1) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzaw(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzaw[i12];
    }
}
