package com.avito.android.cv_upload.screens.cv_upload;

import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CvUploadParams.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_cv-upload_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {
    @k
    public static final CvUploadParams a(@k Intent intent) {
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("cv_upload_params", CvUploadParams.class) : intent.getParcelableExtra("cv_upload_params");
        if (parcelableExtra != null) {
            return (CvUploadParams) parcelableExtra;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
