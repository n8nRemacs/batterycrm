package ru.avito.websocket;

import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.Q;
import okhttp3.Request;

/* compiled from: RequestProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/websocket/l;", "", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface l {

    /* compiled from: RequestProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    I<Q<Request, String>> a(@Y61.l String str);
}
