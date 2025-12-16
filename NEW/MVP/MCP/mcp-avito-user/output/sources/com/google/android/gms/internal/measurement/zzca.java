package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzca extends zzbu implements zzby {
    @Override // com.google.android.gms.internal.measurement.zzby
    public final Bundle zza(Bundle bundle) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, bundle);
        Parcel parcelF4 = f4(parcelE4, 1);
        Bundle bundle2 = (Bundle) zzbw.zza(parcelF4, Bundle.CREATOR);
        parcelF4.recycle();
        return bundle2;
    }
}
