package com.avito.android.search.filter.adapter.multiselect;

import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.adapter.select.l;
import com.avito.android.search.filter.converter.ParameterElement;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MultiselectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/multiselect/i;", "Lcom/avito/android/search/filter/adapter/multiselect/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.s> f262547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.s> f262548c;

    @Inject
    public i(@Y61.k InterfaceC34581l interfaceC34581l) {
        this.f262547b = interfaceC34581l.getF263713g();
        this.f262548c = interfaceC34581l.getF263709c();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        Integer num;
        Integer num2;
        l lVar = (l) eVar;
        ParameterElement.s sVar = (ParameterElement.s) aVar;
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        Badge badge = sVar.f262830p;
        String str = sVar.f262817c;
        boolean z12 = sVar.f262826l;
        if (badge == null) {
            lVar.setTitle(z12 ? "" : str);
        } else {
            lVar.B6(z12 ? "" : str, badge);
        }
        G0 g03 = null;
        ParameterElement.s.a aVar2 = sVar.f262822h;
        if (aVar2 == null || (num2 = aVar2.f262835a) == null) {
            g02 = null;
        } else {
            lVar.setTopPadding(num2.intValue());
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            lVar.t8();
        }
        if (aVar2 != null && (num = aVar2.f262836b) != null) {
            lVar.m4(num.intValue());
            g03 = G0.f406611a;
        }
        if (g03 == null) {
            lVar.ra();
        }
        lVar.c3(sVar.f262823i);
        String str2 = sVar.f262824j;
        if (str2 != null) {
            lVar.o(str2);
        }
        if (sVar.f262820f instanceof ParameterElement.DisplayType.j) {
            lVar.t3();
        } else {
            lVar.a(new e(cVar));
        }
        String str3 = sVar.f262818d;
        if (str3 == null || C43066x.K(str3)) {
            lVar.J4(R.attr.ic_arrowDown20);
        } else {
            lVar.Sa(new f(lVar, this, sVar));
        }
        lVar.m(str3);
        new C41981q0(cVar).C0(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).u0(new g(this, sVar), h.f262546b);
    }
}
