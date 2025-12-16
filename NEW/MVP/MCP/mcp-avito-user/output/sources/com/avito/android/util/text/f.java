package com.avito.android.util.text;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AttributedTextFormatterModule_ProvideAttributedTextFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f319079a;

    public f(u uVar) {
        this.f319079a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        JK0.e eVar = (JK0.e) this.f319079a.get();
        d.f319077a.getClass();
        return new b(eVar, e.f319078l);
    }
}
