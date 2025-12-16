package com.avito.android.work_profile.generated.api.get_profile_about_v_3;

import Y61.k;
import Y61.l;
import cQ0.C27085a;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3;", "", "LcQ0/a;", "action", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3$Status;", "status", "", "subtitle", "title", "<init>", "(LcQ0/a;Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3$Status;Ljava/lang/String;Ljava/lang/String;)V", "LcQ0/a;", "a", "()LcQ0/a;", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3$Status;", "b", "()Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3$Status;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Status", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersonalItemV3 {

    @c("action")
    @l
    private final C27085a action;

    @c("status")
    @l
    private final Status status;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetProfileAboutV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "NotStarted", "InProgress", "Success", "Failed", "Expiring", "Disabled", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c(BeduinCartItemModel.DISABLED_STRING)
        public static final Status Disabled;

        @c("expiring")
        public static final Status Expiring;

        @c(PaymentStateKt.PAYMENT_STATE_FAILED)
        public static final Status Failed;

        @c("in_progress")
        public static final Status InProgress;

        @c("not_started")
        public static final Status NotStarted;

        @c("success")
        public static final Status Success;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f330676b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f330677c;

        static {
            Status status = new Status("NotStarted", 0, "not_started");
            NotStarted = status;
            Status status2 = new Status("InProgress", 1, "in_progress");
            InProgress = status2;
            Status status3 = new Status("Success", 2, "success");
            Success = status3;
            Status status4 = new Status("Failed", 3, PaymentStateKt.PAYMENT_STATE_FAILED);
            Failed = status4;
            Status status5 = new Status("Expiring", 4, "expiring");
            Expiring = status5;
            Status status6 = new Status("Disabled", 5, BeduinCartItemModel.DISABLED_STRING);
            Disabled = status6;
            Status[] statusArr = {status, status2, status3, status4, status5, status6};
            f330676b = statusArr;
            f330677c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f330676b.clone();
        }
    }

    public PersonalItemV3(@l C27085a c27085a, @l Status status, @l String str, @k String str2) {
        this.action = c27085a;
        this.status = status;
        this.subtitle = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C27085a getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
