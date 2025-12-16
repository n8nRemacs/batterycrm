package com.avito.android.remote.autoteka.model;

import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutotekaPreviewResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/autoteka/model/InsightStatus;", "", "(Ljava/lang/String;I)V", "OK", "NEUTRAL", "WARNING", "CAUTION", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InsightStatus {

    @c("caution")
    public static final InsightStatus CAUTION;

    @c("neutral")
    public static final InsightStatus NEUTRAL;

    /* renamed from: OK, reason: collision with root package name */
    @c("ok")
    public static final InsightStatus f253296OK;

    @c(ConstraintKt.WARNING)
    public static final InsightStatus WARNING;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InsightStatus[] f253297b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f253298c;

    static {
        InsightStatus insightStatus = new InsightStatus("OK", 0);
        f253296OK = insightStatus;
        InsightStatus insightStatus2 = new InsightStatus("NEUTRAL", 1);
        NEUTRAL = insightStatus2;
        InsightStatus insightStatus3 = new InsightStatus("WARNING", 2);
        WARNING = insightStatus3;
        InsightStatus insightStatus4 = new InsightStatus("CAUTION", 3);
        CAUTION = insightStatus4;
        InsightStatus[] insightStatusArr = {insightStatus, insightStatus2, insightStatus3, insightStatus4};
        f253297b = insightStatusArr;
        f253298c = kotlin.enums.c.a(insightStatusArr);
    }

    private InsightStatus(String str, int i12) {
    }

    public static InsightStatus valueOf(String str) {
        return (InsightStatus) Enum.valueOf(InsightStatus.class, str);
    }

    public static InsightStatus[] values() {
        return (InsightStatus[]) f253297b.clone();
    }
}
