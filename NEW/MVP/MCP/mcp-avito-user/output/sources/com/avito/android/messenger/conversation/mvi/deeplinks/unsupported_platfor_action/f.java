package com.avito.android.messenger.conversation.mvi.deeplinks.unsupported_platfor_action;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UnsupportedPlatformActionDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final C35868p2 f190677a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f190678b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f190679c;

    public f(C35868p2 c35868p2, dv.b bVar, dv.b bVar2) {
        this.f190677a = c35868p2;
        this.f190678b = bVar;
        this.f190679c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((InterfaceC35845m2) this.f190677a.get(), (a.d) this.f190678b.get(), (a.InterfaceC4053a) this.f190679c.get());
    }
}
