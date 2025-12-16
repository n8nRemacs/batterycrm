package com.avito.android.gsm_s2b_call_action.impl_module.link;

import Y61.k;
import android.os.Bundle;
import cI.InterfaceC27039a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gsm_s2b_call_action.impl_module.link.GsmS2BCallActionLink;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.C43259k;

/* compiled from: GsmS2BCallActionLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gsm_s2b_call_action/impl_module/link/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/gsm_s2b_call_action/impl_module/link/GsmS2BCallActionLink;", "_avito_gsm-s2b-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<GsmS2BCallActionLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC27039a f161294g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final R0 f161295h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC35741a1 f161296i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f161297j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.i f161298k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.g f161299l;

    @Inject
    public b(@k InterfaceC27039a interfaceC27039a, @k R0 r02, @k InterfaceC35741a1 interfaceC35741a1, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.i iVar, @k a.g gVar) {
        super(r02);
        this.f161294g = interfaceC27039a;
        this.f161295h = r02;
        this.f161296i = interfaceC35741a1;
        this.f161297j = aVar;
        this.f161298k = iVar;
        this.f161299l = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(b bVar, Throwable th2) {
        bVar.getClass();
        V2.f318762a.c("GsmS2BCallActionLinkHandler", "onError: " + th2, null);
        GsmS2BCallActionLink gsmS2BCallActionLink = (GsmS2BCallActionLink) bVar.c();
        DeepLink deepLink = gsmS2BCallActionLink != null ? gsmS2BCallActionLink.f161284e : null;
        bVar.f161299l.g(null, false);
        com.avito.android.deeplink_handler.handler.composite.a aVar = bVar.f161297j;
        if (deepLink != null) {
            bVar.i(GsmS2BCallActionLink.b.C4720b.f161286b, aVar, deepLink);
        } else {
            a.i.C4057a.d(bVar.f161298k, InterfaceC35741a1.a.a(bVar.f161296i, th2, null, null, 6), null, null, new f.c(th2), 0, null, null, null, 2030);
            bVar.i(GsmS2BCallActionLink.b.C4720b.f161286b, aVar, new DeepLink[0]);
        }
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        GsmS2BCallActionLink gsmS2BCallActionLink = (GsmS2BCallActionLink) deepLink;
        V2.f318762a.c("GsmS2BCallActionLinkHandler", "doHandle: " + gsmS2BCallActionLink, null);
        this.f161299l.g(null, true);
        Object objG = C43259k.g(this.f161295h.a(), new a(this, gsmS2BCallActionLink, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
