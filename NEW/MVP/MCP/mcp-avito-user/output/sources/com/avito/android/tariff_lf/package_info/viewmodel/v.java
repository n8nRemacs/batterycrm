package com.avito.android.tariff_lf.package_info.viewmodel;

import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: TariffPackageInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/viewmodel/v;", "Lcom/avito/android/tariff_lf/package_info/viewmodel/l;", "Landroidx/lifecycle/M0;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class v extends M0 implements l {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f299307E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f299308J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final a f299309K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final e f299310L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299311M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f299312N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public AtomicReference f299313O = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f299314P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f299315Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0<AttributedText> f299316R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f299317S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f299318T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f299319U;

    public v(@Y61.k String str, @Y61.k String str2, @Y61.k a aVar, @Y61.k e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f299307E = str;
        this.f299308J = str2;
        this.f299309K = aVar;
        this.f299310L = eVar;
        this.f299311M = interfaceC35745a5;
        this.f299312N = screenPerformanceTracker;
        C23038g0<List<com.avito.conveyor_item.a>> c23038g0 = new C23038g0<>();
        this.f299314P = c23038g0;
        C23038g0<P2<?>> c23038g02 = new C23038g0<>();
        this.f299315Q = c23038g02;
        C23038g0<AttributedText> c23038g03 = new C23038g0<>();
        this.f299316R = c23038g03;
        this.f299317S = c23038g0;
        this.f299318T = c23038g02;
        this.f299319U = c23038g03;
        ke();
    }

    @Override // com.avito.android.tariff_lf.package_info.viewmodel.l
    @Y61.k
    /* renamed from: Y, reason: from getter */
    public final C23038g0 getF299319U() {
        return this.f299319U;
    }

    @Override // com.avito.android.tariff_lf.package_info.viewmodel.l
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF299318T() {
        return this.f299318T;
    }

    @Override // com.avito.android.tariff_lf.package_info.viewmodel.l
    public final void h0() {
        ke();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ke() {
        ScreenPerformanceTracker.a.b(this.f299312N, null, 3);
        this.f299313O.dispose();
        this.f299313O = (AtomicReference) this.f299310L.a(this.f299308J, this.f299307E).r0(P2.c.f318721a).K(new o(this)).N(p.f299301b).d0(q.f299302b).K(new r(this)).d0(new s(this)).j0(this.f299311M.e()).v0(new t(this), new u(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff_lf.package_info.viewmodel.l
    /* renamed from: n0, reason: from getter */
    public final C23038g0 getF299317S() {
        return this.f299317S;
    }
}
