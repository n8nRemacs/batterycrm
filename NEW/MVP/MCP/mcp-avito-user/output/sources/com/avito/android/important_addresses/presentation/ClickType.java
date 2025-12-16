package com.avito.android.important_addresses.presentation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImportantAddressesItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/ClickType;", "", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ClickType {

    /* renamed from: b, reason: collision with root package name */
    public static final ClickType f169582b;

    /* renamed from: c, reason: collision with root package name */
    public static final ClickType f169583c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ClickType[] f169584d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f169585e;

    static {
        ClickType clickType = new ClickType("BUTTON", 0);
        f169582b = clickType;
        ClickType clickType2 = new ClickType("HINT", 1);
        f169583c = clickType2;
        ClickType[] clickTypeArr = {clickType, clickType2};
        f169584d = clickTypeArr;
        f169585e = kotlin.enums.c.a(clickTypeArr);
    }

    public ClickType() {
        throw null;
    }

    public static ClickType valueOf(String str) {
        return (ClickType) Enum.valueOf(ClickType.class, str);
    }

    public static ClickType[] values() {
        return (ClickType[]) f169584d.clone();
    }
}
