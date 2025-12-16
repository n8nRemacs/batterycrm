package com.avito.android.beduin.di;

import com.avito.android.beduin_models.BeduinModel;
import java.util.Map;
import qj.InterfaceC47406a;

/* compiled from: BeduinModelPreparerModule_ProvideModelPreparerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class K implements dagger.internal.h<InterfaceC47406a<BeduinModel>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.p f103905a;

    public K(dagger.internal.p pVar) {
        this.f103905a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Map map = (Map) this.f103905a.get();
        J.f103904a.getClass();
        return new com.avito.android.beduin.common.preparer.f(map);
    }
}
