package com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status;

import Kt.C14348a;
import Kt.b;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: V1JobCvImportFromFileStatusResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponse;", "", "LKt/a;", "action", "LKt/b;", "error", "Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponse$Status;", "status", "<init>", "(LKt/a;LKt/b;Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponse$Status;)V", "LKt/a;", "a", "()LKt/a;", "LKt/b;", "b", "()LKt/b;", "Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponse$Status;", "c", "()Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponse$Status;", "Status", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class V1JobCvImportFromFileStatusResponse {

    @c("action")
    @l
    private final C14348a action;

    @c("error")
    @l
    private final b error;

    @c("status")
    @k
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: V1JobCvImportFromFileStatusResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/cv_upload/generated/api/v_1__job_cv_import_from_file_status/V1JobCvImportFromFileStatusResponse$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Pending", "Done", "Error", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c(PaymentStateKt.PAYMENT_STATE_DONE)
        public static final Status Done;

        @c("error")
        public static final Status Error;

        @c("pending")
        public static final Status Pending;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f131683b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f131684c;

        static {
            Status status = new Status("Pending", 0, "pending");
            Pending = status;
            Status status2 = new Status("Done", 1, PaymentStateKt.PAYMENT_STATE_DONE);
            Done = status2;
            Status status3 = new Status("Error", 2, "error");
            Error = status3;
            Status[] statusArr = {status, status2, status3};
            f131683b = statusArr;
            f131684c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f131683b.clone();
        }
    }

    public V1JobCvImportFromFileStatusResponse(@l C14348a c14348a, @l b bVar, @k Status status) {
        this.action = c14348a;
        this.error = bVar;
        this.status = status;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C14348a getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final b getError() {
        return this.error;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }
}
