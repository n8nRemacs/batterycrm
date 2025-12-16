package com.avito.android.short_term_rent.bookingform.items.toggle;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToggleOptionsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle/ToggleOptionsDisplayType;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleOptionsDisplayType {

    /* renamed from: b, reason: collision with root package name */
    public static final ToggleOptionsDisplayType f281696b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ToggleOptionsDisplayType[] f281697c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f281698d;

    static {
        ToggleOptionsDisplayType toggleOptionsDisplayType = new ToggleOptionsDisplayType("SingleLineFixed", 0);
        ToggleOptionsDisplayType toggleOptionsDisplayType2 = new ToggleOptionsDisplayType("SingleLineStretch", 1);
        f281696b = toggleOptionsDisplayType2;
        ToggleOptionsDisplayType[] toggleOptionsDisplayTypeArr = {toggleOptionsDisplayType, toggleOptionsDisplayType2, new ToggleOptionsDisplayType("SingleLineScrollable", 2), new ToggleOptionsDisplayType("MultipleLines", 3)};
        f281697c = toggleOptionsDisplayTypeArr;
        f281698d = kotlin.enums.c.a(toggleOptionsDisplayTypeArr);
    }

    public ToggleOptionsDisplayType() {
        throw null;
    }

    public static ToggleOptionsDisplayType valueOf(String str) {
        return (ToggleOptionsDisplayType) Enum.valueOf(ToggleOptionsDisplayType.class, str);
    }

    public static ToggleOptionsDisplayType[] values() {
        return (ToggleOptionsDisplayType[]) f281697c.clone();
    }
}
