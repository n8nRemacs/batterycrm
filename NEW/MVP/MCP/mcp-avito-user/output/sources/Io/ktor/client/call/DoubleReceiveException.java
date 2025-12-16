package io.ktor.client.call;

import Y61.k;
import kotlin.Metadata;

/* compiled from: HttpClientCall.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/call/DoubleReceiveException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DoubleReceiveException extends IllegalStateException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f398800b;

    public DoubleReceiveException(@k b bVar) {
        this.f398800b = "Response already received: " + bVar;
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f398800b;
    }
}
