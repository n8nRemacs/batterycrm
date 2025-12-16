package com.avito.android.verification.links.download;

import Ju.AbstractC14250d;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;

/* compiled from: VerificationDownloadLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f324188b;

    public b(c cVar) {
        this.f324188b = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        c cVar = this.f324188b;
        a.i iVar = cVar.f324191h;
        String strC = cVar.f324195l.c((Throwable) obj);
        f.c.f125255c.getClass();
        a.i.C4057a.e(iVar, strC, f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        cVar.j(AbstractC14250d.b.f9170c);
    }
}
