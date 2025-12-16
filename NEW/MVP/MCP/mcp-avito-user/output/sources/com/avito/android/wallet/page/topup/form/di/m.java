package com.avito.android.wallet.page.topup.form.di;

import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideInfoLabelBlueprintFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<ru.avito.component.info_label.f> {

    /* renamed from: a, reason: collision with root package name */
    public final n f328282a;

    public m(n nVar) {
        this.f328282a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ru.avito.component.info_label.h hVar = (ru.avito.component.info_label.h) this.f328282a.get();
        g.f328273a.getClass();
        return new ru.avito.component.info_label.f(hVar);
    }
}
