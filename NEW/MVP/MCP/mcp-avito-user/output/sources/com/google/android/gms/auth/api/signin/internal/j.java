package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbc;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
final class j extends o {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final void c(C36616a.b bVar) {
        v vVar = (v) ((h) bVar).getService();
        i iVar = new i(this);
        Parcel parcelE4 = vVar.e4();
        zbc.zbd(parcelE4, iVar);
        zbc.zbc(parcelE4, null);
        vVar.f4(parcelE4, UpdateStatusCode.DialogButton.CONFIRM);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.r createFailedResult(Status status) {
        return new com.google.android.gms.auth.api.signin.e(null, status);
    }
}
