package com.akita.compose.component.toast_bar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToastBarPosition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/toast_bar/ToastBarPosition;", "", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ToastBarPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final ToastBarPosition f63235b;

    /* renamed from: c, reason: collision with root package name */
    public static final ToastBarPosition f63236c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ToastBarPosition[] f63237d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63238e;

    static {
        ToastBarPosition toastBarPosition = new ToastBarPosition("Top", 0);
        f63235b = toastBarPosition;
        ToastBarPosition toastBarPosition2 = new ToastBarPosition("Bottom", 1);
        f63236c = toastBarPosition2;
        ToastBarPosition[] toastBarPositionArr = {toastBarPosition, toastBarPosition2};
        f63237d = toastBarPositionArr;
        f63238e = kotlin.enums.c.a(toastBarPositionArr);
    }

    public ToastBarPosition() {
        throw null;
    }

    public static ToastBarPosition valueOf(String str) {
        return (ToastBarPosition) Enum.valueOf(ToastBarPosition.class, str);
    }

    public static ToastBarPosition[] values() {
        return (ToastBarPosition[]) f63237d.clone();
    }
}
