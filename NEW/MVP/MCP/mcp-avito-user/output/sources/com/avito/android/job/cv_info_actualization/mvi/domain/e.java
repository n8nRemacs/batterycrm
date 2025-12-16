package com.avito.android.job.cv_info_actualization.mvi.domain;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvActualizationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/domain/e;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f174141a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f174142b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CvActualizationInfoBlockOptionsAnswerMode f174143c;

    public e(@k String str, boolean z12, @l CvActualizationInfoBlockOptionsAnswerMode cvActualizationInfoBlockOptionsAnswerMode) {
        this.f174141a = str;
        this.f174142b = z12;
        this.f174143c = cvActualizationInfoBlockOptionsAnswerMode;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f174141a, eVar.f174141a) && this.f174142b == eVar.f174142b && this.f174143c == eVar.f174143c;
    }

    public final int hashCode() {
        int i12 = r.i(this.f174141a.hashCode() * 31, 31, this.f174142b);
        CvActualizationInfoBlockOptionsAnswerMode cvActualizationInfoBlockOptionsAnswerMode = this.f174143c;
        return i12 + (cvActualizationInfoBlockOptionsAnswerMode == null ? 0 : cvActualizationInfoBlockOptionsAnswerMode.hashCode());
    }

    @k
    public final String toString() {
        return "CvActualizationInfoBlockOptions(id=" + this.f174141a + ", required=" + this.f174142b + ", answerMode=" + this.f174143c + ')';
    }
}
