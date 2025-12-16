package com.avito.android.messenger.di;

/* compiled from: ChannelFragmentModule_ProvideSendDraftMessageImmediatelyFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class U implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195713a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195714b;

    public U(C32431e c32431e, dagger.internal.l lVar) {
        this.f195713a = c32431e;
        this.f195714b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195714b.f393949a;
        this.f195713a.getClass();
        return Boolean.valueOf(w12.f189242e);
    }
}
