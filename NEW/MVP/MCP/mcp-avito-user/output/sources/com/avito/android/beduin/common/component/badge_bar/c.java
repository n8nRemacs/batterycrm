package com.avito.android.beduin.common.component.badge_bar;

import com.avito.android.AbstractC35201t;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinBadgeBarComponentFactory_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AbstractC35201t> f100693a;

    public c(Provider<AbstractC35201t> provider) {
        this.f100693a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f100693a.get());
    }
}
