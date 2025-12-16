package com.avito.android.remote.autoteka.generated.api.get_step_report_status_api;

import Dj0.C13407a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetStepReportStatusApiResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001fBA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006 "}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_report_status_api/GetStepReportStatusApiResponse;", "", "LDj0/a;", "action", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "reportPublicId", "", "retryAfterMs", "Lcom/avito/android/remote/autoteka/generated/api/get_step_report_status_api/GetStepReportStatusApiResponse$Status;", "status", "title", "<init>", "(LDj0/a;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/remote/autoteka/generated/api/get_step_report_status_api/GetStepReportStatusApiResponse$Status;Ljava/lang/String;)V", "LDj0/a;", "a", "()LDj0/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "Lcom/avito/android/remote/autoteka/generated/api/get_step_report_status_api/GetStepReportStatusApiResponse$Status;", "e", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_report_status_api/GetStepReportStatusApiResponse$Status;", "f", "Status", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GetStepReportStatusApiResponse {

    @c("action")
    @l
    private final C13407a action;

    @c("description")
    @l
    private final AttributedText description;

    @c("reportPublicId")
    @l
    private final String reportPublicId;

    @c("retryAfterMs")
    @l
    private final Long retryAfterMs;

    @c("status")
    @k
    private final Status status;

    @c("title")
    @l
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetStepReportStatusApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_report_status_api/GetStepReportStatusApiResponse$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Pending", "Completed", "Failed", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("completed")
        public static final Status Completed;

        @c(PaymentStateKt.PAYMENT_STATE_FAILED)
        public static final Status Failed;

        @c("pending")
        public static final Status Pending;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f253288b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f253289c;

        static {
            Status status = new Status("Pending", 0, "pending");
            Pending = status;
            Status status2 = new Status("Completed", 1, "completed");
            Completed = status2;
            Status status3 = new Status("Failed", 2, PaymentStateKt.PAYMENT_STATE_FAILED);
            Failed = status3;
            Status[] statusArr = {status, status2, status3};
            f253288b = statusArr;
            f253289c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f253288b.clone();
        }
    }

    public GetStepReportStatusApiResponse(@l C13407a c13407a, @l AttributedText attributedText, @l String str, @l Long l12, @k Status status, @l String str2) {
        this.action = c13407a;
        this.description = attributedText;
        this.reportPublicId = str;
        this.retryAfterMs = l12;
        this.status = status;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C13407a getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getReportPublicId() {
        return this.reportPublicId;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getRetryAfterMs() {
        return this.retryAfterMs;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
