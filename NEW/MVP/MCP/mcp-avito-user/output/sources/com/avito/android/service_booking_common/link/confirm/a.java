package com.avito.android.service_booking_common.link.confirm;

import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.service_booking_common.link.confirm.ServiceBookingOrderActionInteractor;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingConfirmLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f276602l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingConfirmLink f276603m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ServiceBookingConfirmLink serviceBookingConfirmLink) {
        super(0);
        this.f276602l = dVar;
        this.f276603m = serviceBookingConfirmLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f276602l;
        ServiceBookingOrderActionInteractor.Action action = ServiceBookingOrderActionInteractor.Action.f276597c;
        ServiceBookingConfirmLink serviceBookingConfirmLink = this.f276603m;
        z<P2<SimpleMessageResult>> zVarA = dVar.f276611k.a(action, serviceBookingConfirmLink.f276594c, serviceBookingConfirmLink.f276593b);
        InterfaceC35745a5 interfaceC35745a5 = dVar.f276607g;
        dVar.f276614n.b(zVarA.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new b(dVar), new c(dVar), io.reactivex.rxjava3.internal.functions.a.f401993c));
        return G0.f406611a;
    }
}
