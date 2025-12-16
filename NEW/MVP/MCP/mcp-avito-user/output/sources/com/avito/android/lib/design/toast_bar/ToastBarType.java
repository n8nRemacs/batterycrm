package com.avito.android.lib.design.toast_bar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToastBarType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/ToastBarType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ToastBarType {

    /* renamed from: b, reason: collision with root package name */
    public static final ToastBarType f181051b;

    /* renamed from: c, reason: collision with root package name */
    public static final ToastBarType f181052c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ToastBarType[] f181053d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181054e;

    static {
        ToastBarType toastBarType = new ToastBarType("DEFAULT", 0);
        f181051b = toastBarType;
        ToastBarType toastBarType2 = new ToastBarType("ERROR", 1);
        f181052c = toastBarType2;
        ToastBarType[] toastBarTypeArr = {toastBarType, toastBarType2};
        f181053d = toastBarTypeArr;
        f181054e = kotlin.enums.c.a(toastBarTypeArr);
    }

    public ToastBarType() {
        throw null;
    }

    public static ToastBarType valueOf(String str) {
        return (ToastBarType) Enum.valueOf(ToastBarType.class, str);
    }

    public static ToastBarType[] values() {
        return (ToastBarType[]) f181053d.clone();
    }
}
