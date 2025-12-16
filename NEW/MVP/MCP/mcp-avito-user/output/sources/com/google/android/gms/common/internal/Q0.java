package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class Q0 extends zza implements InterfaceC36708i0 {
    @Override // com.google.android.gms.common.internal.InterfaceC36708i0
    public final int zzc() {
        Parcel parcelE4 = e4(f4(), 2);
        int i12 = parcelE4.readInt();
        parcelE4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC36708i0
    public final com.google.android.gms.dynamic.d zzd() {
        return P0.f(e4(f4(), 1));
    }
}
