package Pd0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.memory.consumption.f;
import com.avito.android.publish.view.ItemDetailsBaseFragment;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDetailsTracker.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"LPd0/w;", "LPd0/v;", "LPd0/a;", "LPd0/o;", "LPd0/d;", "LPd0/g;", "LPd0/l;", "LPd0/y;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w implements v, InterfaceC14770a, o, InterfaceC14773d, g, l, y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f13176a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.w f13177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C14771b f13178c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f13179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C14774e f13180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f13181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f13182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f13183h;

    @Inject
    public w(@Y61.k com.avito.android.analytics.screens.w wVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f13176a = screenPerformanceTracker;
        this.f13177b = wVar;
        this.f13178c = new C14771b(screenPerformanceTracker);
        this.f13179d = new p(screenPerformanceTracker);
        this.f13180e = new C14774e(screenPerformanceTracker);
        this.f13181f = new h(screenPerformanceTracker);
        this.f13182g = new m(screenPerformanceTracker);
        this.f13183h = new z(screenPerformanceTracker);
    }

    @Override // Pd0.InterfaceC14770a
    public final void A(@Y61.k ApiError apiError) {
        this.f13178c.A(apiError);
    }

    @Override // Pd0.InterfaceC14773d
    public final void B() {
        this.f13180e.B();
    }

    @Override // Pd0.o
    public final void C(@Y61.k Throwable th2) {
        this.f13179d.C(th2);
    }

    @Override // Pd0.InterfaceC14770a
    public final void D() {
        this.f13178c.D();
    }

    @Override // Pd0.v
    public final void a(long j12) {
        this.f13176a.a(j12);
    }

    @Override // Pd0.v
    public final void b(@Y61.k ScreenTransfer screenTransfer, @Y61.k Screen screen, @Y61.k com.avito.android.analytics.screens.r rVar) {
        this.f13177b.b(screenTransfer, screen, rVar);
    }

    @Override // Pd0.y
    public final void c() {
        this.f13183h.c();
    }

    @Override // Pd0.v
    public final void d() {
        this.f13176a.d();
    }

    @Override // Pd0.v
    public final void e() {
        this.f13176a.e();
    }

    @Override // Pd0.v
    public final void f() {
        ScreenPerformanceTracker.a.c(this.f13176a, AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, null, null, 6);
    }

    @Override // Pd0.v
    public final void g() {
        this.f13176a.m(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS);
    }

    @Override // Pd0.o
    public final void h() {
        this.f13179d.h();
    }

    @Override // Pd0.InterfaceC14773d
    public final void i() {
        this.f13180e.i();
    }

    @Override // Pd0.g
    public final void j() {
        this.f13181f.j();
    }

    @Override // Pd0.v
    public final void k() {
        this.f13176a.m("parameter_update");
    }

    @Override // Pd0.InterfaceC14773d
    public final void l() {
        this.f13180e.l();
    }

    @Override // Pd0.o
    public final void m() {
        this.f13179d.m();
    }

    @Override // Pd0.o
    public final void n() {
        this.f13179d.n();
    }

    @Override // Pd0.InterfaceC14770a
    public final void o() {
        this.f13178c.o();
    }

    @Override // Pd0.InterfaceC14773d
    public final void p() {
        this.f13180e.p();
    }

    @Override // Pd0.l
    public final void q() {
        this.f13182g.q();
    }

    @Override // Pd0.g
    public final void r() {
        this.f13181f.r();
    }

    @Override // Pd0.o
    public final void s() {
        this.f13179d.s();
    }

    @Override // Pd0.l
    public final void t() {
        this.f13182g.t();
    }

    @Override // Pd0.v
    public final void u(@Y61.k f.a aVar, @Y61.k ItemDetailsBaseFragment itemDetailsBaseFragment) {
        this.f13176a.c(itemDetailsBaseFragment, aVar);
    }

    @Override // Pd0.InterfaceC14770a
    public final void v() {
        this.f13178c.v();
    }

    @Override // Pd0.y
    public final void w() {
        this.f13183h.w();
    }

    @Override // Pd0.InterfaceC14770a
    public final void x() {
        this.f13178c.x();
    }

    @Override // Pd0.v
    public final void y() {
        ScreenPerformanceTracker.a.c(this.f13176a, "parameter_update", null, null, 6);
    }

    @Override // Pd0.InterfaceC14773d
    public final void z(@Y61.k Throwable th2) {
        this.f13180e.z(th2);
    }
}
