package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class W extends zaa implements IInterface {
    public final com.google.android.gms.dynamic.d g4(com.google.android.gms.dynamic.f fVar, zax zaxVar) {
        Parcel parcelE4 = e4();
        zac.zad(parcelE4, fVar);
        zac.zac(parcelE4, zaxVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f350195a.transact(2, parcelE4, parcelObtain, 0);
                parcelObtain.readException();
                parcelE4.recycle();
                com.google.android.gms.dynamic.d dVarF4 = d.a.f4(parcelObtain.readStrongBinder());
                parcelObtain.recycle();
                return dVarF4;
            } catch (RuntimeException e12) {
                parcelObtain.recycle();
                throw e12;
            }
        } catch (Throwable th2) {
            parcelE4.recycle();
            throw th2;
        }
    }
}
