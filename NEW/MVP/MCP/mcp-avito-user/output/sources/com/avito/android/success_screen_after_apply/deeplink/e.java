package com.avito.android.success_screen_after_apply.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuccessScreenAfterApplyDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f291712a;

    /* renamed from: b, reason: collision with root package name */
    public final iA0.c f291713b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f291714c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f291715d;

    public e(dv.b bVar, iA0.c cVar, dv.b bVar2, Provider provider) {
        this.f291712a = bVar;
        this.f291713b = cVar;
        this.f291714c = bVar2;
        this.f291715d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f291712a.get(), g.a(w.a(this.f291713b)), (a.f) this.f291714c.get(), this.f291715d.get());
    }
}
