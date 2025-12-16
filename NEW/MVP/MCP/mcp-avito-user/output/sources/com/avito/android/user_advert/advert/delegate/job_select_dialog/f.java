package com.avito.android.user_advert.advert.delegate.job_select_dialog;

import Np0.InterfaceC14601a;
import Ut.InterfaceC15565a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobSelectBottomSheetDialogDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308647a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308648b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308649c;

    /* renamed from: d, reason: collision with root package name */
    public final u f308650d;

    public f(u uVar, u uVar2, u uVar3, u uVar4) {
        this.f308647a = uVar;
        this.f308648b = uVar2;
        this.f308649c = uVar3;
        this.f308650d = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.deeplink_handler.handler.composite.a) this.f308647a.get(), (InterfaceC15565a) this.f308648b.get(), (InterfaceC14601a) this.f308649c.get(), (R0) this.f308650d.get());
    }
}
