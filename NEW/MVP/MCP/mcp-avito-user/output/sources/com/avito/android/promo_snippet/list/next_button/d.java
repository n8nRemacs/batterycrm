package com.avito.android.promo_snippet.list.next_button;

import TV0.e;
import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PromoNextButtonPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/promo_snippet/list/next_button/d;", "LTV0/d;", "Lcom/avito/android/promo_snippet/list/next_button/b;", "Lcom/avito/android/promo_snippet/list/next_button/PromoNextButtonItem;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<b, PromoNextButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f231750b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super DeepLink, G0> lVar) {
        this.f231750b = lVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        ((b) eVar).iE((PromoNextButtonItem) aVar, this.f231750b);
    }
}
