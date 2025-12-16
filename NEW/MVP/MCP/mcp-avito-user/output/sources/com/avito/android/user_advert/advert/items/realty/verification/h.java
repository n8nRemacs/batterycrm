package com.avito.android.user_advert.advert.items.realty.verification;

import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.h0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyVerificationItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/verification/h;", "Lcom/avito/android/user_advert/advert/items/realty/verification/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f309966b;

    @Inject
    public h() {
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (a) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.d
    public final void Y2(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309966b = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.realty.verification.d
    public final void c0() {
        this.f309966b = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        a aVar2 = (a) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof h0 : true) {
                obj = next;
            }
        }
        h0 h0Var = (h0) (obj instanceof h0 ? obj : null);
        if (h0Var != null) {
            jVar.setLoading(h0Var.f309482a);
        } else {
            k(jVar, aVar2);
        }
    }

    public final void k(@Y61.k j jVar, @Y61.k a aVar) {
        MyAdvertDetails.RealtyOwnerVerification realtyOwnerVerification = aVar.f309951d;
        jVar.rg(realtyOwnerVerification.getStatus(), new e(aVar, this));
        jVar.setLoading(aVar.f309952e);
        jVar.nA(realtyOwnerVerification.getStatus());
        jVar.Au(realtyOwnerVerification.getTitle(), realtyOwnerVerification.getStatus());
        jVar.g(realtyOwnerVerification.getDescription());
        jVar.DC(realtyOwnerVerification.getCadastralField(), new f(aVar, this));
        jVar.Le(realtyOwnerVerification.getAction(), realtyOwnerVerification.getStatus(), new g(aVar, this));
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309966b;
        if (myAdvertDetailsActivity != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.u7(aVar);
        }
    }
}
