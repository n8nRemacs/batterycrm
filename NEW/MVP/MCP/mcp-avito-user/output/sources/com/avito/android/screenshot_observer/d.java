package com.avito.android.screenshot_observer;

import android.content.Context;
import com.avito.android.screenshot_observer.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ScreenshotObserverImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f261696a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.h f261697b;

    /* renamed from: c, reason: collision with root package name */
    public final u f261698c;

    /* renamed from: d, reason: collision with root package name */
    public final u f261699d;

    public d(dagger.internal.h hVar, u uVar, u uVar2, u uVar3) {
        this.f261696a = uVar;
        this.f261697b = hVar;
        this.f261698c = uVar2;
        this.f261699d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f261696a.get(), (a.InterfaceC7827a) this.f261697b.get(), (com.avito.android.permissions.u) this.f261698c.get(), (f) this.f261699d.get());
    }
}
