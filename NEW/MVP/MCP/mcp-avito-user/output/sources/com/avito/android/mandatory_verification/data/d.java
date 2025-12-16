package com.avito.android.mandatory_verification.data;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.MultipartBody;

/* compiled from: MandatoryVerificationRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/data/d;", "", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d {
    @k
    InterfaceC43160i<FileUploadResult> b(@k String str, @k MultipartBody.Part part);

    @k
    InterfaceC43160i<FileDeleteResult> c(@k String str, @k String str2);

    @l
    Object d(long j12, @k String str, @k ContinuationImpl continuationImpl);

    @l
    Object e(long j12, @k ContinuationImpl continuationImpl);
}
