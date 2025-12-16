package com.avito.android.messenger.deeplink;

import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.PinChannelLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.PinUnpinChannelResponse;

/* compiled from: PinChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/PinUnpinChannelResponse;", "result", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/api/entity/PinUnpinChannelResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f195323b;

    public E0(G0 g02) {
        this.f195323b = g02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PinUnpinChannelResponse pinUnpinChannelResponse = (PinUnpinChannelResponse) obj;
        boolean isSuccess = pinUnpinChannelResponse.getIsSuccess();
        G0 g02 = this.f195323b;
        if (isSuccess) {
            g02.j(PinChannelLink.b.c.f133580b);
            return;
        }
        if (pinUnpinChannelResponse.getError() != null) {
            g02.f195336j.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new D0(pinUnpinChannelResponse));
            g02.j(PinChannelLink.b.C4014b.f133579b);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException();
            a.i.C4057a.d(g02.f195335i, InterfaceC35741a1.a.a(g02.f195334h, illegalStateException, null, null, 6), null, null, new f.c(illegalStateException), 0, null, null, null, 2030);
            g02.j(PinChannelLink.b.a.f133578b);
        }
    }
}
