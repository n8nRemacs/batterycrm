package com.avito.beduin.v2.avito.component.chips.state;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisplayView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/chips/state/DisplayView;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisplayView {

    /* renamed from: b, reason: collision with root package name */
    public static final DisplayView f334047b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DisplayView[] f334048c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f334049d;

    static {
        DisplayView displayView = new DisplayView("SingleLineFixed", 0);
        DisplayView displayView2 = new DisplayView("SingleLineStretched", 1);
        DisplayView displayView3 = new DisplayView("SingleLineScrollable", 2);
        f334047b = displayView3;
        DisplayView[] displayViewArr = {displayView, displayView2, displayView3, new DisplayView("MultiLine", 3)};
        f334048c = displayViewArr;
        f334049d = kotlin.enums.c.a(displayViewArr);
    }

    public DisplayView() {
        throw null;
    }

    public static DisplayView valueOf(String str) {
        return (DisplayView) Enum.valueOf(DisplayView.class, str);
    }

    public static DisplayView[] values() {
        return (DisplayView[]) f334048c.clone();
    }
}
