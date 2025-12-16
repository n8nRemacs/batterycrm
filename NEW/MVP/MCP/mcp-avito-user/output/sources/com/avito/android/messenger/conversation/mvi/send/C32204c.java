package com.avito.android.messenger.conversation.mvi.send;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: MessengerPhotoStorageImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.send.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32204c implements dagger.internal.h<C32202b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f194485a;

    public C32204c(C30102l3 c30102l3) {
        this.f194485a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32202b((Context) this.f194485a.get());
    }
}
