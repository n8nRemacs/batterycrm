package com.avito.android.user_advert.advert.faq;

import com.avito.android.ab_tests.f0;
import com.avito.android.ab_tests.h0;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertFaqSurveyStartupTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<AdvertFaqSurveyStartupTask> {

    /* renamed from: a, reason: collision with root package name */
    public final h f308928a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f308929b;

    public i(h hVar, h0 h0Var) {
        this.f308928a = hVar;
        this.f308929b = h0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AdvertFaqSurveyStartupTask((e) this.f308928a.get(), (f0) this.f308929b.get());
    }
}
