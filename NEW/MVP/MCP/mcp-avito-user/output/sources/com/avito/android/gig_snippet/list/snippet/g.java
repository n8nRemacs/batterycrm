package com.avito.android.gig_snippet.list.snippet;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigShiftSnippetPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_snippet/list/snippet/g;", "LTV0/d;", "Lcom/avito/android/gig_snippet/list/snippet/b;", "Lcom/avito/android/gig_snippet/list/snippet/GigShiftSnippetListItem;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements TV0.d<b, GigShiftSnippetListItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f161070b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f161071c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f161072d;

    public g(@Y61.l Y41.a aVar, @k l lVar, @k l lVar2) {
        this.f161070b = lVar;
        this.f161071c = lVar2;
        this.f161072d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((b) eVar).A40((GigShiftSnippetListItem) aVar, this.f161070b, this.f161071c, this.f161072d);
    }

    public /* synthetic */ g(l lVar, l lVar2, Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? null : aVar, lVar, lVar2);
    }
}
