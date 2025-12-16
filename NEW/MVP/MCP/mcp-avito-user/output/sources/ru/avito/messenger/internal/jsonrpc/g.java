package ru.avito.messenger.internal.jsonrpc;

import kotlin.Metadata;

/* compiled from: WebSocketJsonRpcClient.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lj91/c;", "response", "Lkotlin/G0;", "accept", "(Lj91/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f431747b;

    public g(f fVar) {
        this.f431747b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f431747b.f431733e.a("Messenger", "JsonRpc response = " + ((j91.c) obj), null);
    }
}
