package com.avito.android.cv_validation_bottom_sheet.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvValidationDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f131813a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f131814b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f131815c;

    public d(dv.b bVar, dv.b bVar2, dv.b bVar3) {
        this.f131813a = bVar;
        this.f131814b = bVar2;
        this.f131815c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f131813a.get(), (a.f) this.f131814b.get(), (a.i) this.f131815c.get());
    }
}
