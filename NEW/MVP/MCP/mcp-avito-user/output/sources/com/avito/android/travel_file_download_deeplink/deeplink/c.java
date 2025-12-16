package com.avito.android.travel_file_download_deeplink.deeplink;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.travel_file_download_deeplink.f;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileDownloadDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f301722a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f301723b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f301724c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f301725d;

    /* renamed from: e, reason: collision with root package name */
    public final C25721c f301726e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f301727f;

    /* renamed from: g, reason: collision with root package name */
    public final f f301728g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f301729h;

    public c(C30102l3 c30102l3, dv.b bVar, dv.b bVar2, dv.b bVar3, C25721c c25721c, dv.b bVar4, f fVar, Provider provider) {
        this.f301722a = c30102l3;
        this.f301723b = bVar;
        this.f301724c = bVar2;
        this.f301725d = bVar3;
        this.f301726e = c25721c;
        this.f301727f = bVar4;
        this.f301728g = fVar;
        this.f301729h = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f301722a.get(), (a.h) this.f301723b.get(), (a.InterfaceC4053a) this.f301724c.get(), (a.b) this.f301725d.get(), (C25719a) this.f301726e.get(), (a.i) this.f301727f.get(), (com.avito.android.travel_file_download_deeplink.d) this.f301728g.get(), this.f301729h.get());
    }
}
