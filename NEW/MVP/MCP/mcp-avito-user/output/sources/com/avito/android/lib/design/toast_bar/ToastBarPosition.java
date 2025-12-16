package com.avito.android.lib.design.toast_bar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToastBarPosition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/ToastBarPosition;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ToastBarPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final ToastBarPosition f181044b;

    /* renamed from: c, reason: collision with root package name */
    public static final ToastBarPosition f181045c;

    /* renamed from: d, reason: collision with root package name */
    public static final ToastBarPosition f181046d;

    /* renamed from: e, reason: collision with root package name */
    public static final ToastBarPosition f181047e;

    /* renamed from: f, reason: collision with root package name */
    public static final ToastBarPosition f181048f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ToastBarPosition[] f181049g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181050h;

    static {
        ToastBarPosition toastBarPosition = new ToastBarPosition("ABOVE_VIEW", 0);
        f181044b = toastBarPosition;
        ToastBarPosition toastBarPosition2 = new ToastBarPosition("BELOW_VIEW", 1);
        f181045c = toastBarPosition2;
        ToastBarPosition toastBarPosition3 = new ToastBarPosition("OVERLAY_VIEW_TOP", 2);
        f181046d = toastBarPosition3;
        ToastBarPosition toastBarPosition4 = new ToastBarPosition("OVERLAY_VIEW_BOTTOM", 3);
        f181047e = toastBarPosition4;
        ToastBarPosition toastBarPosition5 = new ToastBarPosition("CUSTOM_BOTTOM", 4);
        f181048f = toastBarPosition5;
        ToastBarPosition[] toastBarPositionArr = {toastBarPosition, toastBarPosition2, toastBarPosition3, toastBarPosition4, toastBarPosition5};
        f181049g = toastBarPositionArr;
        f181050h = kotlin.enums.c.a(toastBarPositionArr);
    }

    public ToastBarPosition() {
        throw null;
    }

    public static ToastBarPosition valueOf(String str) {
        return (ToastBarPosition) Enum.valueOf(ToastBarPosition.class, str);
    }

    public static ToastBarPosition[] values() {
        return (ToastBarPosition[]) f181049g.clone();
    }
}
