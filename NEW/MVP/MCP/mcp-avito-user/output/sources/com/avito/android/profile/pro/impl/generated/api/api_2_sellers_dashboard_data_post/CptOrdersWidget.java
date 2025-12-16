package com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2SellersDashboardDataPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget;", "", "Lx90/c;", "data", "Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget$Status;", "status", "<init>", "(Lx90/c;Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget$Status;)V", "Lx90/c;", "a", "()Lx90/c;", "Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget$Status;", "b", "()Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget$Status;", "Status", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CptOrdersWidget {

    @c("data")
    @l
    private final x90.c data;

    @c("status")
    @k
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2SellersDashboardDataPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Success", "Error", "Zero", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("error")
        public static final Status Error;

        @c("success")
        public static final Status Success;

        @c("zero")
        public static final Status Zero;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f222657b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f222658c;

        static {
            Status status = new Status("Success", 0, "success");
            Success = status;
            Status status2 = new Status("Error", 1, "error");
            Error = status2;
            Status status3 = new Status("Zero", 2, "zero");
            Zero = status3;
            Status[] statusArr = {status, status2, status3};
            f222657b = statusArr;
            f222658c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f222657b.clone();
        }
    }

    public CptOrdersWidget(@l x90.c cVar, @k Status status) {
        this.data = cVar;
        this.status = status;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final x90.c getData() {
        return this.data;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }
}
