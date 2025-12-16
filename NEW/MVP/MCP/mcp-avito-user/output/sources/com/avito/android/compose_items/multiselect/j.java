package com.avito.android.compose_items.multiselect;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiselectComposeItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f125423a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f125424b;

    /* renamed from: c, reason: collision with root package name */
    public final u f125425c;

    public j(u uVar, u uVar2, Provider provider) {
        this.f125423a = uVar;
        this.f125424b = provider;
        this.f125425c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.util.text.a) this.f125423a.get(), this.f125424b.get(), (Q1) this.f125425c.get());
    }
}
