package com.avito.android.search.filter.adapter.segment;

import Y61.k;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/segment/f;", "Lcom/avito/android/search/filter/adapter/segment/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<ParameterElement.v> f262568b;

    @Inject
    public f(@k InterfaceC34581l interfaceC34581l) {
        this.f262568b = interfaceC34581l.getF263716j();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ParameterElement.v.b bVar = (ParameterElement.v.b) aVar;
        List<Cp0.e> list = bVar.f262862t;
        Iterator<Cp0.e> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (it.next().f2700e) {
                break;
            } else {
                i13++;
            }
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (i13 == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        List<Cp0.e> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new SegmentedControl.c(!r2.f2705j, ((Cp0.e) it2.next()).f2698c));
        }
        hVar.O00(iIntValue, arrayList);
        hVar.Bz(new e(bVar, this));
        hVar.setTitle(bVar.f262840c);
    }
}
