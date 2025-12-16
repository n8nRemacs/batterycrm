package com.avito.android.safedeal.delivery.order_cancellation.deeplink_handler;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryOrderCancelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f256128l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f256129m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, String str) {
        super(0);
        this.f256128l = dVar;
        this.f256129m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f256128l;
        z<TypedResult<G0>> zVarB = dVar.f256116k.b(this.f256129m);
        InterfaceC35745a5 interfaceC35745a5 = dVar.f256117l;
        dVar.f256121p.b(zVarB.x0(interfaceC35745a5.a()).d0(a.f256108b).m0(new b(dVar)).r0(P2.c.f318721a).j0(interfaceC35745a5.e()).t0(new c(dVar)));
        return G0.f406611a;
    }
}
