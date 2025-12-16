package com.avito.android.serp.adapter.gig_promo_snippet;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.promo_snippet.PromoSnippetList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigPromoSnippetItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/gig_promo_snippet/c;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PromoSnippetList f270090b;

    public c(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.motivations_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.promo_snippet.PromoSnippetList");
        }
        this.f270090b = (PromoSnippetList) viewFindViewById;
    }
}
