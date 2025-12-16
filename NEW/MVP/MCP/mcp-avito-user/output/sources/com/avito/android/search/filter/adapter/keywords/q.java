package com.avito.android.search.filter.adapter.keywords;

import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.input.s;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: KeywordsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/keywords/q;", "Lcom/avito/android/search/filter/adapter/keywords/j;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.p> f262478b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<DeepLink> f262479c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement> f262480d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public s f262481e;

    @Inject
    public q(@Y61.k InterfaceC34581l interfaceC34581l) {
        this.f262478b = interfaceC34581l.getF263701A();
        this.f262479c = interfaceC34581l.getF263721o();
        this.f262480d = interfaceC34581l.getF263702B();
    }

    public static void k(g gVar, String str) {
        if (C43066x.K(str)) {
            gVar.ib(null);
        } else {
            gVar.ib(Integer.valueOf(R.drawable.add_round));
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ParameterElement.p pVar = (ParameterElement.p) aVar;
        gVar.GX(pVar.f262803d, pVar.f262809j);
        gVar.setHint(pVar.f262805f);
        gVar.mh(pVar.f262806g);
        Integer num = pVar.f262807h;
        if (num != null) {
            gVar.EE(num.intValue());
        }
        gVar.dF(new k(this, gVar, pVar));
        gVar.yE(new l(this, gVar, pVar));
        s sVar = this.f262481e;
        if (sVar != null) {
            gVar.rf(sVar);
        }
        gVar.t(new m(this, gVar));
        s sVar2 = new s("", new n(this, gVar, pVar));
        this.f262481e = sVar2;
        gVar.eR(sVar2);
        String str = pVar.f262808i;
        gVar.y0(str == null ? "" : str);
        gVar.SC(new o(gVar));
        k(gVar, str != null ? str : "");
        if (pVar.f262810k != null) {
            gVar.cV(new p(this, pVar));
        } else {
            gVar.cV(null);
        }
        gVar.B(pVar.f262804e);
        gVar.YY(pVar.f262804e.size() < gVar.getF262441h());
    }
}
