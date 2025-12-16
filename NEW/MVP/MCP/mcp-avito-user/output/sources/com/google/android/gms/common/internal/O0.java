package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class O0 extends zza implements InterfaceC36719o {
    @Override // com.google.android.gms.common.internal.InterfaceC36719o
    public final void cancel() {
        Parcel parcelF4 = f4();
        try {
            this.f350220a.transact(2, parcelF4, null, 1);
        } finally {
            parcelF4.recycle();
        }
    }
}
