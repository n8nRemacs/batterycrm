package com.avito.android.vas_performance.screens.applied_services.ui.compose;

import IL0.a;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IL0.a, G0> f320344l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesState.Section.Item f320345m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Y41.l<? super IL0.a, G0> lVar, AppliedServicesState.Section.Item item) {
        super(0);
        this.f320344l = lVar;
        this.f320345m = item;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f320344l.invoke(new a.C0460a(this.f320345m.f320297g.f320309b));
        return G0.f406611a;
    }
}
