package com.avito.android.phone_confirmation.di;

import com.avito.android.phone_confirmation.C33146b;
import com.avito.android.phone_confirmation.U;
import com.avito.android.phone_confirmation.X;
import com.avito.android.phone_confirmation.di.a;
import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.remote.r;
import com.avito.android.server_time.f;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import s70.InterfaceC48008b;

/* compiled from: PhoneConfirmationModule_ProvidePhoneConfirmationInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final d f215923a;

    /* renamed from: b, reason: collision with root package name */
    public final l f215924b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<r> f215925c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<f> f215926d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC48008b> f215927e;

    /* renamed from: f, reason: collision with root package name */
    public final l f215928f;

    /* renamed from: g, reason: collision with root package name */
    public final S3 f215929g;

    public e(d dVar, l lVar, Provider provider, Provider provider2, Provider provider3, l lVar2, S3 s32) {
        this.f215923a = dVar;
        this.f215924b = lVar;
        this.f215925c = provider;
        this.f215926d = provider2;
        this.f215927e = provider3;
        this.f215928f = lVar2;
        this.f215929g = s32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f215924b.f393949a).booleanValue();
        r rVar = (r) ((a.c.C6476a) this.f215925c).get();
        f fVar = (f) ((a.c.C6477c) this.f215926d).get();
        InterfaceC48008b interfaceC48008b = this.f215927e.get();
        PhoneConfirmationScreenState phoneConfirmationScreenState = (PhoneConfirmationScreenState) this.f215928f.f393949a;
        this.f215929g.getClass();
        L4 l4A = S3.a();
        this.f215923a.getClass();
        return zBooleanValue ? new C33146b(rVar, fVar, interfaceC48008b, phoneConfirmationScreenState, l4A) : new X(rVar, fVar, interfaceC48008b, phoneConfirmationScreenState, l4A);
    }
}
