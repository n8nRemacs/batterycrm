package com.avito.android.serp.adapter.action_promo_banner;

import AK0.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.search.filter.adapter.select.m;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ActionPromoBannerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/action_promo_banner/h;", "Lcom/avito/android/serp/adapter/action_promo_banner/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f268618b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f268619c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f268620d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f268621e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e2 f268622f;

    @Inject
    public h(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k l lVar) {
        this.f268618b = e12;
        this.f268619c = interfaceC28373a;
        this.f268620d = lVar;
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f268621e = f2.b(0, 1, bufferOverflow, 1);
        this.f268622f = f2.b(0, 1, bufferOverflow, 1);
    }

    @Override // com.avito.android.serp.adapter.action_promo_banner.f
    @Y61.k
    public final InterfaceC43160i<G0> A5() {
        return C43175k.a(this.f268621e);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        ActionPromoBannerItem actionPromoBannerItem = (ActionPromoBannerItem) aVar;
        String strA = this.f268618b.a();
        if (strA == null) {
            strA = "";
        }
        this.f268619c.c(new BannerEvent.i(actionPromoBannerItem.f268597b, "serp", null, strA, 4, null));
        jVar.e(actionPromoBannerItem.f268598c);
        jVar.r(actionPromoBannerItem.f268599d);
        jVar.i(actionPromoBannerItem.f268602g);
        jVar.gc(actionPromoBannerItem.f268600e, new g(this, actionPromoBannerItem));
        jVar.Xw(actionPromoBannerItem.f268604i, actionPromoBannerItem.f268603h, new m(10, this, actionPromoBannerItem));
        jVar.SP(actionPromoBannerItem.f268601f);
    }

    @Override // com.avito.android.serp.adapter.action_promo_banner.f
    @Y61.k
    public final InterfaceC43160i<DeepLink> p4() {
        return C43175k.a(this.f268622f);
    }
}
