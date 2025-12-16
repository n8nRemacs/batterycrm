package com.avito.android.publish.di;

import com.avito.android.publish.PublishSession;
import com.avito.android.publish.PublishState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.parse.adapter.ImageTypeAdapter;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.WizardParametersTypeAdapter;
import com.google.gson.Gson;

/* compiled from: PublishStateGsonModule_ProvideDeserializerGsonFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class U implements dagger.internal.h<Gson> {

    /* renamed from: a, reason: collision with root package name */
    public final S f235160a;

    public U(S s5) {
        this.f235160a = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f235160a.getClass();
        com.google.gson.d dVar = new com.google.gson.d();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryD = com.avito.android.authorization.auto_recovery.phone_confirm.b.d(RuntimeTypeAdapterFactory.f254218g, PublishState.StepState.class);
        runtimeTypeAdapterFactoryD.b(PublishState.StepState.Wizard.class, PublishSession.StepType.f232006h.toString(), null);
        runtimeTypeAdapterFactoryD.b(PublishState.StepState.CategoriesSuggestions.class, PublishSession.StepType.f232014p.toString(), null);
        runtimeTypeAdapterFactoryD.b(PublishState.StepState.Vin.class, PublishSession.StepType.f232007i.toString(), null);
        runtimeTypeAdapterFactoryD.b(PublishState.StepState.Imei.class, PublishSession.StepType.f232008j.toString(), null);
        dVar.c(runtimeTypeAdapterFactoryD);
        dVar.b(WizardParameter.class, new WizardParametersTypeAdapter());
        dVar.b(Image.class, new ImageTypeAdapter());
        return dVar.a();
    }
}
