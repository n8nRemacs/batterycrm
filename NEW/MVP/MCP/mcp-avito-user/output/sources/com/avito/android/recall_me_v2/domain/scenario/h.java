package com.avito.android.recall_me_v2.domain.scenario;

import com.avito.android.recall_me.domain.n;
import com.avito.android.recall_me.domain.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecallMePhoneRequestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final r f252075a;

    public h(r rVar) {
        this.f252075a = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((n) this.f252075a.get());
    }
}
