package com.avito.android.map.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/LoadState;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LoadState {

    /* renamed from: b, reason: collision with root package name */
    public static final LoadState f185047b;

    /* renamed from: c, reason: collision with root package name */
    public static final LoadState f185048c;

    /* renamed from: d, reason: collision with root package name */
    public static final LoadState f185049d;

    /* renamed from: e, reason: collision with root package name */
    public static final LoadState f185050e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ LoadState[] f185051f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f185052g;

    static {
        LoadState loadState = new LoadState("NONE", 0);
        f185047b = loadState;
        LoadState loadState2 = new LoadState("LOADING", 1);
        f185048c = loadState2;
        LoadState loadState3 = new LoadState("LOAD", 2);
        f185049d = loadState3;
        LoadState loadState4 = new LoadState("ERROR", 3);
        f185050e = loadState4;
        LoadState[] loadStateArr = {loadState, loadState2, loadState3, loadState4};
        f185051f = loadStateArr;
        f185052g = c.a(loadStateArr);
    }

    public LoadState() {
        throw null;
    }

    public static LoadState valueOf(String str) {
        return (LoadState) Enum.valueOf(LoadState.class, str);
    }

    public static LoadState[] values() {
        return (LoadState[]) f185051f.clone();
    }

    public final boolean a() {
        return this == f185048c;
    }
}
