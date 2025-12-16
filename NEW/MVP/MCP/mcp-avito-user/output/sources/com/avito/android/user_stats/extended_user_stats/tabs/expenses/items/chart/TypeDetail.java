package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChartExpensesItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/chart/TypeDetail;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypeDetail {

    /* renamed from: b, reason: collision with root package name */
    public static final TypeDetail f317695b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeDetail f317696c;

    /* renamed from: d, reason: collision with root package name */
    public static final TypeDetail f317697d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeDetail f317698e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ TypeDetail[] f317699f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f317700g;

    static {
        TypeDetail typeDetail = new TypeDetail("BASE", 0);
        f317695b = typeDetail;
        TypeDetail typeDetail2 = new TypeDetail("TOP", 1);
        f317696c = typeDetail2;
        TypeDetail typeDetail3 = new TypeDetail("BOTTOM", 2);
        f317697d = typeDetail3;
        TypeDetail typeDetail4 = new TypeDetail("TOP_AND_BOTTOM", 3);
        f317698e = typeDetail4;
        TypeDetail[] typeDetailArr = {typeDetail, typeDetail2, typeDetail3, typeDetail4};
        f317699f = typeDetailArr;
        f317700g = kotlin.enums.c.a(typeDetailArr);
    }

    public TypeDetail() {
        throw null;
    }

    public static TypeDetail valueOf(String str) {
        return (TypeDetail) Enum.valueOf(TypeDetail.class, str);
    }

    public static TypeDetail[] values() {
        return (TypeDetail[]) f317699f.clone();
    }
}
