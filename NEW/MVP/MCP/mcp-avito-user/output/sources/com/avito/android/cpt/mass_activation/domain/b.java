package com.avito.android.cpt.mass_activation.domain;

import Qr.InterfaceC14925a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetCptMassActivationUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f126572a;

    /* renamed from: b, reason: collision with root package name */
    public final u f126573b;

    /* renamed from: c, reason: collision with root package name */
    public final u f126574c;

    public b(l lVar, u uVar, u uVar2) {
        this.f126572a = lVar;
        this.f126573b = uVar;
        this.f126574c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String[]) this.f126572a.f393949a, (InterfaceC14925a) this.f126573b.get(), (R0) this.f126574c.get());
    }
}
