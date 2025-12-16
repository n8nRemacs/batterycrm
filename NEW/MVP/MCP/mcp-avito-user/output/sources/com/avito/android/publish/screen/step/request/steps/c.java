package com.avito.android.publish.screen.step.request.steps;

import com.avito.android.publish.screen.step.request.steps.mvi.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StepsRequestViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.screen.step.request.steps.mvi.h f241965a;

    public c(com.avito.android.publish.screen.step.request.steps.mvi.h hVar) {
        this.f241965a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((g) this.f241965a.get(), null, 2, null);
    }
}
