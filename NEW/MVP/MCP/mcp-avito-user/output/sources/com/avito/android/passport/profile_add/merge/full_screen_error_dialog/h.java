package com.avito.android.passport.profile_add.merge.full_screen_error_dialog;

import Cd.D;
import androidx.view.P0;
import androidx.view.S0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FullScreenUserDialogModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213072a;

    /* renamed from: b, reason: collision with root package name */
    public final u f213073b;

    public h(dagger.internal.l lVar, u uVar) {
        this.f213072a = lVar;
        this.f213073b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        S0 s02 = (S0) this.f213072a.f393949a;
        D d12 = (D) this.f213073b.get();
        f.f213071a.getClass();
        return (k) new P0(s02, d12, null, 4, null).a(l.class);
    }
}
