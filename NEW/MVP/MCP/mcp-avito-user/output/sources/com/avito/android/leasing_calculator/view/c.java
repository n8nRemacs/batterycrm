package com.avito.android.leasing_calculator.view;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LeasingApplicationPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f175136l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f175137m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, b bVar) {
        super(0);
        this.f175136l = str;
        this.f175137m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.advert.item.leasing_calculator.j jVar;
        String str = this.f175136l;
        if (str != null && (jVar = this.f175137m.f175132e) != null) {
            jVar.f77396a.f77367d.Q1(str);
        }
        return G0.f406611a;
    }
}
