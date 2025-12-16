package com.avito.android.quic.events;

import Y61.k;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CronetReportedErrorType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/events/CronetReportedErrorType;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CronetReportedErrorType {

    /* renamed from: c, reason: collision with root package name */
    public static final CronetReportedErrorType f246250c;

    /* renamed from: d, reason: collision with root package name */
    public static final CronetReportedErrorType f246251d;

    /* renamed from: e, reason: collision with root package name */
    public static final CronetReportedErrorType f246252e;

    /* renamed from: f, reason: collision with root package name */
    public static final CronetReportedErrorType f246253f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CronetReportedErrorType[] f246254g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f246255h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f246256b;

    static {
        CronetReportedErrorType cronetReportedErrorType = new CronetReportedErrorType("COMMON", 0, "common");
        f246250c = cronetReportedErrorType;
        CronetReportedErrorType cronetReportedErrorType2 = new CronetReportedErrorType("INTERNAL", 1, "internal");
        f246251d = cronetReportedErrorType2;
        CronetReportedErrorType cronetReportedErrorType3 = new CronetReportedErrorType("QUIC", 2, "quic");
        f246252e = cronetReportedErrorType3;
        CronetReportedErrorType cronetReportedErrorType4 = new CronetReportedErrorType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        f246253f = cronetReportedErrorType4;
        CronetReportedErrorType[] cronetReportedErrorTypeArr = {cronetReportedErrorType, cronetReportedErrorType2, cronetReportedErrorType3, cronetReportedErrorType4};
        f246254g = cronetReportedErrorTypeArr;
        f246255h = c.a(cronetReportedErrorTypeArr);
    }

    public CronetReportedErrorType(String str, int i12, String str2) {
        this.f246256b = str2;
    }

    public static CronetReportedErrorType valueOf(String str) {
        return (CronetReportedErrorType) Enum.valueOf(CronetReportedErrorType.class, str);
    }

    public static CronetReportedErrorType[] values() {
        return (CronetReportedErrorType[]) f246254g.clone();
    }
}
