package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SetProfileNameReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f212197a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f212198b;

    public p(dagger.internal.l lVar, u uVar) {
        this.f212197a = uVar;
        this.f212198b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.passport.profile_add.create_flow.set_profile_name.b) this.f212197a.get(), (SetProfileNameArgs) this.f212198b.f393949a);
    }
}
