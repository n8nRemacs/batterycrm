package com.avito.android.settings;

import Tv0.C15417c;
import Tv0.InterfaceC15415a;
import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingsResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f280893a;

    /* renamed from: b, reason: collision with root package name */
    public final C15417c f280894b;

    public m(dagger.internal.l lVar, C15417c c15417c) {
        this.f280893a = lVar;
        this.f280894b = c15417c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Resources) this.f280893a.f393949a, (InterfaceC15415a) this.f280894b.get());
    }
}
