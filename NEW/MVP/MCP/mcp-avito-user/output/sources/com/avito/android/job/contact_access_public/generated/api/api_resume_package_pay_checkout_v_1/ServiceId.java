package com.avito.android.job.contact_access_public.generated.api.api_resume_package_pay_checkout_v_1;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiResumePackagePayCheckoutV1Request.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/job/contact_access_public/generated/api/api_resume_package_pay_checkout_v_1/ServiceId;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int13", "Int14", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ServiceId {

    @c("13")
    public static final ServiceId Int13;

    @c("14")
    public static final ServiceId Int14;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ServiceId[] f173959c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f173960d;

    /* renamed from: b, reason: collision with root package name */
    public final int f173961b;

    static {
        ServiceId serviceId = new ServiceId("Int13", 0, 13);
        Int13 = serviceId;
        ServiceId serviceId2 = new ServiceId("Int14", 1, 14);
        Int14 = serviceId2;
        ServiceId[] serviceIdArr = {serviceId, serviceId2};
        f173959c = serviceIdArr;
        f173960d = kotlin.enums.c.a(serviceIdArr);
    }

    private ServiceId(String str, int i12, int i13) {
        this.f173961b = i13;
    }

    public static ServiceId valueOf(String str) {
        return (ServiceId) Enum.valueOf(ServiceId.class, str);
    }

    public static ServiceId[] values() {
        return (ServiceId[]) f173959c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return String.valueOf(this.f173961b);
    }
}
