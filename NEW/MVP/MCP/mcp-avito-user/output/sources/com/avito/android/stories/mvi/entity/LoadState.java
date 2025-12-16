package com.avito.android.stories.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/mvi/entity/LoadState;", "", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoadState {

    /* renamed from: b, reason: collision with root package name */
    public static final LoadState f285239b;

    /* renamed from: c, reason: collision with root package name */
    public static final LoadState f285240c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LoadState[] f285241d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f285242e;

    static {
        LoadState loadState = new LoadState("LOADING", 0);
        f285239b = loadState;
        LoadState loadState2 = new LoadState("READY", 1);
        f285240c = loadState2;
        LoadState[] loadStateArr = {loadState, loadState2};
        f285241d = loadStateArr;
        f285242e = c.a(loadStateArr);
    }

    public LoadState() {
        throw null;
    }

    public static LoadState valueOf(String str) {
        return (LoadState) Enum.valueOf(LoadState.class, str);
    }

    public static LoadState[] values() {
        return (LoadState[]) f285241d.clone();
    }
}
