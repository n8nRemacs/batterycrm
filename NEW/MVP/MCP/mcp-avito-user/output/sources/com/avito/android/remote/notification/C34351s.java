package com.avito.android.remote.notification;

import com.avito.android.remote.notification.analytics.NotificationImageLoadEvent;
import kotlin.Metadata;

/* compiled from: NotificationInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.remote.notification.s, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
final class C34351s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f254097b;

    public C34351s(r rVar) {
        this.f254097b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f254097b.f254082n.c(NotificationImageLoadEvent.f254022c);
    }
}
