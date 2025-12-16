package com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization;

import Y61.k;
import Y61.l;
import com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization.CvActualizationBlock;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvActualizationBlockAttributeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockAttributeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "CvActualizationBlockAttributeTypeAdapter", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvActualizationBlockAttributeTypeAdapterFactory implements r {

    /* compiled from: CvActualizationBlockAttributeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockAttributeTypeAdapterFactory$CvActualizationBlockAttributeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlock$Attribute;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CvActualizationBlockAttributeTypeAdapter extends TypeAdapter<CvActualizationBlock.Attribute> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<CvActualizationBlock.Attribute> f174081a;

        public CvActualizationBlockAttributeTypeAdapter(@k TypeAdapter<CvActualizationBlock.Attribute> typeAdapter) {
            this.f174081a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final CvActualizationBlock.Attribute read(a aVar) {
            CvActualizationBlock.Attribute attribute = this.f174081a.read(aVar);
            return attribute == null ? CvActualizationBlock.Attribute.SearchStatus : attribute;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, CvActualizationBlock.Attribute attribute) {
            this.f174081a.write(cVar, attribute);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), CvActualizationBlock.Attribute.class)) {
            return new CvActualizationBlockAttributeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(CvActualizationBlock.Attribute.class)));
        }
        return null;
    }
}
