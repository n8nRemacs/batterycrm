package com.avito.android.beduin.common.component.real_estate_filter;

import android.content.Context;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinRealEstateFilterComponent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28803d f102322l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f102323m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C28803d c28803d, Context context) {
        super(0);
        this.f102322l = c28803d;
        this.f102323m = context;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C28803d c28803d = this.f102322l;
        s sVar = new s(this.f102323m, c28803d.f102290f.getFilters(), c28803d.f102295k, c28803d);
        c28803d.f102296l = sVar;
        com.avito.android.lib.util.g.a(sVar.f102339d);
        return G0.f406611a;
    }
}
