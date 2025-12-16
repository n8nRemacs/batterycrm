package com.avito.android.autoteka.analytics.event.report;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportButtons.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/analytics/event/report/ReportButtons;", "", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReportButtons {

    /* renamed from: c, reason: collision with root package name */
    public static final ReportButtons f96096c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReportButtons f96097d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ReportButtons[] f96098e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f96099f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96100b;

    static {
        ReportButtons reportButtons = new ReportButtons("DOWNLOAD", 0, "download");
        f96096c = reportButtons;
        ReportButtons reportButtons2 = new ReportButtons("SHARE", 1, "share");
        f96097d = reportButtons2;
        ReportButtons[] reportButtonsArr = {reportButtons, reportButtons2};
        f96098e = reportButtonsArr;
        f96099f = c.a(reportButtonsArr);
    }

    public ReportButtons(String str, int i12, String str2) {
        this.f96100b = str2;
    }

    public static ReportButtons valueOf(String str) {
        return (ReportButtons) Enum.valueOf(ReportButtons.class, str);
    }

    public static ReportButtons[] values() {
        return (ReportButtons[]) f96098e.clone();
    }
}
