package com.avito.android.messenger.di;

/* compiled from: ChannelFragmentModule_ProvideChannelIdFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32483n implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196135a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f196136b;

    public C32483n(C32431e c32431e, dagger.internal.l lVar) {
        this.f196135a = c32431e;
        this.f196136b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f196136b.f393949a;
        this.f196135a.getClass();
        String str = w12.f189238a;
        dagger.internal.t.d(str);
        return str;
    }
}
