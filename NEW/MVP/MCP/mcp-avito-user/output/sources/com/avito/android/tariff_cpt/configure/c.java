package com.avito.android.tariff_cpt.configure;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TariffCptConfigureActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/c;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f297558b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f297559c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f297560d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f297561e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f297562f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f297563g;

    static {
        c cVar = new c("LANDING", 0);
        f297558b = cVar;
        c cVar2 = new c("FORBIDDEN", 1);
        f297559c = cVar2;
        c cVar3 = new c("MIGRATION", 2);
        f297560d = cVar3;
        c cVar4 = new c("LEVELS", 3);
        f297561e = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f297562f = cVarArr;
        f297563g = kotlin.enums.c.a(cVarArr);
    }

    public c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f297562f.clone();
    }
}
