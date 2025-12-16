package com.avito.android.cv_upload.screens.cv_upload.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.ConstContent;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadButton;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CvUploadReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "LOt/c;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements u<CvUploadInternalAction, Ot.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_upload.domain.e f131785b;

    @Inject
    public m(@Y61.k com.avito.android.cv_upload.domain.e eVar) {
        this.f131785b = eVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ot.c a(CvUploadInternalAction cvUploadInternalAction, Ot.c cVar) {
        Ot.c cVar2;
        CvUploadInternalAction cvUploadInternalAction2 = cvUploadInternalAction;
        Ot.c cVar3 = cVar;
        if (cvUploadInternalAction2 instanceof CvUploadInternalAction.ScreenLoading) {
            return Ot.c.a(cVar3, null, null, 14);
        }
        boolean z12 = cvUploadInternalAction2 instanceof CvUploadInternalAction.FileLoading;
        com.avito.android.cv_upload.domain.e eVar = this.f131785b;
        if (z12) {
            eVar.getClass();
            return Ot.c.a(cVar3, eVar.a(((CvUploadInternalAction.FileLoading) cvUploadInternalAction2).f131767b ? ConstContent.f131753e : ConstContent.f131752d), null, 12);
        }
        if (cvUploadInternalAction2 instanceof CvUploadInternalAction.Content) {
            cVar2 = new Ot.c(false, ((CvUploadInternalAction.Content) cvUploadInternalAction2).f131766b, null, CvUploadButton.f131760d);
        } else {
            if (!(cvUploadInternalAction2 instanceof CvUploadInternalAction.ParsedWithPending)) {
                if (cvUploadInternalAction2 instanceof CvUploadInternalAction.ReceivedDeeplink) {
                    return cVar3;
                }
                if (cvUploadInternalAction2 instanceof CvUploadInternalAction.ServerError) {
                    return Ot.c.a(cVar3, null, ((CvUploadInternalAction.ServerError) cvUploadInternalAction2).f131770b, 11);
                }
                throw new NoWhenBranchMatchedException();
            }
            cVar2 = new Ot.c(false, eVar.a(ConstContent.f131754f), null, CvUploadButton.f131761e);
        }
        return cVar2;
    }
}
