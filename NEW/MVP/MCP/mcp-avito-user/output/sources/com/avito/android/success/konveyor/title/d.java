package com.avito.android.success.konveyor.title;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import eA0.InterfaceC39979a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuccessTitlePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/konveyor/title/d;", "LTV0/d;", "Lcom/avito/android/success/konveyor/title/f;", "Lcom/avito/android/success/konveyor/title/c;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements TV0.d<f, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f291662b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC39979a, G0> f291663c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k com.avito.android.util.text.a aVar, @k l<? super InterfaceC39979a, G0> lVar) {
        this.f291662b = aVar;
        this.f291663c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e eVar2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 29);
        AttributedText attributedText = ((c) aVar).f291661b;
        attributedText.setOnDeepLinkClickListener(eVar2);
        ((f) eVar).O1(attributedText, this.f291662b);
    }
}
