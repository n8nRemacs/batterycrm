package com.avito.android.messenger.conversation.mvi.deeplinks.delete_channel;

import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeleteChannelLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.util.q;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.Metadata;
import l41.g;

/* compiled from: DeleteChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f190521b;

    public c(d dVar) {
        this.f190521b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        d dVar = this.f190521b;
        a.i.C4057a.d(dVar.f190526j, InterfaceC35741a1.a.a(dVar.f190525i, q.a(th2), null, null, 6), null, null, new f.c(th2), 0, null, null, null, 2030);
        dVar.j(DeleteChannelLink.b.a.f133177b);
    }
}
