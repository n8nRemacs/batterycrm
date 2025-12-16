package com.avito.android.extended_profile.converter;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileUniversalWidgetConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f149434a;

    public l(u uVar) {
        this.f149434a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.extended_profile_ui_components.universal_widget.a) this.f149434a.get());
    }
}
