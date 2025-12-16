package com.avito.android.remote.notification;

import com.avito.android.analytics.event.C28449x0;
import com.avito.android.saved_searches.model.SubscriptionUnreadCount;
import kotlin.Metadata;

/* compiled from: UnreadNotificationsInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/saved_searches/model/SubscriptionUnreadCount;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/saved_searches/model/SubscriptionUnreadCount;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes17.dex */
final class T<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f253992b;

    public T(S s5) {
        this.f253992b = s5;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f253992b.f253985g.onNext(new C28449x0(((SubscriptionUnreadCount) obj).getCount()));
    }
}
