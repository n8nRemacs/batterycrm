package com.avito.android.passport.profile_switch;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PassportSwitchProfileLinkHandlerModule_ProvideSwitchProfileDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f213717a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f213718b;

    public q(k kVar, dagger.internal.f fVar) {
        this.f213717a = kVar;
        this.f213718b = fVar;
    }

    public static C43834a a(k kVar, InterfaceC28373a interfaceC28373a) {
        p.f213716a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PassportSwitchProfileLink.class, new r(interfaceC28373a), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PassportSwitchProfileLink.class), kVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f213717a, (InterfaceC28373a) this.f213718b.get());
    }
}
