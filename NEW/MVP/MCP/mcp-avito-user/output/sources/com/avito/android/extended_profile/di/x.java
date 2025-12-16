package com.avito.android.extended_profile.di;

import android.content.Context;
import com.avito.android.advert_core.contactbar.C28263b;
import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import javax.inject.Provider;

/* compiled from: ExtendedProfileModule_ProvideAdvertActionIconFactory$_avito_extended_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class x implements dagger.internal.h<InterfaceC28262a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f149951a;

    public x(Provider<Context> provider) {
        this.f149951a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f149951a.get();
        r.f149945a.getClass();
        return new C28263b(context, false, 2, null);
    }
}
