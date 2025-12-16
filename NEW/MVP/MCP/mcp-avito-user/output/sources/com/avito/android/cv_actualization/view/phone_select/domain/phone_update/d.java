package com.avito.android.cv_actualization.view.phone_select.domain.phone_update;

import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationPhoneSelectUpdatePhoneInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<DP.a> f131351a;

    public d(Provider<DP.a> provider) {
        this.f131351a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.a(w.a(this.f131351a)));
    }
}
