package io.ktor.websocket;

import kotlin.Metadata;

/* compiled from: FrameTooBigException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/websocket/FrameTooBigException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlinx/coroutines/J;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FrameTooBigException extends Exception implements kotlinx.coroutines.J<FrameTooBigException> {

    /* renamed from: b, reason: collision with root package name */
    public final long f401415b;

    public FrameTooBigException(long j12) {
        this.f401415b = j12;
    }

    @Override // kotlinx.coroutines.J
    public final Throwable a() {
        FrameTooBigException frameTooBigException = new FrameTooBigException(this.f401415b);
        frameTooBigException.initCause(this);
        return frameTooBigException;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getMessage() {
        return "Frame is too big: " + this.f401415b;
    }
}
