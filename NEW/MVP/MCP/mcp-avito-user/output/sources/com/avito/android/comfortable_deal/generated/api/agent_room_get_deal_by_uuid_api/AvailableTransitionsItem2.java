package com.avito.android.comfortable_deal.generated.api.agent_room_get_deal_by_uuid_api;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/AvailableTransitionsItem2;", "", "", "id", "", "label", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/AvailableTransitionsItem2$Transition;", "transition", "<init>", "(JLjava/lang/String;Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/AvailableTransitionsItem2$Transition;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/AvailableTransitionsItem2$Transition;", "c", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/AvailableTransitionsItem2$Transition;", "Transition", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AvailableTransitionsItem2 {

    @c("id")
    private final long id;

    @c("label")
    @k
    private final String label;

    @c("transition")
    @k
    private final Transition transition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/AvailableTransitionsItem2$Transition;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unreachable", "DidNotAgreeOnMeeting", "MeetingWasAgreed", "InAdvertising", "DepositMade", "Sold", "RefusedBySeller", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Transition {

        @c("deposit_made")
        public static final Transition DepositMade;

        @c("did_not_agree_on_meeting")
        public static final Transition DidNotAgreeOnMeeting;

        @c("in_advertising")
        public static final Transition InAdvertising;

        @c("meeting_was_agreed")
        public static final Transition MeetingWasAgreed;

        @c("refused_by_seller")
        public static final Transition RefusedBySeller;

        @c("sold")
        public static final Transition Sold;

        @c("unreachable")
        public static final Transition Unreachable;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Transition[] f122381c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f122382d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122383b;

        static {
            Transition transition = new Transition("Unreachable", 0, "unreachable");
            Unreachable = transition;
            Transition transition2 = new Transition("DidNotAgreeOnMeeting", 1, "did_not_agree_on_meeting");
            DidNotAgreeOnMeeting = transition2;
            Transition transition3 = new Transition("MeetingWasAgreed", 2, "meeting_was_agreed");
            MeetingWasAgreed = transition3;
            Transition transition4 = new Transition("InAdvertising", 3, "in_advertising");
            InAdvertising = transition4;
            Transition transition5 = new Transition("DepositMade", 4, "deposit_made");
            DepositMade = transition5;
            Transition transition6 = new Transition("Sold", 5, "sold");
            Sold = transition6;
            Transition transition7 = new Transition("RefusedBySeller", 6, "refused_by_seller");
            RefusedBySeller = transition7;
            Transition[] transitionArr = {transition, transition2, transition3, transition4, transition5, transition6, transition7};
            f122381c = transitionArr;
            f122382d = kotlin.enums.c.a(transitionArr);
        }

        private Transition(String str, int i12, String str2) {
            this.f122383b = str2;
        }

        public static Transition valueOf(String str) {
            return (Transition) Enum.valueOf(Transition.class, str);
        }

        public static Transition[] values() {
            return (Transition[]) f122381c.clone();
        }
    }

    public AvailableTransitionsItem2(long j12, @k String str, @k Transition transition) {
        this.id = j12;
        this.label = str;
        this.transition = transition;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Transition getTransition() {
        return this.transition;
    }
}
