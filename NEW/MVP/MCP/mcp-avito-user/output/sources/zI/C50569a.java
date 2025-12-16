package zi;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.image.c;
import com.avito.android.analytics.screens.tracker.C28493o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.tracker.fps.h;
import com.avito.android.analytics.screens.w;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinScreenTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi/a;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50569a implements ScreenPerformanceTracker {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final w f444172a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f444173b;

    @Inject
    public C50569a(@k w wVar, @k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f444172a = wVar;
        this.f444173b = screenPerformanceTracker;
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void A(@k String str, boolean z12) {
        this.f444173b.A(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void B(@k c cVar, @k InterfaceC22983P interfaceC22983P) {
        this.f444173b.B(cVar, interfaceC22983P);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void D(@k String str, boolean z12) {
        this.f444173b.D(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void E(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType, @k J j12, long j13) {
        this.f444173b.E(str, loadingType, j12, j13);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @l
    public final C34244a F(@k String str, @l AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a, boolean z12) {
        return this.f444173b.F(str, abstractC23662a, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void G(@l SerpResultCategoryDetails serpResultCategoryDetails) {
        this.f444173b.G(serpResultCategoryDetails);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @l
    public final Long H(@k String str) {
        return this.f444173b.H(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @k
    /* renamed from: O */
    public final String getF305951e() {
        return this.f444173b.getF305951e();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void P(@k String str, @k J j12, @l Integer num) {
        this.f444173b.P(str, j12, num);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void a(long j12) {
        this.f444173b.a(j12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void b(@k RecyclerView recyclerView) {
        this.f444173b.b(recyclerView);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void c(@k InterfaceC22983P interfaceC22983P, @k f.a aVar) {
        this.f444173b.c(interfaceC22983P, aVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void d() {
        this.f444173b.d();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void e() {
        this.f444173b.e();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void f() {
        this.f444173b.f();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void l() {
        this.f444173b.l();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void m(@k String str) {
        this.f444173b.m(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @k
    public final C28493o o(@l AbstractC23662a.b bVar) {
        return this.f444173b.o(bVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void p(@k h hVar) {
        this.f444173b.p(hVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void r(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType, @k J j12, @l Integer num) {
        this.f444173b.r(str, loadingType, j12, num);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void s(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType) {
        this.f444173b.s(str, loadingType);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void t(long j12) {
        this.f444173b.t(j12);
    }
}
