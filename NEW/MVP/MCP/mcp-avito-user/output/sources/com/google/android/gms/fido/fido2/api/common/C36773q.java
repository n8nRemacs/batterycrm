package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36773q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 == 3) {
                bArrC = SafeParcelReader.c(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                arrayListJ = SafeParcelReader.j(parcel, i12, Transport.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new PublicKeyCredentialDescriptor(strF, bArrC, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new PublicKeyCredentialDescriptor[i12];
    }
}
