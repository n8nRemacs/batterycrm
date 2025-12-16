package com.avito.android.publish.premoderation.di;

import androidx.view.InterfaceC23487e;
import com.avito.android.publish.premoderation.WrongCategoryFragment;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WrongCategoryModule_ProvideRegistryOwnerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<InterfaceC23487e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f238293a;

    /* renamed from: b, reason: collision with root package name */
    public final l f238294b;

    public j(i iVar, l lVar) {
        this.f238293a = iVar;
        this.f238294b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        WrongCategoryFragment wrongCategoryFragment = (WrongCategoryFragment) this.f238294b.f393949a;
        this.f238293a.getClass();
        return wrongCategoryFragment;
    }
}
