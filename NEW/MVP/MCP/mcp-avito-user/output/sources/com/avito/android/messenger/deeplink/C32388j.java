package com.avito.android.messenger.deeplink;

import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.ChannelCallLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.jsonrpc.client.JsonRpcCallException;
import com.avito.android.util.InterfaceC35741a1;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;

/* compiled from: ChannelCallDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.deeplink.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32388j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32402q f195517b;

    public C32388j(C32402q c32402q) {
        this.f195517b = c32402q;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        C32402q c32402q = this.f195517b;
        C30277e1 c30277e1 = c32402q.f195549m;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[63];
        if (((Boolean) c30277e1.f145022k0.a().invoke()).booleanValue()) {
            a.i.C4057a.d(c32402q.f195543g, com.avito.android.printable_text.b.c(R.string.messenger_phone_number_request_is_forbidden, new Serializable[0]), null, null, f.a.f125253a, 0, null, null, null, 2030);
        } else {
            a.i.C4057a.d(c32402q.f195543g, th2 instanceof JsonRpcCallException ? ((JsonRpcCallException) th2).f174716b == -32043 ? com.avito.android.printable_text.b.c(R.string.messenger_phone_number_request_is_forbidden, new Serializable[0]) : com.avito.android.printable_text.b.c(R.string.unknown_server_error, new Serializable[0]) : th2 instanceof TimeoutException ? com.avito.android.printable_text.b.c(R.string.error_timeout, new Serializable[0]) : InterfaceC35741a1.a.a(c32402q.f195548l, th2, null, null, 6), null, null, new f.c(th2), 0, null, null, null, 2030);
        }
        c32402q.j(new ChannelCallLink.b.C3990b(th2));
    }
}
