package com.avito.android.cv_upload.deeplink_handling.cv_upload;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hO.InterfaceC40860a;

/* compiled from: CvUploadDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f131626a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f131627b;

    /* renamed from: c, reason: collision with root package name */
    public final Mt.c f131628c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.cv_upload.features.d f131629d;

    public d(dv.b bVar, dv.b bVar2, Mt.c cVar, com.avito.android.cv_upload.features.d dVar) {
        this.f131626a = bVar;
        this.f131627b = bVar2;
        this.f131628c = cVar;
        this.f131629d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f131626a.get(), (a.b) this.f131627b.get(), (InterfaceC40860a) this.f131628c.get(), (com.avito.android.cv_upload.features.a) this.f131629d.get());
    }
}
