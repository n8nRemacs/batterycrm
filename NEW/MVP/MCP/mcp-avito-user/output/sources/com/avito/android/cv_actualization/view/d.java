package com.avito.android.cv_actualization.view;

import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f131226a;

    public d(u uVar) {
        this.f131226a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.a(w.a(this.f131226a)));
    }
}
