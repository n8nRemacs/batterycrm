package com.avito.android.autoteka.deeplinks.buyReportLink;

import com.avito.android.deep_linking.links.L;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaBuyReportLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f96250a;

    /* renamed from: b, reason: collision with root package name */
    public final C35868p2 f96251b;

    /* renamed from: c, reason: collision with root package name */
    public final u f96252c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f96253d;

    public c(dv.b bVar, C35868p2 c35868p2, u uVar, dv.b bVar2) {
        this.f96250a = bVar;
        this.f96251b = c35868p2;
        this.f96252c = uVar;
        this.f96253d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f96250a.get(), (InterfaceC35845m2) this.f96251b.get(), (L) this.f96252c.get(), (a.i) this.f96253d.get());
    }
}
