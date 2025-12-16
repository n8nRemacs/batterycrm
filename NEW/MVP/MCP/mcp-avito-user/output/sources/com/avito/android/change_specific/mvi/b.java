package com.avito.android.change_specific.mvi;

import com.avito.android.change_specific.ExtendedProfileChangeSpecificArguments;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileChangeSpecificActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f118014a;

    /* renamed from: b, reason: collision with root package name */
    public final u f118015b;

    public b(l lVar, u uVar) {
        this.f118014a = lVar;
        this.f118015b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((ExtendedProfileChangeSpecificArguments) this.f118014a.f393949a, (com.avito.android.change_specific.j) this.f118015b.get());
    }
}
