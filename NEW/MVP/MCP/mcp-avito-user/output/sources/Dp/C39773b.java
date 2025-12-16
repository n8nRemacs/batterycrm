package dp;

import com.avito.android.comfortable_deal.generated.api.agent_room_get_deal_by_uuid_api.GetDealByUuidOutSuccessApi;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AgentRoomDealResponse.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: dp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39773b {

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dp.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f394064a;

        static {
            int[] iArr = new int[GetDealByUuidOutSuccessApi.SelectedStageValue.values().length];
            try {
                iArr[GetDealByUuidOutSuccessApi.SelectedStageValue.Introduction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetDealByUuidOutSuccessApi.SelectedStageValue.Meeting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetDealByUuidOutSuccessApi.SelectedStageValue.Published.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetDealByUuidOutSuccessApi.SelectedStageValue.Deposit.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GetDealByUuidOutSuccessApi.SelectedStageValue.Deal.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GetDealByUuidOutSuccessApi.SelectedStageValue.Refused.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f394064a = iArr;
        }
    }
}
