package com.avito.android.bxcontent.mvi.entity;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/LoadState;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoadState {

    /* renamed from: b, reason: collision with root package name */
    public static final LoadState f112043b;

    /* renamed from: c, reason: collision with root package name */
    public static final LoadState f112044c;

    /* renamed from: d, reason: collision with root package name */
    public static final LoadState f112045d;

    /* renamed from: e, reason: collision with root package name */
    public static final LoadState f112046e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ LoadState[] f112047f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f112048g;

    static {
        LoadState loadState = new LoadState("NONE", 0);
        f112043b = loadState;
        LoadState loadState2 = new LoadState("LOADING", 1);
        f112044c = loadState2;
        LoadState loadState3 = new LoadState("LOAD", 2);
        f112045d = loadState3;
        LoadState loadState4 = new LoadState("ERROR", 3);
        f112046e = loadState4;
        LoadState[] loadStateArr = {loadState, loadState2, loadState3, loadState4};
        f112047f = loadStateArr;
        f112048g = kotlin.enums.c.a(loadStateArr);
    }

    public LoadState() {
        throw null;
    }

    public static LoadState valueOf(String str) {
        return (LoadState) Enum.valueOf(LoadState.class, str);
    }

    public static LoadState[] values() {
        return (LoadState[]) f112047f.clone();
    }
}
