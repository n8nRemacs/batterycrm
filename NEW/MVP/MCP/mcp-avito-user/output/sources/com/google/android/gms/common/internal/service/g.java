package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
abstract class g extends h {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ r createFailedResult(Status status) {
        return status;
    }
}
