package com.avito.android.work_profile.intent_factory;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WorkProfileIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/intent_factory/WorkProfileTab;", "", "_avito_job_work-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WorkProfileTab {

    /* renamed from: d, reason: collision with root package name */
    public static final WorkProfileTab f330693d;

    /* renamed from: e, reason: collision with root package name */
    public static final WorkProfileTab f330694e;

    /* renamed from: f, reason: collision with root package name */
    public static final WorkProfileTab f330695f;

    /* renamed from: g, reason: collision with root package name */
    public static final WorkProfileTab f330696g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ WorkProfileTab[] f330697h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f330698i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f330699b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f330700c;

    static {
        WorkProfileTab workProfileTab = new WorkProfileTab("CVS", 0, "cvs", "Резюме");
        f330693d = workProfileTab;
        WorkProfileTab workProfileTab2 = new WorkProfileTab("APPLIES", 1, "applies", "Отклики");
        f330694e = workProfileTab2;
        WorkProfileTab workProfileTab3 = new WorkProfileTab("ABOUT", 2, "about", "Обо мне");
        f330695f = workProfileTab3;
        WorkProfileTab workProfileTab4 = new WorkProfileTab("GIG", 3, "gig", "Подработка");
        f330696g = workProfileTab4;
        WorkProfileTab[] workProfileTabArr = {workProfileTab, workProfileTab2, workProfileTab3, workProfileTab4};
        f330697h = workProfileTabArr;
        f330698i = c.a(workProfileTabArr);
    }

    public WorkProfileTab(String str, int i12, String str2, String str3) {
        this.f330699b = str2;
        this.f330700c = str3;
    }

    public static WorkProfileTab valueOf(String str) {
        return (WorkProfileTab) Enum.valueOf(WorkProfileTab.class, str);
    }

    public static WorkProfileTab[] values() {
        return (WorkProfileTab[]) f330697h.clone();
    }
}
