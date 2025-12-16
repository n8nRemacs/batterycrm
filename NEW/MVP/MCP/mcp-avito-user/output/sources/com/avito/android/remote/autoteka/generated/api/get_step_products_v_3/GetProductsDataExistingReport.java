package com.avito.android.remote.autoteka.generated.api.get_step_products_v_3;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetStepProductsV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0017B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "reportPublicId", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport$Status;", "status", "title", "usagePublicId", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport$Status;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport$Status;", "getStatus", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport$Status;", "c", "d", "Status", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GetProductsDataExistingReport {

    @c("description")
    @k
    private final AttributedText description;

    @c("reportPublicId")
    @k
    private final String reportPublicId;

    @c("status")
    @k
    private final Status status;

    @c("title")
    @k
    private final String title;

    @c("usagePublicId")
    @l
    private final String usagePublicId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetStepProductsV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Pending", "Completed", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("completed")
        public static final Status Completed;

        @c("pending")
        public static final Status Pending;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f253284b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f253285c;

        static {
            Status status = new Status("Pending", 0, "pending");
            Pending = status;
            Status status2 = new Status("Completed", 1, "completed");
            Completed = status2;
            Status[] statusArr = {status, status2};
            f253284b = statusArr;
            f253285c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f253284b.clone();
        }
    }

    public GetProductsDataExistingReport(@k AttributedText attributedText, @k String str, @k Status status, @k String str2, @l String str3) {
        this.description = attributedText;
        this.reportPublicId = str;
        this.status = status;
        this.title = str2;
        this.usagePublicId = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getReportPublicId() {
        return this.reportPublicId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getUsagePublicId() {
        return this.usagePublicId;
    }
}
