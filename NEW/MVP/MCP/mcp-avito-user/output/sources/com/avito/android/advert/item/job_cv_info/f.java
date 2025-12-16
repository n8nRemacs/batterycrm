package com.avito.android.advert.item.job_cv_info;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.cv.JobCvInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCvInfoPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/job_cv_info/f;", "Lcom/avito/android/advert/item/job_cv_info/e;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String appliedAt;
        i iVar = (i) eVar;
        JobCvInfo jobCvInfo = ((AdvertCvInfoItem) aVar).f77201d;
        String title = jobCvInfo.getTitle();
        String updatedAt = jobCvInfo.getUpdatedAt();
        String type = jobCvInfo.getAccess().getType();
        if (L.f(type, "cv")) {
            appliedAt = jobCvInfo.getAccess().getBoughtAt();
            if (appliedAt == null) {
                return;
            }
        } else if (!L.f(type, "apply") || (appliedAt = jobCvInfo.getAccess().getAppliedAt()) == null) {
            return;
        }
        iVar.h50(jobCvInfo.getAccess().getVacancyAttributedText(), title, updatedAt, appliedAt);
    }
}
