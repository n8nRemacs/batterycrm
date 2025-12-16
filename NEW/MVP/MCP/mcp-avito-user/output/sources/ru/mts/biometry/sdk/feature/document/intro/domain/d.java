package ru.mts.biometry.sdk.feature.document.intro.domain;

import P91.c;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final c f436438b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f436439c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f436440d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f436441e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f436442f;

    static {
        d dVar = new d("Passport", 0);
        f436439c = dVar;
        d dVar2 = new d("RussianForeignPassport", 1);
        f436440d = dVar2;
        d[] dVarArr = {dVar, dVar2, new d("Id", 2), new d("Drvlic", 3)};
        f436441e = dVarArr;
        f436442f = kotlin.enums.c.a(dVarArr);
        f436438b = new c();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f436441e.clone();
    }
}
