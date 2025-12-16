package com.avito.android.paid_services.routing;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TariffCountStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paid_services/routing/TariffCountStatus;", "", "_avito_paid-services_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TariffCountStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final TariffCountStatus f210627b;

    /* renamed from: c, reason: collision with root package name */
    public static final TariffCountStatus f210628c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TariffCountStatus[] f210629d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f210630e;

    static {
        TariffCountStatus tariffCountStatus = new TariffCountStatus("NORMAL", 0);
        f210627b = tariffCountStatus;
        TariffCountStatus tariffCountStatus2 = new TariffCountStatus("WARNING", 1);
        f210628c = tariffCountStatus2;
        TariffCountStatus[] tariffCountStatusArr = {tariffCountStatus, tariffCountStatus2};
        f210629d = tariffCountStatusArr;
        f210630e = c.a(tariffCountStatusArr);
    }

    public TariffCountStatus() {
        throw null;
    }

    public static TariffCountStatus valueOf(String str) {
        return (TariffCountStatus) Enum.valueOf(TariffCountStatus.class, str);
    }

    public static TariffCountStatus[] values() {
        return (TariffCountStatus[]) f210629d.clone();
    }
}
