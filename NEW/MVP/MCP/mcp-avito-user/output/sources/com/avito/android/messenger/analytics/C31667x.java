package com.avito.android.messenger.analytics;

import Oq.InterfaceC14725a;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.app.task.MessageSendingFatalException;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.MessengerConversionAfterParsingException;
import com.avito.android.messenger.conversation.mvi.data.MessengerDbException;
import java.util.Map;
import kotlin.Metadata;
import ru.avito.messenger.internal.connection.MessengerSocketTerminationException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcParsingException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerSocketCallAwaitingConnectionTimeoutException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerSocketResponseTimeoutException;

/* compiled from: MessengerErrorTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/x;", "LOq/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.analytics.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31667x implements InterfaceC14725a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f186323a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f186324b;

    public C31667x(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C30277e1 c30277e1) {
        this.f186323a = interfaceC28373a;
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[30];
        this.f186324b = ((Boolean) c30277e1.f144953D.a().invoke()).booleanValue();
    }

    @Override // Oq.InterfaceC14725a
    public final void a(@Y61.k Throwable th2, @Y61.l String str, @Y61.k Map<String, ? extends Object> map) {
        String str2;
        boolean z12 = th2 instanceof MessengerSocketResponseTimeoutException;
        boolean z13 = z12 || (th2 instanceof MessengerSocketTerminationException.NetworkError) || (th2 instanceof MessengerSocketCallAwaitingConnectionTimeoutException);
        boolean z14 = this.f186324b;
        InterfaceC28373a interfaceC28373a = this.f186323a;
        if (z14 && z13) {
            interfaceC28373a.c(new cc.g(th2, str));
        } else {
            if (str == null) {
                str = "";
            }
            interfaceC28373a.c(new NonFatalErrorEvent(str, th2, map, NonFatalErrorEvent.a.C4323a.f147930a));
        }
        if (th2 instanceof MessengerSocketTerminationException) {
            str2 = "socket_connection";
        } else if (z12) {
            str2 = "socket_response_timeout";
        } else if (th2 instanceof MessengerJsonRpcCallException) {
            str2 = "api";
        } else if (th2 instanceof MessengerJsonRpcParsingException) {
            str2 = "response_parsing";
        } else if (th2 instanceof MessengerDbException) {
            str2 = "storage";
        } else if (th2 instanceof MessageSendingFatalException) {
            str2 = "message_sending";
        } else if (!(th2 instanceof MessengerConversionAfterParsingException)) {
            return;
        } else {
            str2 = "conversion_after_parsing";
        }
        interfaceC28373a.c(new y.a("messenger.client_error.".concat(str2), 0L, 2, null));
        if ((th2 instanceof MessengerDbException) && ((MessengerDbException) th2).f190424b) {
            interfaceC28373a.c(new y.a("messenger.client_error.storage_reset", 0L, 2, null));
        }
    }
}
