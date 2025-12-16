package ru.avito.messenger.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessengerWebsocketMessageParser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/MessengerResponseBodyConverterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessengerResponseBodyConverterException extends Exception {
    public MessengerResponseBodyConverterException() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessengerResponseBodyConverterException(String str, Throwable th2, int i12, C42822w c42822w) {
        String message = null;
        str = (i12 & 1) != 0 ? null : str;
        th2 = (i12 & 2) != 0 ? null : th2;
        if (str != null) {
            message = str;
        } else if (th2 != null) {
            message = th2.getMessage();
        }
        super(message, th2);
    }
}
