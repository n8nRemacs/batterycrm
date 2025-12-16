package io.ktor.client.plugins.cache;

import io.ktor.http.T;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: HttpCache.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class l extends H implements Y41.l<String, List<? extends String>> {
    @Override // Y41.l
    public final List<? extends String> invoke(String str) {
        return ((T) this.receiver).a(str);
    }
}
