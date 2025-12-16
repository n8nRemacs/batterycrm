package com.avito.android.map_core.view.pin_items;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublishFloatingViewsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/pin_items/ViewVisibility;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ViewVisibility {

    /* renamed from: b, reason: collision with root package name */
    public static final ViewVisibility f185805b;

    /* renamed from: c, reason: collision with root package name */
    public static final ViewVisibility f185806c;

    /* renamed from: d, reason: collision with root package name */
    public static final ViewVisibility f185807d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ViewVisibility[] f185808e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f185809f;

    static {
        ViewVisibility viewVisibility = new ViewVisibility("HIDDEN", 0);
        f185805b = viewVisibility;
        ViewVisibility viewVisibility2 = new ViewVisibility("PARTIALLY_VISIBLE", 1);
        f185806c = viewVisibility2;
        ViewVisibility viewVisibility3 = new ViewVisibility("COMPLETELY_VISIBLE", 2);
        f185807d = viewVisibility3;
        ViewVisibility[] viewVisibilityArr = {viewVisibility, viewVisibility2, viewVisibility3};
        f185808e = viewVisibilityArr;
        f185809f = kotlin.enums.c.a(viewVisibilityArr);
    }

    public ViewVisibility() {
        throw null;
    }

    public static ViewVisibility valueOf(String str) {
        return (ViewVisibility) Enum.valueOf(ViewVisibility.class, str);
    }

    public static ViewVisibility[] values() {
        return (ViewVisibility[]) f185808e.clone();
    }
}
