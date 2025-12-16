package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: PortfolioProjectSellerScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f280288l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f280289m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f280290n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(T t12, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
        super(0);
        this.f280288l = t12;
        this.f280289m = interfaceC22204y1;
        this.f280290n = interfaceC22204y12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Boolean bool = Boolean.TRUE;
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f280289m;
        interfaceC22204y1.setValue(bool);
        C43259k.d(this.f280288l, null, null, new C(this.f280290n, interfaceC22204y1, null), 3);
        return G0.f406611a;
    }
}
