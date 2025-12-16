package com.avito.android.user_advert.advert.delegate.gallery;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyAdvertGalleryPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308598a;

    public d(u uVar) {
        this.f308598a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC35745a5) this.f308598a.get());
    }
}
