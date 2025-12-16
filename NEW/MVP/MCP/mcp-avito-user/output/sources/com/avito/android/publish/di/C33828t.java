package com.avito.android.publish.di;

import com.avito.android.publish.PublishActivity;

/* compiled from: PublishModule_ProvideDialogRouterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33828t implements dagger.internal.h<com.avito.android.progress_overlay.h> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235283a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235284b;

    public C33828t(C33824o c33824o, dagger.internal.l lVar) {
        this.f235283a = c33824o;
        this.f235284b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PublishActivity publishActivity = (PublishActivity) this.f235284b.f393949a;
        this.f235283a.getClass();
        return new com.avito.android.progress_overlay.h(publishActivity);
    }
}
