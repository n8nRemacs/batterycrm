package com.avito.android.publish.vinsuggest;

import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import dl0.InterfaceC39749a;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: VinSuggestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PublishParametersInteractor> f245759a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f245760b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC39749a> f245761c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f245762d;

    /* renamed from: e, reason: collision with root package name */
    public final l f245763e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<PublishDraftRepository> f245764f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f245765g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C43617a> f245766h;

    public g(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f245759a = provider;
        this.f245760b = provider2;
        this.f245761c = provider3;
        this.f245762d = provider4;
        this.f245763e = lVar;
        this.f245764f = provider5;
        this.f245765g = provider6;
        this.f245766h = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f245759a.get(), this.f245760b.get(), this.f245761c.get(), this.f245762d.get(), (VinSuggestOpenParams) this.f245763e.f393949a, this.f245764f.get(), this.f245765g.get(), this.f245766h.get());
    }
}
