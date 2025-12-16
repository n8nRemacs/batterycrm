package com.avito.android.comfortable_deal.deal.item.completion.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealCompletionAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f121343a;

    /* renamed from: b, reason: collision with root package name */
    public final u f121344b;

    public c(u uVar, Provider provider) {
        this.f121343a = provider;
        this.f121344b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f121343a.get(), (String) this.f121344b.get());
    }
}
