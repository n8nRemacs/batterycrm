package com.avito.android.search.filter.adapter.category_group;

import android.os.Bundle;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryGroupItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/p;", "Lcom/avito/android/search/filter/adapter/category_group/i;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements i {

    /* renamed from: b, reason: collision with root package name */
    public boolean f262077b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f262078c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ParameterElement.v.b f262079d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.v> f262080e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<C34537a> f262081f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f262082g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f262083h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<B> f262084i;

    /* renamed from: j, reason: collision with root package name */
    public final int f262085j;

    @Inject
    public p(@Y61.k InterfaceC34581l interfaceC34581l, @Y61.k y yVar, @Y61.l com.avito.android.search.filter.di.w wVar) {
        Bundle bundle;
        Bundle bundle2;
        this.f262077b = (wVar == null || (bundle2 = wVar.f263290a) == null) ? false : bundle2.getBoolean("dialog_opened_key");
        this.f262078c = (wVar == null || (bundle = wVar.f263290a) == null) ? null : bundle.getString("dialog_search_query_key");
        this.f262080e = interfaceC34581l.getF263716j();
        this.f262081f = new com.jakewharton.rxrelay3.c<>();
        this.f262082g = new com.jakewharton.rxrelay3.c<>();
        this.f262083h = new com.jakewharton.rxrelay3.c<>();
        this.f262084i = new com.jakewharton.rxrelay3.c<>();
        this.f262085j = yVar.getWidth();
    }

    @Override // com.avito.android.search.filter.adapter.category_group.i
    @Y61.k
    public final C41981q0 E7() {
        com.jakewharton.rxrelay3.c<B> cVar = this.f262084i;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ParameterElement.v.b bVar;
        Boolean hideShowMore;
        s sVar = (s) eVar;
        ParameterElement.d dVar = (ParameterElement.d) aVar;
        Iterator it = C42745f0.k(dVar.f262743f).iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            ParameterElement parameterElement = (ParameterElement) it.next();
            if (parameterElement instanceof ParameterElement.v.b) {
                bVar = (ParameterElement.v.b) parameterElement;
                if (bVar.f262844g == null) {
                    break;
                }
            }
        }
        new j(sVar);
        sVar.X5(this.f262085j);
        sVar.setTitle(dVar.f262741d);
        sVar.pW(new k(this, dVar), dVar.f262744g);
        if (bVar != null) {
            this.f262079d = bVar;
            List<Cp0.e> list = bVar.f262862t;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList.add(new C(i13, (Cp0.e) obj));
                i13 = i14;
            }
            SelectParameter.Displaying displaying = bVar.f262855r;
            sVar.Gr(arrayList, (displaying == null || (hideShowMore = displaying.getHideShowMore()) == null) ? false : hideShowMore.booleanValue(), new l(dVar, bVar, this));
            C34541e f262103f = sVar.getF262103f();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            int i15 = 0;
            for (Object obj2 : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList2.add(new C(i15, (Cp0.e) obj2));
                i15 = i16;
            }
            f262103f.f262058c = arrayList2;
            Chips chips = f262103f.f262056a;
            chips.j();
            chips.setData(arrayList2);
            chips.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            chips.setChipsSelectedListener(new C34539c(new m(bVar, this, sVar)));
            n nVar = new n(this);
            Input input = f262103f.f262057b;
            input.b(new com.avito.android.lib.design.input.s(input.m53getText(), nVar));
        } else {
            sVar.Gr(C42784z0.f406748b, true, null);
        }
        if (this.f262077b) {
            sVar.ZC(new o(this));
            C34541e f262103f2 = sVar.getF262103f();
            String str = this.f262078c;
            if (str != null) {
                Input.t(f262103f2.f262057b, str, false, 6);
            } else {
                f262103f2.getClass();
            }
        }
    }

    @Override // com.avito.android.search.filter.adapter.category_group.i
    @Y61.k
    public final C41981q0 Q3() {
        com.jakewharton.rxrelay3.c<C34537a> cVar = this.f262081f;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.search.filter.adapter.category_group.i
    @Y61.k
    public final C41981q0 T0() {
        com.jakewharton.rxrelay3.c<G0> cVar = this.f262082g;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.search.filter.adapter.category_group.i
    @Y61.k
    public final C41981q0 p6() {
        com.jakewharton.rxrelay3.c<G0> cVar = this.f262083h;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.search.filter.adapter.category_group.i
    public final void y4(@Y61.l String str) {
        Object next;
        ParameterElement.v.b bVar = this.f262079d;
        if (bVar == null) {
            return;
        }
        Iterator<T> it = bVar.f262862t.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((Cp0.e) next).f2697b, str)) {
                    break;
                }
            }
        }
        Cp0.e eVar = (Cp0.e) next;
        if (eVar == null) {
            return;
        }
        bVar.f262844g = eVar;
        this.f262083h.accept(G0.f406611a);
        this.f262080e.accept(bVar);
    }
}
