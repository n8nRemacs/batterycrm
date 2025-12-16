package com.avito.android.search.filter.adapter.group_clearance;

import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.ClearanceValue;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: GroupClearanceItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/group_clearance/g;", "LTV0/d;", "Lcom/avito/android/search/filter/adapter/select/l;", "Lcom/avito/android/search/filter/converter/ParameterElement$k;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements TV0.d<com.avito.android.search.filter.adapter.select.l, ParameterElement.k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f262329b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.k> f262330c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.k> f262331d;

    @Inject
    public g(@Y61.k InterfaceC34581l interfaceC34581l, @Y61.k j jVar) {
        this.f262329b = jVar;
        this.f262330c = interfaceC34581l.getF263719m();
        this.f262331d = interfaceC34581l.getF263720n();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String strC;
        Object next;
        String strB;
        com.avito.android.search.filter.adapter.select.l lVar = (com.avito.android.search.filter.adapter.select.l) eVar;
        ParameterElement.k kVar = (ParameterElement.k) aVar;
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        lVar.setTitle(kVar.f262765d);
        String str = kVar.f262766e;
        if (str != null) {
            lVar.o(str);
        }
        lVar.a(new c(cVar));
        lVar.c3(kVar.f262767f);
        List<IntParameter> list = kVar.f262769h;
        IntParameter intParameter = (IntParameter) C42745f0.E(list);
        IntParameter intParameter2 = list.get(1);
        Long value = intParameter.getValue();
        long jLongValue = value != null ? value.longValue() : 0L;
        Long value2 = intParameter2.getValue();
        long jLongValue2 = value2 != null ? value2.longValue() : 0L;
        if (jLongValue == 0 && jLongValue2 == 0) {
            strB = null;
        } else {
            DisplayingOptions displayingOptions = intParameter.getDisplayingOptions();
            j jVar = this.f262329b;
            if (displayingOptions == null || (strC = displayingOptions.getPostfix()) == null) {
                strC = jVar.c();
            }
            Iterator<T> it = kVar.f262770i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ClearanceValue clearanceValue = (ClearanceValue) next;
                if (clearanceValue.getTo() == ((int) jLongValue2) && clearanceValue.getFrom() == ((int) jLongValue)) {
                    break;
                }
            }
            ClearanceValue clearanceValue2 = (ClearanceValue) next;
            strB = (clearanceValue2 != null ? clearanceValue2.getButtonTitle() : null) == null ? jLongValue == 0 ? jVar.b(intParameter2.getTitle(), String.valueOf(jLongValue2), strC) : jLongValue2 == 0 ? jVar.b(intParameter.getTitle(), String.valueOf(jLongValue), strC) : jVar.a(intParameter.getTitle(), String.valueOf(jLongValue), String.valueOf(jLongValue2), strC) : clearanceValue2.getButtonTitle();
        }
        if (strB == null || C43066x.K(strB)) {
            lVar.J4(R.attr.ic_arrowDown20);
        } else {
            lVar.Sa(new d(lVar, this, kVar));
        }
        lVar.m(strB);
        new C41981q0(cVar).C0(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).u0(new e(this, kVar), f.f262328b);
    }
}
