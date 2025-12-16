package io.ktor.websocket;

import io.ktor.websocket.AbstractC41723i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;

/* compiled from: WebSocketSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/Z;", "Lkotlinx/coroutines/T;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Z extends kotlinx.coroutines.T {

    /* compiled from: WebSocketSession.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    Object B(@Y61.k AbstractC41723i.b bVar, @Y61.k Continuation continuation);

    @Y61.k
    K0<AbstractC41723i> D();

    @Y61.l
    Object G(@Y61.k Continuation<? super G0> continuation);

    @Y61.k
    M0<AbstractC41723i> j();

    long p();

    void y(long j12);
}
