package com.avito.android.installments.form.mvi;

import com.avito.android.deep_linking.links.UxFeedbackActions;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsFormActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f172746a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.installments.form.l f172747b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f172748c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f172749d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Gson> f172750e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<UN.a> f172751f;

    public e(dagger.internal.l lVar, com.avito.android.installments.form.l lVar2, dagger.internal.l lVar3, Provider provider, Provider provider2, Provider provider3) {
        this.f172746a = lVar;
        this.f172747b = lVar2;
        this.f172748c = lVar3;
        this.f172749d = provider;
        this.f172750e = provider2;
        this.f172751f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Boolean) this.f172746a.f393949a, (com.avito.android.installments.form.j) this.f172747b.get(), (UxFeedbackActions) this.f172748c.f393949a, this.f172749d.get(), this.f172750e.get(), this.f172751f.get());
    }
}
