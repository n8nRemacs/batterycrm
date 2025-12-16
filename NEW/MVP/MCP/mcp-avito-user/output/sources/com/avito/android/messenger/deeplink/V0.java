package com.avito.android.messenger.deeplink;

import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.UnpinChannelLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.Metadata;

/* compiled from: UnpinChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class V0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W0 f195436b;

    public V0(W0 w02) {
        this.f195436b = w02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        W0 w02 = this.f195436b;
        a.i.C4057a.d(w02.f195440i, InterfaceC35741a1.a.a(w02.f195439h, com.avito.android.messenger.util.q.a(th2), null, null, 6), null, null, new f.c(th2), 0, null, null, null, 2030);
        w02.j(UnpinChannelLink.b.a.f133769b);
    }
}
