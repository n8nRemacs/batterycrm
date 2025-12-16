package com.avito.android.avl_analytics;

import Y61.k;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvlFromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_analytics/AvlFromPage;", "", "_avito_avl-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvlFromPage {

    /* renamed from: c, reason: collision with root package name */
    public static final AvlFromPage f98428c;

    /* renamed from: d, reason: collision with root package name */
    public static final AvlFromPage f98429d;

    /* renamed from: e, reason: collision with root package name */
    public static final AvlFromPage f98430e;

    /* renamed from: f, reason: collision with root package name */
    public static final AvlFromPage f98431f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AvlFromPage[] f98432g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98433h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f98434b;

    static {
        AvlFromPage avlFromPage = new AvlFromPage("MAIN", 0, "main");
        f98428c = avlFromPage;
        AvlFromPage avlFromPage2 = new AvlFromPage("VERTICAL_MAIN", 1, "vertical_main");
        f98429d = avlFromPage2;
        AvlFromPage avlFromPage3 = new AvlFromPage("SHARE_LINK", 2, "share_link");
        f98430e = avlFromPage3;
        AvlFromPage avlFromPage4 = new AvlFromPage("DIRECT_LINK", 3, "direct_link");
        f98431f = avlFromPage4;
        AvlFromPage[] avlFromPageArr = {avlFromPage, avlFromPage2, avlFromPage3, avlFromPage4, new AvlFromPage("FEED", 4, "feed"), new AvlFromPage("FEED_FULLSCREEN", 5, "feed_fullscreen")};
        f98432g = avlFromPageArr;
        f98433h = kotlin.enums.c.a(avlFromPageArr);
    }

    public AvlFromPage(String str, int i12, String str2) {
        this.f98434b = str2;
    }

    public static AvlFromPage valueOf(String str) {
        return (AvlFromPage) Enum.valueOf(AvlFromPage.class, str);
    }

    public static AvlFromPage[] values() {
        return (AvlFromPage[]) f98432g.clone();
    }
}
