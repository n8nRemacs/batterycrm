package ru.avito.messenger.internal;

import kotlin.Metadata;

/* compiled from: MessengerClientImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/internal/MessengerInconsistentUserInRequestAndSocket;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessengerInconsistentUserInRequestAndSocket extends Exception {
    public MessengerInconsistentUserInRequestAndSocket() {
        super("UserId used in request is different from the one used by socket");
    }
}
