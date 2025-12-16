package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class d extends g {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final void c(C36616a.b bVar) {
        m mVar = (m) ((i) bVar).getService();
        e eVar = new e(this);
        Parcel parcelE4 = mVar.e4();
        zac.zad(parcelE4, eVar);
        try {
            mVar.f350195a.transact(1, parcelE4, null, 1);
        } finally {
            parcelE4.recycle();
        }
    }
}
