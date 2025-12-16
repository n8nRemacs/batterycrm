package com.avito.android.cv_upload.screens.cv_upload.mvi.entity;

import com.avito.android.R;
import j.e0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CvUploadState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/ConstContent;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConstContent {

    /* renamed from: d, reason: collision with root package name */
    public static final ConstContent f131752d;

    /* renamed from: e, reason: collision with root package name */
    public static final ConstContent f131753e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConstContent f131754f;

    /* renamed from: g, reason: collision with root package name */
    public static final ConstContent f131755g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ConstContent[] f131756h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f131757i;

    /* renamed from: b, reason: collision with root package name */
    public final int f131758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131759c;

    static {
        ConstContent constContent = new ConstContent("UPLOADING_THE_FILE", 0, R.string.uploading_the_file_title, R.string.it_takes_a_few_seconds_subtitle);
        f131752d = constContent;
        ConstContent constContent2 = new ConstContent("UPLOADING_THE_FILE_TOO_LONG", 1, R.string.need_a_little_more_time_title, R.string.the_file_is_still_loading_subtitle);
        f131753e = constContent2;
        ConstContent constContent3 = new ConstContent("FILE_IS_UPLOADED", 2, R.string.the_file_is_uploaded_title, R.string.we_will_send_you_a_notification_subtitle);
        f131754f = constContent3;
        ConstContent constContent4 = new ConstContent("FILE_IS_TOO_LARGE", 3, R.string.file_is_too_large_title, R.string.try_to_compress_it_subtitle);
        f131755g = constContent4;
        ConstContent[] constContentArr = {constContent, constContent2, constContent3, constContent4};
        f131756h = constContentArr;
        f131757i = c.a(constContentArr);
    }

    public ConstContent(@e0 String str, @e0 int i12, int i13, int i14) {
        this.f131758b = i13;
        this.f131759c = i14;
    }

    public static ConstContent valueOf(String str) {
        return (ConstContent) Enum.valueOf(ConstContent.class, str);
    }

    public static ConstContent[] values() {
        return (ConstContent[]) f131756h.clone();
    }
}
