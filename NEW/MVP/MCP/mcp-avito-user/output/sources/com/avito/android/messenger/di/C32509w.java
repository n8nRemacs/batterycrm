package com.avito.android.messenger.di;

/* compiled from: ChannelFragmentModule_ProvideFlowIdFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32509w implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196306a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f196307b;

    public C32509w(C32431e c32431e, dagger.internal.l lVar) {
        this.f196306a = c32431e;
        this.f196307b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.W1 w12 = (com.avito.android.messenger.conversation.W1) this.f196307b.f393949a;
        this.f196306a.getClass();
        String str = w12.f189244g;
        return str == null ? "" : str;
    }
}
