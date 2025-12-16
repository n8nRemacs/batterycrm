package com.avito.android.vas_planning_feedback;

import Y61.k;
import androidx.view.M0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VasPlanningFeedbackViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_feedback/e;", "Landroidx/lifecycle/M0;", "LSK0/d;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends M0 implements SK0.d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f323053E;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final Object f323055K;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final b f323054J = new b();

    /* renamed from: L, reason: collision with root package name */
    @k
    public final D<G0> f323056L = new D<>();

    /* renamed from: M, reason: collision with root package name */
    @k
    public final D<SK0.c> f323057M = new D<>();

    public e(@k InterfaceC35745a5 interfaceC35745a5) {
        this.f323053E = interfaceC35745a5;
        this.f323055K = EmptyDisposable.f401988b;
        this.f323055K = I.C(150L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).s(interfaceC35745a5.e()).x(new c(this), new d(this));
    }

    @Override // SK0.d
    public final void Od(@k String str) {
        this.f323054J.getClass();
        if (str.equals("st_vas_planner_uxf")) {
            this.f323056L.postValue(G0.f406611a);
        }
    }

    @Override // SK0.d
    public final void ha(@k String str) {
        this.f323054J.getClass();
        if (str.equals("st_vas_planner_uxf")) {
            this.f323056L.postValue(G0.f406611a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f323055K.dispose();
    }

    @Override // SK0.d
    public final void W2(@k String str) {
    }

    @Override // SK0.d
    public final void v5(@k String str) {
    }
}
