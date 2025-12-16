package com.avito.android.advert.deeplinks.chrome_tab;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CustomChromeTabLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f68902a;

    /* renamed from: b, reason: collision with root package name */
    public final C35868p2 f68903b;

    public d(dv.b bVar, C35868p2 c35868p2) {
        this.f68902a = bVar;
        this.f68903b = c35868p2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.InterfaceC4053a) this.f68902a.get(), (InterfaceC35845m2) this.f68903b.get());
    }
}
