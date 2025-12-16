package com.avito.android.mortgage.person_form.suggestion.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.api.model.items.form.SuggestFormSuggestType;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f201480a;

    /* renamed from: b, reason: collision with root package name */
    public final d f201481b;

    /* renamed from: c, reason: collision with root package name */
    public final k f201482c;

    /* renamed from: d, reason: collision with root package name */
    public final m f201483d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f201484e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f201485f;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider, dagger.internal.l lVar) {
        this.f201480a = fVar;
        this.f201481b = dVar;
        this.f201482c = kVar;
        this.f201483d = mVar;
        this.f201484e = provider;
        this.f201485f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f201480a.getClass();
        e eVar = new e();
        a aVar = (a) this.f201481b.get();
        this.f201482c.getClass();
        j jVar = new j();
        this.f201483d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f201484e.get();
        SuggestionArguments suggestionArguments = (SuggestionArguments) this.f201485f.f393949a;
        H00.c.f6913k.getClass();
        SuggestFormSuggestType suggestFormSuggestType = suggestionArguments.f201414f;
        return new h("Suggestion", new H00.c(suggestionArguments.f201410b, suggestionArguments.f201411c, suggestionArguments.f201412d, suggestionArguments.f201413e, suggestFormSuggestType, null, null, false), new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
