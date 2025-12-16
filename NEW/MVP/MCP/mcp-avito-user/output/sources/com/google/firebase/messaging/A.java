package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes6.dex */
public class A implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    @j.P
    public final RemoteMessage createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            if (((char) i12) != 2) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bundleB = SafeParcelReader.b(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new RemoteMessage(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    @j.P
    public final RemoteMessage[] newArray(int i12) {
        return new RemoteMessage[i12];
    }
}
