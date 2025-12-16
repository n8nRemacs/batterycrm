package com.avito.android.publish.details.di;

import com.avito.android.analytics.screens.EditParametersScreen;
import com.avito.android.analytics.screens.PublishParametersScreen;
import com.avito.android.analytics.screens.Screen;

/* compiled from: PublishDetailsAnalyticsModule_ProvidesScreenFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33736q implements dagger.internal.h<Screen> {

    /* renamed from: a, reason: collision with root package name */
    public final C33735p f234581a;

    public C33736q(C33735p c33735p) {
        this.f234581a = c33735p;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.f234581a.f234579a ? EditParametersScreen.f90347d : PublishParametersScreen.f90455d;
        dagger.internal.t.d(obj);
        return obj;
    }
}
