package com.avito.android.authorization.tfa.code_check;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.q;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;

/* compiled from: TfaCodeCheckScenarioBuilder_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f94643a;

    public b(q qVar) {
        this.f94643a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Map) this.f94643a.get());
    }
}
