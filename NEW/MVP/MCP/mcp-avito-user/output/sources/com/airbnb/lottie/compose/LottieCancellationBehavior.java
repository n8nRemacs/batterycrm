package com.airbnb.lottie.compose;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LottieCancellationBehavior.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LottieCancellationBehavior {

    /* renamed from: b, reason: collision with root package name */
    public static final LottieCancellationBehavior f59394b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LottieCancellationBehavior[] f59395c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f59396d;

    static {
        LottieCancellationBehavior lottieCancellationBehavior = new LottieCancellationBehavior("Immediately", 0);
        f59394b = lottieCancellationBehavior;
        LottieCancellationBehavior[] lottieCancellationBehaviorArr = {lottieCancellationBehavior, new LottieCancellationBehavior("OnIterationFinish", 1)};
        f59395c = lottieCancellationBehaviorArr;
        f59396d = kotlin.enums.c.a(lottieCancellationBehaviorArr);
    }

    public LottieCancellationBehavior() {
        throw null;
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) f59395c.clone();
    }
}
