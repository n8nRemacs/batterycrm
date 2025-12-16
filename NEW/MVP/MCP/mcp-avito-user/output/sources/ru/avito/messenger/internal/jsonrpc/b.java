package ru.avito.messenger.internal.jsonrpc;

import J81.o;
import J81.u;
import Y61.k;
import android.annotation.SuppressLint;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: HttpApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JI\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJI\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/avito/messenger/internal/jsonrpc/b;", "", "", "origin", "session", "", "queryParameters", "Lj91/b;", "request", "Lio/reactivex/rxjava3/core/I;", "Lj91/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lj91/b;)Lio/reactivex/rxjava3/core/I;", "b", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface b {
    @o("fallback")
    @k
    I<j91.c> a(@J81.i("Origin") @k String origin, @J81.i("X-Session") @k String session, @u @k Map<String, String> queryParameters, @J81.a @k j91.b request);

    @o("fallback")
    @k
    @SuppressLint({"ApiWithoutContracts"})
    I<j91.c> b(@J81.i("Origin") @k String origin, @J81.i("Cookie") @k String session, @u @k Map<String, String> queryParameters, @J81.a @k j91.b request);
}
