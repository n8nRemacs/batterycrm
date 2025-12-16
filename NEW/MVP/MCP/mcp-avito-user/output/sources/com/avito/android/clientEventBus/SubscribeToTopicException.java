package com.avito.android.clientEventBus;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubscribeToTopicException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/clientEventBus/SubscribeToTopicException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SubscribeToTopicException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Throwable f118532b;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribeToTopicException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @Y61.l
    public final Throwable getCause() {
        return this.f118532b;
    }

    public SubscribeToTopicException(@Y61.l Throwable th2) {
        this.f118532b = th2;
    }

    public /* synthetic */ SubscribeToTopicException(Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : th2);
    }
}
