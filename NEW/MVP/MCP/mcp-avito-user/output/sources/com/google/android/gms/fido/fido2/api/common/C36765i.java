package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36765i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        boolean zL2 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            if (((char) i12) != 1) {
                SafeParcelReader.x(parcel, i12);
            } else {
                zL2 = SafeParcelReader.l(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzad(zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzad[i12];
    }
}
