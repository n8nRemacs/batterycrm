package com.avito.android.wallet.page.topup.form.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final w f328284a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.wallet.page.topup.form.items.input.c f328285b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.wallet.page.topup.form.items.shortcut_section.b f328286c;

    /* renamed from: d, reason: collision with root package name */
    public final m f328287d;

    public o(w wVar, com.avito.android.wallet.page.topup.form.items.input.c cVar, com.avito.android.wallet.page.topup.form.items.shortcut_section.b bVar, m mVar) {
        this.f328284a = wVar;
        this.f328285b = cVar;
        this.f328286c = bVar;
        this.f328287d = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.wallet.page.topup.form.items.submit_button_item.a aVar = (com.avito.android.wallet.page.topup.form.items.submit_button_item.a) this.f328284a.get();
        com.avito.android.wallet.page.topup.form.items.input.b bVar = (com.avito.android.wallet.page.topup.form.items.input.b) this.f328285b.get();
        com.avito.android.wallet.page.topup.form.items.shortcut_section.a aVar2 = (com.avito.android.wallet.page.topup.form.items.shortcut_section.a) this.f328286c.get();
        ru.avito.component.info_label.f fVar = (ru.avito.component.info_label.f) this.f328287d.get();
        g.f328273a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(fVar);
        c10493a.b(aVar);
        c10493a.b(bVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
