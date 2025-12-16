package com.avito.android.advert.deeplinks.delivery;

import com.avito.android.deep_linking.links.RequestDeliveryLink;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RequestDeliveryDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f68924l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RequestDeliveryLink f68925m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, RequestDeliveryLink requestDeliveryLink) {
        super(0);
        this.f68924l = aVar;
        this.f68925m = requestDeliveryLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f68924l;
        G gA2 = aVar.f68916q.a();
        InterfaceC35745a5 interfaceC35745a5 = aVar.f68912m;
        aVar.f68918s.b(gA2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new c(aVar, this.f68925m), new d(aVar)));
        return G0.f406611a;
    }
}
