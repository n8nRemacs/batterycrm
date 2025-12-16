package io.ktor.client.plugins.cache;

import io.ktor.http.T;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: HttpCacheLegacy.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class w extends H implements Y41.l<String, String> {
    @Override // Y41.l
    public final String invoke(String str) {
        return ((T) this.receiver).get(str);
    }
}
