package com.avito.android.master_plan.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MasterPlanState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/mvi/entity/LoadingState;", "", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LoadingState {

    /* renamed from: b, reason: collision with root package name */
    public static final LoadingState f186068b;

    /* renamed from: c, reason: collision with root package name */
    public static final LoadingState f186069c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LoadingState[] f186070d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f186071e;

    static {
        LoadingState loadingState = new LoadingState("Loading", 0);
        f186068b = loadingState;
        LoadingState loadingState2 = new LoadingState("Loaded", 1);
        f186069c = loadingState2;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, new LoadingState("Error", 2)};
        f186070d = loadingStateArr;
        f186071e = c.a(loadingStateArr);
    }

    public LoadingState() {
        throw null;
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) f186070d.clone();
    }
}
