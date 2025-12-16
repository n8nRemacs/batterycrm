package com.avito.android.cv_upload.generated.api.di;

import com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status.V1JobCvImportFromFileStatusResponseStatusTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: CvUploadJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes12.dex */
public final class b implements h<Set<r>> {

    /* compiled from: CvUploadJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f131682a = new b();
    }

    public static b a() {
        return a.f131682a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.cv_upload.generated.api.di.a.f131681a.getClass();
        return Collections.singleton(new V1JobCvImportFromFileStatusResponseStatusTypeAdapterFactory());
    }
}
