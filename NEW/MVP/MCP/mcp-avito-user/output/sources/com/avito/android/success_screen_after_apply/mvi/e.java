package com.avito.android.success_screen_after_apply.mvi;

import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyOpenParams;
import dagger.internal.x;
import dagger.internal.y;
import hA0.C40793a;
import hA0.C40794b;

/* compiled from: SuccessScreenAfterApplyActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f291733a;

    /* renamed from: b, reason: collision with root package name */
    public final C40794b f291734b;

    public e(dagger.internal.l lVar, C40794b c40794b) {
        this.f291733a = lVar;
        this.f291734b = c40794b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((SuccessScreenAfterApplyOpenParams) this.f291733a.f393949a, (C40793a) this.f291734b.get());
    }
}
