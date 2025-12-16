package com.avito.android.app_rater.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppRaterEventSourcePage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app_rater/events/AppRaterEventSourcePage;", "", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AppRaterEventSourcePage {

    /* renamed from: c, reason: collision with root package name */
    public static final AppRaterEventSourcePage f91794c;

    /* renamed from: d, reason: collision with root package name */
    public static final AppRaterEventSourcePage f91795d;

    /* renamed from: e, reason: collision with root package name */
    public static final AppRaterEventSourcePage f91796e;

    /* renamed from: f, reason: collision with root package name */
    public static final AppRaterEventSourcePage f91797f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AppRaterEventSourcePage[] f91798g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f91799h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f91800b;

    static {
        AppRaterEventSourcePage appRaterEventSourcePage = new AppRaterEventSourcePage("FREE_PUBLISH", 0, "freePublish");
        f91794c = appRaterEventSourcePage;
        AppRaterEventSourcePage appRaterEventSourcePage2 = new AppRaterEventSourcePage("SOLD_ON_AVITO", 1, "soldOnAvito");
        f91795d = appRaterEventSourcePage2;
        AppRaterEventSourcePage appRaterEventSourcePage3 = new AppRaterEventSourcePage("CALL_ENDED", 2, "callEnded");
        f91796e = appRaterEventSourcePage3;
        AppRaterEventSourcePage appRaterEventSourcePage4 = new AppRaterEventSourcePage("FAVORITES_ADD", 3, "favoritesAdd");
        f91797f = appRaterEventSourcePage4;
        AppRaterEventSourcePage[] appRaterEventSourcePageArr = {appRaterEventSourcePage, appRaterEventSourcePage2, appRaterEventSourcePage3, appRaterEventSourcePage4};
        f91798g = appRaterEventSourcePageArr;
        f91799h = c.a(appRaterEventSourcePageArr);
    }

    public AppRaterEventSourcePage(String str, int i12, String str2) {
        this.f91800b = str2;
    }

    public static AppRaterEventSourcePage valueOf(String str) {
        return (AppRaterEventSourcePage) Enum.valueOf(AppRaterEventSourcePage.class, str);
    }

    public static AppRaterEventSourcePage[] values() {
        return (AppRaterEventSourcePage[]) f91798g.clone();
    }
}
