package com.avito.android.service_booking_common.link.cancel;

import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.service_booking_common.link.confirm.ServiceBookingOrderActionInteractor;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingCancelLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f276572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingCancelLink f276573m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ServiceBookingCancelLink serviceBookingCancelLink) {
        super(0);
        this.f276572l = dVar;
        this.f276573m = serviceBookingCancelLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f276572l;
        ServiceBookingOrderActionInteractor.Action action = ServiceBookingOrderActionInteractor.Action.f276598d;
        ServiceBookingCancelLink serviceBookingCancelLink = this.f276573m;
        z<P2<SimpleMessageResult>> zVarA = dVar.f276581k.a(action, serviceBookingCancelLink.f276569c, serviceBookingCancelLink.f276568b);
        InterfaceC35745a5 interfaceC35745a5 = dVar.f276577g;
        dVar.f276584n.b(zVarA.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new b(dVar), new c(dVar), io.reactivex.rxjava3.internal.functions.a.f401993c));
        return G0.f406611a;
    }
}
