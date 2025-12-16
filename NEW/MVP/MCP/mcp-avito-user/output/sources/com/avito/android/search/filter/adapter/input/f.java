package com.avito.android.search.filter.adapter.input;

import Y61.k;
import com.avito.android.common.l;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.l1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InputItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/input/f;", "Lcom/avito/android/search/filter/adapter/input/c;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l1 f262420b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l41.g<ParameterElement.o> f262421c;

    @Inject
    public f(@k InterfaceC34581l interfaceC34581l, @k l1 l1Var) {
        this.f262420b = l1Var;
        this.f262421c = interfaceC34581l.getF263714h();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ParameterElement.o oVar = (ParameterElement.o) aVar;
        l lVarA = this.f262420b.a(oVar.f262792k);
        hVar.setTitle(oVar.f262785d);
        hVar.A6(oVar.f262788g);
        int i13 = oVar.f262789h;
        if (i13 == 1) {
            hVar.h0();
        } else {
            hVar.J1(i13, 1);
        }
        hVar.x5(oVar.f262790i);
        hVar.T2(oVar.f262791j);
        hVar.t5(oVar.f262798q);
        hVar.o(oVar.f262795n);
        String str = oVar.f262786e;
        if (str == null || lVarA == null) {
            hVar.m(str);
        } else {
            hVar.m(lVarA.a(new com.avito.android.common.k(0, 0, str)).f123766a.toString());
        }
        hVar.K(new d(oVar, this));
        hVar.o0(new e(hVar, this, oVar, lVarA));
    }
}
