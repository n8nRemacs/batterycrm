package com.avito.android.messenger.di;

/* compiled from: ChannelFragmentModule_BindPlatformActionsVisibilityConnectorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32440h implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.platform_actions.A> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195796a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f195797b;

    public C32440h(C32431e c32431e, dagger.internal.u uVar) {
        this.f195796a = c32431e;
        this.f195797b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.mvi.platform_actions.f fVar = (com.avito.android.messenger.conversation.mvi.platform_actions.f) this.f195797b.get();
        this.f195796a.getClass();
        return fVar;
    }
}
