package com.avito.android.cpx_promo;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;

/* compiled from: PriceFormatter_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126804a;

    public c(u uVar) {
        this.f126804a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Locale) this.f126804a.get());
    }
}
