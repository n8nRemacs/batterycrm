package ru.avito.websocket;

import io.reactivex.rxjava3.core.K;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.websocket.u;

/* compiled from: LegacyRxWebSocketImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f431897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K<G0> f431898c;

    public i(e eVar, K<G0> k12) {
        this.f431897b = eVar;
        this.f431898c = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f431897b.f431885h.onNext(new u.c(0, th2.getMessage(), th2, 1, null));
        K<G0> k12 = this.f431898c;
        if (k12.i()) {
            return;
        }
        k12.onError(th2);
    }
}
