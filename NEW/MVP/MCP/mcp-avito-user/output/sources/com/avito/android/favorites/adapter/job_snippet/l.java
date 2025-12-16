package com.avito.android.favorites.adapter.job_snippet;

import Q81.a;
import android.view.View;
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

/* compiled from: FavoriteJobItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/job_snippet/l;", "LTV0/e;", "Lcom/avito/android/serp/c;", "Lru/avito/component/serp/job/c;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.android.serp.c implements TV0.e, ru.avito.component.serp.job.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f156636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ru.avito.component.serp.job.e f156637c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f156638d;

    public l(@Y61.k View view) {
        super(view);
        this.f156636b = view;
        this.f156637c = new ru.avito.component.serp.job.e(view, 0, false, null, 14, null);
    }

    @Override // ru.avito.component.serp.job.c
    public final void FO() {
        this.f156637c.FO();
    }

    @Override // ru.avito.component.serp.job.c
    public final void H0() {
        this.f156637c.H0();
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        ru.avito.component.serp.job.e eVar = this.f156637c;
        eVar.getClass();
        a.C0890a.a(eVar, z12);
    }

    @Override // ru.avito.component.serp.job.c
    public final void K0(@Y61.k String str, boolean z12) {
        this.f156637c.K0(str, false);
    }

    @Override // ru.avito.component.serp.job.c
    public final void MU(@Y61.l KeyAttributes keyAttributes) {
        this.f156637c.MU(keyAttributes);
    }

    @Override // ru.avito.component.serp.job.c
    public final void Q50(@Y61.l com.avito.android.image_loader.a aVar) {
        this.f156637c.Q50(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void Vo(@Y61.l List<SellerInfoInlineAdvantage> list, @Y61.l String str, @Y61.l SellerOnlineStatus sellerOnlineStatus) {
        this.f156637c.Vo(list, str, sellerOnlineStatus);
    }

    @Override // ru.avito.component.serp.job.c
    public final void X50(@Y61.k Y41.a<G0> aVar) {
        this.f156637c.X50(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void b0(@Y61.l String str) {
        this.f156637c.b0(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f156638d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // ru.avito.component.serp.job.c
    public final void jb(boolean z12, boolean z13) {
        this.f156637c.jb(z12, false);
    }

    @Override // ru.avito.component.serp.job.c
    public final void l5(@Y61.k Y41.a<G0> aVar) {
        this.f156637c.l5(aVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void lo(@Y61.k ru.avito.component.serp.job.geo.g gVar) {
        this.f156637c.lo(gVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void n1(@Y61.l List<SellerInfoAdvantage> list) {
        this.f156637c.n1(list);
    }

    @Override // ru.avito.component.serp.job.c
    public final void o5(@Y61.l SerpBadgeBar serpBadgeBar) {
        this.f156637c.o5(serpBadgeBar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void om(@Y61.k Y41.l<? super AdvertAction, G0> lVar) {
        this.f156637c.om(lVar);
    }

    @Override // ru.avito.component.serp.job.c
    public final void p(@Y61.l String str) {
        this.f156637c.p(str);
    }

    @Override // ru.avito.component.serp.job.c
    public final void qD(@Y61.l List<? extends AdvertAction> list, boolean z12) {
        this.f156637c.qD(list, false);
    }

    @Override // ru.avito.component.serp.job.c
    public final void setActive(boolean z12) {
        this.f156637c.setActive(z12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f156637c.setPhoneLoadingState(phoneLoadingState);
    }

    @Override // ru.avito.component.serp.job.c
    public final void setViewed(boolean z12) {
        this.f156637c.setViewed(z12);
    }
}
