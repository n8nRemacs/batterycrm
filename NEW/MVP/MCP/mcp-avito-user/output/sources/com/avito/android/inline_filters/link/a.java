package com.avito.android.inline_filters.link;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InlineFiltersApplyLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/link/a;", "Lev/b;", "Lcom/avito/android/inline_filters/link/InlineFiltersApplyLink;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40162b<InlineFiltersApplyLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f172312d;

    @Inject
    public a(@k f fVar) {
        this.f172312d = fVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f172312d.f172315a.onNext((InlineFiltersApplyLink) deepLink);
        return AbstractC14250d.c.f9171c;
    }
}
