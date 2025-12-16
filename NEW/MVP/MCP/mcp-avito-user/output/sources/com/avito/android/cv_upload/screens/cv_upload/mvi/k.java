package com.avito.android.cv_upload.screens.cv_upload.mvi;

import Ot.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvUploadOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "LOt/b;", "<init>", "()V", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements t<CvUploadInternalAction, Ot.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ot.b b(CvUploadInternalAction cvUploadInternalAction) {
        CvUploadInternalAction cvUploadInternalAction2 = cvUploadInternalAction;
        if (cvUploadInternalAction2 instanceof CvUploadInternalAction.ReceivedDeeplink) {
            return new b.a(((CvUploadInternalAction.ReceivedDeeplink) cvUploadInternalAction2).f131769b);
        }
        return null;
    }
}
