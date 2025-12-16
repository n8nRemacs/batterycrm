package com.avito.android.cv_actualization.view.code_input.mvi.action_handler;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationConfirmClickedActionHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131175a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.cv_actualization.view.code_input.e> f131176b;

    public b(l lVar, Provider provider) {
        this.f131175a = lVar;
        this.f131176b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f131175a.f393949a, this.f131176b.get());
    }
}
