package com.avito.android.cv_validation_need_draft.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mQ.InterfaceC44001a;

/* compiled from: CvValidationDraftDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f131971a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44001a> f131972b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f131973c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f131974d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f131975e;

    public e(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f131971a = fVar;
        this.f131972b = provider;
        this.f131973c = bVar;
        this.f131974d = bVar2;
        this.f131975e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.deeplink_handler.handler.composite.a) this.f131971a.get(), g.b(this.f131972b), (a.g) this.f131973c.get(), (a.i) this.f131974d.get(), this.f131975e.get());
    }
}
