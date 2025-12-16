package com.avito.android.cv_upload.screens.cv_upload.mvi.entity;

import Y61.k;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink.JobCvUploadLink;
import j.e0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CvUploadState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadButton;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvUploadButton {

    /* renamed from: d, reason: collision with root package name */
    public static final CvUploadButton f131760d;

    /* renamed from: e, reason: collision with root package name */
    public static final CvUploadButton f131761e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CvUploadButton[] f131762f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f131763g;

    /* renamed from: b, reason: collision with root package name */
    public final int f131764b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f131765c;

    static {
        CvUploadButton cvUploadButton = new CvUploadButton("TRY_ONE_MORE_TIME", 0, R.string.try_one_more_time_button, new JobCvUploadLink("cv_upload_screen", false, null, 6, null));
        f131760d = cvUploadButton;
        CvUploadButton cvUploadButton2 = new CvUploadButton("OK", 1, R.string.ok_btn, new NoMatchLink());
        f131761e = cvUploadButton2;
        CvUploadButton[] cvUploadButtonArr = {cvUploadButton, cvUploadButton2};
        f131762f = cvUploadButtonArr;
        f131763g = c.a(cvUploadButtonArr);
    }

    public CvUploadButton(@e0 String str, int i12, int i13, DeepLink deepLink) {
        this.f131764b = i13;
        this.f131765c = deepLink;
    }

    public static CvUploadButton valueOf(String str) {
        return (CvUploadButton) Enum.valueOf(CvUploadButton.class, str);
    }

    public static CvUploadButton[] values() {
        return (CvUploadButton[]) f131762f.clone();
    }
}
