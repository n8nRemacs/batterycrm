package com.avito.android.promo_snippet.list.snippet;

import TV0.e;
import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.promo_snippet.PromoSnippetState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PromoSnippetPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/promo_snippet/list/snippet/d;", "LTV0/d;", "Lcom/avito/android/promo_snippet/list/snippet/c;", "Lcom/avito/android/promo_snippet/PromoSnippetState;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<c, PromoSnippetState> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f231755b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super DeepLink, G0> lVar) {
        this.f231755b = lVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        ((c) eVar).hu((PromoSnippetState) aVar, this.f231755b);
    }
}
