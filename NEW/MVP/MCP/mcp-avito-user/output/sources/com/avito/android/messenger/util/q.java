package com.avito.android.messenger.util;

import com.avito.android.jsonrpc.client.JsonRpcCallException;
import com.avito.android.util.K5;
import com.avito.android.util.NetworkException;
import com.avito.android.util.UnauthorizedException;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;

/* compiled from: Throwables.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q {
    @Y61.k
    public static final Throwable a(@Y61.k Throwable th2) {
        Throwable unauthorizedException;
        if (K5.e(th2)) {
            return th2;
        }
        if (th2 instanceof TimeoutException) {
            unauthorizedException = new NetworkException(null, th2);
        } else {
            if (!(th2 instanceof JsonRpcCallException)) {
                return th2;
            }
            if (((JsonRpcCallException) th2).f174716b != 3401) {
                Throwable cause = th2.getCause();
                return (cause == null || cause.equals(th2)) ? th2 : a(cause);
            }
            unauthorizedException = new UnauthorizedException(null, th2);
        }
        return unauthorizedException;
    }
}
