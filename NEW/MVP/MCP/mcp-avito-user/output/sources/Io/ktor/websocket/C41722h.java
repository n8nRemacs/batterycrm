package io.ktor.websocket;

import io.ktor.websocket.CloseReason;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultWebSocketSession.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-websockets"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41722h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final org.slf4j.a f401551a = org.slf4j.b.e("io.ktor.websocket.WebSocket");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.S f401552b = new kotlinx.coroutines.S("ws-incoming-processor");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.S f401553c = new kotlinx.coroutines.S("ws-outgoing-processor");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final CloseReason f401554d = new CloseReason(CloseReason.Codes.NORMAL, "OK");
}
