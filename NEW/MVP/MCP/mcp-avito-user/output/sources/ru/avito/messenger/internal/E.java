package ru.avito.messenger.internal;

import com.adjust.sdk.Constants;
import com.avito.android.remote.analytics.messenger.MessengerErrorType;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcParsingException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcSerializationException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerNoNetworkException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerSocketCallAwaitingConnectionTimeoutException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerSocketResponseTimeoutException;

/* compiled from: MessengerErrorResolver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/internal/E;", "Lcom/avito/android/remote/analytics/messenger/b;", "<init>", "()V", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class E implements com.avito.android.remote.analytics.messenger.b {

    /* compiled from: MessengerErrorResolver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/avito/messenger/internal/E$a;", "", "<init>", "()V", "", "NO_SOCKET_CONNECTION_PREFIX", "Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public static String b(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th2.getClass().getSimpleName());
        sb2.append(": ");
        String message = th2.getMessage();
        if (message == null) {
            message = "<none>";
        }
        sb2.append(message);
        return sb2.toString();
    }

    public static String c(MessengerJsonRpcCallException messengerJsonRpcCallException) {
        switch (messengerJsonRpcCallException.f174716b) {
            case -32700:
                return "parsing failure";
            case -32603:
                return "internal";
            case -32602:
                return "invalid parameters";
            case -32601:
                return "method not found";
            case -32600:
                return "invalid request";
            case -32300:
                return AdvertStatus.CLOSED;
            case -32249:
                return "request limit exceeded";
            case -32077:
                return "invalid hash id";
            case -32060:
                return "need phone verification";
            case -32054:
            case 504:
                return "request timeout";
            case -32050:
            case 500:
                return "server";
            case -32046:
            case 406:
                return "not acceptable";
            case -32044:
            case 404:
                return "not found";
            case -32043:
            case 403:
            case 3403:
                return "forbidden";
            case -32041:
            case 401:
            case 3401:
                return "unauthorized";
            case -32040:
            case Constants.MINIMAL_ERROR_STATUS_CODE /* 400 */:
                return "badRequest";
            case -1:
                return PaymentStateKt.PAYMENT_STATE_FAILED;
            case 1000:
                return "closed by user";
            case 3410:
                return "state gone";
            default:
                StringBuilder sb2 = new StringBuilder("error ");
                sb2.append(messengerJsonRpcCallException.f174716b);
                sb2.append(' ');
                Throwable cause = messengerJsonRpcCallException.getCause();
                sb2.append(cause != null ? cause.getClass().getSimpleName() : "");
                return sb2.toString();
        }
    }

    @Override // com.avito.android.remote.analytics.messenger.b
    @Y61.k
    public final com.avito.android.remote.analytics.messenger.a a(@Y61.k Throwable th2) {
        if (th2 instanceof MessengerJsonRpcCallException) {
            return new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253194c, c((MessengerJsonRpcCallException) th2), b(th2));
        }
        if (th2 instanceof MessengerJsonRpcParsingException) {
            return new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253195d, "deserialization error", b(th2));
        }
        if (th2 instanceof MessengerJsonRpcSerializationException) {
            return new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253195d, "serialization error", b(th2));
        }
        if (th2 instanceof MessengerSocketResponseTimeoutException) {
            return new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253196e, "response timeout", b(th2));
        }
        if (!(th2 instanceof MessengerSocketCallAwaitingConnectionTimeoutException)) {
            return th2 instanceof MessengerNoNetworkException ? new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253196e, "no network", b(th2)) : th2 instanceof MessengerInconsistentUserInRequestAndSocket ? new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253195d, "inconsistent user in request and socket", b(th2)) : new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253197f, th2.getClass().getSimpleName(), b(th2));
        }
        Throwable th3 = ((MessengerSocketCallAwaitingConnectionTimeoutException) th2).f431689b;
        if (!(th3 instanceof MessengerJsonRpcCallException)) {
            return new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253196e, "no socket connection ".concat(th3.getClass().getSimpleName()), b(th3));
        }
        return new com.avito.android.remote.analytics.messenger.a(MessengerErrorType.f253196e, "no socket connection " + c((MessengerJsonRpcCallException) th3), b(th3));
    }
}
