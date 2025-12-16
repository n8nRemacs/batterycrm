package com.avito.android.comparison.domain;

import com.avito.android.comparison.remote.model.ComparisonItem;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.comparison.remote.model.ComparisonValue;
import com.avito.android.comparison.remote.model.OptionItem;
import com.avito.android.comparison.remote.model.SpecificationItem;
import com.avito.android.remote.model.TypedResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import l41.o;

/* compiled from: ComparisonInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comparison/remote/model/ComparisonResponse;", "it", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f123900b;

    public c(b bVar) {
        this.f123900b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String value;
        ComparisonResponse comparisonResponseA = (ComparisonResponse) obj;
        int i12 = b.f123897c;
        this.f123900b.getClass();
        if (comparisonResponseA.getItems().size() > 1) {
            List<SpecificationItem> listF = comparisonResponseA.f();
            ArrayList arrayList = new ArrayList(C42745f0.q(listF, 10));
            for (SpecificationItem specificationItem : listF) {
                List<OptionItem> listC = specificationItem.c();
                ArrayList arrayList2 = new ArrayList();
                for (T t12 : listC) {
                    OptionItem optionItem = (OptionItem) t12;
                    List<ComparisonItem> items = comparisonResponseA.getItems();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(items, 10));
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        ComparisonValue comparisonValue = ((ComparisonItem) it.next()).d().get(optionItem.getOptionId());
                        if (comparisonValue == null || (value = comparisonValue.getValue()) == null) {
                            value = "Unknown";
                        }
                        arrayList3.add(value);
                    }
                    if (C42745f0.P0(arrayList3).size() > 1) {
                        arrayList2.add(t12);
                    }
                }
                arrayList.add(SpecificationItem.a(specificationItem, arrayList2));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!((SpecificationItem) next).c().isEmpty()) {
                    arrayList4.add(next);
                }
            }
            comparisonResponseA = ComparisonResponse.a(comparisonResponseA, null, arrayList4, 23);
        }
        return new TypedResult.Success(comparisonResponseA);
    }
}
