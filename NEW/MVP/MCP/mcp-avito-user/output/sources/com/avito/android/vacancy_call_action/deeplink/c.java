package com.avito.android.vacancy_call_action.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VacancyCallActionDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f319212a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f319213b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.vacancy_call_action.domain.d f319214c;

    /* renamed from: d, reason: collision with root package name */
    public final f f319215d;

    public c(Provider provider, dv.b bVar, com.avito.android.vacancy_call_action.domain.d dVar, f fVar) {
        this.f319212a = provider;
        this.f319213b = bVar;
        this.f319214c = dVar;
        this.f319215d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f319212a.get(), (a.g) this.f319213b.get(), (com.avito.android.vacancy_call_action.domain.b) this.f319214c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f319215d.get());
    }
}
