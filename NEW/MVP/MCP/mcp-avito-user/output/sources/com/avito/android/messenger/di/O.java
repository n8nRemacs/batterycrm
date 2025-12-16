package com.avito.android.messenger.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: ChannelFragmentModule_ProvideQuickRepliesItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class O implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195677a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f195678b;

    public O(C32431e c32431e, dagger.internal.u uVar) {
        this.f195677a = c32431e;
        this.f195678b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.messenger.conversation.mvi.quick_replies.adapter.b bVar = (com.avito.android.messenger.conversation.mvi.quick_replies.adapter.b) this.f195678b.get();
        this.f195677a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
