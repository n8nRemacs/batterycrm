package Hb0;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OnboardingItemInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: Hb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13949c implements h<C13948b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f7333a;

    public C13949c(u uVar) {
        this.f7333a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13948b((l) this.f7333a.get());
    }
}
