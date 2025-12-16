package com.avito.android.push.impl_module.token.sending.sender;

import com.avito.android.analytics.statsd.y;
import kotlin.Metadata;

/* compiled from: PushTokenSenderImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f246036b;

    public b(a aVar) {
        this.f246036b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f246036b.f246034d.c(new y.a("calls.api.notificationToken.called", 0L, 2, null));
    }
}
