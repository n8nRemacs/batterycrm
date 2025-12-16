package com.avito.android.job.cv_info_actualization.mvi.domain;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CvActualizationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/domain/CvActualizationInfoBlockOptionsAnswerMode;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvActualizationInfoBlockOptionsAnswerMode {

    /* renamed from: b, reason: collision with root package name */
    public static final CvActualizationInfoBlockOptionsAnswerMode f174116b;

    /* renamed from: c, reason: collision with root package name */
    public static final CvActualizationInfoBlockOptionsAnswerMode f174117c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CvActualizationInfoBlockOptionsAnswerMode[] f174118d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f174119e;

    static {
        CvActualizationInfoBlockOptionsAnswerMode cvActualizationInfoBlockOptionsAnswerMode = new CvActualizationInfoBlockOptionsAnswerMode("SINGLE", 0);
        f174116b = cvActualizationInfoBlockOptionsAnswerMode;
        CvActualizationInfoBlockOptionsAnswerMode cvActualizationInfoBlockOptionsAnswerMode2 = new CvActualizationInfoBlockOptionsAnswerMode("MULTIPLE", 1);
        f174117c = cvActualizationInfoBlockOptionsAnswerMode2;
        CvActualizationInfoBlockOptionsAnswerMode[] cvActualizationInfoBlockOptionsAnswerModeArr = {cvActualizationInfoBlockOptionsAnswerMode, cvActualizationInfoBlockOptionsAnswerMode2};
        f174118d = cvActualizationInfoBlockOptionsAnswerModeArr;
        f174119e = kotlin.enums.c.a(cvActualizationInfoBlockOptionsAnswerModeArr);
    }

    public CvActualizationInfoBlockOptionsAnswerMode() {
        throw null;
    }

    public static CvActualizationInfoBlockOptionsAnswerMode valueOf(String str) {
        return (CvActualizationInfoBlockOptionsAnswerMode) Enum.valueOf(CvActualizationInfoBlockOptionsAnswerMode.class, str);
    }

    public static CvActualizationInfoBlockOptionsAnswerMode[] values() {
        return (CvActualizationInfoBlockOptionsAnswerMode[]) f174118d.clone();
    }
}
