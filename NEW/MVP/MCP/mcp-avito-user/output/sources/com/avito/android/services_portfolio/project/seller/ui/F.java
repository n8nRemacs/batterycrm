package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kv0.InterfaceC43503b;

/* compiled from: PortfolioProjectSellerScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class F extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f280293l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f280294m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC43503b, G0> f280295n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(T t12, InterfaceC22204y1<Boolean> interfaceC22204y1, Y41.l<? super InterfaceC43503b, G0> lVar) {
        super(0);
        this.f280293l = t12;
        this.f280294m = interfaceC22204y1;
        this.f280295n = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Boolean bool = Boolean.TRUE;
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f280294m;
        interfaceC22204y1.setValue(bool);
        C43259k.d(this.f280293l, null, null, new E(this.f280295n, interfaceC22204y1, null), 3);
        return G0.f406611a;
    }
}
