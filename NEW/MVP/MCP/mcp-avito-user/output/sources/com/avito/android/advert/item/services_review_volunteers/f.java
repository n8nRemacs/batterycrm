package com.avito.android.advert.item.services_review_volunteers;

import com.avito.android.advert.item.W0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServicesReviewVolunteersPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f80007l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServicesReviewVolunteersItem f80008m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ServicesReviewVolunteersItem servicesReviewVolunteersItem) {
        super(0);
        this.f80007l = gVar;
        this.f80008m = servicesReviewVolunteersItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        W0 w02 = this.f80007l.f80009b;
        if (w02 != null) {
            w02.q(this.f80008m.f79996i.f79998c);
        }
        return G0.f406611a;
    }
}
