package com.avito.android.stories.mvi;

import android.net.Uri;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.stories.StoriesArguments;
import com.avito.android.stories.mvi.entity.LoadState;
import com.avito.android.stories.mvi.entity.StoriesState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42784z0;

/* compiled from: StoriesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f285285a;

    /* renamed from: b, reason: collision with root package name */
    public final o f285286b;

    /* renamed from: c, reason: collision with root package name */
    public final q f285287c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f285288d;

    /* renamed from: e, reason: collision with root package name */
    public final m f285289e;

    public k(h hVar, o oVar, q qVar, Provider provider, m mVar) {
        this.f285285a = hVar;
        this.f285286b = oVar;
        this.f285287c = qVar;
        this.f285288d = provider;
        this.f285289e = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String queryParameter;
        a aVar = (a) this.f285285a.get();
        this.f285286b.getClass();
        n nVar = new n();
        this.f285287c.getClass();
        p pVar = new p();
        ScreenPerformanceTracker screenPerformanceTracker = this.f285288d.get();
        l lVar = (l) this.f285289e.get();
        StoriesState.f285262j.getClass();
        StoriesArguments storiesArguments = lVar.f285290a;
        String str = storiesArguments.f284988b;
        try {
            queryParameter = Uri.parse(str).getQueryParameter("selectedId");
        } catch (Exception unused) {
            queryParameter = null;
        }
        return new j("Stories", new StoriesState(str, queryParameter, storiesArguments.f284989c, C42784z0.f406748b, storiesArguments.f284991e, storiesArguments.f284992f, false, LoadState.f285239b), new i(aVar, screenPerformanceTracker, pVar, nVar));
    }
}
