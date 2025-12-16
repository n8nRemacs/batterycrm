package com.avito.android.publish.publish_advert_request.data;

import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import yc.C50213a;

/* compiled from: PublishAdvertRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f238970a;

    /* renamed from: b, reason: collision with root package name */
    public final u f238971b;

    /* renamed from: c, reason: collision with root package name */
    public final u f238972c;

    public d(u uVar, u uVar2, u uVar3) {
        this.f238970a = uVar;
        this.f238971b = uVar2;
        this.f238972c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((H0) this.f238970a.get(), (C50213a) this.f238971b.get(), (CategoryParametersConverter) this.f238972c.get());
    }
}
