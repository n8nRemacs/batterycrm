package io.ktor.websocket;

import kotlin.Metadata;

/* compiled from: ProtocolViolationException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/websocket/ProtocolViolationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlinx/coroutines/J;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProtocolViolationException extends Exception implements kotlinx.coroutines.J<ProtocolViolationException> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f401438b;

    public ProtocolViolationException(@Y61.k String str) {
        this.f401438b = str;
    }

    @Override // kotlinx.coroutines.J
    public final Throwable a() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException(this.f401438b);
        protocolViolationException.initCause(this);
        return protocolViolationException;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getMessage() {
        return "Received illegal frame: " + this.f401438b;
    }
}
