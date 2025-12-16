package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzc {
    static {
        zzc.class.getClassLoader();
    }

    public static void zza(Parcel parcel, boolean z12) {
        parcel.writeInt(1);
    }

    public static boolean zzb(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
