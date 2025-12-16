package com.avito.android.help_center;

import com.avito.android.C30277e1;

/* compiled from: HelpCenterUrlProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f161612a;

    public J(dagger.internal.u uVar) {
        this.f161612a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new I((C30277e1) this.f161612a.get());
    }
}
