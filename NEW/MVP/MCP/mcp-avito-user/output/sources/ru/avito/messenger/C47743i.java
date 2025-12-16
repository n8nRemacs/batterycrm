package ru.avito.messenger;

import com.avito.android.C30277e1;

/* compiled from: CloseScreenCommandViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47743i implements dagger.internal.h<C47733d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f431173a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f431174b;

    public C47743i(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f431173a = uVar;
        this.f431174b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C47733d((F0) this.f431173a.get(), (C30277e1) this.f431174b.get());
    }
}
