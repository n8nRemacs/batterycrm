package com.avito.android.screenshot_observer;

import android.content.Context;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScreenshotValidatorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f261704a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f261705b;

    public h(u uVar, Provider provider) {
        this.f261704a = uVar;
        this.f261705b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Context) this.f261704a.get(), this.f261705b.get());
    }
}
