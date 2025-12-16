package com.avito.android.job.cv_info_actualization.mvi.domain;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CvActualizationBlockAttribute.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/domain/CvActualizationBlockAttribute;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvActualizationBlockAttribute {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CvActualizationBlockAttribute[] f174114b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f174115c;

    static {
        CvActualizationBlockAttribute[] cvActualizationBlockAttributeArr = {new CvActualizationBlockAttribute("PHONE", 0), new CvActualizationBlockAttribute("SEARCH_STATUS", 1), new CvActualizationBlockAttribute("CAN_START_WORK_TOMORROW", 2), new CvActualizationBlockAttribute("TYPE_OF_JOB", 3)};
        f174114b = cvActualizationBlockAttributeArr;
        f174115c = kotlin.enums.c.a(cvActualizationBlockAttributeArr);
    }

    public static CvActualizationBlockAttribute valueOf(String str) {
        return (CvActualizationBlockAttribute) Enum.valueOf(CvActualizationBlockAttribute.class, str);
    }

    public static CvActualizationBlockAttribute[] values() {
        return (CvActualizationBlockAttribute[]) f174114b.clone();
    }
}
