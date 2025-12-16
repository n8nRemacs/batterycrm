package ru.avito.websocket;

import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;
import okhttp3.WebSocketListener;

/* compiled from: WebSocketFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/websocket/z;", "", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface z {

    /* compiled from: WebSocketFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    O a(@Y61.k WebSocketListener webSocketListener, @Y61.l String str);
}
