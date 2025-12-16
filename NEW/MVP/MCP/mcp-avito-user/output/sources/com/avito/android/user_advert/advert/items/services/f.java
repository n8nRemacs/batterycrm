package com.avito.android.user_advert.advert.items.services;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Service;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServicesItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/services/f;", "Lcom/avito/android/user_advert/advert/items/services/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f310226b;

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.jh(aVar2.f310217c);
        List<Service> list = aVar2.f310218d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            Service service = (Service) obj;
            arrayList.add(new Q(i13 + '_' + service.getId(), com.avito.android.image_loader.b.b(service.getIcon())));
            i13 = i14;
        }
        hVar.BO(P0.p(arrayList));
        hVar.X(new e(this, aVar2));
    }

    @Override // com.avito.android.user_advert.advert.items.services.d
    public final void T5(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310226b = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.services.d
    public final void c0() {
        this.f310226b = null;
    }
}
