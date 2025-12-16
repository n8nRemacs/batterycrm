package com.avito.android.beduin.di;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.actionhandler.C0;
import com.avito.android.beduin_models.BeduinAction;

/* compiled from: BeduinActionHandlerModule_ProvideBeduinPixelActionHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.di.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28843e implements dagger.internal.h<InterfaceC15523b<? extends BeduinAction>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103918a;

    public C28843e(dagger.internal.f fVar) {
        this.f103918a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f103918a);
        C28841c.f103917a.getClass();
        return new C0(eVarB, null, 2, null);
    }
}
