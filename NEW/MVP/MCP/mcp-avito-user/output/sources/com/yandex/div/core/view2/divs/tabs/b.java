package com.yandex.div.core.view2.divs.tabs;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import com.yandex.div.core.view2.P;
import com.yandex.div.core.view2.divs.widgets.C;
import com.yandex.div.internal.widget.tabs.d;
import com.yandex.div.internal.widget.tabs.s;
import com.yandex.div.internal.widget.tabs.z;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivAction;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DivTabsAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/b;", "Lcom/yandex/div/internal/widget/tabs/d;", "Lcom/yandex/div/core/view2/divs/tabs/a;", "Landroid/view/ViewGroup;", "Lcom/yandex/div2/DivAction;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends com.yandex.div.internal.widget.tabs.d<a, ViewGroup, DivAction> {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f368737o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C38029k f368738p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final P f368739q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C38040w f368740r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final l f368741s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public com.yandex.div.core.state.f f368742t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.k f368743u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f368744v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final m f368745w;

    public b(@Y61.k com.yandex.div.internal.viewpool.h hVar, @Y61.k z zVar, @Y61.k d.i iVar, @Y61.k com.yandex.div.internal.widget.tabs.m mVar, boolean z12, @Y61.k C38029k c38029k, @Y61.k s sVar, @Y61.k P p12, @Y61.k C38040w c38040w, @Y61.k l lVar, @Y61.k com.yandex.div.core.state.f fVar, @Y61.k com.yandex.div.core.downloader.k kVar) {
        super(hVar, zVar, iVar, mVar, sVar, lVar, lVar);
        this.f368737o = z12;
        this.f368738p = c38029k;
        this.f368739q = p12;
        this.f368740r = c38040w;
        this.f368741s = lVar;
        this.f368742t = fVar;
        this.f368743u = kVar;
        this.f368744v = new LinkedHashMap();
        this.f368745w = new m(this.f370461c);
    }

    @Override // com.yandex.div.internal.widget.tabs.d
    public final ViewGroup a(ViewGroup viewGroup, d.g.b bVar, int i12) {
        C.f368870a.getClass();
        C38029k c38029k = this.f368738p;
        C.a(viewGroup, c38029k);
        AbstractC38330g abstractC38330g = ((a) bVar).f368734a.f372126a;
        View viewN = this.f368739q.n(abstractC38330g, c38029k.getExpressionResolver());
        viewN.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f368740r.b(viewN, abstractC38330g, c38029k, this.f368742t);
        this.f368744v.put(viewGroup, new n(viewN, abstractC38330g));
        viewGroup.addView(viewN);
        return viewGroup;
    }

    @Override // com.yandex.div.internal.widget.tabs.d
    public final void c(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        this.f368744v.remove(viewGroup2);
        C.f368870a.getClass();
        C.a(viewGroup2, this.f368738p);
    }

    public final void d() {
        for (Map.Entry entry : this.f368744v.entrySet()) {
            ViewGroup viewGroup = (ViewGroup) entry.getKey();
            n nVar = (n) entry.getValue();
            View view = nVar.f368816b;
            com.yandex.div.core.state.f fVar = this.f368742t;
            this.f368740r.b(view, nVar.f368815a, this.f368738p, fVar);
            viewGroup.requestLayout();
        }
    }
}
