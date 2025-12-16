package io.ktor.client.plugins.cache;

import io.ktor.http.T0;
import kotlin.Metadata;

/* compiled from: HttpCache.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/plugins/cache/InvalidCacheStateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InvalidCacheStateException extends IllegalStateException {
    public InvalidCacheStateException(@Y61.k T0 t02) {
        super("The entry for url: " + t02 + " was removed from cache");
    }
}
