package com.avito.android.job.cv_info_actualization.mvi.domain;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CvActualizationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/domain/CvActualizationInfoBlockType;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvActualizationInfoBlockType {

    /* renamed from: b, reason: collision with root package name */
    public static final CvActualizationInfoBlockType f174120b;

    /* renamed from: c, reason: collision with root package name */
    public static final CvActualizationInfoBlockType f174121c;

    /* renamed from: d, reason: collision with root package name */
    public static final CvActualizationInfoBlockType f174122d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CvActualizationInfoBlockType[] f174123e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f174124f;

    static {
        CvActualizationInfoBlockType cvActualizationInfoBlockType = new CvActualizationInfoBlockType("RADIO", 0);
        f174120b = cvActualizationInfoBlockType;
        CvActualizationInfoBlockType cvActualizationInfoBlockType2 = new CvActualizationInfoBlockType("CHIPS", 1);
        f174121c = cvActualizationInfoBlockType2;
        CvActualizationInfoBlockType cvActualizationInfoBlockType3 = new CvActualizationInfoBlockType("CHECKBOX", 2);
        f174122d = cvActualizationInfoBlockType3;
        CvActualizationInfoBlockType[] cvActualizationInfoBlockTypeArr = {cvActualizationInfoBlockType, cvActualizationInfoBlockType2, cvActualizationInfoBlockType3};
        f174123e = cvActualizationInfoBlockTypeArr;
        f174124f = kotlin.enums.c.a(cvActualizationInfoBlockTypeArr);
    }

    public CvActualizationInfoBlockType() {
        throw null;
    }

    public static CvActualizationInfoBlockType valueOf(String str) {
        return (CvActualizationInfoBlockType) Enum.valueOf(CvActualizationInfoBlockType.class, str);
    }

    public static CvActualizationInfoBlockType[] values() {
        return (CvActualizationInfoBlockType[]) f174123e.clone();
    }
}
