package com.avito.android.recall_me_v2.domain.scenario;

import com.avito.android.recall_me.domain.n;
import com.avito.android.recall_me.domain.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecallMeCodeConfirmInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final r f252067a;

    public f(r rVar) {
        this.f252067a = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((n) this.f252067a.get());
    }
}
