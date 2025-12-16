package com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info;

import Y61.k;
import com.avito.android.profile.user_profile.cards.service_booking.items.d;
import com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.ServiceBookingsDetailedInfoItem;
import com.avito.android.util.L3;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ServiceBookingsDetailedInfoItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/detailed_info/f;", "Lcom/avito/android/profile/user_profile/cards/service_booking/items/detailed_info/c;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f225436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f225437c;

    @Inject
    public f() {
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f225436b = e2VarB;
        this.f225437c = e2VarB;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (ServiceBookingsDetailedInfoItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        ServiceBookingsDetailedInfoItem serviceBookingsDetailedInfoItem = (ServiceBookingsDetailedInfoItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d.a) {
                obj = obj2;
            }
        }
        if (!(obj instanceof d.a)) {
            obj = null;
        }
        d.a aVar2 = (d.a) obj;
        if (aVar2 == null) {
            k(hVar, serviceBookingsDetailedInfoItem);
            return;
        }
        L3<String> l32 = aVar2.f225414a;
        if (l32.f318649a) {
            hVar.setTitle(l32.f318650b);
        }
        if (aVar2.f225415b.f318649a) {
            hVar.a(new e(serviceBookingsDetailedInfoItem, this));
        }
        L3<ServiceBookingsDetailedInfoItem.Icon> l33 = aVar2.f225416c;
        if (l33.f318649a) {
            ServiceBookingsDetailedInfoItem.Icon icon = l33.f318650b;
            hVar.a3(icon != null ? icon.f225426b : null, icon != null ? icon.f225427c : null);
        }
    }

    public final void k(@k h hVar, @k ServiceBookingsDetailedInfoItem serviceBookingsDetailedInfoItem) {
        hVar.setTitle(serviceBookingsDetailedInfoItem.f225423c);
        ServiceBookingsDetailedInfoItem.Icon icon = serviceBookingsDetailedInfoItem.f225425e;
        hVar.a3(icon != null ? icon.f225426b : null, icon != null ? icon.f225427c : null);
        hVar.a(new d(serviceBookingsDetailedInfoItem, this));
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.c
    /* renamed from: u, reason: from getter */
    public final e2 getF225437c() {
        return this.f225437c;
    }
}
