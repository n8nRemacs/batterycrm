package com.avito.android.passport.profile_add.merge.code_confirm.mvi;

import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmArgs;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CodeConfirmBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f212759a;

    public f(dagger.internal.l lVar) {
        this.f212759a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((CodeConfirmArgs) this.f212759a.f393949a);
    }
}
