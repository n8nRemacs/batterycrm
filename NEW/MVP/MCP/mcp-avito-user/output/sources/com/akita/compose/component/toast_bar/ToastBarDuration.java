package com.akita.compose.component.toast_bar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToastBarHost.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/toast_bar/ToastBarDuration;", "", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ToastBarDuration {

    /* renamed from: b, reason: collision with root package name */
    public static final ToastBarDuration f63230b;

    /* renamed from: c, reason: collision with root package name */
    public static final ToastBarDuration f63231c;

    /* renamed from: d, reason: collision with root package name */
    public static final ToastBarDuration f63232d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ToastBarDuration[] f63233e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63234f;

    static {
        ToastBarDuration toastBarDuration = new ToastBarDuration("Short", 0);
        f63230b = toastBarDuration;
        ToastBarDuration toastBarDuration2 = new ToastBarDuration("Long", 1);
        f63231c = toastBarDuration2;
        ToastBarDuration toastBarDuration3 = new ToastBarDuration("Indefinite", 2);
        f63232d = toastBarDuration3;
        ToastBarDuration[] toastBarDurationArr = {toastBarDuration, toastBarDuration2, toastBarDuration3};
        f63233e = toastBarDurationArr;
        f63234f = kotlin.enums.c.a(toastBarDurationArr);
    }

    public ToastBarDuration() {
        throw null;
    }

    public static ToastBarDuration valueOf(String str) {
        return (ToastBarDuration) Enum.valueOf(ToastBarDuration.class, str);
    }

    public static ToastBarDuration[] values() {
        return (ToastBarDuration[]) f63233e.clone();
    }
}
