package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.StrPayoutInitLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrPayoutInitDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/o;", "Lcom/avito/android/messenger/conversation/mvi/deeplinks/payout/b;", "Lcom/avito/android/deep_linking/links/StrPayoutInitLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes15.dex */
public final class o extends b<StrPayoutInitLink> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final q f190617h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f190618i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f190619j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f190620k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a.d f190621l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f190622m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final a.g f190623n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Resources f190624o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final a.b f190625p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f190626q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final a.i f190627r;

    @Inject
    public o(@Y61.k q qVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.d dVar, @Y61.k InterfaceC36134w1 interfaceC36134w1, @Y61.k a.g gVar, @Y61.k Resources resources, @Y61.k a.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.i iVar) {
        this.f190617h = qVar;
        this.f190618i = interfaceC35745a5;
        this.f190619j = fVar;
        this.f190620k = interfaceC4053a;
        this.f190621l = dVar;
        this.f190622m = interfaceC36134w1;
        this.f190623n = gVar;
        this.f190624o = resources;
        this.f190625p = bVar;
        this.f190626q = aVar;
        this.f190627r = iVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final a.InterfaceC4053a getF190620k() {
        return this.f190620k;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: l, reason: from getter */
    public final a.b getF190625p() {
        return this.f190625p;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final com.avito.android.deeplink_handler.handler.composite.a getF190626q() {
        return this.f190626q;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: n, reason: from getter */
    public final a.d getF190621l() {
        return this.f190621l;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: o, reason: from getter */
    public final a.g getF190623n() {
        return this.f190623n;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: p, reason: from getter */
    public final InterfaceC36134w1 getF190622m() {
        return this.f190622m;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    public final k q() {
        return this.f190617h;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: r, reason: from getter */
    public final Resources getF190624o() {
        return this.f190624o;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: s, reason: from getter */
    public final InterfaceC35745a5 getF190618i() {
        return this.f190618i;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    @Y61.k
    /* renamed from: t, reason: from getter */
    public final com.avito.android.remote.error.f getF190619j() {
        return this.f190619j;
    }

    @Override // com.avito.android.messenger.conversation.mvi.deeplinks.payout.b
    public final void u(@Y61.k ApiError apiError) {
        if (!(apiError instanceof ApiError.IncorrectData)) {
            super.u(apiError);
            return;
        }
        a.i.C4057a.e(this.f190627r, ((ApiError.IncorrectData) apiError).getF244063c(), new f.c(apiError), 0, ToastBarPosition.f181044b, 942);
    }
}
