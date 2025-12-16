package com.avito.android.ab_tests.groups;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServicesNotificationAboutAnomalyLowPricesGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/groups/ServicesNotificationAboutAnomalyLowPricesGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_services"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ServicesNotificationAboutAnomalyLowPricesGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final ServicesNotificationAboutAnomalyLowPricesGroup f67956c;

    /* renamed from: d, reason: collision with root package name */
    public static final ServicesNotificationAboutAnomalyLowPricesGroup f67957d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ServicesNotificationAboutAnomalyLowPricesGroup[] f67958e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67959f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67960b;

    static {
        ServicesNotificationAboutAnomalyLowPricesGroup servicesNotificationAboutAnomalyLowPricesGroup = new ServicesNotificationAboutAnomalyLowPricesGroup("TEST", 0, "test");
        f67956c = servicesNotificationAboutAnomalyLowPricesGroup;
        ServicesNotificationAboutAnomalyLowPricesGroup servicesNotificationAboutAnomalyLowPricesGroup2 = new ServicesNotificationAboutAnomalyLowPricesGroup("CONTROL", 1, "control");
        f67957d = servicesNotificationAboutAnomalyLowPricesGroup2;
        ServicesNotificationAboutAnomalyLowPricesGroup[] servicesNotificationAboutAnomalyLowPricesGroupArr = {servicesNotificationAboutAnomalyLowPricesGroup, servicesNotificationAboutAnomalyLowPricesGroup2};
        f67958e = servicesNotificationAboutAnomalyLowPricesGroupArr;
        f67959f = c.a(servicesNotificationAboutAnomalyLowPricesGroupArr);
    }

    public ServicesNotificationAboutAnomalyLowPricesGroup(String str, int i12, String str2) {
        this.f67960b = str2;
    }

    public static ServicesNotificationAboutAnomalyLowPricesGroup valueOf(String str) {
        return (ServicesNotificationAboutAnomalyLowPricesGroup) Enum.valueOf(ServicesNotificationAboutAnomalyLowPricesGroup.class, str);
    }

    public static ServicesNotificationAboutAnomalyLowPricesGroup[] values() {
        return (ServicesNotificationAboutAnomalyLowPricesGroup[]) f67958e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67960b() {
        return this.f67960b;
    }
}
