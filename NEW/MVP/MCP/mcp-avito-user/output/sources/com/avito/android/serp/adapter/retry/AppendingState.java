package com.avito.android.serp.adapter.retry;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppendingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/retry/AppendingState;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppendingState {

    /* renamed from: b, reason: collision with root package name */
    public static final AppendingState f270750b;

    /* renamed from: c, reason: collision with root package name */
    public static final AppendingState f270751c;

    /* renamed from: d, reason: collision with root package name */
    public static final AppendingState f270752d;

    /* renamed from: e, reason: collision with root package name */
    public static final AppendingState f270753e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AppendingState[] f270754f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f270755g;

    static {
        AppendingState appendingState = new AppendingState("NONE", 0);
        f270750b = appendingState;
        AppendingState appendingState2 = new AppendingState("CAN_LOAD", 1);
        f270751c = appendingState2;
        AppendingState appendingState3 = new AppendingState("LOADING", 2);
        f270752d = appendingState3;
        AppendingState appendingState4 = new AppendingState("ERROR", 3);
        f270753e = appendingState4;
        AppendingState[] appendingStateArr = {appendingState, appendingState2, appendingState3, appendingState4};
        f270754f = appendingStateArr;
        f270755g = kotlin.enums.c.a(appendingStateArr);
    }

    public AppendingState() {
        throw null;
    }

    public static AppendingState valueOf(String str) {
        return (AppendingState) Enum.valueOf(AppendingState.class, str);
    }

    public static AppendingState[] values() {
        return (AppendingState[]) f270754f.clone();
    }
}
