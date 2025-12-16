package com.avito.android.blueprints.publish.wizard;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WizardItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f106504a;

    public c(u uVar) {
        this.f106504a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f106504a.get());
    }
}
