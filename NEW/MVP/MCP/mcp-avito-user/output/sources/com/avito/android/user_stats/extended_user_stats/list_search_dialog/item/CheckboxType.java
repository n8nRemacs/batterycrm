package com.avito.android.user_stats.extended_user_stats.list_search_dialog.item;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckBoxData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/item/CheckboxType;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckboxType {

    /* renamed from: b, reason: collision with root package name */
    public static final CheckboxType f317256b;

    /* renamed from: c, reason: collision with root package name */
    public static final CheckboxType f317257c;

    /* renamed from: d, reason: collision with root package name */
    public static final CheckboxType f317258d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CheckboxType[] f317259e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f317260f;

    static {
        CheckboxType checkboxType = new CheckboxType("SELECTED", 0);
        f317256b = checkboxType;
        CheckboxType checkboxType2 = new CheckboxType("UNSELECTED", 1);
        f317257c = checkboxType2;
        CheckboxType checkboxType3 = new CheckboxType("INDETERMINATE", 2);
        f317258d = checkboxType3;
        CheckboxType[] checkboxTypeArr = {checkboxType, checkboxType2, checkboxType3};
        f317259e = checkboxTypeArr;
        f317260f = kotlin.enums.c.a(checkboxTypeArr);
    }

    public CheckboxType() {
        throw null;
    }

    public static CheckboxType valueOf(String str) {
        return (CheckboxType) Enum.valueOf(CheckboxType.class, str);
    }

    public static CheckboxType[] values() {
        return (CheckboxType[]) f317259e.clone();
    }
}
