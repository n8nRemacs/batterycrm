package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzdc extends zzbu implements zzda {
    public zzdc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zza() {
        Parcel parcelF4 = f4(e4(), 2);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zza(String str, String str2, Bundle bundle, long j12) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, bundle);
        parcelE4.writeLong(j12);
        g4(parcelE4, 1);
    }
}
