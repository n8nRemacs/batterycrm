package com.avito.android.bxcontent.beduin_v2.wrapper;

import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BxWrapperStateFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final u f109615a;

    public n(u uVar) {
        this.f109615a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((Gson) this.f109615a.get());
    }
}
