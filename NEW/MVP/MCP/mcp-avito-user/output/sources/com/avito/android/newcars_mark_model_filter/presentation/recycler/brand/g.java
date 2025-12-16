package com.avito.android.newcars_mark_model_filter.presentation.recycler.brand;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: BrandOptionItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/brand/g;", "Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/brand/e;", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<Long> f207376b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n2<Long> f207377c;

    @Inject
    public g() {
        Z1<Long> z1A = p2.a(null);
        this.f207376b = z1A;
        this.f207377c = z1A;
    }

    @Override // com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.e
    @Y61.k
    public final n2<Long> N0() {
        return this.f207377c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((i) eVar).DG((b) aVar, new f(1, this, g.class, "changeSelectedValue", "changeSelectedValue(J)V", 0));
    }
}
