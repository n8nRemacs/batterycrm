package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.r;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36667s<A extends com.google.android.gms.common.api.r, B extends com.google.android.gms.common.api.r> extends com.google.android.gms.common.api.m<B> {
    @Override // com.google.android.gms.common.api.m
    public final void addStatusListener(@j.N m.a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.m
    @j.N
    public final B await() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.m
    public final void cancel() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.m
    public final boolean isCanceled() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.m
    public final void setResultCallback(@j.N com.google.android.gms.common.api.s<? super B> sVar) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.m
    @ResultIgnorabilityUnspecified
    @j.N
    public final <S extends com.google.android.gms.common.api.r> com.google.android.gms.common.api.v<S> then(@j.N com.google.android.gms.common.api.u<? super B, ? extends S> uVar) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.m
    @j.N
    public final B await(long j12, @j.N TimeUnit timeUnit) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.m
    public final void setResultCallback(@j.N com.google.android.gms.common.api.s<? super B> sVar, long j12, @j.N TimeUnit timeUnit) {
        throw null;
    }
}
