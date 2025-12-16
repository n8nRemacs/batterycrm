package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development;

import Jw.C14255a;
import Lw.InterfaceC14443a;
import Y41.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.image_carousel.ActionType;
import com.avito.android.developments_agency_search.domain.Metro;
import dx.C39815c;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DevelopmentSearchResultItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development/h;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements TV0.d<j, a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC14443a, G0> f138320b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k l<? super InterfaceC14443a, G0> lVar) {
        this.f138320b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        a aVar2 = (a) aVar;
        jVar.a(new d(this, aVar2));
        jVar.Gc(new e(this, aVar2));
        jVar.FU(new f(this, aVar2));
        jVar.Y8(new g(this, aVar2));
        C39815c c39815c = aVar2.f138302c;
        jVar.xf(C14255a.a(c39815c.h()), Collections.singleton(new com.avito.android.cyclic_gallery_widget.image_carousel.a(ActionType.f131988g, aVar2.f138304e, R.attr.textH50, null, 8, null)));
        jVar.Yk(c39815c.getName());
        jVar.Z50(c39815c.getDeveloper().getName());
        jVar.X00(c39815c.getPriceRange());
        jVar.sh(aVar2.f138303d);
        jVar.Q00(c39815c.getCompletionQuarter().getValue(), c39815c.getCompletionQuarter().getColor());
        jVar.D2((Metro) C42745f0.G(aVar2.f138305f));
        jVar.B0(c39815c.getAddress());
    }
}
