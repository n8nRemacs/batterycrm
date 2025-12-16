package com.avito.android.lib.design.selector_card;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectorCardStateManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardSelectStrategy;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectorCardSelectStrategy {

    /* renamed from: b, reason: collision with root package name */
    public static final SelectorCardSelectStrategy f180365b;

    /* renamed from: c, reason: collision with root package name */
    public static final SelectorCardSelectStrategy f180366c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SelectorCardSelectStrategy[] f180367d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180368e;

    static {
        SelectorCardSelectStrategy selectorCardSelectStrategy = new SelectorCardSelectStrategy("SINGLE", 0);
        f180365b = selectorCardSelectStrategy;
        SelectorCardSelectStrategy selectorCardSelectStrategy2 = new SelectorCardSelectStrategy("MULTIPLE", 1);
        f180366c = selectorCardSelectStrategy2;
        SelectorCardSelectStrategy[] selectorCardSelectStrategyArr = {selectorCardSelectStrategy, selectorCardSelectStrategy2};
        f180367d = selectorCardSelectStrategyArr;
        f180368e = kotlin.enums.c.a(selectorCardSelectStrategyArr);
    }

    public SelectorCardSelectStrategy() {
        throw null;
    }

    public static SelectorCardSelectStrategy valueOf(String str) {
        return (SelectorCardSelectStrategy) Enum.valueOf(SelectorCardSelectStrategy.class, str);
    }

    public static SelectorCardSelectStrategy[] values() {
        return (SelectorCardSelectStrategy[]) f180367d.clone();
    }
}
