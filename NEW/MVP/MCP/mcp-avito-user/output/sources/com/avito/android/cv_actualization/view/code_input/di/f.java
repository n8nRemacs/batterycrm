package com.avito.android.cv_actualization.view.code_input.di;

import com.avito.android.cv_actualization.view.code_input.di.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationCodeInputModule_ProvideRxTimerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<com.avito.android.code_confirmation.code_confirmation.timer.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f131166a;

    public f(Provider<InterfaceC35745a5> provider) {
        this.f131166a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.C3905c) this.f131166a).get();
        d.f131164a.getClass();
        return new com.avito.android.code_confirmation.code_confirmation.timer.d(interfaceC35745a5);
    }
}
