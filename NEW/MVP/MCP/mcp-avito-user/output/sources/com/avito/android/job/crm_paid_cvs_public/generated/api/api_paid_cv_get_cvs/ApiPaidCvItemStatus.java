package com.avito.android.job.crm_paid_cvs_public.generated.api.api_paid_cv_get_cvs;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiPaidCvGetCvsResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus;", "", "", "color", "Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus$Value;", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus$Value;)V", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus$Value;", "a", "()Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus$Value;", "Value", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ApiPaidCvItemStatus {

    @c("color")
    @l
    private final String color;

    @c("value")
    @l
    private final Value value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiPaidCvGetCvsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus$Value;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "New", "Pending", "Approved", "Declined", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Value {

        @c("approved")
        public static final Value Approved;

        @c("declined")
        public static final Value Declined;

        @c("new")
        public static final Value New;

        @c("pending")
        public static final Value Pending;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Value[] f174018c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f174019d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f174020b;

        static {
            Value value = new Value("New", 0, "new");
            New = value;
            Value value2 = new Value("Pending", 1, "pending");
            Pending = value2;
            Value value3 = new Value("Approved", 2, "approved");
            Approved = value3;
            Value value4 = new Value("Declined", 3, "declined");
            Declined = value4;
            Value[] valueArr = {value, value2, value3, value4};
            f174018c = valueArr;
            f174019d = kotlin.enums.c.a(valueArr);
        }

        private Value(String str, int i12, String str2) {
            this.f174020b = str2;
        }

        public static Value valueOf(String str) {
            return (Value) Enum.valueOf(Value.class, str);
        }

        public static Value[] values() {
            return (Value[]) f174018c.clone();
        }
    }

    public ApiPaidCvItemStatus(@l String str, @l Value value) {
        this.color = str;
        this.value = value;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Value getValue() {
        return this.value;
    }
}
