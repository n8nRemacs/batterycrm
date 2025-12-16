package com.avito.android.advert.item.chat_history;

import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChatHistoryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f74252a;

    /* renamed from: b, reason: collision with root package name */
    public final u f74253b;

    public b(u uVar, Provider provider) {
        this.f74252a = provider;
        this.f74253b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f74252a.get(), (InterfaceC35945t1) this.f74253b.get());
    }
}
