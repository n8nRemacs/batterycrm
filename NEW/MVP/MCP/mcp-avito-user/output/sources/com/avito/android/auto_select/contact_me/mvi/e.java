package com.avito.android.auto_select.contact_me.mvi;

import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeBottomSheetOpenArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectContactMeBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f96004a;

    public e(dagger.internal.l lVar) {
        this.f96004a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((AutoSelectContactMeBottomSheetOpenArguments) this.f96004a.f393949a);
    }
}
