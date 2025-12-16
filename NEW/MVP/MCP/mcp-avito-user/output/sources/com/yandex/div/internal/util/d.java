package com.yandex.div.internal.util;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: CompletedFuture.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/util/d;", "T", "Ljava/util/concurrent/Future;", "utils_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d<T> implements Future<T> {
    public d() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j12, @Y61.k TimeUnit timeUnit) {
        throw null;
    }
}
