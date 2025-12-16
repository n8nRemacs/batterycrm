package com.avito.android.remote.notification;

import com.avito.android.remote.notification.analytics.NotificationImageLoadEvent;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.remote.notification.t, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
final class C34352t extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f254098l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34352t(r rVar) {
        super(1);
        this.f254098l = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f254098l.f254082n.c(NotificationImageLoadEvent.f254023d);
        return G0.f406611a;
    }
}
