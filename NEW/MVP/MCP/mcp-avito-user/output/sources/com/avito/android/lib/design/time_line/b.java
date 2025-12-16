package com.avito.android.lib.design.time_line;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeLineAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f180966b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f180967c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f180968d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180969e;

    static {
        b bVar = new b("START", 0);
        f180966b = bVar;
        b bVar2 = new b("END", 1);
        f180967c = bVar2;
        b[] bVarArr = {bVar, bVar2};
        f180968d = bVarArr;
        f180969e = kotlin.enums.c.a(bVarArr);
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f180968d.clone();
    }
}
