package com.avito.android.push.impl_module.token.sending.sender;

import Y61.k;
import com.avito.android.analytics.statsd.y;
import kotlin.Metadata;

/* compiled from: PushTokenSenderImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f246038b;

    public d(a aVar) {
        this.f246038b = aVar;
    }

    @Override // l41.g
    public final void accept(@k T t12) {
        this.f246038b.f246034d.c(new y.a("calls.api.notificationToken.ok", 0L, 2, null));
    }
}
