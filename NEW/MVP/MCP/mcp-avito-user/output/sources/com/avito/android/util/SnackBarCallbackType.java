package com.avito.android.util;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnackBarCallbackObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/SnackBarCallbackType;", "", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SnackBarCallbackType {

    /* renamed from: b, reason: collision with root package name */
    public static final SnackBarCallbackType f318736b;

    /* renamed from: c, reason: collision with root package name */
    public static final SnackBarCallbackType f318737c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SnackBarCallbackType[] f318738d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f318739e;

    static {
        SnackBarCallbackType snackBarCallbackType = new SnackBarCallbackType("ACTION_CLICK", 0);
        f318736b = snackBarCallbackType;
        SnackBarCallbackType snackBarCallbackType2 = new SnackBarCallbackType("CLOSE", 1);
        f318737c = snackBarCallbackType2;
        SnackBarCallbackType[] snackBarCallbackTypeArr = {snackBarCallbackType, snackBarCallbackType2};
        f318738d = snackBarCallbackTypeArr;
        f318739e = kotlin.enums.c.a(snackBarCallbackTypeArr);
    }

    public SnackBarCallbackType() {
        throw null;
    }

    public static SnackBarCallbackType valueOf(String str) {
        return (SnackBarCallbackType) Enum.valueOf(SnackBarCallbackType.class, str);
    }

    public static SnackBarCallbackType[] values() {
        return (SnackBarCallbackType[]) f318738d.clone();
    }
}
