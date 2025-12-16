package com.avito.android.push.impl_module.token.sending.sender;

import com.avito.android.analytics.statsd.y;
import kotlin.Metadata;

/* compiled from: PushTokenSenderImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f246037b;

    public c(a aVar) {
        this.f246037b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f246037b.f246034d.c(new y.a("calls.api.notificationToken.error", 0L, 2, null));
    }
}
