package com.avito.android.rating_form.api.remote.di;

import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.b1;

/* compiled from: RatingFormJsonModule_ProvideButtonHidingRuleTypeAdapterFactoryFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class c implements h<Set<r>> {

    /* compiled from: RatingFormJsonModule_ProvideButtonHidingRuleTypeAdapterFactoryFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f247972a = new c();
    }

    public static c a() {
        return a.f247972a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_form.api.remote.di.a.f247970a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(RatingFormAddValueType.Button.HidingRule.class);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Button.HidingRule.FieldsHaveBeenRevealedRule.class, "fieldsHaveBeenRevealed", null);
        return b1.g(runtimeTypeAdapterFactory);
    }
}
