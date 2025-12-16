package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.sync.C32282p0;
import com.avito.android.messenger.conversation.mvi.sync.InterfaceC32280o0;
import javax.inject.Provider;

/* compiled from: MessengerSyncModule_ProvideMessageUpdateMerger$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class e2 implements dagger.internal.h<InterfaceC32280o0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f195769a;

    /* renamed from: b, reason: collision with root package name */
    public final C30713g1 f195770b;

    public e2(C30713g1 c30713g1, Provider provider) {
        this.f195769a = provider;
        this.f195770b = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC32024m interfaceC32024m = this.f195769a.get();
        C30277e1 c30277e1 = (C30277e1) this.f195770b.get();
        int i12 = W1.f195723a;
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[68];
        Object c32282p0 = ((Boolean) c30277e1.f145030o0.a().invoke()).booleanValue() ? new C32282p0(interfaceC32024m) : InterfaceC32280o0.a.f194834a;
        dagger.internal.t.d(c32282p0);
        return c32282p0;
    }
}
