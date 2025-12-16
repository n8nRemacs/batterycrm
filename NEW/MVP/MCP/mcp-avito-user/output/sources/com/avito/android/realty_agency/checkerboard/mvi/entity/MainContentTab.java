package com.avito.android.realty_agency.checkerboard.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckerboardState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/mvi/entity/MainContentTab;", "", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MainContentTab {

    /* renamed from: b, reason: collision with root package name */
    public static final MainContentTab f251251b;

    /* renamed from: c, reason: collision with root package name */
    public static final MainContentTab f251252c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ MainContentTab[] f251253d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f251254e;

    static {
        MainContentTab mainContentTab = new MainContentTab("LOTS_LIST", 0);
        f251251b = mainContentTab;
        MainContentTab mainContentTab2 = new MainContentTab("CHECKERBOARD", 1);
        f251252c = mainContentTab2;
        MainContentTab[] mainContentTabArr = {mainContentTab, mainContentTab2};
        f251253d = mainContentTabArr;
        f251254e = c.a(mainContentTabArr);
    }

    public MainContentTab() {
        throw null;
    }

    public static MainContentTab valueOf(String str) {
        return (MainContentTab) Enum.valueOf(MainContentTab.class, str);
    }

    public static MainContentTab[] values() {
        return (MainContentTab[]) f251253d.clone();
    }
}
