package com.avito.android.blueprints.publish.multiselect.inline;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishInlineMultiselectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f106382a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f106383b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106384c;

    public e(u uVar, u uVar2, Provider provider) {
        this.f106382a = uVar;
        this.f106383b = provider;
        this.f106384c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.util.text.a) this.f106382a.get(), this.f106383b.get(), (Q1) this.f106384c.get());
    }
}
