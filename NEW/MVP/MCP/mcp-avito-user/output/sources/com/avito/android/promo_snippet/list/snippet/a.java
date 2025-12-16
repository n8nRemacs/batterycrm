package com.avito.android.promo_snippet.list.snippet;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.promo_snippet.PromoSnippet;
import com.avito.android.promo_snippet.PromoSnippetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoSnippetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promo_snippet/list/snippet/a;", "Lcom/avito/android/promo_snippet/list/snippet/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PromoSnippet f231751b;

    public a(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.promo_snippet_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.promo_snippet.PromoSnippet");
        }
        this.f231751b = (PromoSnippet) viewFindViewById;
    }

    @Override // com.avito.android.promo_snippet.list.snippet.c
    public final void hu(@k PromoSnippetState promoSnippetState, @k l<? super DeepLink, G0> lVar) {
        PromoSnippet promoSnippet = this.f231751b;
        promoSnippet.setOnClickListener(lVar);
        promoSnippet.setState(promoSnippetState);
    }
}
