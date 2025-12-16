package com.avito.android.profile.user_profile.cards.service_booking.items.order;

import Y61.k;
import com.avito.android.profile.user_profile.cards.service_booking.items.d;
import com.avito.android.profile.user_profile.cards.service_booking.items.n;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.L3;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ServiceBookingItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/order/f;", "Lcom/avito/android/profile/user_profile/cards/service_booking/items/order/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n f225468b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f225469c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f225470d;

    @Inject
    public f(@k n nVar) {
        this.f225468b = nVar;
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f225469c = e2VarB;
        this.f225470d = e2VarB;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (ServiceBookingItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        ServiceBookingItem serviceBookingItem = (ServiceBookingItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d.b) {
                obj = obj2;
            }
        }
        d.b bVar = (d.b) (obj instanceof d.b ? obj : null);
        if (bVar == null) {
            k(hVar, serviceBookingItem);
            return;
        }
        L3<String> l32 = bVar.f225417a;
        if (l32.f318649a) {
            hVar.setTitle(l32.f318650b);
        }
        L3<String> l33 = bVar.f225418b;
        if (l33.f318649a) {
            hVar.f(l33.f318650b);
        }
        L3<AttributedText> l34 = bVar.f225419c;
        if (l34.f318649a) {
            hVar.nT(l34.f318650b);
        }
        if (bVar.f225420d.f318649a) {
            hVar.kv(serviceBookingItem.f225458f, this.f225468b.a(hVar.getContext()));
        }
        if (bVar.f225421e.f318649a) {
            hVar.a(new e(serviceBookingItem, this));
        }
    }

    public final void k(@k h hVar, @k ServiceBookingItem serviceBookingItem) {
        hVar.setTitle(serviceBookingItem.f225455c);
        hVar.f(serviceBookingItem.f225456d);
        hVar.nT(serviceBookingItem.f225457e);
        hVar.kv(serviceBookingItem.f225458f, this.f225468b.a(hVar.getContext()));
        hVar.a(new d(serviceBookingItem, this));
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.order.c
    /* renamed from: u, reason: from getter */
    public final e2 getF225470d() {
        return this.f225470d;
    }
}
