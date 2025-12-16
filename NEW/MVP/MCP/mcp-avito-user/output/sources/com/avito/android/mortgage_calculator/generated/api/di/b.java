package com.avito.android.mortgage_calculator.generated.api.di;

import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.DescriptionActionCalculationFieldUpdateFieldV2TypeAdapterFactory;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.LimitsFailureActionFieldV2TypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: UtilJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes15.dex */
public final class b implements h<Set<r>> {

    /* compiled from: UtilJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f204098a = new b();
    }

    public static b a() {
        return a.f204098a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage_calculator.generated.api.di.a.f204097a.getClass();
        Set setL0 = C42756l.l0(new r[]{new DescriptionActionCalculationFieldUpdateFieldV2TypeAdapterFactory(), new LimitsFailureActionFieldV2TypeAdapterFactory()});
        t.d(setL0);
        return setL0;
    }
}
