package com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status;

import Y61.k;
import Y61.l;
import com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status.V1JobCvImportFromFileStatusResponse;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: V1JobCvImportFromFileStatusResponseStatusTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponseStatusTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "V1JobCvImportFromFileStatusResponseStatusTypeAdapter", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class V1JobCvImportFromFileStatusResponseStatusTypeAdapterFactory implements r {

    /* compiled from: V1JobCvImportFromFileStatusResponseStatusTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponseStatusTypeAdapterFactory$V1JobCvImportFromFileStatusResponseStatusTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponse$Status;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class V1JobCvImportFromFileStatusResponseStatusTypeAdapter extends TypeAdapter<V1JobCvImportFromFileStatusResponse.Status> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<V1JobCvImportFromFileStatusResponse.Status> f131685a;

        public V1JobCvImportFromFileStatusResponseStatusTypeAdapter(@k TypeAdapter<V1JobCvImportFromFileStatusResponse.Status> typeAdapter) {
            this.f131685a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final V1JobCvImportFromFileStatusResponse.Status read(a aVar) {
            V1JobCvImportFromFileStatusResponse.Status status = this.f131685a.read(aVar);
            return status == null ? V1JobCvImportFromFileStatusResponse.Status.Pending : status;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, V1JobCvImportFromFileStatusResponse.Status status) {
            this.f131685a.write(cVar, status);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), V1JobCvImportFromFileStatusResponse.Status.class)) {
            return new V1JobCvImportFromFileStatusResponseStatusTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(V1JobCvImportFromFileStatusResponse.Status.class)));
        }
        return null;
    }
}
