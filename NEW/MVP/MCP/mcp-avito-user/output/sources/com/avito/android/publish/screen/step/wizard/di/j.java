package com.avito.android.publish.screen.step.wizard.di;

import Jf0.InterfaceC14192a;
import com.avito.android.publish.screen.step.wizard.di.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: WizardModule_ProvideWizardRepository$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.android.publish.screen.step.wizard.data.e> {

    /* renamed from: a, reason: collision with root package name */
    public final e f242506a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14192a> f242507b;

    /* renamed from: c, reason: collision with root package name */
    public final l f242508c;

    /* renamed from: d, reason: collision with root package name */
    public final l f242509d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C50213a> f242510e;

    public j(e eVar, Provider provider, l lVar, l lVar2, Provider provider2) {
        this.f242506a = eVar;
        this.f242507b = provider;
        this.f242508c = lVar;
        this.f242509d = lVar2;
        this.f242510e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14192a interfaceC14192a = (InterfaceC14192a) ((a.c.h) this.f242507b).get();
        Navigation navigation2 = (Navigation) this.f242508c.f393949a;
        List list = (List) this.f242509d.f393949a;
        C50213a c50213a = (C50213a) ((a.c.e) this.f242510e).get();
        this.f242506a.getClass();
        return new com.avito.android.publish.screen.step.wizard.data.g(interfaceC14192a, navigation2, list, new CategoryParametersConverter(null, null, null, 7, null), c50213a);
    }
}
