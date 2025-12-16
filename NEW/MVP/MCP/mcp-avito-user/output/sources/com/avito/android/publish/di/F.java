package com.avito.android.publish.di;

import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.W0;

/* compiled from: PublishModule_ProvideSubmissionPresenterRouterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class F implements dagger.internal.h<W0.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235139a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235140b;

    public F(C33824o c33824o, dagger.internal.l lVar) {
        this.f235139a = c33824o;
        this.f235140b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PublishActivity publishActivity = (PublishActivity) this.f235140b.f393949a;
        this.f235139a.getClass();
        return publishActivity;
    }
}
