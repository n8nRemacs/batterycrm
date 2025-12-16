package com.avito.android.auto_reseller_contacts.featuretoggle.di;

import Ue.C15512a;
import com.avito.android.C34161r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApicoChatFeaturesModule_ProvideApicoChatFeaturesFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C15512a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f95782a;

    public c(Provider<C34161r> provider) {
        this.f95782a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f95782a.get();
        a.f95781a.getClass();
        return (C15512a) c34161r.f246393a.b(C15512a.class);
    }
}
