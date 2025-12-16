package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class R0 extends zzb implements InterfaceC36708i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f349368a = 0;

    public R0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            com.google.android.gms.dynamic.d dVarZzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, dVarZzd);
        } else {
            if (i12 != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
