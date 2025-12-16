package com.avito.android.passport.profile_add.create_flow.select_vertical.mvi;

import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SelectVerticalReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f211984a;

    /* renamed from: b, reason: collision with root package name */
    public final u f211985b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f211986c;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar) {
        this.f211984a = lVar;
        this.f211985b = uVar;
        this.f211986c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Z1) this.f211984a.f393949a, (com.avito.android.passport.profile_add.create_flow.select_vertical.a) this.f211985b.get(), (SelectVerticalArguments) this.f211986c.f393949a);
    }
}
