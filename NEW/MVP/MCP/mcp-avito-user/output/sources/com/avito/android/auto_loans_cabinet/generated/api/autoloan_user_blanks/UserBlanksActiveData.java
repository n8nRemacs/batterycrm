package com.avito.android.auto_loans_cabinet.generated.api.autoloan_user_blanks;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AutoloanUserBlanksResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData;", "", "", "applicationsCount", "blankId", "Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData$BlankStep;", "blankStep", "itemId", "<init>", "(Ljava/lang/Long;JLcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData$BlankStep;J)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "J", "b", "()J", "Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData$BlankStep;", "c", "()Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData$BlankStep;", "d", "BlankStep", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserBlanksActiveData {

    @c("applicationsCount")
    @l
    private final Long applicationsCount;

    @c("blankId")
    private final long blankId;

    @c("blankStep")
    @k
    private final BlankStep blankStep;

    @c("itemId")
    private final long itemId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AutoloanUserBlanksResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/generated/api/autoloan_user_blanks/UserBlanksActiveData$BlankStep;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Started", "ScoredNegative", "ScoredPositive", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BlankStep {

        @c("scored_negative")
        public static final BlankStep ScoredNegative;

        @c("scored_positive")
        public static final BlankStep ScoredPositive;

        @c("started")
        public static final BlankStep Started;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ BlankStep[] f95407b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f95408c;

        static {
            BlankStep blankStep = new BlankStep("Started", 0, "started");
            Started = blankStep;
            BlankStep blankStep2 = new BlankStep("ScoredNegative", 1, "scored_negative");
            ScoredNegative = blankStep2;
            BlankStep blankStep3 = new BlankStep("ScoredPositive", 2, "scored_positive");
            ScoredPositive = blankStep3;
            BlankStep[] blankStepArr = {blankStep, blankStep2, blankStep3};
            f95407b = blankStepArr;
            f95408c = kotlin.enums.c.a(blankStepArr);
        }

        private BlankStep(String str, int i12, String str2) {
        }

        public static BlankStep valueOf(String str) {
            return (BlankStep) Enum.valueOf(BlankStep.class, str);
        }

        public static BlankStep[] values() {
            return (BlankStep[]) f95407b.clone();
        }
    }

    public UserBlanksActiveData(@l Long l12, long j12, @k BlankStep blankStep, long j13) {
        this.applicationsCount = l12;
        this.blankId = j12;
        this.blankStep = blankStep;
        this.itemId = j13;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getApplicationsCount() {
        return this.applicationsCount;
    }

    /* renamed from: b, reason: from getter */
    public final long getBlankId() {
        return this.blankId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final BlankStep getBlankStep() {
        return this.blankStep;
    }

    /* renamed from: d, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }
}
