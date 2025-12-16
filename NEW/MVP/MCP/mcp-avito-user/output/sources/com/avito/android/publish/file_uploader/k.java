package com.avito.android.publish.file_uploader;

import android.content.ContentResolver;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: FileUploaderInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<C33855c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f235694a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f235695b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f235696c;

    public k(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f235694a = uVar;
        this.f235695b = uVar2;
        this.f235696c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33855c((H0) this.f235694a.get(), (ContentResolver) this.f235695b.get(), (InterfaceC35745a5) this.f235696c.get());
    }
}
