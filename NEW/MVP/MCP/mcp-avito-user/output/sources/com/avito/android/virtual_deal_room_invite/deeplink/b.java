package com.avito.android.virtual_deal_room_invite.deeplink;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kO0.InterfaceC42610a;
import kotlin.Metadata;

/* compiled from: InviteDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/deeplink/b;", "Lev/a;", "Lcom/avito/android/virtual_deal_room_invite/deeplink/InviteDeeplink;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<InviteDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f326916f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42610a f326917g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f326918h;

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC42610a interfaceC42610a, @k C25719a c25719a) {
        this.f326916f = interfaceC4053a;
        this.f326917g = interfaceC42610a;
        this.f326918h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        InviteDeeplink inviteDeeplink = (InviteDeeplink) deepLink;
        this.f326918h.b(inviteDeeplink, this, null, new a(this, inviteDeeplink));
        j(AbstractC14250d.c.f9171c);
    }
}
