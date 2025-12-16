package com.avito.android.rating_form.step;

import java.lang.ref.WeakReference;
import javax.inject.Provider;

/* compiled from: ActivityLauncherProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f249177a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view.s> f249178b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f249179c;

    public c(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f249177a = uVar;
        this.f249178b = provider;
        this.f249179c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((WeakReference) this.f249177a.get(), this.f249178b.get(), (Y41.l) this.f249179c.f393949a);
    }
}
