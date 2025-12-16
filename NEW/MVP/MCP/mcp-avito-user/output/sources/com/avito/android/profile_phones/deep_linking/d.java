package com.avito.android.profile_phones.deep_linking;

import com.avito.android.N1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.S3;
import dagger.internal.x;
import dagger.internal.y;
import mb0.C44043c;

/* compiled from: MobilePhoneVerificationAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f227125a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f227126b;

    /* renamed from: c, reason: collision with root package name */
    public final C44043c f227127c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f227128d;

    /* renamed from: e, reason: collision with root package name */
    public final S3 f227129e;

    public d(dv.b bVar, dv.b bVar2, C44043c c44043c, dagger.internal.f fVar, S3 s32) {
        this.f227125a = bVar;
        this.f227126b = bVar2;
        this.f227127c = c44043c;
        this.f227128d = fVar;
        this.f227129e = s32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.b bVar = (a.b) this.f227125a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f227126b.get();
        N1 n12 = (N1) this.f227127c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f227128d.get();
        this.f227129e.getClass();
        return new c(bVar, interfaceC4053a, n12, interfaceC28373a, S3.a());
    }
}
