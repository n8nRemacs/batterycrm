package com.avito.android.calltracking.deeplink;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import l41.g;

/* compiled from: MessengerPhoneCallLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f113641b;

    public b(c cVar) {
        this.f113641b = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        c cVar = this.f113641b;
        a.i.C4057a.e(cVar.f113643g, "", new f.c((Throwable) obj), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        cVar.j(MessengerReallContactMethodLink.c.f.f113773b);
    }
}
