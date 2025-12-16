package com.avito.android.safedeal.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.C33879l0;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.suggest_locations.C35141f;
import com.avito.android.suggest_locations.InterfaceC35139d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryCourierLocationSelectLinkDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f256033a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f256034b;

    /* renamed from: c, reason: collision with root package name */
    public final C35141f f256035c;

    /* renamed from: d, reason: collision with root package name */
    public final C33879l0 f256036d;

    public c(dv.b bVar, dv.b bVar2, C35141f c35141f, C33879l0 c33879l0) {
        this.f256033a = bVar;
        this.f256034b = bVar2;
        this.f256035c = c35141f;
        this.f256036d = c33879l0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f256033a.get(), (a.InterfaceC4053a) this.f256034b.get(), (InterfaceC35139d) this.f256035c.get(), (PublishIntentFactory) this.f256036d.get());
    }
}
