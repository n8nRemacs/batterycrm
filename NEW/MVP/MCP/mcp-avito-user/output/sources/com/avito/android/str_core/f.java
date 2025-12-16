package com.avito.android.str_core;

import com.avito.android.remote.d1;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrUxFeedbackInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f288534a;

    public f(u uVar) {
        this.f288534a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((d1) this.f288534a.get());
    }
}
