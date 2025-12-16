package com.avito.android.advert.item;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerticalInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/z2;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class z2 {

    /* renamed from: b, reason: collision with root package name */
    public static final z2 f80771b;

    /* renamed from: c, reason: collision with root package name */
    public static final z2 f80772c;

    /* renamed from: d, reason: collision with root package name */
    public static final z2 f80773d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z2[] f80774e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80775f;

    static {
        z2 z2Var = new z2("REALTY", 0);
        f80771b = z2Var;
        z2 z2Var2 = new z2("SERVICES", 1);
        f80772c = z2Var2;
        z2 z2Var3 = new z2("OTHER", 2);
        f80773d = z2Var3;
        z2[] z2VarArr = {z2Var, z2Var2, z2Var3};
        f80774e = z2VarArr;
        f80775f = kotlin.enums.c.a(z2VarArr);
    }

    public z2() {
        throw null;
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) f80774e.clone();
    }
}
