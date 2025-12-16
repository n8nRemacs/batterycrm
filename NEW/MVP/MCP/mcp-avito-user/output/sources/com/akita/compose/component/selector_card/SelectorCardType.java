package com.akita.compose.component.selector_card;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectorCardType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/selector_card/SelectorCardType;", "", "selector-card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SelectorCardType {

    /* renamed from: b, reason: collision with root package name */
    public static final SelectorCardType f62626b;

    /* renamed from: c, reason: collision with root package name */
    public static final SelectorCardType f62627c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SelectorCardType[] f62628d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f62629e;

    static {
        SelectorCardType selectorCardType = new SelectorCardType("Checkmark", 0);
        f62626b = selectorCardType;
        SelectorCardType selectorCardType2 = new SelectorCardType("Switcher", 1);
        SelectorCardType selectorCardType3 = new SelectorCardType("None", 2);
        f62627c = selectorCardType3;
        SelectorCardType[] selectorCardTypeArr = {selectorCardType, selectorCardType2, selectorCardType3};
        f62628d = selectorCardTypeArr;
        f62629e = kotlin.enums.c.a(selectorCardTypeArr);
    }

    public SelectorCardType() {
        throw null;
    }

    public static SelectorCardType valueOf(String str) {
        return (SelectorCardType) Enum.valueOf(SelectorCardType.class, str);
    }

    public static SelectorCardType[] values() {
        return (SelectorCardType[]) f62628d.clone();
    }
}
