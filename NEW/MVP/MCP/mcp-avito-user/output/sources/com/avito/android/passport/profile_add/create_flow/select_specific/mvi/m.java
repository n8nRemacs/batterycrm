package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SelectSpecificReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f211764a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f211765b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f211766c;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar) {
        this.f211764a = uVar;
        this.f211765b = lVar;
        this.f211766c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.passport.profile_add.create_flow.select_specific.f) this.f211764a.get(), (SelectSpecificArguments) this.f211765b.f393949a, (Z1) this.f211766c.f393949a);
    }
}
