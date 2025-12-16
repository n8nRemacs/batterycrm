package com.avito.android.search.filter.adapter.suggest_location;

import Y61.k;
import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.adapter.select.l;
import com.avito.android.search.filter.converter.ParameterElement;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/suggest_location/h;", "Lcom/avito/android/search/filter/adapter/suggest_location/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<ParameterElement.v> f262604b;

    @Inject
    public h(@k InterfaceC34581l interfaceC34581l) {
        this.f262604b = interfaceC34581l.getF263712f();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        CustomPaddings customPaddings;
        Integer bottom;
        CustomPaddings customPaddings2;
        Integer top;
        l lVar = (l) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        lVar.setTitle(vVar.f262840c);
        String str = vVar.f262850m;
        if (str != null) {
            lVar.o(str);
        }
        lVar.a(new e(cVar));
        G0 g03 = null;
        SelectParameter.Displaying displaying = vVar.f262855r;
        if (displaying == null || (customPaddings2 = displaying.getCustomPaddings()) == null || (top = customPaddings2.getTop()) == null) {
            g02 = null;
        } else {
            lVar.setTopPadding(top.intValue());
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            lVar.t8();
        }
        if (displaying != null && (customPaddings = displaying.getCustomPaddings()) != null && (bottom = customPaddings.getBottom()) != null) {
            lVar.m4(bottom.intValue());
            g03 = G0.f406611a;
        }
        if (g03 == null) {
            lVar.ra();
        }
        lVar.c3(vVar.f262848k);
        lVar.H4(R.attr.ic_hollowPin16);
        lVar.J4(R.attr.ic_arrowDown20);
        lVar.m(vVar.f262842e);
        new C41981q0(cVar).C0(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).u0(new f(this, vVar), g.f262603b);
    }
}
