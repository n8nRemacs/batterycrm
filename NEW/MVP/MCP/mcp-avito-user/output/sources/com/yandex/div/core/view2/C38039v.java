package com.yandex.div.core.view2;

import android.view.View;
import com.avito.android.R;
import com.yandex.div2.C38584w0;
import kotlin.Metadata;

/* compiled from: DivAccessibilityVisitor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/v;", "Lcom/yandex/div/core/view2/divs/widgets/w;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38039v extends com.yandex.div.core.view2.divs.widgets.w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38037t f369181a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C38029k f369182b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.e f369183c;

    public C38039v(@Y61.k C38037t c38037t, @Y61.k C38029k c38029k, @Y61.k com.yandex.div.json.expressions.e eVar) {
        this.f369181a = c38037t;
        this.f369182b = c38029k;
        this.f369183c = eVar;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void a(@Y61.k View view) {
        Object tag = view.getTag(R.id.div_custom_tag);
        C38584w0 c38584w0 = tag instanceof C38584w0 ? (C38584w0) tag : null;
        if (c38584w0 != null) {
            r(view, c38584w0);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void b(@Y61.k com.yandex.div.core.view2.divs.widgets.f fVar) {
        r(fVar, fVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void c(@Y61.k com.yandex.div.core.view2.divs.widgets.g gVar) {
        r(gVar, gVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void d(@Y61.k com.yandex.div.core.view2.divs.widgets.h hVar) {
        r(hVar, hVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void e(@Y61.k com.yandex.div.core.view2.divs.widgets.i iVar) {
        r(iVar, iVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void f(@Y61.k com.yandex.div.core.view2.divs.widgets.k kVar) {
        r(kVar, kVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void g(@Y61.k com.yandex.div.core.view2.divs.widgets.l lVar) {
        r(lVar, lVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void h(@Y61.k com.yandex.div.core.view2.divs.widgets.m mVar) {
        r(mVar, mVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void i(@Y61.k com.yandex.div.core.view2.divs.widgets.n nVar) {
        r(nVar, nVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void j(@Y61.k com.yandex.div.core.view2.divs.widgets.o oVar) {
        r(oVar, oVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void k(@Y61.k com.yandex.div.core.view2.divs.widgets.p pVar) {
        r(pVar, pVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void l(@Y61.k com.yandex.div.core.view2.divs.widgets.q qVar) {
        r(qVar, qVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void m(@Y61.k com.yandex.div.core.view2.divs.widgets.r rVar) {
        r(rVar, rVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void n(@Y61.k com.yandex.div.core.view2.divs.widgets.t tVar) {
        r(tVar, tVar.getDivState());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void o(@Y61.k com.yandex.div.core.view2.divs.widgets.v vVar) {
        r(vVar, vVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void p(@Y61.k com.yandex.div.core.view2.divs.widgets.y yVar) {
        r(yVar, yVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void q(@Y61.k com.yandex.div.internal.widget.tabs.z zVar) {
        r(zVar, zVar.getDiv());
    }

    public final void r(View view, com.yandex.div2.H h12) {
        if (h12 == null) {
            return;
        }
        this.f369181a.b(view, this.f369182b, h12.getF374454a().f371185c.a(this.f369183c));
    }
}
