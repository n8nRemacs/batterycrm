package com.avito.android.profile.edit.di;

import android.content.Context;
import com.avito.android.profile.edit.d0;
import com.avito.android.profile.edit.di.C33316a;
import com.avito.android.profile.edit.e0;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideLocationInteractorResourceProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<d0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f222198a;

    public v(Provider<Context> provider) {
        this.f222198a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) ((C33316a.c.d) this.f222198a).get();
        C33319d.f222158a.getClass();
        return new e0(context.getResources());
    }
}
