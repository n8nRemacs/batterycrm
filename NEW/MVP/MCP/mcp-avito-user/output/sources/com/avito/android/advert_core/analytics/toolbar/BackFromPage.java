package com.avito.android.advert_core.analytics.toolbar;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BackPressAdvertTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/toolbar/BackFromPage;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BackFromPage {

    /* renamed from: b, reason: collision with root package name */
    public static final BackFromPage f82882b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ BackFromPage[] f82883c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f82884d;

    static {
        BackFromPage backFromPage = new BackFromPage();
        f82882b = backFromPage;
        BackFromPage[] backFromPageArr = {backFromPage};
        f82883c = backFromPageArr;
        f82884d = c.a(backFromPageArr);
    }

    public static BackFromPage valueOf(String str) {
        return (BackFromPage) Enum.valueOf(BackFromPage.class, str);
    }

    public static BackFromPage[] values() {
        return (BackFromPage[]) f82883c.clone();
    }
}
