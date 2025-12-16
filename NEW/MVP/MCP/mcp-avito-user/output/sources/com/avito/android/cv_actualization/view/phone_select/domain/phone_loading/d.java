package com.avito.android.cv_actualization.view.phone_select.domain.phone_loading;

import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationPhoneSelectInitialLoadPhonesInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f131342a;

    /* renamed from: b, reason: collision with root package name */
    public final l f131343b;

    public d(l lVar, Provider provider) {
        this.f131342a = provider;
        this.f131343b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.a(w.a(this.f131342a)), ((Boolean) this.f131343b.f393949a).booleanValue());
    }
}
