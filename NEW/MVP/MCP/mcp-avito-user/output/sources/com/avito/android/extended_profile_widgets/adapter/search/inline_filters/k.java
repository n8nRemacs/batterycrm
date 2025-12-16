package com.avito.android.extended_profile_widgets.adapter.search.inline_filters;

import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;

/* compiled from: InlineFiltersItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/k;", "Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<oB.k, G0> f154667b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31062w f154668c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f154669d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public k(@Y61.k Y41.l<? super oB.k, G0> lVar, @Y61.k InterfaceC31062w interfaceC31062w, @Y61.k R0 r02) {
        this.f154667b = lVar;
        this.f154668c = interfaceC31062w;
        this.f154669d = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.d()));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        this.f154668c.w1(mVar, mVar, null, null, null);
        C43175k.K(new C43197r1(new i(this, null), C43175k.N(y.a(mVar.pu().d0(d.f154658b)), y.a(mVar.Vl().d0(e.f154659b)), y.a(mVar.TJ().d0(f.f154660b)), y.a(mVar.s60().d0(g.f154661b)), y.a(mVar.Ct().d0(h.f154662b)))), this.f154669d);
        mVar.d(new j(this, mVar));
    }
}
