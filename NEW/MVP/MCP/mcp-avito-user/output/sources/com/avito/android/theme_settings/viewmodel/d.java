package com.avito.android.theme_settings.viewmodel;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import nE0.InterfaceC44242a;

/* compiled from: ThemeSettingsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301370a;

    public d(u uVar) {
        this.f301370a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC44242a) this.f301370a.get());
    }
}
