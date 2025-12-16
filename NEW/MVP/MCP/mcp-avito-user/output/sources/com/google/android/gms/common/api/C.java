package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.r;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class C<R extends r> extends BasePendingResult<R> {

    /* renamed from: p, reason: collision with root package name */
    public final Status f348895p;

    public C(Status status) {
        super(null);
        this.f348895p = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.f348895p;
    }
}
