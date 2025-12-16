package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzd extends zza implements zzf {
    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelE4 = e4(parcelObtain, 1);
        String string = parcelE4.readString();
        parcelE4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelE4 = e4(parcelObtain, 6);
        boolean zZzb = zzc.zzb(parcelE4);
        parcelE4.recycle();
        return zZzb;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z12) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        zzc.zza(parcelObtain, true);
        Parcel parcelE4 = e4(parcelObtain, 2);
        boolean zZzb = zzc.zzb(parcelE4);
        parcelE4.recycle();
        return zZzb;
    }
}
