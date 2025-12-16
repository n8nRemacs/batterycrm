package com.avito.android.re_agent_landing.landing.items.question;

import Sh0.InterfaceC15186a;
import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: QuestionPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/question/e;", "LTV0/d;", "Lcom/avito/android/re_agent_landing/landing/items/question/g;", "Lcom/avito/android/re_agent_landing/landing/items/question/c;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15186a, G0> f250785b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e f250786c = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 19);

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15186a, G0> lVar) {
        this.f250785b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) aVar;
        cVar.f250784d.setOnDeepLinkClickListener(this.f250786c);
        ((g) eVar).Ur(cVar);
    }
}
