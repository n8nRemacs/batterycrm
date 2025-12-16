package com.avito.android.lib.design.chips;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChipsStateManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/SelectStrategy;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectStrategy {

    /* renamed from: b, reason: collision with root package name */
    public static final SelectStrategy f178716b;

    /* renamed from: c, reason: collision with root package name */
    public static final SelectStrategy f178717c;

    /* renamed from: d, reason: collision with root package name */
    public static final SelectStrategy f178718d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SelectStrategy[] f178719e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f178720f;

    static {
        SelectStrategy selectStrategy = new SelectStrategy("SINGLE", 0);
        f178716b = selectStrategy;
        SelectStrategy selectStrategy2 = new SelectStrategy("MULTIPLE", 1);
        f178717c = selectStrategy2;
        SelectStrategy selectStrategy3 = new SelectStrategy("SINGLE_OPTIONAL", 2);
        f178718d = selectStrategy3;
        SelectStrategy[] selectStrategyArr = {selectStrategy, selectStrategy2, selectStrategy3};
        f178719e = selectStrategyArr;
        f178720f = kotlin.enums.c.a(selectStrategyArr);
    }

    public SelectStrategy() {
        throw null;
    }

    public static SelectStrategy valueOf(String str) {
        return (SelectStrategy) Enum.valueOf(SelectStrategy.class, str);
    }

    public static SelectStrategy[] values() {
        return (SelectStrategy[]) f178719e.clone();
    }
}
