package com.avito.android.messenger.di;

/* compiled from: ChannelFragmentModule_ProvideMessageIdFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class B implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195602a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195603b;

    public B(C32431e c32431e, dagger.internal.l lVar) {
        this.f195602a = c32431e;
        this.f195603b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f195603b.f393949a;
        this.f195602a.getClass();
        return w12.f189240c;
    }
}
