package ru.avito.websocket;

import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.WebSocketListener;

/* compiled from: OkHttpWebSocketFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/websocket/k;", "Lru/avito/websocket/z;", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<OkHttpClient> f431901a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f431902b;

    public k(@Y61.k h31.e<OkHttpClient> eVar, @Y61.k l lVar) {
        this.f431901a = eVar;
        this.f431902b = lVar;
    }

    @Override // ru.avito.websocket.z
    @Y61.k
    public final O a(@Y61.k WebSocketListener webSocketListener, @Y61.l String str) {
        return this.f431902b.a(str).r(new j(this, webSocketListener));
    }
}
