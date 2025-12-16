package io.ktor.client.engine.okhttp;

import androidx.compose.foundation.H;
import io.ktor.client.plugins.websocket.WebSocketException;
import io.ktor.websocket.AbstractC41723i;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.InterfaceC41715a;
import io.ktor.websocket.L;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlinx.coroutines.B;
import kotlinx.coroutines.InterfaceC43314z;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.C43086b;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.C44805o;

/* compiled from: OkHttpWebsocketSession.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/engine/okhttp/s;", "Lio/ktor/websocket/a;", "Lokhttp3/WebSocketListener;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class s extends WebSocketListener implements InterfaceC41715a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final OkHttpClient f398976d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f398977e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43314z<s> f398978f = B.a();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43314z<Response> f398979g = B.a();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C43108m f398980h = A.a(0, null, null, 7);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43314z<CloseReason> f398981i = B.a();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final M0<AbstractC41723i> f398982j;

    public s(@Y61.k OkHttpClient okHttpClient, @Y61.k Request request, @Y61.k CoroutineContext coroutineContext) {
        this.f398976d = okHttpClient;
        this.f398977e = coroutineContext;
        this.f398982j = C43086b.a(this, new r(this, request, null));
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object B(@Y61.k AbstractC41723i.b bVar, @Y61.k Continuation continuation) {
        Object objSend = j().send(bVar, continuation);
        if (objSend != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objSend = G0.f406611a;
        }
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final K0<AbstractC41723i> D() {
        return this.f398980h;
    }

    @Override // io.ktor.websocket.Z
    @Y61.l
    public final Object G(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    @Override // io.ktor.websocket.InterfaceC41715a
    public final void P(@Y61.k List<? extends L<?>> list) {
        if (!list.isEmpty()) {
            throw new IllegalArgumentException("Extensions are not supported.");
        }
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF399611e() {
        return this.f398977e;
    }

    @Override // io.ktor.websocket.Z
    @Y61.k
    public final M0<AbstractC41723i> j() {
        return this.f398982j;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(@Y61.k WebSocket webSocket, int i12, @Y61.k String str) {
        Object objValueOf;
        super.onClosed(webSocket, i12, str);
        short s5 = (short) i12;
        this.f398981i.n(new CloseReason(str, s5));
        this.f398980h.h(null);
        M0<AbstractC41723i> m02 = this.f398982j;
        StringBuilder sb2 = new StringBuilder("WebSocket session closed with code ");
        CloseReason.Codes.f401390c.getClass();
        CloseReason.Codes codes = (CloseReason.Codes) CloseReason.Codes.f401391d.get(Short.valueOf(s5));
        if (codes == null || (objValueOf = codes.toString()) == null) {
            objValueOf = Integer.valueOf(i12);
        }
        m02.h(new CancellationException(H.n(sb2, objValueOf, '.')));
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosing(@Y61.k WebSocket webSocket, int i12, @Y61.k String str) {
        super.onClosing(webSocket, i12, str);
        short s5 = (short) i12;
        this.f398981i.n(new CloseReason(str, s5));
        try {
            D.c(this.f398982j, new AbstractC41723i.b(new CloseReason(str, s5)));
        } catch (Throwable unused) {
        }
        this.f398980h.h(null);
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(@Y61.k WebSocket webSocket, @Y61.k Throwable th2, @Y61.l Response response) {
        super.onFailure(webSocket, th2, response);
        this.f398981i.b(th2);
        this.f398979g.b(th2);
        this.f398980h.h(th2);
        this.f398982j.h(th2);
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(@Y61.k WebSocket webSocket, @Y61.k C44805o c44805o) {
        super.onMessage(webSocket, c44805o);
        D.c(this.f398980h, new AbstractC41723i.a(true, c44805o.s(), false, false, false));
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(@Y61.k WebSocket webSocket, @Y61.k Response response) {
        super.onOpen(webSocket, response);
        this.f398979g.n(response);
    }

    @Override // io.ktor.websocket.Z
    public final long p() {
        return Long.MAX_VALUE;
    }

    @Override // io.ktor.websocket.Z
    public final void y(long j12) {
        throw new WebSocketException("Max frame size switch is not supported in OkHttp engine.", null);
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(@Y61.k WebSocket webSocket, @Y61.k String str) {
        super.onMessage(webSocket, str);
        D.c(this.f398980h, new AbstractC41723i.f(true, str.getBytes(C43047d.f410589b), false, false, false));
    }
}
