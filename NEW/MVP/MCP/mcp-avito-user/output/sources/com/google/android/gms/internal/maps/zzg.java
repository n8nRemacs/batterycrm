package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.dynamic.d;

/* loaded from: classes6.dex */
public final class zzg extends zza implements zze {
    @Override // com.google.android.gms.internal.maps.zze
    public final d zza(int i12) {
        Parcel parcelE4 = e4();
        parcelE4.writeInt(i12);
        return P0.f(f4(parcelE4, 1));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final d zzb(String str) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        return P0.f(f4(parcelE4, 3));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final d zzc(String str) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        return P0.f(f4(parcelE4, 7));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final d zzi() {
        return P0.f(f4(e4(), 4));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final d zza(String str) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        return P0.f(f4(parcelE4, 2));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final d zza(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        return P0.f(f4(parcelE4, 5));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final d zza(Bitmap bitmap) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, bitmap);
        return P0.f(f4(parcelE4, 6));
    }
}
