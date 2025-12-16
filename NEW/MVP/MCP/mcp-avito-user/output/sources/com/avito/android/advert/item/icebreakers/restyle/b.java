package com.avito.android.advert.item.icebreakers.restyle;

import com.avito.android.advert.item.icebreakers.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IceBreakersBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f76507a;

    public b(Provider<d> provider) {
        this.f76507a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f76507a.get());
    }
}
