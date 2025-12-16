package com.avito.android.search.filter.link.apply;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersApplyLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/link/apply/a;", "Lev/b;", "Lcom/avito/android/search/filter/link/apply/FiltersApplyLink;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40162b<FiltersApplyLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f263393d;

    @Inject
    public a(@k f fVar) {
        this.f263393d = fVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f263393d.f263396a.onNext((FiltersApplyLink) deepLink);
        return AbstractC14250d.c.f9171c;
    }
}
