package io.ktor.http;

import com.adjust.sdk.Constants;
import kotlin.Metadata;

/* compiled from: URLProtocol.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class P0 {
    public static final boolean a(@Y61.k O0 o02) {
        String str = o02.f399889a;
        return kotlin.jvm.internal.L.f(str, Constants.SCHEME) || kotlin.jvm.internal.L.f(str, "wss");
    }
}
