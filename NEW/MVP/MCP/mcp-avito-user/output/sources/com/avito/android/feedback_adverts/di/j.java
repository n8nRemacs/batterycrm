package com.avito.android.feedback_adverts.di;

import Cd.D;
import androidx.fragment.app.Fragment;
import androidx.view.R0;
import com.avito.android.feedback_adverts.o;
import com.avito.android.feedback_adverts.p;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeedbackAdvertsModule_ProvidePresenter$_avito_feedback_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f157810a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f157811b;

    public j(dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f157810a = lVar;
        this.f157811b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f157810a.f393949a;
        D d12 = (D) this.f157811b.get();
        e.f157805a.getClass();
        return (o) R0.a(fragment, d12).a(p.class);
    }
}
