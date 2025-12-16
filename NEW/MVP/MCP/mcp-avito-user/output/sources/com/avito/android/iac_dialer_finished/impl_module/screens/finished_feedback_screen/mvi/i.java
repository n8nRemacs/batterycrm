package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenState;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenArgument;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedFeedbackScreenFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final d f166692a;

    /* renamed from: b, reason: collision with root package name */
    public final f f166693b;

    /* renamed from: c, reason: collision with root package name */
    public final k f166694c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f166695d;

    /* renamed from: e, reason: collision with root package name */
    public final l f166696e;

    public i(d dVar, f fVar, k kVar, Provider provider, l lVar) {
        this.f166692a = dVar;
        this.f166693b = fVar;
        this.f166694c = kVar;
        this.f166695d = provider;
        this.f166696e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f166692a.get();
        this.f166693b.getClass();
        e eVar = new e();
        this.f166694c.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f166695d.get();
        IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument = (IacFinishedFeedbackScreenArgument) this.f166696e.f393949a;
        IacFinishedFeedbackScreenState.INSTANCE.getClass();
        return new h("IacFinishedFeedbackScreen", new IacFinishedFeedbackScreenState(null, true, null, iacFinishedFeedbackScreenArgument), new g(cVar, screenPerformanceTracker, jVar, eVar));
    }
}
