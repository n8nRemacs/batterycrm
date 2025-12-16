package com.avito.android.data_picker_show.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DataPickerShowLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.data_picker_show.d f132533a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f132534b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f132535c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f132536d;

    public b(com.avito.android.data_picker_show.d dVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f132533a = dVar;
        this.f132534b = bVar;
        this.f132535c = bVar2;
        this.f132536d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f132533a.getClass();
        return new a(new com.avito.android.data_picker_show.b(), (a.d) this.f132534b.get(), (a.f) this.f132535c.get(), this.f132536d.get());
    }
}
