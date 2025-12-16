package com.avito.android.floating_views;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FloatingViewsPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/floating_views/VisibilityState;", "", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VisibilityState {

    /* renamed from: b, reason: collision with root package name */
    public static final VisibilityState f158450b;

    /* renamed from: c, reason: collision with root package name */
    public static final VisibilityState f158451c;

    /* renamed from: d, reason: collision with root package name */
    public static final VisibilityState f158452d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ VisibilityState[] f158453e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158454f;

    static {
        VisibilityState visibilityState = new VisibilityState("HIDDEN", 0);
        f158450b = visibilityState;
        VisibilityState visibilityState2 = new VisibilityState("COMPLETELY_VISIBLE", 1);
        f158451c = visibilityState2;
        VisibilityState visibilityState3 = new VisibilityState("PARTIALLY_VISIBLE", 2);
        f158452d = visibilityState3;
        VisibilityState[] visibilityStateArr = {visibilityState, visibilityState2, visibilityState3};
        f158453e = visibilityStateArr;
        f158454f = kotlin.enums.c.a(visibilityStateArr);
    }

    public VisibilityState() {
        throw null;
    }

    public static VisibilityState valueOf(String str) {
        return (VisibilityState) Enum.valueOf(VisibilityState.class, str);
    }

    public static VisibilityState[] values() {
        return (VisibilityState[]) f158453e.clone();
    }
}
