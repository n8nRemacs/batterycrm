package com.avito.android.publish.di;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.parse.adapter.ImageTypeAdapter;
import com.avito.android.remote.parse.adapter.WizardParametersTypeAdapter;
import com.google.gson.Gson;

/* compiled from: PublishStateGsonModule_ProvideSerializerGsonFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class V implements dagger.internal.h<Gson> {

    /* renamed from: a, reason: collision with root package name */
    public final S f235161a;

    public V(S s5) {
        this.f235161a = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f235161a.getClass();
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.b(WizardParameter.class, new WizardParametersTypeAdapter());
        dVar.b(Image.class, new ImageTypeAdapter());
        return dVar.a();
    }
}
