package io.ktor.http;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Headers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/V;", "Lio/ktor/http/T;", "Lio/ktor/util/D0;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class V extends io.ktor.util.D0 implements T {
    public V() {
        this(null, 1, null);
    }

    @Override // io.ktor.util.D0
    @Y61.k
    public final String toString() {
        return "Headers " + b();
    }

    public V(Map map, int i12, C42822w c42822w) {
        super(true, (i12 & 1) != 0 ? kotlin.collections.P0.c() : map);
    }
}
