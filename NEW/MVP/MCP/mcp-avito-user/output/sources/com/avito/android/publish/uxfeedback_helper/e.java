package com.avito.android.publish.uxfeedback_helper;

import com.avito.android.Q1;
import com.avito.android.ux.feedback.impl.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f245518a;

    /* renamed from: b, reason: collision with root package name */
    public final l f245519b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q1> f245520c;

    public e(Provider provider, l lVar, Provider provider2) {
        this.f245518a = provider;
        this.f245519b = lVar;
        this.f245520c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f245518a.get(), (com.avito.android.ux.feedback.impl.f) this.f245519b.get(), this.f245520c.get());
    }
}
