package com.avito.android.advert_core.task;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FirstTimeRunTask_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<FirstTimeRunTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f84396a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f84397b;

    public c(C30214v6 c30214v6, Provider provider) {
        this.f84396a = c30214v6;
        this.f84397b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FirstTimeRunTask((l) this.f84396a.get(), this.f84397b.get());
    }
}
