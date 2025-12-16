package com.avito.android.remote.notification;

import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: NotificationBitmapInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.remote.notification.g, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
final class C34340g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34343j f254050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c<P2<NotificationImages>> f254051c;

    public C34340g(C34343j c34343j, com.jakewharton.rxrelay3.c<P2<NotificationImages>> cVar) {
        this.f254050b = c34343j;
        this.f254051c = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C34343j.c(this.f254050b, this.f254051c);
    }
}
