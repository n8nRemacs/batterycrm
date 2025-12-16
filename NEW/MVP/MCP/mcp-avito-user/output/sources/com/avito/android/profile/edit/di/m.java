package com.avito.android.profile.edit.di;

import android.content.Context;
import com.avito.android.profile.edit.M;
import com.avito.android.profile.edit.N;
import com.avito.android.profile.edit.di.C33316a;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideEditProfileResourceProvider$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f222174a;

    public m(Provider<Context> provider) {
        this.f222174a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) ((C33316a.c.d) this.f222174a).get();
        C33319d.f222158a.getClass();
        return new N(context.getResources());
    }
}
