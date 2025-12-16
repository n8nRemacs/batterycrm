package com.avito.android.extended_profile_serp;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedProfileSerpFloatingViewsPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/VisibilityState;", "", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VisibilityState {

    /* renamed from: b, reason: collision with root package name */
    public static final VisibilityState f152580b;

    /* renamed from: c, reason: collision with root package name */
    public static final VisibilityState f152581c;

    /* renamed from: d, reason: collision with root package name */
    public static final VisibilityState f152582d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ VisibilityState[] f152583e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f152584f;

    static {
        VisibilityState visibilityState = new VisibilityState("HIDDEN", 0);
        f152580b = visibilityState;
        VisibilityState visibilityState2 = new VisibilityState("COMPLETELY_VISIBLE", 1);
        f152581c = visibilityState2;
        VisibilityState visibilityState3 = new VisibilityState("PARTIALLY_VISIBLE", 2);
        f152582d = visibilityState3;
        VisibilityState[] visibilityStateArr = {visibilityState, visibilityState2, visibilityState3};
        f152583e = visibilityStateArr;
        f152584f = kotlin.enums.c.a(visibilityStateArr);
    }

    public VisibilityState() {
        throw null;
    }

    public static VisibilityState valueOf(String str) {
        return (VisibilityState) Enum.valueOf(VisibilityState.class, str);
    }

    public static VisibilityState[] values() {
        return (VisibilityState[]) f152583e.clone();
    }
}
