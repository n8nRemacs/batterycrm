package com.avito.android.feedback_adverts.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeedbackAdvertsModule_ProvideResourcesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f157813a;

    public l(dagger.internal.l lVar) {
        this.f157813a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f157813a.f393949a;
        e.f157805a.getClass();
        return fragment.getResources();
    }
}
