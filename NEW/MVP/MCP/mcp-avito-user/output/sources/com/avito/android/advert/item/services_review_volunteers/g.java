package com.avito.android.advert.item.services_review_volunteers;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesReviewVolunteersPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/services_review_volunteers/g;", "Lcom/avito/android/advert/item/services_review_volunteers/e;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public W0 f80009b;

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        ServicesReviewVolunteersItem servicesReviewVolunteersItem = (ServicesReviewVolunteersItem) aVar;
        cVar.setTitle(servicesReviewVolunteersItem.f79994g);
        cVar.f(servicesReviewVolunteersItem.f79995h);
        cVar.c1(servicesReviewVolunteersItem.f79996i.f79997b);
        cVar.a(new f(this, servicesReviewVolunteersItem));
    }

    @Override // com.avito.android.advert.item.services_review_volunteers.e
    public final void c0() {
        this.f80009b = null;
    }

    @Override // com.avito.android.advert.item.services_review_volunteers.e
    public final void t5(@k W0 w02) {
        this.f80009b = w02;
    }
}
