package com.avito.android.feedback_adverts.di;

import Cd.D;
import androidx.fragment.app.Fragment;
import androidx.view.R0;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeedbackAdvertsModule_ProvideInteractor$_avito_feedback_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<com.avito.android.feedback_adverts.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f157807a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f157808b;

    public h(dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f157807a = lVar;
        this.f157808b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f157807a.f393949a;
        D d12 = (D) this.f157808b.get();
        e.f157805a.getClass();
        return (com.avito.android.feedback_adverts.g) R0.a(fragment, d12).a(com.avito.android.feedback_adverts.h.class);
    }
}
