package com.avito.android.constructor_advert.ui.serp.constructor;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BadgeHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/BadgeType;", "", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BadgeType {

    /* renamed from: b, reason: collision with root package name */
    public static final BadgeType f125731b;

    /* renamed from: c, reason: collision with root package name */
    public static final BadgeType f125732c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BadgeType[] f125733d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f125734e;

    static {
        BadgeType badgeType = new BadgeType("BADGE", 0);
        f125731b = badgeType;
        BadgeType badgeType2 = new BadgeType("ICON", 1);
        f125732c = badgeType2;
        BadgeType[] badgeTypeArr = {badgeType, badgeType2};
        f125733d = badgeTypeArr;
        f125734e = kotlin.enums.c.a(badgeTypeArr);
    }

    public BadgeType() {
        throw null;
    }

    public static BadgeType valueOf(String str) {
        return (BadgeType) Enum.valueOf(BadgeType.class, str);
    }

    public static BadgeType[] values() {
        return (BadgeType[]) f125733d.clone();
    }
}
