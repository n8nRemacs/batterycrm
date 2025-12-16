package io.ktor.client.plugins.logging;

import kotlin.Metadata;

/* compiled from: LoggerJvm.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/logging/g;", "Lio/ktor/client/plugins/logging/f;", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final org.slf4j.a f399523b = org.slf4j.b.d(io.ktor.client.a.class);

    @Override // io.ktor.client.plugins.logging.f
    public final void log(@Y61.k String str) {
        this.f399523b.info(str);
    }
}
