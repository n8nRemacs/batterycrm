package com.avito.android.related_products.bottom_sheet;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.C28493o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import javax.inject.Inject;
import kotlin.Metadata;
import ux.InterfaceC49123a;

/* compiled from: RelatedProductsBottomSheetTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/l;", "Lcom/avito/android/related_products/bottom_sheet/k;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements k, ScreenPerformanceTracker {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f252906a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.w f252907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Screen f252908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.r f252909d;

    @Inject
    public l(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.analytics.screens.w wVar, @InterfaceC49123a @Y61.k Screen screen, @InterfaceC49123a @Y61.k com.avito.android.analytics.screens.r rVar) {
        this.f252906a = screenPerformanceTracker;
        this.f252907b = wVar;
        this.f252908c = screen;
        this.f252909d = rVar;
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void A(@Y61.k String str, boolean z12) {
        this.f252906a.A(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void B(@Y61.k com.avito.android.analytics.screens.image.c cVar, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f252906a.B(cVar, interfaceC22983P);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void D(@Y61.k String str, boolean z12) {
        this.f252906a.D(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void E(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k J j12, long j13) {
        this.f252906a.E(str, loadingType, j12, j13);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.l
    public final C34244a F(@Y61.k String str, @Y61.l AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a, boolean z12) {
        return this.f252906a.F(str, abstractC23662a, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void G(@Y61.l SerpResultCategoryDetails serpResultCategoryDetails) {
        this.f252906a.G(serpResultCategoryDetails);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.l
    public final Long H(@Y61.k String str) {
        return this.f252906a.H(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.k
    /* renamed from: O */
    public final String getF305951e() {
        return this.f252906a.getF305951e();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void P(@Y61.k String str, @Y61.k J j12, @Y61.l Integer num) {
        this.f252906a.P(str, j12, num);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void a(long j12) {
        this.f252906a.a(j12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void b(@Y61.k RecyclerView recyclerView) {
        this.f252906a.b(recyclerView);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void c(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k f.a aVar) {
        this.f252906a.c(interfaceC22983P, aVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void d() {
        this.f252906a.d();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void e() {
        this.f252906a.e();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void f() {
        this.f252906a.f();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void l() {
        this.f252906a.l();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void m(@Y61.k String str) {
        this.f252906a.m(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @Y61.k
    public final C28493o o(@Y61.l AbstractC23662a.b bVar) {
        return this.f252906a.o(bVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void p(@Y61.k com.avito.android.analytics.screens.tracker.fps.h hVar) {
        this.f252906a.p(hVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void r(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k J j12, @Y61.l Integer num) {
        this.f252906a.r(str, loadingType, j12, num);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void s(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType) {
        this.f252906a.s(str, loadingType);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void t(long j12) {
        this.f252906a.t(j12);
    }

    @Override // com.avito.android.related_products.bottom_sheet.k
    public final void x(@Y61.k ScreenTransfer screenTransfer) {
        this.f252907b.b(screenTransfer, this.f252908c, this.f252909d);
    }
}
