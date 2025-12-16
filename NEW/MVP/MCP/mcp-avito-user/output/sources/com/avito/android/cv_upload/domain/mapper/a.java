package com.avito.android.cv_upload.domain.mapper;

import com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status.V1JobCvImportFromFileStatusResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: V1JobCvImportFromFileStatusResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_upload/domain/mapper/a;", "", "<init>", "()V", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: V1JobCvImportFromFileStatusResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cv_upload.domain.mapper.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3941a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131668a;

        static {
            int[] iArr = new int[V1JobCvImportFromFileStatusResponse.Status.values().length];
            try {
                iArr[V1JobCvImportFromFileStatusResponse.Status.Pending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[V1JobCvImportFromFileStatusResponse.Status.Done.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[V1JobCvImportFromFileStatusResponse.Status.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131668a = iArr;
        }
    }

    @Inject
    public a() {
    }
}
