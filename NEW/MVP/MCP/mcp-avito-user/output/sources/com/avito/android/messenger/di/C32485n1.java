package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.mvi.data.C32020i;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32019h;
import ru.avito.messenger.InterfaceC47835s;

/* compiled from: MessengerModule_ProvideMessageBodySerializerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.n1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32485n1 implements dagger.internal.h<InterfaceC32019h> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196158a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f196159b;

    public C32485n1(U0 u02, dagger.internal.f fVar) {
        this.f196158a = u02;
        this.f196159b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47835s interfaceC47835s = (InterfaceC47835s) this.f196159b.get();
        this.f196158a.getClass();
        return new C32020i(interfaceC47835s.getF430738c());
    }
}
