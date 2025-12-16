package com.avito.android.advert.item.items_list_builder;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemListBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/items_list_builder/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f76608b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f76609c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f76610d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f76611e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f76612f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f76613g;

    static {
        a aVar = new a("REALTY_DEFAULT", 0);
        f76608b = aVar;
        a aVar2 = new a("SERVICES_DEFAULT", 1);
        f76609c = aVar2;
        a aVar3 = new a("GIG_DEFAULT", 2);
        f76610d = aVar3;
        a aVar4 = new a("DEFAULT", 3);
        f76611e = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f76612f = aVarArr;
        f76613g = kotlin.enums.c.a(aVarArr);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f76612f.clone();
    }
}
