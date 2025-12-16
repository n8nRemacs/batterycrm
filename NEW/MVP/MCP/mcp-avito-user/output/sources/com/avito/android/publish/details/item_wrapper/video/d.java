package com.avito.android.publish.details.item_wrapper.video;

import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f234790a;

    /* renamed from: b, reason: collision with root package name */
    public final u f234791b;

    public d(u uVar, u uVar2) {
        this.f234790a = uVar;
        this.f234791b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((H0) this.f234790a.get(), (InterfaceC35745a5) this.f234791b.get());
    }
}
