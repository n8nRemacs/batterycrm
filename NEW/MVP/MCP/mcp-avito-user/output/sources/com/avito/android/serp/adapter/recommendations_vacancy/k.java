package com.avito.android.serp.adapter.recommendations_vacancy;

import Q81.a;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.KeyAttributes;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.SellerInfoInlineAdvantage;
import com.avito.android.remote.model.SellerOnlineStatus;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: RdsAdvertVacancyItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/recommendations_vacancy/k;", "Lcom/avito/android/serp/adapter/recommendations_vacancy/j;", "Lcom/avito/android/serp/c;", "Lru/avito/component/serp/job/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends com.avito.android.serp.c implements j, ru.avito.component.serp.job.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.avito.component.serp.job.e f270615b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f270616c;

    public k(@Y61.k View view) {
        super(view);
        this.f270615b = new ru.avito.component.serp.job.e(view, 0, false, null, 14, null);
    }

    @Override // ru.avito.component.serp.job.c
    public final void H0() {
        this.f270615b.H0();
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        ru.avito.component.serp.job.e eVar = this.f270615b;
        eVar.getClass();
        a.C0890a.a(eVar, z12);
    }

    @Override // ru.avito.component.serp.job.c
    public final void K0(@Y61.k String str, boolean z12) {
        this.f270615b.K0(str, z12);
    }

    @Override // ru.avito.component.serp.job.c
    public final void MU(@l KeyAttributes keyAttributes) {
        this.f270615b.MU(keyAttributes);
    }

    @Override // ru.avito.component.serp.job.c
    public final void Q50(@l com.avito.android.image_loader.a aVar) {
        this.f270615b.Q50(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void Vo(@l List<SellerInfoInlineAdvantage> list, @l String str, @l SellerOnlineStatus sellerOnlineStatus) {
        this.f270615b.Vo(list, str, sellerOnlineStatus);
    }

    @Override // ru.avito.component.serp.job.c
    public final void X50(@Y61.k Y41.a<G0> aVar) {
        this.f270615b.X50(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void b0(@l String str) {
        this.f270615b.b0(str);
    }

    @Override // ru.avito.component.serp.job.c
    public final void bk(@Y61.k ru.avito.component.serp.job.geo.a aVar) {
        this.f270615b.bk(aVar);
    }

    @Override // com.avito.android.serp.adapter.recommendations_vacancy.j
    public final void d(@l Y41.a<G0> aVar) {
        this.f270616c = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f270616c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void jb(boolean z12, boolean z13) {
        this.f270615b.jb(z12, false);
    }

    @Override // ru.avito.component.serp.job.c
    public final void l5(@Y61.k Y41.a<G0> aVar) {
        this.f270615b.l5(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void n1(@l List<SellerInfoAdvantage> list) {
        this.f270615b.n1(list);
    }

    @Override // ru.avito.component.serp.job.c
    public final void o5(@l SerpBadgeBar serpBadgeBar) {
        this.f270615b.o5(serpBadgeBar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void om(@Y61.k Y41.l<? super AdvertAction, G0> lVar) {
        this.f270615b.om(lVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void p(@l String str) {
        this.f270615b.p(str);
    }

    @Override // ru.avito.component.serp.job.c
    public final void qD(@l List<? extends AdvertAction> list, boolean z12) {
        this.f270615b.qD(list, false);
    }

    @Override // ru.avito.component.serp.job.c
    public final void setActive(boolean z12) {
        this.f270615b.setActive(z12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f270615b.setPhoneLoadingState(phoneLoadingState);
    }

    @Override // ru.avito.component.serp.job.c
    public final void setViewed(boolean z12) {
        this.f270615b.setViewed(z12);
    }
}
