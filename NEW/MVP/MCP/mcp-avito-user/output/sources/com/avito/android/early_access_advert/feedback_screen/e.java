package com.avito.android.early_access_advert.feedback_screen;

import com.avito.android.early_access_advert.feedback_screen.mvi.f;
import com.avito.android.early_access_advert.feedback_screen.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EarlyAccessAdvertFeedbackViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final g f145668a;

    public e(g gVar) {
        this.f145668a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f145668a.get(), null, 2, null);
    }
}
