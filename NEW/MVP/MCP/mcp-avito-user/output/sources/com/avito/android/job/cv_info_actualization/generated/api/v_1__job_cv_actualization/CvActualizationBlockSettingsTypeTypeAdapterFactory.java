package com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization;

import Y61.k;
import Y61.l;
import com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization.CvActualizationBlockSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvActualizationBlockSettingsTypeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettingsTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "CvActualizationBlockSettingsTypeTypeAdapter", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvActualizationBlockSettingsTypeTypeAdapterFactory implements r {

    /* compiled from: CvActualizationBlockSettingsTypeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettingsTypeTypeAdapterFactory$CvActualizationBlockSettingsTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings$Type;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CvActualizationBlockSettingsTypeTypeAdapter extends TypeAdapter<CvActualizationBlockSettings.Type> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<CvActualizationBlockSettings.Type> f174084a;

        public CvActualizationBlockSettingsTypeTypeAdapter(@k TypeAdapter<CvActualizationBlockSettings.Type> typeAdapter) {
            this.f174084a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final CvActualizationBlockSettings.Type read(a aVar) {
            CvActualizationBlockSettings.Type type = this.f174084a.read(aVar);
            return type == null ? CvActualizationBlockSettings.Type.Radio : type;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, CvActualizationBlockSettings.Type type) {
            this.f174084a.write(cVar, type);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), CvActualizationBlockSettings.Type.class)) {
            return new CvActualizationBlockSettingsTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(CvActualizationBlockSettings.Type.class)));
        }
        return null;
    }
}
