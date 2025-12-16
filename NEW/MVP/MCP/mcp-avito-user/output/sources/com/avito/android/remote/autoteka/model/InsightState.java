package com.avito.android.remote.autoteka.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutotekaPreviewResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/autoteka/model/InsightState;", "", "(Ljava/lang/String;I)V", "COMPLETE", "LOADING", "INCOMPLETE", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InsightState {

    @c("complete")
    public static final InsightState COMPLETE;

    @c("incomplete")
    public static final InsightState INCOMPLETE;

    @c("loading")
    public static final InsightState LOADING;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InsightState[] f253294b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f253295c;

    static {
        InsightState insightState = new InsightState("COMPLETE", 0);
        COMPLETE = insightState;
        InsightState insightState2 = new InsightState("LOADING", 1);
        LOADING = insightState2;
        InsightState insightState3 = new InsightState("INCOMPLETE", 2);
        INCOMPLETE = insightState3;
        InsightState[] insightStateArr = {insightState, insightState2, insightState3};
        f253294b = insightStateArr;
        f253295c = kotlin.enums.c.a(insightStateArr);
    }

    private InsightState(String str, int i12) {
    }

    public static InsightState valueOf(String str) {
        return (InsightState) Enum.valueOf(InsightState.class, str);
    }

    public static InsightState[] values() {
        return (InsightState[]) f253294b.clone();
    }
}
