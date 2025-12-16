package ru.avito.messenger.internal.entity.jsonrpc;

import Y61.k;
import kotlin.Metadata;

/* compiled from: MessengerSocketResponseTimeoutException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/entity/jsonrpc/MessengerSocketResponseTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessengerSocketResponseTimeoutException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Throwable f431690b;

    public MessengerSocketResponseTimeoutException(@k Throwable th2) {
        this.f431690b = th2;
    }

    @Override // java.lang.Throwable
    @k
    public final Throwable getCause() {
        return this.f431690b;
    }
}
