package com.avito.android.passport.profile_add.merge.code_confirm;

import com.avito.android.passport.profile_add.merge.code_confirm.o;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CodeConfirmViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.code_request.mvi.g f212773a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.code_confirm.mvi.k f212774b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f212775c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.code_confirm.view_state.d f212776d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f212777e;

    public n(com.avito.android.passport.profile_add.merge.code_request.mvi.g gVar, com.avito.android.passport.profile_add.merge.code_confirm.mvi.k kVar, dagger.internal.l lVar, com.avito.android.passport.profile_add.merge.code_confirm.view_state.d dVar, Provider provider) {
        this.f212773a = gVar;
        this.f212774b = kVar;
        this.f212775c = lVar;
        this.f212776d = dVar;
        this.f212777e = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.code_request.mvi.f fVar = (com.avito.android.passport.profile_add.merge.code_request.mvi.f) this.f212773a.get();
        com.avito.android.passport.profile_add.merge.code_confirm.mvi.j jVar = (com.avito.android.passport.profile_add.merge.code_confirm.mvi.j) this.f212774b.get();
        CodeConfirmArgs codeConfirmArgs = (CodeConfirmArgs) this.f212775c.f393949a;
        this.f212776d.getClass();
        return new m(fVar, jVar, codeConfirmArgs, new com.avito.android.passport.profile_add.merge.code_confirm.view_state.c(), (R0) ((o.b.C6364b) this.f212777e).get());
    }
}
