package com.avito.android.advert_core.safedeal;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyAdvertSafeDealServicesInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f84202a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f84203b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f84204c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f84205d;

    public g(dagger.internal.h hVar, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f84202a = hVar;
        this.f84203b = uVar;
        this.f84204c = uVar2;
        this.f84205d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f84202a.get();
        return new f((com.avito.android.remote.error.f) this.f84204c.get(), (InterfaceC35745a5) this.f84205d.get(), dagger.internal.g.b(this.f84203b), str);
    }
}
