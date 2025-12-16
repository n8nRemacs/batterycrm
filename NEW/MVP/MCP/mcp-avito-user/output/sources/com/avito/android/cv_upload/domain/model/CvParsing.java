package com.avito.android.cv_upload.domain.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CvParsingResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/domain/model/CvParsing;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvParsing {

    /* renamed from: b, reason: collision with root package name */
    public static final CvParsing f131671b;

    /* renamed from: c, reason: collision with root package name */
    public static final CvParsing f131672c;

    /* renamed from: d, reason: collision with root package name */
    public static final CvParsing f131673d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CvParsing[] f131674e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f131675f;

    static {
        CvParsing cvParsing = new CvParsing("PENDING", 0);
        f131671b = cvParsing;
        CvParsing cvParsing2 = new CvParsing("DONE", 1);
        f131672c = cvParsing2;
        CvParsing cvParsing3 = new CvParsing("ERROR", 2);
        f131673d = cvParsing3;
        CvParsing[] cvParsingArr = {cvParsing, cvParsing2, cvParsing3};
        f131674e = cvParsingArr;
        f131675f = c.a(cvParsingArr);
    }

    public CvParsing() {
        throw null;
    }

    public static CvParsing valueOf(String str) {
        return (CvParsing) Enum.valueOf(CvParsing.class, str);
    }

    public static CvParsing[] values() {
        return (CvParsing[]) f131674e.clone();
    }
}
