package io.ktor.network.sockets;

import io.ktor.utils.io.core.C41641n;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Datagram.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/sockets/w;", "", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: io.ktor.network.sockets.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41580w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C41641n f400273a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U f400274b;

    public C41580w(@Y61.k C41641n c41641n, @Y61.k U u12) {
        this.f400273a = c41641n;
        this.f400274b = u12;
        if (c41641n.o() <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return;
        }
        throw new IllegalArgumentException(("Datagram size limit exceeded: " + c41641n.o() + " of possible 65535").toString());
    }
}
