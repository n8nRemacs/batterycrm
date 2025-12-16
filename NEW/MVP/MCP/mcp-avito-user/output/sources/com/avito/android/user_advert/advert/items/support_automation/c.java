package com.avito.android.user_advert.advert.items.support_automation;

import com.avito.android.user_advert.advert.items.support_automation.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SupportAutomationItemBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d.a> f310319a;

    public c(Provider<d.a> provider) {
        this.f310319a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f310319a.get());
    }
}
