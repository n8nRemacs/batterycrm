package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbc;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
final class l extends o {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final void c(C36616a.b bVar) {
        h hVar = (h) bVar;
        v vVar = (v) hVar.getService();
        k kVar = new k(this);
        Parcel parcelE4 = vVar.e4();
        zbc.zbd(parcelE4, kVar);
        zbc.zbc(parcelE4, hVar.f348787I);
        vVar.f4(parcelE4, 102);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.r createFailedResult(Status status) {
        return status;
    }
}
