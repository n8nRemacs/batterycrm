package com.avito.android.search.filter;

import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$k;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/filter/converter/ParameterElement$k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34605x0 extends kotlin.jvm.internal.N implements Y41.l<ParameterElement.k, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263812l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34605x0(C34574h0 c34574h0) {
        super(1);
        this.f263812l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ParameterElement.k kVar) {
        List<IntParameter> list = kVar.f262769h;
        this.f263812l.n(((IntParameter) C42745f0.E(list)).getId(), list.get(1).getId());
        return kotlin.G0.f406611a;
    }
}
