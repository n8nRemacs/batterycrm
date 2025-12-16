package com.avito.android.beduin.common.container.horizontal_slider;

import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.utils.C28814j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinHorizontalSliderContainerFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103117a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Th.a> f103118b;

    /* renamed from: c, reason: collision with root package name */
    public final u f103119c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<AbstractC35201t> f103120d;

    public j(dagger.internal.f fVar, u uVar, Provider provider, Provider provider2) {
        this.f103117a = fVar;
        this.f103118b = provider;
        this.f103119c = uVar;
        this.f103120d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.b(this.f103117a), this.f103118b.get(), (C28814j) this.f103119c.get(), this.f103120d.get());
    }
}
