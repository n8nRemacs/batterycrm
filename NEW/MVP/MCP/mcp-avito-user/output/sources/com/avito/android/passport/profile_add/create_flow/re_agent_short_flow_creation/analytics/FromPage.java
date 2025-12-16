package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReAgentShortFlowCreationEndEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/analytics/FromPage;", "", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FromPage {

    /* renamed from: c, reason: collision with root package name */
    public static final FromPage f211543c;

    /* renamed from: d, reason: collision with root package name */
    public static final FromPage f211544d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f211545e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f211546f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f211547b;

    static {
        FromPage fromPage = new FromPage("NO_VERIFICATION", 0, "no_verification");
        f211543c = fromPage;
        FromPage fromPage2 = new FromPage("VERIFICATION", 1, "verification");
        f211544d = fromPage2;
        FromPage[] fromPageArr = {fromPage, fromPage2};
        f211545e = fromPageArr;
        f211546f = c.a(fromPageArr);
    }

    public FromPage(String str, int i12, String str2) {
        this.f211547b = str2;
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f211545e.clone();
    }
}
