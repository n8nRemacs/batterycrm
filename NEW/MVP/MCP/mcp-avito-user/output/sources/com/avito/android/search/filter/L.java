package com.avito.android.search.filter;

import com.avito.android.location.find.DetectLocationInteractor;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class L<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261873b;

    public L(E e12) {
        this.f261873b = e12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SelectParameter.Value value;
        String id2;
        Throwable th2 = (Throwable) obj;
        boolean z12 = th2 instanceof DetectLocationInteractor.LocationDisabledException;
        E e12 = this.f261873b;
        if (z12) {
            ParametersTreeWithAdditional parametersTreeWithAdditional = e12.f261753B;
            ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(SearchParamsConverterKt.SORT) : null;
            SelectParameter.Flat flat = parameterSlotFindParameter instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlotFindParameter : null;
            if (flat != null && (value = (SelectParameter.Value) C42745f0.G(flat.getValues())) != null && (id2 = value.getId()) != null) {
                flat.setValue(id2);
            }
        }
        e12.f261782s.f(null, th2.getMessage());
        V2.f318762a.f(th2);
    }
}
