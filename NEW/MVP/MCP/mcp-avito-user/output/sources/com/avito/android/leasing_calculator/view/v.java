package com.avito.android.leasing_calculator.view;

import com.avito.android.leasing_calculator.analytics.events.ApplicationFormOpenSource;
import com.avito.android.remote.model.LeasingCalculator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LeasingInfoPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/leasing_calculator/view/v;", "Lcom/avito/android/leasing_calculator/view/u;", "<init>", "()V", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.leasing_calculator.k f175172a;

    /* compiled from: LeasingInfoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.advert.item.leasing_calculator.k kVar = v.this.f175172a;
            if (kVar != null) {
                kVar.f77398a.a(false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LeasingInfoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.advert.item.leasing_calculator.k kVar = v.this.f175172a;
            if (kVar != null) {
                com.avito.android.advert.item.leasing_calculator.f.k(kVar.f77399b, kVar.f77400c, ApplicationFormOpenSource.f175091d);
                kVar.f77398a.a(true);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public v() {
    }

    @Override // com.avito.android.leasing_calculator.view.u
    public final void a() {
        this.f175172a = null;
    }

    @Override // com.avito.android.leasing_calculator.view.u
    public final void b(@Y61.k x xVar, @Y61.k LeasingCalculator.LeasingInfo.InfoModal infoModal) {
        xVar.y4(infoModal.getBlocks());
        xVar.a(infoModal.getCloseButton(), new a());
        xVar.b7(infoModal.getToApplicationButton(), new b());
    }

    @Override // com.avito.android.leasing_calculator.view.u
    public final void c(@Y61.k com.avito.android.advert.item.leasing_calculator.k kVar) {
        this.f175172a = kVar;
    }
}
