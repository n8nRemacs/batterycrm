package com.avito.android.comfortable_deal.generated.api.deal_stage_api;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: DealStageApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/deal_stage_api/DealStageApiResponse;", "", "Lcom/avito/android/comfortable_deal/generated/api/deal_stage_api/DealStageApiResponse$DealStage;", "dealStage", "<init>", "(Lcom/avito/android/comfortable_deal/generated/api/deal_stage_api/DealStageApiResponse$DealStage;)V", "Lcom/avito/android/comfortable_deal/generated/api/deal_stage_api/DealStageApiResponse$DealStage;", "a", "()Lcom/avito/android/comfortable_deal/generated/api/deal_stage_api/DealStageApiResponse$DealStage;", "DealStage", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DealStageApiResponse {

    @c("dealStage")
    @k
    private final DealStage dealStage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DealStageApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/deal_stage_api/DealStageApiResponse$DealStage;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Introduction", "Meeting", "Published", "Deposit", "Deal", "Refused", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DealStage {

        @c("deal")
        public static final DealStage Deal;

        @c("deposit")
        public static final DealStage Deposit;

        @c("introduction")
        public static final DealStage Introduction;

        @c("meeting")
        public static final DealStage Meeting;

        @c("published")
        public static final DealStage Published;

        @c("refused")
        public static final DealStage Refused;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ DealStage[] f122401b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f122402c;

        static {
            DealStage dealStage = new DealStage("Introduction", 0, "introduction");
            Introduction = dealStage;
            DealStage dealStage2 = new DealStage("Meeting", 1, "meeting");
            Meeting = dealStage2;
            DealStage dealStage3 = new DealStage("Published", 2, "published");
            Published = dealStage3;
            DealStage dealStage4 = new DealStage("Deposit", 3, "deposit");
            Deposit = dealStage4;
            DealStage dealStage5 = new DealStage("Deal", 4, "deal");
            Deal = dealStage5;
            DealStage dealStage6 = new DealStage("Refused", 5, "refused");
            Refused = dealStage6;
            DealStage[] dealStageArr = {dealStage, dealStage2, dealStage3, dealStage4, dealStage5, dealStage6};
            f122401b = dealStageArr;
            f122402c = kotlin.enums.c.a(dealStageArr);
        }

        private DealStage(String str, int i12, String str2) {
        }

        public static DealStage valueOf(String str) {
            return (DealStage) Enum.valueOf(DealStage.class, str);
        }

        public static DealStage[] values() {
            return (DealStage[]) f122401b.clone();
        }
    }

    public DealStageApiResponse(@k DealStage dealStage) {
        this.dealStage = dealStage;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final DealStage getDealStage() {
        return this.dealStage;
    }
}
