package com.avito.android.user_adverts_common.safety;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import lJ0.InterfaceC43648d;

/* compiled from: SafetyInfoProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f315929a;

    /* renamed from: b, reason: collision with root package name */
    public final u f315930b;

    /* renamed from: c, reason: collision with root package name */
    public final u f315931c;

    /* renamed from: d, reason: collision with root package name */
    public final u f315932d;

    public h(u uVar, u uVar2, u uVar3, u uVar4) {
        this.f315929a = uVar;
        this.f315930b = uVar2;
        this.f315931c = uVar3;
        this.f315932d = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.a(w.a(this.f315929a)), (InterfaceC35745a5) this.f315930b.get(), (InterfaceC43648d) this.f315931c.get(), (com.avito.android.server_time.f) this.f315932d.get());
    }
}
