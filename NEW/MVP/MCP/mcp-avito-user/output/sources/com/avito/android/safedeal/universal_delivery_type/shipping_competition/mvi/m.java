package com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi;

import Vn0.C15698d;
import Vn0.InterfaceC15696b;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeShippingCompetitionReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "LVn0/b;", "LVn0/d;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements u<InterfaceC15696b, C15698d> {
    @Inject
    public m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C15698d a(InterfaceC15696b interfaceC15696b, C15698d c15698d) {
        InterfaceC15696b interfaceC15696b2 = interfaceC15696b;
        C15698d c15698d2 = c15698d;
        if (interfaceC15696b2 instanceof InterfaceC15696b.a) {
            k kVar = new k(interfaceC15696b2);
            C15698d.a aVar = c15698d2.f17378a;
            return aVar instanceof C15698d.a.C1198a ? new C15698d((C15698d.a) kVar.invoke(aVar)) : c15698d2;
        }
        if (interfaceC15696b2 instanceof InterfaceC15696b.c) {
            l lVar = new l(interfaceC15696b2);
            C15698d.a aVar2 = c15698d2.f17378a;
            return aVar2 instanceof C15698d.a.C1198a ? new C15698d((C15698d.a) lVar.invoke(aVar2)) : c15698d2;
        }
        if (!(interfaceC15696b2 instanceof InterfaceC15696b.d)) {
            return interfaceC15696b2.equals(InterfaceC15696b.e.f17374a) ? new C15698d(C15698d.a.b.f17382a) : c15698d2;
        }
        InterfaceC15696b.d dVar = (InterfaceC15696b.d) interfaceC15696b2;
        return new C15698d(new C15698d.a.C1198a(dVar.f17372a, dVar.f17373b, false));
    }
}
