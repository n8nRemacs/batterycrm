package com.avito.android.cv_upload.domain;

import Y61.k;
import android.content.Context;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.ConstContent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvUploadMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/domain/e;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f131666a;

    @Inject
    public e(@k Context context) {
        this.f131666a = context;
    }

    @k
    public final It.c a(@k ConstContent constContent) {
        int i12 = constContent.f131758b;
        Context context = this.f131666a;
        return new It.c(context.getString(i12), context.getString(constContent.f131759c));
    }
}
