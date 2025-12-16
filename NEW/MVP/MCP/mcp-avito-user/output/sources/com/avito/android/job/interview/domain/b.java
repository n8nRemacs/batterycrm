package com.avito.android.job.interview.domain;

import Y61.k;
import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: InterviewDraftConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/job/interview/domain/b;", "", "<init>", "()V", "a", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ConstantLocale"})
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final SimpleDateFormat f174546a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final SimpleDateFormat f174547b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final SimpleDateFormat f174548c;

    /* compiled from: InterviewDraftConverter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/avito/android/job/interview/domain/b$a;", "", "<init>", "()V", "", "DATE_PATTERN", "Ljava/lang/String;", "FULL_DATE_PATTERN", "TIME_PATTERN", "UTC_TIMEZONE_ID", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "responseDateFormat", "timeFormat", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f174546a = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault());
        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
        f174547b = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat3.setTimeZone(TimeZone.getDefault());
        f174548c = simpleDateFormat3;
    }

    @Inject
    public b() {
    }
}
