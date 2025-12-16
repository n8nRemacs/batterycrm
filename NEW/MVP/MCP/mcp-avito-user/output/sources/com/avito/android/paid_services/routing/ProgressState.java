package com.avito.android.paid_services.routing;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProgressState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paid_services/routing/ProgressState;", "", "_avito_paid-services_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProgressState {

    /* renamed from: b, reason: collision with root package name */
    public static final ProgressState f210623b;

    /* renamed from: c, reason: collision with root package name */
    public static final ProgressState f210624c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ProgressState[] f210625d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f210626e;

    static {
        ProgressState progressState = new ProgressState("NORMAL", 0);
        f210623b = progressState;
        ProgressState progressState2 = new ProgressState("WARNING", 1);
        f210624c = progressState2;
        ProgressState[] progressStateArr = {progressState, progressState2};
        f210625d = progressStateArr;
        f210626e = c.a(progressStateArr);
    }

    public ProgressState() {
        throw null;
    }

    public static ProgressState valueOf(String str) {
        return (ProgressState) Enum.valueOf(ProgressState.class, str);
    }

    public static ProgressState[] values() {
        return (ProgressState[]) f210625d.clone();
    }
}
