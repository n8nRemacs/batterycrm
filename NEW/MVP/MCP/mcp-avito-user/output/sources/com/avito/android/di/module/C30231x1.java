package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: AvitoAppFirebaseMessagingModule_ProvideFirebaseMessagingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.x1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30231x1 implements dagger.internal.h<FirebaseMessaging> {

    /* renamed from: a, reason: collision with root package name */
    public final C30220w1 f144701a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144702b;

    public C30231x1(C30220w1 c30220w1, dagger.internal.l lVar) {
        this.f144701a = c30220w1;
        this.f144702b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144702b.f393949a;
        this.f144701a.getClass();
        return interfaceC29905l.b();
    }
}
