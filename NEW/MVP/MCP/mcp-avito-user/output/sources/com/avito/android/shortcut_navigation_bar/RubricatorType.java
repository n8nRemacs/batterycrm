package com.avito.android.shortcut_navigation_bar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RubricatorType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/RubricatorType;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RubricatorType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RubricatorType[] f283173b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f283174c;

    static {
        RubricatorType[] rubricatorTypeArr = {new RubricatorType("SMALL_ICON_ALL_CAT_FIRST", 0), new RubricatorType("SMALL_ICON_ALL_CAT_LAST", 1), new RubricatorType("BIG_ICON_ALL_CAT_LAST", 2), new RubricatorType("BIG_ICON_ALL_CAT_BELOW", 3)};
        f283173b = rubricatorTypeArr;
        f283174c = kotlin.enums.c.a(rubricatorTypeArr);
    }

    public RubricatorType() {
        throw null;
    }

    public static RubricatorType valueOf(String str) {
        return (RubricatorType) Enum.valueOf(RubricatorType.class, str);
    }

    public static RubricatorType[] values() {
        return (RubricatorType[]) f283173b.clone();
    }
}
