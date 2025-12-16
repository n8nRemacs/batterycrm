package com.avito.android.rating_form.api.remote.di;

import com.adjust.sdk.Constants;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.b1;

/* compiled from: RatingFormJsonModule_ProvideButtonCommandTypeAdapterFactoryFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class b implements h<Set<r>> {

    /* compiled from: RatingFormJsonModule_ProvideButtonCommandTypeAdapterFactoryFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f247971a = new b();
    }

    public static b a() {
        return a.f247971a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_form.api.remote.di.a.f247970a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(RatingFormAddValueType.Command.class);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Command.FinishCommand.class, "finishStep", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Command.SendDeeplinkCommand.class, Constants.DEEPLINK, null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Command.RevealFieldsCommand.class, "revealFields", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Command.ControlFieldsCommand.class, "controlFields", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Command.CloseCommand.class, "closeForm", null);
        return b1.g(runtimeTypeAdapterFactory);
    }
}
