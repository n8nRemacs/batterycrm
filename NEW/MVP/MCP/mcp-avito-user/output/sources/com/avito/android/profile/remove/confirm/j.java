package com.avito.android.profile.remove.confirm;

import com.avito.android.account.InterfaceC27663a;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveConfirmInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f223861a;

    /* renamed from: b, reason: collision with root package name */
    public final u f223862b;

    /* renamed from: c, reason: collision with root package name */
    public final H90.a f223863c;

    /* renamed from: d, reason: collision with root package name */
    public final u f223864d;

    public j(u uVar, u uVar2, H90.a aVar, u uVar3) {
        this.f223861a = uVar;
        this.f223862b = uVar2;
        this.f223863c = aVar;
        this.f223864d = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((InterfaceC34401z0) this.f223861a.get(), (InterfaceC27663a) this.f223862b.get(), (ProfileRemoveAnalytics) this.f223863c.get(), (R0) this.f223864d.get());
    }
}
