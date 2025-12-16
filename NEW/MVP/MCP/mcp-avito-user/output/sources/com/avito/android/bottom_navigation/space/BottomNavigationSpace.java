package com.avito.android.bottom_navigation.space;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomNavigationSpace.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;", "", "_avito_bottom-navigation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomNavigationSpace {

    /* renamed from: b, reason: collision with root package name */
    public static final BottomNavigationSpace f107065b;

    /* renamed from: c, reason: collision with root package name */
    public static final BottomNavigationSpace f107066c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BottomNavigationSpace[] f107067d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f107068e;

    static {
        BottomNavigationSpace bottomNavigationSpace = new BottomNavigationSpace("Default", 0);
        f107065b = bottomNavigationSpace;
        BottomNavigationSpace bottomNavigationSpace2 = new BottomNavigationSpace("AvitoForBusiness", 1);
        f107066c = bottomNavigationSpace2;
        BottomNavigationSpace[] bottomNavigationSpaceArr = {bottomNavigationSpace, bottomNavigationSpace2};
        f107067d = bottomNavigationSpaceArr;
        f107068e = kotlin.enums.c.a(bottomNavigationSpaceArr);
    }

    public BottomNavigationSpace() {
        throw null;
    }

    public static BottomNavigationSpace valueOf(String str) {
        return (BottomNavigationSpace) Enum.valueOf(BottomNavigationSpace.class, str);
    }

    public static BottomNavigationSpace[] values() {
        return (BottomNavigationSpace[]) f107067d.clone();
    }
}
