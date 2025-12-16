package kI0;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkI0/b;", "LkI0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kI0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42586b implements InterfaceC42585a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f406225a;

    @Inject
    public C42586b(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f406225a = screenPerformanceTracker;
    }

    @Override // kI0.InterfaceC42585a
    public final void A(@k Throwable th2) {
        ScreenPerformanceTracker.a.c(this.f406225a, "reload-advertisement", new J.a(th2), null, 4);
    }

    @Override // kI0.InterfaceC42585a
    public final void C() {
        this.f406225a.m("deactivate-advertisement");
    }

    @Override // kI0.InterfaceC42585a
    public final void D() {
        this.f406225a.m("restore-advertisement");
    }

    @Override // kI0.InterfaceC42585a
    public final void E(@k ApiError apiError) {
        ScreenPerformanceTracker.a.c(this.f406225a, "delete-advertisement", new J.a(apiError), null, 4);
    }

    @Override // kI0.InterfaceC42585a
    public final void G() {
        ScreenPerformanceTracker.a.c(this.f406225a, "delete-advertisement", null, null, 6);
    }

    @Override // kI0.InterfaceC42585a
    public final void H() {
        ScreenPerformanceTracker.a.b(this.f406225a, "activate-advertisement", 2);
    }

    @Override // kI0.InterfaceC42585a
    public final void I(@k ApiError apiError) {
        ScreenPerformanceTracker.a.c(this.f406225a, "deactivate-advertisement", new J.a(apiError), null, 4);
    }

    @Override // pj.InterfaceC47100c
    public final void J(@k String str, @k J j12) {
        ScreenPerformanceTracker.a.d(this.f406225a, str, null, j12, null, 10);
    }

    @Override // kI0.InterfaceC42585a
    public final void K(@l ApiError apiError) {
        J.a.f90383b.getClass();
        ScreenPerformanceTracker.a.c(this.f406225a, "restore-advertisement", J.a.C2676a.b(apiError), null, 4);
    }

    @Override // kI0.InterfaceC42585a
    public final void L() {
        ScreenPerformanceTracker.a.d(this.f406225a, "restore-advertisement", null, null, null, 14);
    }

    @Override // kI0.InterfaceC42585a
    public final void M() {
        ScreenPerformanceTracker.a.c(this.f406225a, "deactivate-advertisement", null, null, 6);
    }

    @Override // kI0.InterfaceC42585a
    public final void O(@k ApiError apiError) {
        ScreenPerformanceTracker.a.d(this.f406225a, "delete-advertisement", null, new J.a(apiError), null, 10);
    }

    @Override // kI0.InterfaceC42585a
    public final void P() {
        ScreenPerformanceTracker.a.d(this.f406225a, "delete-advertisement", null, null, null, 14);
    }

    @Override // kI0.InterfaceC42585a
    public final void Q() {
        ScreenPerformanceTracker.a.c(this.f406225a, "restore-advertisement", null, null, 6);
    }

    @Override // kI0.InterfaceC42585a
    public final void R() {
        this.f406225a.m("activate-advertisement");
    }

    @Override // kI0.InterfaceC42585a
    public final void S() {
        ScreenPerformanceTracker.a.b(this.f406225a, "delete-advertisement", 2);
    }

    @Override // kI0.InterfaceC42585a
    public final void a(long j12) {
        this.f406225a.a(j12);
    }

    @Override // kI0.InterfaceC42585a
    public final void b(@k RecyclerView recyclerView) {
        this.f406225a.b(recyclerView);
    }

    @Override // kI0.InterfaceC42585a
    public final void c() {
        ScreenPerformanceTracker.a.d(this.f406225a, "deactivate-advertisement", null, null, null, 14);
    }

    @Override // kI0.InterfaceC42585a
    public final void d() {
        this.f406225a.d();
    }

    @Override // kI0.InterfaceC42585a
    public final void e() {
        this.f406225a.e();
    }

    @Override // kI0.InterfaceC42585a
    public final void f() {
        ScreenPerformanceTracker.a.c(this.f406225a, "activate-advertisement", J.b.f90385a, null, 4);
    }

    @Override // pj.InterfaceC47100c
    public final void h(@k String str) {
        ScreenPerformanceTracker.a.b(this.f406225a, str, 2);
    }

    @Override // kI0.InterfaceC42585a
    public final void i() {
        ScreenPerformanceTracker.a.b(this.f406225a, "restore-advertisement", 2);
    }

    @Override // kI0.InterfaceC42585a
    public final void j() {
        this.f406225a.m("delete-advertisement");
    }

    @Override // kI0.InterfaceC42585a
    public final void k() {
        ScreenPerformanceTracker.a.c(this.f406225a, "reload-advertisement", null, null, 6);
    }

    @Override // kI0.InterfaceC42585a
    public final void l() {
        ScreenPerformanceTracker.a.d(this.f406225a, "reload-advertisement", null, null, null, 14);
    }

    @Override // kI0.InterfaceC42585a
    public final void n(@k Throwable th2) {
        ScreenPerformanceTracker.a.d(this.f406225a, "reload-advertisement", null, new J.a(th2), null, 10);
    }

    @Override // kI0.InterfaceC42585a
    public final void o(@k ApiError apiError) {
        ScreenPerformanceTracker.a.d(this.f406225a, "activate-advertisement", null, new J.a(apiError), null, 10);
    }

    @Override // kI0.InterfaceC42585a
    public final void q() {
        ScreenPerformanceTracker.a.b(this.f406225a, "deactivate-advertisement", 2);
    }

    @Override // kI0.InterfaceC42585a
    public final void s(@k ApiError apiError) {
        ScreenPerformanceTracker.a.c(this.f406225a, "activate-advertisement", new J.a(apiError), null, 4);
    }

    @Override // kI0.InterfaceC42585a
    public final void t() {
        this.f406225a.m("reload-advertisement");
    }

    @Override // kI0.InterfaceC42585a
    public final void u(@k ApiError apiError) {
        ScreenPerformanceTracker.a.d(this.f406225a, "deactivate-advertisement", null, new J.a(apiError), null, 10);
    }

    @Override // kI0.InterfaceC42585a
    public final void w(@k MyAdvertDetailsActivity myAdvertDetailsActivity, @k f.a aVar) {
        this.f406225a.c(myAdvertDetailsActivity, aVar);
    }

    @Override // kI0.InterfaceC42585a
    public final void x() {
        ScreenPerformanceTracker.a.b(this.f406225a, "reload-advertisement", 2);
    }

    @Override // kI0.InterfaceC42585a
    public final void y(@l ApiError apiError) {
        J.a.f90383b.getClass();
        ScreenPerformanceTracker.a.d(this.f406225a, "restore-advertisement", null, J.a.C2676a.b(apiError), null, 10);
    }

    @Override // kI0.InterfaceC42585a
    public final void z() {
        ScreenPerformanceTracker.a.d(this.f406225a, "activate-advertisement", null, null, null, 14);
    }
}
