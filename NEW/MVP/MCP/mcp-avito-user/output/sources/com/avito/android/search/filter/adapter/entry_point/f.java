package com.avito.android.search.filter.adapter.entry_point;

import Y61.k;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: EntryPointItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/entry_point/f;", "LTV0/d;", "Lcom/avito/android/search/filter/adapter/entry_point/h;", "Lcom/avito/android/search/filter/converter/ParameterElement$i;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements TV0.d<h, ParameterElement.i> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f262306b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u3.g<AutoGlowFiltersTestGroup> f262307c;

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @oD.i @k u3.g<AutoGlowFiltersTestGroup> gVar) {
        this.f262306b = aVar;
        this.f262307c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ArrayList arrayList;
        h hVar = (h) eVar;
        ParameterElement.i iVar = (ParameterElement.i) aVar;
        u3.g<AutoGlowFiltersTestGroup> gVar = this.f262307c;
        AutoGlowFiltersTestGroup autoGlowFiltersTestGroup = gVar.f439742a.f439749b;
        autoGlowFiltersTestGroup.getClass();
        if (autoGlowFiltersTestGroup != AutoGlowFiltersTestGroup.f157645e && autoGlowFiltersTestGroup != AutoGlowFiltersTestGroup.f157646f) {
            AutoGlowFiltersTestGroup autoGlowFiltersTestGroup2 = gVar.f439742a.f439749b;
            autoGlowFiltersTestGroup2.getClass();
            if (!(autoGlowFiltersTestGroup2 == AutoGlowFiltersTestGroup.f157644d)) {
                hVar.lG(false);
                return;
            } else {
                hVar.lG(false);
                hVar.nc(new c(this));
                return;
            }
        }
        hVar.lG(true);
        hVar.setTitle(iVar.f262759d);
        hVar.f(iVar.f262760e);
        List<UniversalColor> list = iVar.f262763h;
        if (list != null) {
            List<UniversalColor> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(C48063a.f437606a.a(hVar.getContext(), (UniversalColor) it.next())));
            }
        } else {
            arrayList = null;
        }
        boolean zA2 = O2.a(arrayList);
        String str = iVar.f262761f;
        if (zA2) {
            hVar.jw(str, arrayList);
            hVar.nc(new d(this, hVar));
        } else {
            hVar.eJ(str);
        }
        hVar.a(new e(this, iVar));
    }
}
