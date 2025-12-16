package com.avito.android.publish.details.tags;

import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import yc.C50213a;

/* compiled from: PublishTagsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f235018a;

    /* renamed from: b, reason: collision with root package name */
    public final u f235019b;

    /* renamed from: c, reason: collision with root package name */
    public final u f235020c;

    public c(u uVar, u uVar2, u uVar3) {
        this.f235018a = uVar;
        this.f235019b = uVar2;
        this.f235020c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((H0) this.f235018a.get(), (InterfaceC35745a5) this.f235019b.get(), (C50213a) this.f235020c.get());
    }
}
