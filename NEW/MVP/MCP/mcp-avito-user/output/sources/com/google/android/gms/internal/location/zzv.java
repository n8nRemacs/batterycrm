package com.google.android.gms.internal.location;

import RX0.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.api.r;
import com.google.android.gms.location.ActivityRecognition;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
abstract class zzv extends C36634e.a {
    public zzv(i iVar) {
        super(ActivityRecognition.API, iVar);
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a, com.google.android.gms.common.api.internal.C36634e.b
    @a
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzv) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ r createFailedResult(Status status) {
        return status;
    }
}
