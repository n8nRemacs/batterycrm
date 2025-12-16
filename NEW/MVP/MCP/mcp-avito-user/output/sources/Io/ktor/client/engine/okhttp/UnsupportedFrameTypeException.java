package io.ktor.client.engine.okhttp;

import io.ktor.websocket.AbstractC41723i;
import kotlin.Metadata;
import kotlinx.coroutines.J;

/* compiled from: OkHttpWebsocketSession.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "Lkotlinx/coroutines/J;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnsupportedFrameTypeException extends IllegalArgumentException implements J<UnsupportedFrameTypeException> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC41723i f398910b;

    public UnsupportedFrameTypeException(@Y61.k AbstractC41723i abstractC41723i) {
        super("Unsupported frame type: " + abstractC41723i);
        this.f398910b = abstractC41723i;
    }

    @Override // kotlinx.coroutines.J
    public final Throwable a() {
        UnsupportedFrameTypeException unsupportedFrameTypeException = new UnsupportedFrameTypeException(this.f398910b);
        unsupportedFrameTypeException.initCause(this);
        return unsupportedFrameTypeException;
    }
}
