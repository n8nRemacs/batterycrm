package com.avito.android.publish.pretend;

import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.u1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import yc.C50213a;

/* compiled from: PretendInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f238372a;

    /* renamed from: b, reason: collision with root package name */
    public final u f238373b;

    /* renamed from: c, reason: collision with root package name */
    public final u f238374c;

    /* renamed from: d, reason: collision with root package name */
    public final u f238375d;

    public g(u uVar, u uVar2, u uVar3, u uVar4) {
        this.f238372a = uVar;
        this.f238373b = uVar2;
        this.f238374c = uVar3;
        this.f238375d = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((u1) this.f238372a.get(), (InterfaceC35745a5) this.f238373b.get(), (CategoryParametersConverter) this.f238374c.get(), (C50213a) this.f238375d.get());
    }
}
