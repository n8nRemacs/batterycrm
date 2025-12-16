package com.avito.android.app.task;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStartTypeDetermineTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/W1;", "", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class W1 {

    /* renamed from: c, reason: collision with root package name */
    public static final W1 f91547c;

    /* renamed from: d, reason: collision with root package name */
    public static final W1 f91548d;

    /* renamed from: e, reason: collision with root package name */
    public static final W1 f91549e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ W1[] f91550f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f91551g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f91552b;

    static {
        W1 w12 = new W1("COLD", 0, "cold");
        f91547c = w12;
        W1 w13 = new W1("WARM", 1, "warm");
        f91548d = w13;
        W1 w14 = new W1("HOT", 2, "hot");
        f91549e = w14;
        W1[] w1Arr = {w12, w13, w14};
        f91550f = w1Arr;
        f91551g = kotlin.enums.c.a(w1Arr);
    }

    public W1(String str, int i12, String str2) {
        this.f91552b = str2;
    }

    public static W1 valueOf(String str) {
        return (W1) Enum.valueOf(W1.class, str);
    }

    public static W1[] values() {
        return (W1[]) f91550f.clone();
    }
}
