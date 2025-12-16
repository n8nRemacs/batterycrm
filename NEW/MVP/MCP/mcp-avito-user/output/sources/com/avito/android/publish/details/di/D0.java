package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;
import androidx.view.R0;

/* compiled from: PublishDetailsTagsModule_ProvidePublishTagsViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class D0 implements dagger.internal.h<com.avito.android.publish.details.tags.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f233614a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f233615b;

    public D0(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f233614a = uVar;
        this.f233615b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.details.tags.f fVar = (com.avito.android.publish.details.tags.f) this.f233614a.get();
        Fragment fragment = (Fragment) this.f233615b.f393949a;
        C0.f233612a.getClass();
        return (com.avito.android.publish.details.tags.e) R0.a(fragment, fVar).a(com.avito.android.publish.details.tags.e.class);
    }
}
