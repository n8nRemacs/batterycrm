package com.avito.android.advert.item.chat_history.restyle;

import com.avito.android.advert.item.chat_history.c;
import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChatHistoryBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f74271a;

    /* renamed from: b, reason: collision with root package name */
    public final u f74272b;

    public b(u uVar, Provider provider) {
        this.f74271a = provider;
        this.f74272b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f74271a.get(), (InterfaceC35945t1) this.f74272b.get());
    }
}
