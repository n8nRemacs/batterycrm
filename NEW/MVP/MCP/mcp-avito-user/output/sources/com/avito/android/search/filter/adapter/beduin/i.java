package com.avito.android.search.filter.adapter.beduin;

import com.avito.android.R;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: BeduinItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/beduin/i;", "Lcom/avito/android/search/filter/adapter/beduin/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.C34553a> f261987b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.C34553a> f261988c;

    @Inject
    public i(@Y61.k InterfaceC34581l interfaceC34581l) {
        this.f261987b = interfaceC34581l.getF263731y();
        this.f261988c = interfaceC34581l.getF263732z();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        ParameterElement.C34553a c34553a = (ParameterElement.C34553a) aVar;
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        lVar.setTitle(c34553a.f262727d);
        lVar.o(c34553a.f262729f);
        lVar.a(new e(cVar));
        String str = c34553a.f262728e;
        if (str == null || C43066x.K(str)) {
            lVar.J4(R.attr.ic_arrowDown20);
        } else {
            lVar.Sa(new f(this, c34553a));
        }
        lVar.m(str);
        new C41981q0(cVar).C0(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).u0(new g(this, c34553a), h.f261986b);
    }
}
