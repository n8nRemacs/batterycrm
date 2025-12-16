package com.avito.android.calltracking.item;

import com.avito.android.calltracking.F;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CallItemTextFormatterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113718a;

    public c(u uVar) {
        this.f113718a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((F) this.f113718a.get());
    }
}
