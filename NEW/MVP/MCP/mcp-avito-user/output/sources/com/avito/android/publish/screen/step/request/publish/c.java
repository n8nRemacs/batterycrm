package com.avito.android.publish.screen.step.request.publish;

import com.avito.android.publish.screen.step.request.publish.mvi.m;
import com.avito.android.publish.screen.step.request.publish.mvi.n;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishRequestViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final n f241857a;

    public c(n nVar) {
        this.f241857a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((m) this.f241857a.get(), null, 2, null);
    }
}
