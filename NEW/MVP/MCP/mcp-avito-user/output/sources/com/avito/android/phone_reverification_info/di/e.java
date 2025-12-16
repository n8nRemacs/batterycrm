package com.avito.android.phone_reverification_info.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneReverificationItemsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.phone_reverification_info.items.header.c f216089a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.phone_reverification_info.items.attention.c f216090b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.phone_reverification_info.items.text.c f216091c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.phone_reverification_info.items.text_point.c f216092d;

    public e(com.avito.android.phone_reverification_info.items.header.c cVar, com.avito.android.phone_reverification_info.items.attention.c cVar2, com.avito.android.phone_reverification_info.items.text.c cVar3, com.avito.android.phone_reverification_info.items.text_point.c cVar4) {
        this.f216089a = cVar;
        this.f216090b = cVar2;
        this.f216091c = cVar3;
        this.f216092d = cVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.phone_reverification_info.items.header.b bVar = (com.avito.android.phone_reverification_info.items.header.b) this.f216089a.get();
        com.avito.android.phone_reverification_info.items.attention.b bVar2 = (com.avito.android.phone_reverification_info.items.attention.b) this.f216090b.get();
        com.avito.android.phone_reverification_info.items.text.b bVar3 = (com.avito.android.phone_reverification_info.items.text.b) this.f216091c.get();
        com.avito.android.phone_reverification_info.items.text_point.b bVar4 = (com.avito.android.phone_reverification_info.items.text_point.b) this.f216092d.get();
        d.f216088a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(bVar4);
        return c10493a.a();
    }
}
