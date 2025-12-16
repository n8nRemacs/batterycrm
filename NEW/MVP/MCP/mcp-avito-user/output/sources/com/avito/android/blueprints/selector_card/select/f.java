package com.avito.android.blueprints.selector_card.select;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectorCardGroupPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f106667a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106668b;

    public f(u uVar, Provider provider) {
        this.f106667a = provider;
        this.f106668b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f106667a.get(), (Q1) this.f106668b.get());
    }
}
