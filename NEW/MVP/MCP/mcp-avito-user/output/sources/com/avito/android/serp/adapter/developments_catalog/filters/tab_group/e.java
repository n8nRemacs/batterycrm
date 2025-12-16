package com.avito.android.serp.adapter.developments_catalog.filters.tab_group;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: FiltersTabGroupPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f269864l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<Integer, G0> f269865m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(l0.f fVar, l<? super Integer, G0> lVar) {
        super(1);
        this.f269864l = fVar;
        this.f269865m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        l0.f fVar = this.f269864l;
        if (fVar.f406840b != iIntValue) {
            this.f269865m.invoke(Integer.valueOf(iIntValue));
            fVar.f406840b = iIntValue;
        }
        return G0.f406611a;
    }
}
