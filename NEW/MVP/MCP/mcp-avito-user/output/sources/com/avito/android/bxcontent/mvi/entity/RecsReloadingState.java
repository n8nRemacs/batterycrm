package com.avito.android.bxcontent.mvi.entity;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/RecsReloadingState;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecsReloadingState {

    /* renamed from: b, reason: collision with root package name */
    public static final RecsReloadingState f112049b;

    /* renamed from: c, reason: collision with root package name */
    public static final RecsReloadingState f112050c;

    /* renamed from: d, reason: collision with root package name */
    public static final RecsReloadingState f112051d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ RecsReloadingState[] f112052e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f112053f;

    static {
        RecsReloadingState recsReloadingState = new RecsReloadingState("NONE", 0);
        f112049b = recsReloadingState;
        RecsReloadingState recsReloadingState2 = new RecsReloadingState("RELOADING", 1);
        f112050c = recsReloadingState2;
        RecsReloadingState recsReloadingState3 = new RecsReloadingState("RELOADED", 2);
        f112051d = recsReloadingState3;
        RecsReloadingState[] recsReloadingStateArr = {recsReloadingState, recsReloadingState2, recsReloadingState3};
        f112052e = recsReloadingStateArr;
        f112053f = kotlin.enums.c.a(recsReloadingStateArr);
    }

    public RecsReloadingState() {
        throw null;
    }

    public static RecsReloadingState valueOf(String str) {
        return (RecsReloadingState) Enum.valueOf(RecsReloadingState.class, str);
    }

    public static RecsReloadingState[] values() {
        return (RecsReloadingState[]) f112052e.clone();
    }
}
