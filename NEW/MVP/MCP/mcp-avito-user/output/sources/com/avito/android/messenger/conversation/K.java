package com.avito.android.messenger.conversation;

import MY.k;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.lib.design.modal.a;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class K extends kotlin.jvm.internal.H implements Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, kotlin.G0> {
    public final void f(@Y61.k com.avito.android.messenger.conversation.mvi.messages.h0 h0Var) {
        ChannelFragment channelFragment = (ChannelFragment) this.receiver;
        ChannelFragment.a aVar = ChannelFragment.f188932o3;
        channelFragment.getClass();
        if (h0Var instanceof h0.i) {
            h0.i iVar = (h0.i) h0Var;
            channelFragment.D5().accept(new k.a.g(iVar.f192985a, iVar.f192986b, iVar.f192987c, iVar.f192988d));
            return;
        }
        if (h0Var instanceof h0.k) {
            h0.k kVar = (h0.k) h0Var;
            channelFragment.D5().accept(new k.a.e(kVar.f192992b, kVar.f192993c));
            return;
        }
        if (h0Var instanceof h0.l) {
            h0.l lVar = (h0.l) h0Var;
            channelFragment.D5().accept(new k.a.f(lVar.f192994a, lVar.f192995b, lVar.f192996c));
            return;
        }
        if (h0Var instanceof h0.m) {
            com.avito.android.messenger.conversation.mvi.message_menu.l lVar2 = channelFragment.f188949O0;
            h0.m mVar = (h0.m) h0Var;
            (lVar2 != null ? lVar2 : null).tb(mVar.f192997a, mVar.f192998b);
            return;
        }
        if (h0Var instanceof h0.j) {
            com.avito.android.messenger.conversation.mvi.message_menu.l lVar3 = channelFragment.f188949O0;
            h0.j jVar = (h0.j) h0Var;
            (lVar3 != null ? lVar3 : null).tb(jVar.f192989a, jVar.f192990b);
            return;
        }
        if (h0Var instanceof h0.h) {
            Context context = channelFragment.getContext();
            if (context != null) {
                com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, context, Q1.f189138l));
                return;
            }
            return;
        }
        if (h0Var instanceof h0.o) {
            V2 v22 = V2.f318762a;
            NonFatalErrorEvent nonFatalErrorEvent = ((h0.o) h0Var).f193001a;
            v22.f(nonFatalErrorEvent);
            InterfaceC28373a interfaceC28373a = channelFragment.f189006t0;
            (interfaceC28373a != null ? interfaceC28373a : null).c(nonFatalErrorEvent);
            return;
        }
        if (h0Var instanceof h0.c) {
            JY.a aVar2 = channelFragment.f188999n1;
            if ((aVar2 != null ? aVar2 : null).d()) {
                channelFragment.D5().accept(new k.a.d(((h0.c) h0Var).f192977a));
                return;
            }
            return;
        }
        if (h0Var instanceof h0.q) {
            channelFragment.D5().accept(k.b.c.f10788a);
            return;
        }
        if (h0Var instanceof h0.t) {
            channelFragment.D5().accept(new k.a.h(((h0.t) h0Var).f193006a));
            return;
        }
        if (h0Var instanceof h0.p) {
            channelFragment.D5().accept(new k.b.f(((h0.p) h0Var).f193002a));
            return;
        }
        if (h0Var instanceof h0.u) {
            com.avito.android.messenger.conversation.mvi.channel_feature.n nVarD5 = channelFragment.D5();
            T1.d dVar = ((h0.u) h0Var).f193007a;
            nVarD5.accept(new k.a.i(dVar, dVar.f189181p));
            return;
        }
        if (h0Var instanceof h0.v) {
            com.avito.android.messenger.conversation.mvi.channel_feature.n nVarD52 = channelFragment.D5();
            h0.v vVar = (h0.v) h0Var;
            T1.d dVar2 = vVar.f193008a;
            nVarD52.accept(new k.a.j(dVar2, dVar2.f189181p, vVar.f193009b));
            return;
        }
        if (h0Var instanceof h0.f) {
            channelFragment.D5().accept(new k.a.c(((h0.f) h0Var).f192981a));
            return;
        }
        if (h0Var instanceof h0.e) {
            InterfaceC28373a interfaceC28373a2 = channelFragment.f189006t0;
            if (interfaceC28373a2 == null) {
                interfaceC28373a2 = null;
            }
            h0.e eVar = (h0.e) h0Var;
            LocalMessage localMessage = eVar.f192980b;
            String channelId = localMessage.getChannelId();
            DeepLink deepLink = eVar.f192979a;
            interfaceC28373a2.c(new com.avito.android.messenger.analytics.F(channelId, deepLink.getUri().toString(), localMessage.getRemoteId(), null, null, 24, null));
            com.avito.android.deeplink_handler.handler.composite.a aVar3 = channelFragment.f189012y0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            b.a.a(aVar3, deepLink, null, null, 6);
            return;
        }
        if (h0Var instanceof h0.a) {
            channelFragment.D5().accept(new k.a.b(((h0.a) h0Var).f192975a));
            return;
        }
        if (h0Var instanceof h0.g) {
            InterfaceC28373a interfaceC28373a3 = channelFragment.f189006t0;
            if (interfaceC28373a3 == null) {
                interfaceC28373a3 = null;
            }
            h0.g gVar = (h0.g) h0Var;
            LocalMessage localMessage2 = gVar.f192983b;
            String channelId2 = localMessage2.getChannelId();
            MessengerReallContactMethodLink messengerReallContactMethodLink = gVar.f192982a;
            interfaceC28373a3.c(new com.avito.android.messenger.analytics.F(channelId2, messengerReallContactMethodLink.getUri().toString(), localMessage2.getRemoteId(), null, null, 24, null));
            ChannelIacInteractor channelIacInteractor = channelFragment.f188985g1;
            (channelIacInteractor != null ? channelIacInteractor : null).U6(messengerReallContactMethodLink);
            return;
        }
        if (h0Var instanceof h0.w) {
            h0.w wVar = (h0.w) h0Var;
            channelFragment.D5().accept(new k.b.a(wVar.f193010a.f189206c, wVar.f193011b));
            return;
        }
        if (h0Var instanceof h0.b) {
            channelFragment.D5().accept(new k.a.C0684a(((h0.b) h0Var).f192976a));
            return;
        }
        if (h0Var instanceof h0.s) {
            channelFragment.D5().accept(new k.b.C0685b(((h0.s) h0Var).f193005a));
            return;
        }
        if (h0Var instanceof h0.d) {
            com.avito.android.deeplink_handler.handler.composite.a aVar4 = channelFragment.f189012y0;
            if (aVar4 == null) {
                aVar4 = null;
            }
            b.a.a(aVar4, ((h0.d) h0Var).f192978a, null, null, 6);
            return;
        }
        if (h0Var instanceof h0.n) {
            h0.n nVar = (h0.n) h0Var;
            channelFragment.f188998m3.accept(new kotlin.Q<>(nVar.f192999a, nVar.f193000b));
        } else if (h0Var instanceof h0.r) {
            ChannelIacInteractor channelIacInteractor2 = channelFragment.f188985g1;
            (channelIacInteractor2 != null ? channelIacInteractor2 : null).z3(((h0.r) h0Var).f193004a);
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ kotlin.G0 invoke(com.avito.android.messenger.conversation.mvi.messages.h0 h0Var) {
        f(h0Var);
        return kotlin.G0.f406611a;
    }
}
