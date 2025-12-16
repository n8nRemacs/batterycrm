package com.avito.android.details_sheet;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetailsSheetActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/details_sheet/a;", "", "_avito_details-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f135928b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f135929c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f135930d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f135931e;

    static {
        a aVar = new a("LEFT", 0);
        f135928b = aVar;
        a aVar2 = new a("RIGHT", 1);
        f135929c = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f135930d = aVarArr;
        f135931e = kotlin.enums.c.a(aVarArr);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f135930d.clone();
    }
}
