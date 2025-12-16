package com.avito.android.job.cv_info_actualization.generated.api.di;

import com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization.CvActualizationBlockAttributeTypeAdapterFactory;
import com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization.CvActualizationBlockSettingsTypeTypeAdapterFactory;
import com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization_save.CvActualizationSaveRequestAttributesItemAttributeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: CvInfoActualizationJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<Set<r>> {

    /* compiled from: CvInfoActualizationJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f174078a = new b();
    }

    public static b a() {
        return a.f174078a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.job.cv_info_actualization.generated.api.di.a.f174077a.getClass();
        Set setL0 = C42756l.l0(new r[]{new CvActualizationBlockAttributeTypeAdapterFactory(), new CvActualizationBlockSettingsTypeTypeAdapterFactory(), new CvActualizationSaveRequestAttributesItemAttributeTypeAdapterFactory()});
        t.d(setL0);
        return setL0;
    }
}
