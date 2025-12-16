package com.avito.android.home.tags_item.tag;

import Y61.k;
import com.avito.android.serp.adapter.home_section_tab.SectionTag;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionTagItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/tags_item/tag/g;", "Lcom/avito/android/home/tags_item/tag/e;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.home.tags_item.d f162521b;

    @Inject
    public g(@k com.avito.android.home.tags_item.d dVar) {
        this.f162521b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SectionTag sectionTag = (SectionTag) aVar;
        ((i) eVar).Xt(sectionTag, i12, new f(this, sectionTag));
    }
}
