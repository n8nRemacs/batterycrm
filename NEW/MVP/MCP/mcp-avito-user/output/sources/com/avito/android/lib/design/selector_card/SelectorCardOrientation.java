package com.avito.android.lib.design.selector_card;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectorCardGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardOrientation;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectorCardOrientation {

    /* renamed from: c, reason: collision with root package name */
    public static final SelectorCardOrientation f180359c;

    /* renamed from: d, reason: collision with root package name */
    public static final SelectorCardOrientation f180360d;

    /* renamed from: e, reason: collision with root package name */
    public static final SelectorCardOrientation f180361e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ SelectorCardOrientation[] f180362f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180363g;

    /* renamed from: b, reason: collision with root package name */
    public final int f180364b;

    static {
        SelectorCardOrientation selectorCardOrientation = new SelectorCardOrientation("HORIZONTAL", 0, 0);
        f180359c = selectorCardOrientation;
        SelectorCardOrientation selectorCardOrientation2 = new SelectorCardOrientation("VERTICAL", 1, 1);
        f180360d = selectorCardOrientation2;
        SelectorCardOrientation selectorCardOrientation3 = new SelectorCardOrientation("GRID", 2, 1);
        f180361e = selectorCardOrientation3;
        SelectorCardOrientation[] selectorCardOrientationArr = {selectorCardOrientation, selectorCardOrientation2, selectorCardOrientation3};
        f180362f = selectorCardOrientationArr;
        f180363g = kotlin.enums.c.a(selectorCardOrientationArr);
    }

    public SelectorCardOrientation(String str, int i12, int i13) {
        this.f180364b = i13;
    }

    public static SelectorCardOrientation valueOf(String str) {
        return (SelectorCardOrientation) Enum.valueOf(SelectorCardOrientation.class, str);
    }

    public static SelectorCardOrientation[] values() {
        return (SelectorCardOrientation[]) f180362f.clone();
    }
}
