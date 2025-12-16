package io.ktor.client.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HttpClientEngineBase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/engine/ClientEngineClosedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClientEngineClosedException extends IllegalStateException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Throwable f398854b;

    public ClientEngineClosedException() {
        this(null, 1, null);
    }

    @Override // java.lang.Throwable
    @Y61.l
    public final Throwable getCause() {
        return this.f398854b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientEngineClosedException(Throwable th2, int i12, C42822w c42822w) {
        super("Client already closed");
        th2 = (i12 & 1) != 0 ? null : th2;
        this.f398854b = th2;
    }
}
