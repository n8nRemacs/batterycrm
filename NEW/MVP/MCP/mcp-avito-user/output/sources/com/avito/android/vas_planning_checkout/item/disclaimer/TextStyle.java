package com.avito.android.vas_planning_checkout.item.disclaimer;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VasPlanningDisclaimerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/disclaimer/TextStyle;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final TextStyle f322947b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ TextStyle[] f322948c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f322949d;

    static {
        TextStyle textStyle = new TextStyle("DEFAULT", 0);
        f322947b = textStyle;
        TextStyle[] textStyleArr = {textStyle, new TextStyle("BODY", 1)};
        f322948c = textStyleArr;
        f322949d = kotlin.enums.c.a(textStyleArr);
    }

    public TextStyle() {
        throw null;
    }

    public static TextStyle valueOf(String str) {
        return (TextStyle) Enum.valueOf(TextStyle.class, str);
    }

    public static TextStyle[] values() {
        return (TextStyle[]) f322948c.clone();
    }
}
