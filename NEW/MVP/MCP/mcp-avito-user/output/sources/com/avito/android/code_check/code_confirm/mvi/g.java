package com.avito.android.code_check.code_confirm.mvi;

import com.avito.android.code_check.code_confirm.t;
import com.avito.android.code_check_public.screen.c;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import javax.inject.Provider;

/* compiled from: CodeConfirmActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final t f118726a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.code_check.d> f118727b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C40806a> f118728c;

    public g(t tVar, Provider provider, Provider provider2) {
        this.f118726a = tVar;
        this.f118727b = provider;
        this.f118728c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((c.b) this.f118726a.get(), this.f118727b.get(), this.f118728c.get());
    }
}
