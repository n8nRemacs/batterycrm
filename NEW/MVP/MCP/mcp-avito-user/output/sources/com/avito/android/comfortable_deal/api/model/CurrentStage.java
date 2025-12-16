package com.avito.android.comfortable_deal.api.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrentStage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/CurrentStage;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Introduction", "Meeting", "Published", "Deposit", "Deal", "Refused", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurrentStage {

    @c("deal")
    public static final CurrentStage Deal;

    @c("deposit")
    public static final CurrentStage Deposit;

    @c("introduction")
    public static final CurrentStage Introduction;

    @c("meeting")
    public static final CurrentStage Meeting;

    @c("published")
    public static final CurrentStage Published;

    @c("refused")
    public static final CurrentStage Refused;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CurrentStage[] f119760c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f119761d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119762b;

    static {
        CurrentStage currentStage = new CurrentStage("Introduction", 0, "introduction");
        Introduction = currentStage;
        CurrentStage currentStage2 = new CurrentStage("Meeting", 1, "meeting");
        Meeting = currentStage2;
        CurrentStage currentStage3 = new CurrentStage("Published", 2, "published");
        Published = currentStage3;
        CurrentStage currentStage4 = new CurrentStage("Deposit", 3, "deposit");
        Deposit = currentStage4;
        CurrentStage currentStage5 = new CurrentStage("Deal", 4, "deal");
        Deal = currentStage5;
        CurrentStage currentStage6 = new CurrentStage("Refused", 5, "refused");
        Refused = currentStage6;
        CurrentStage[] currentStageArr = {currentStage, currentStage2, currentStage3, currentStage4, currentStage5, currentStage6};
        f119760c = currentStageArr;
        f119761d = kotlin.enums.c.a(currentStageArr);
    }

    private CurrentStage(String str, int i12, String str2) {
        this.f119762b = str2;
    }

    public static CurrentStage valueOf(String str) {
        return (CurrentStage) Enum.valueOf(CurrentStage.class, str);
    }

    public static CurrentStage[] values() {
        return (CurrentStage[]) f119760c.clone();
    }
}
