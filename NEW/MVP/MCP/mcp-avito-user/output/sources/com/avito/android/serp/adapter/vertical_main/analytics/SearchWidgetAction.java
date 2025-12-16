package com.avito.android.serp.adapter.vertical_main.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerticalMainSearchWidgetActionEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/analytics/SearchWidgetAction;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchWidgetAction {

    /* renamed from: c, reason: collision with root package name */
    public static final SearchWidgetAction f272569c;

    /* renamed from: d, reason: collision with root package name */
    public static final SearchWidgetAction f272570d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SearchWidgetAction[] f272571e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f272572f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272573b;

    static {
        SearchWidgetAction searchWidgetAction = new SearchWidgetAction("AUTO", 0, "auto");
        f272569c = searchWidgetAction;
        SearchWidgetAction searchWidgetAction2 = new SearchWidgetAction("BY_CLICK", 1, "by_click");
        f272570d = searchWidgetAction2;
        SearchWidgetAction[] searchWidgetActionArr = {searchWidgetAction, searchWidgetAction2};
        f272571e = searchWidgetActionArr;
        f272572f = c.a(searchWidgetActionArr);
    }

    public SearchWidgetAction(String str, int i12, String str2) {
        this.f272573b = str2;
    }

    public static SearchWidgetAction valueOf(String str) {
        return (SearchWidgetAction) Enum.valueOf(SearchWidgetAction.class, str);
    }

    public static SearchWidgetAction[] values() {
        return (SearchWidgetAction[]) f272571e.clone();
    }
}
