package com.avito.android.publish.di;

import android.app.Activity;
import com.avito.android.publish.PublishActivity;

/* compiled from: PublishModule_ProvideActivityFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<Activity> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235280a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235281b;

    public r(C33824o c33824o, dagger.internal.l lVar) {
        this.f235280a = c33824o;
        this.f235281b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PublishActivity publishActivity = (PublishActivity) this.f235281b.f393949a;
        this.f235280a.getClass();
        return publishActivity;
    }
}
