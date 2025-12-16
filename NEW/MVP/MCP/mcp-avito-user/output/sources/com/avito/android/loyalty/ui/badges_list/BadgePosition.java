package com.avito.android.loyalty.ui.badges_list;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BadgesListScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badges_list/BadgePosition;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BadgePosition {

    /* renamed from: b, reason: collision with root package name */
    public static final BadgePosition f183354b;

    /* renamed from: c, reason: collision with root package name */
    public static final BadgePosition f183355c;

    /* renamed from: d, reason: collision with root package name */
    public static final BadgePosition f183356d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BadgePosition[] f183357e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f183358f;

    static {
        BadgePosition badgePosition = new BadgePosition("TSAR", 0);
        f183354b = badgePosition;
        BadgePosition badgePosition2 = new BadgePosition("LEFT", 1);
        f183355c = badgePosition2;
        BadgePosition badgePosition3 = new BadgePosition("RIGHT", 2);
        f183356d = badgePosition3;
        BadgePosition[] badgePositionArr = {badgePosition, badgePosition2, badgePosition3};
        f183357e = badgePositionArr;
        f183358f = kotlin.enums.c.a(badgePositionArr);
    }

    public BadgePosition() {
        throw null;
    }

    public static BadgePosition valueOf(String str) {
        return (BadgePosition) Enum.valueOf(BadgePosition.class, str);
    }

    public static BadgePosition[] values() {
        return (BadgePosition[]) f183357e.clone();
    }
}
