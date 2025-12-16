package com.avito.android.search_view;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Toolbar23SearchView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/ShareButtonEvent;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShareButtonEvent {

    /* renamed from: b, reason: collision with root package name */
    public static final ShareButtonEvent f264426b;

    /* renamed from: c, reason: collision with root package name */
    public static final ShareButtonEvent f264427c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ShareButtonEvent[] f264428d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f264429e;

    static {
        ShareButtonEvent shareButtonEvent = new ShareButtonEvent("ON_CLICKED", 0);
        f264426b = shareButtonEvent;
        ShareButtonEvent shareButtonEvent2 = new ShareButtonEvent("ON_SHOWN", 1);
        f264427c = shareButtonEvent2;
        ShareButtonEvent[] shareButtonEventArr = {shareButtonEvent, shareButtonEvent2};
        f264428d = shareButtonEventArr;
        f264429e = kotlin.enums.c.a(shareButtonEventArr);
    }

    public ShareButtonEvent() {
        throw null;
    }

    public static ShareButtonEvent valueOf(String str) {
        return (ShareButtonEvent) Enum.valueOf(ShareButtonEvent.class, str);
    }

    public static ShareButtonEvent[] values() {
        return (ShareButtonEvent[]) f264428d.clone();
    }
}
