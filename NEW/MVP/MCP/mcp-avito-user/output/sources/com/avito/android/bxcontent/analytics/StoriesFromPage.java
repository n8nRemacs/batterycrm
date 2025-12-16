package com.avito.android.bxcontent.analytics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesFromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/analytics/StoriesFromPage;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StoriesFromPage {

    /* renamed from: c, reason: collision with root package name */
    public static final StoriesFromPage f109459c;

    /* renamed from: d, reason: collision with root package name */
    public static final StoriesFromPage f109460d;

    /* renamed from: e, reason: collision with root package name */
    public static final StoriesFromPage f109461e;

    /* renamed from: f, reason: collision with root package name */
    public static final StoriesFromPage f109462f;

    /* renamed from: g, reason: collision with root package name */
    public static final StoriesFromPage f109463g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ StoriesFromPage[] f109464h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f109465i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f109466b;

    static {
        StoriesFromPage storiesFromPage = new StoriesFromPage("STORIES_MAIN_FROM_PAGE", 0, "stories_main");
        f109459c = storiesFromPage;
        StoriesFromPage storiesFromPage2 = new StoriesFromPage("STORIES_SERP_FROM_PAGE", 1, "stories_serp");
        f109460d = storiesFromPage2;
        StoriesFromPage storiesFromPage3 = new StoriesFromPage("STORIES_VERTICAL_FROM_PAGE", 2, "stories_vertical");
        f109461e = storiesFromPage3;
        StoriesFromPage storiesFromPage4 = new StoriesFromPage("STORIES_CROSS_VERTICAL_FROM_PAGE", 3, "stories_cross_vertical_main");
        f109462f = storiesFromPage4;
        StoriesFromPage storiesFromPage5 = new StoriesFromPage(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, "unknown");
        f109463g = storiesFromPage5;
        StoriesFromPage[] storiesFromPageArr = {storiesFromPage, storiesFromPage2, storiesFromPage3, storiesFromPage4, storiesFromPage5};
        f109464h = storiesFromPageArr;
        f109465i = kotlin.enums.c.a(storiesFromPageArr);
    }

    public StoriesFromPage(String str, int i12, String str2) {
        this.f109466b = str2;
    }

    public static StoriesFromPage valueOf(String str) {
        return (StoriesFromPage) Enum.valueOf(StoriesFromPage.class, str);
    }

    public static StoriesFromPage[] values() {
        return (StoriesFromPage[]) f109464h.clone();
    }
}
