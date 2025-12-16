package com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.gson.annotations.c;
import dr.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests;", "", "", "Ldr/j;", "items", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests$Status;", "status", "", "statusText", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests$Status;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests$Status;", "b", "()Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests$Status;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Status", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OkResponseSuccessSuggests {

    @c("items")
    @k
    private final List<j> items;

    @c("status")
    @k
    private final Status status;

    @c("statusText")
    @k
    private final String statusText;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2CompetitorAnalyticsGeneralResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Success", "Warning", "Alert", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("alert")
        public static final Status Alert;

        @c("success")
        public static final Status Success;

        @c(ConstraintKt.WARNING)
        public static final Status Warning;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f124381b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f124382c;

        static {
            Status status = new Status("Success", 0, "success");
            Success = status;
            Status status2 = new Status("Warning", 1, ConstraintKt.WARNING);
            Warning = status2;
            Status status3 = new Status("Alert", 2, "alert");
            Alert = status3;
            Status[] statusArr = {status, status2, status3};
            f124381b = statusArr;
            f124382c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f124381b.clone();
        }
    }

    public OkResponseSuccessSuggests(@k List<j> list, @k Status status, @k String str, @k String str2) {
        this.items = list;
        this.status = status;
        this.statusText = str;
        this.title = str2;
    }

    @k
    public final List<j> a() {
        return this.items;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
