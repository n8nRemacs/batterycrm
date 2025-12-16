package oH0;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiUrgencyPreferenceStorage_Factory.java */
@e
@y
@x
/* renamed from: oH0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44647c implements h<C44645a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f419692a;

    public C44647c(u uVar) {
        this.f419692a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44645a((l) this.f419692a.get());
    }
}
