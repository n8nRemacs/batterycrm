package com.avito.android.str_seller_orders_important_to_note.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerImportantToNoteDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f291261a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f291262b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f291263c;

    public d(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f291261a = bVar;
        this.f291262b = bVar2;
        this.f291263c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f291261a.get(), (a.f) this.f291262b.get(), this.f291263c.get());
    }
}
