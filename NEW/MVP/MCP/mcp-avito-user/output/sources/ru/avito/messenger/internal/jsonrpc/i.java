package ru.avito.messenger.internal.jsonrpc;

import kotlin.Metadata;
import l41.r;

/* compiled from: WebSocketJsonRpcClient.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lj91/c;", "response", "", "test", "(Lj91/c;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class i<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j91.b f431749b;

    public i(j91.b bVar) {
        this.f431749b = bVar;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return ((j91.c) obj).b().longValue() == this.f431749b.getId();
    }
}
