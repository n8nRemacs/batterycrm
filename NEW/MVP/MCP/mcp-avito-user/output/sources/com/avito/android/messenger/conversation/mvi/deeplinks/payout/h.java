package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deep_linking.links.DeliveryPayoutInitLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryPayoutInitDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/h;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/b;", "Lcom/avito/android/deep_linking/links/DeliveryPayoutInitLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes15.dex */
public final class h extends b<DeliveryPayoutInitLink> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final j f190567h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f190568i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f190569j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f190570k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a.d f190571l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final a.g f190572m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f190573n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Resources f190574o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final a.b f190575p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f190576q;

    @Inject
    public h(@Y61.k j jVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.d dVar, @Y61.k a.g gVar, @Y61.k InterfaceC36134w1 interfaceC36134w1, @Y61.k Resources resources, @Y61.k a.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f190567h = jVar;
        this.f190568i = interfaceC35745a5;
        this.f190569j = fVar;
        this.f190570k = interfaceC4053a;
        this.f190571l = dVar;
        this.f190572m = gVar;
        this.f190573n = interfaceC36134w1;
        this.f190574o = resources;
        this.f190575p = bVar;
        this.f190576q = aVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final a.InterfaceC4053a getF190620k() {
        return this.f190570k;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: l, reason: from getter */
    public final a.b getF190625p() {
        return this.f190575p;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final com.avito.android.deeplink_handler.handler.composite.a getF190626q() {
        return this.f190576q;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: n, reason: from getter */
    public final a.d getF190621l() {
        return this.f190571l;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: o, reason: from getter */
    public final a.g getF190623n() {
        return this.f190572m;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: p, reason: from getter */
    public final InterfaceC36134w1 getF190622m() {
        return this.f190573n;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    public final k q() {
        return this.f190567h;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: r, reason: from getter */
    public final Resources getF190624o() {
        return this.f190574o;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: s, reason: from getter */
    public final InterfaceC35745a5 getF190618i() {
        return this.f190568i;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: t, reason: from getter */
    public final com.avito.android.remote.error.f getF190619j() {
        return this.f190569j;
    }
}
