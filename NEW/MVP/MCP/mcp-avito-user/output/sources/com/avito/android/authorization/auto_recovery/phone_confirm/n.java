package com.avito.android.authorization.auto_recovery.phone_confirm;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.S3;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: AutoRecoveryDialogBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f93260a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f93261b;

    /* renamed from: c, reason: collision with root package name */
    public final S3 f93262c;

    /* renamed from: d, reason: collision with root package name */
    public final u f93263d;

    public n(dagger.internal.f fVar, Provider provider, S3 s32, u uVar) {
        this.f93260a = fVar;
        this.f93261b = provider;
        this.f93262c = s32;
        this.f93263d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f93260a.get();
        com.avito.android.util.text.a aVar = this.f93261b.get();
        this.f93262c.getClass();
        return new l(interfaceC28373a, aVar, S3.a(), (Y1) this.f93263d.get());
    }
}
