package Lw0;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.C28493o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.tracker.fps.h;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SimilarAdvertsListScreenPerformanceTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LLw0/c;", "LLw0/b;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements InterfaceC14445b, ScreenPerformanceTracker {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f10280a;

    @Inject
    public c(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f10280a = screenPerformanceTracker;
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void A(@k String str, boolean z12) {
        this.f10280a.A(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void B(@k com.avito.android.analytics.screens.image.c cVar, @k InterfaceC22983P interfaceC22983P) {
        this.f10280a.B(cVar, interfaceC22983P);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void D(@k String str, boolean z12) {
        this.f10280a.D(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void E(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType, @k J j12, long j13) {
        this.f10280a.E(str, loadingType, j12, j13);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @l
    public final C34244a F(@k String str, @l AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a, boolean z12) {
        return this.f10280a.F(str, abstractC23662a, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void G(@l SerpResultCategoryDetails serpResultCategoryDetails) {
        this.f10280a.G(serpResultCategoryDetails);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @l
    public final Long H(@k String str) {
        return this.f10280a.H(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @k
    /* renamed from: O */
    public final String getF90716d() {
        return this.f10280a.getF90716d();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void P(@k String str, @k J j12, @l Integer num) {
        this.f10280a.P(str, j12, num);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void a(long j12) {
        this.f10280a.a(j12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void b(@k RecyclerView recyclerView) {
        this.f10280a.b(recyclerView);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void c(@k InterfaceC22983P interfaceC22983P, @k f.a aVar) {
        this.f10280a.c(interfaceC22983P, aVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void d() {
        this.f10280a.d();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void e() {
        this.f10280a.e();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void f() {
        this.f10280a.f();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void l() {
        this.f10280a.l();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void m(@k String str) {
        this.f10280a.m(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @k
    public final C28493o o(@l AbstractC23662a.b bVar) {
        return this.f10280a.o(bVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void p(@k h hVar) {
        this.f10280a.p(hVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void r(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType, @k J j12, @l Integer num) {
        this.f10280a.r(str, loadingType, j12, num);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void s(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType) {
        this.f10280a.s(str, loadingType);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void t(long j12) {
        this.f10280a.t(j12);
    }
}
