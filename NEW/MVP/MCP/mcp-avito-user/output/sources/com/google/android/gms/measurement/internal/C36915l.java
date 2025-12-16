package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36915l implements Parcelable.Creator<zzaj> {
    @Override // android.os.Parcelable.Creator
    public final zzaj createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            if (((char) i12) != 1) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bundleB = SafeParcelReader.b(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzaj(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaj[] newArray(int i12) {
        return new zzaj[i12];
    }
}
