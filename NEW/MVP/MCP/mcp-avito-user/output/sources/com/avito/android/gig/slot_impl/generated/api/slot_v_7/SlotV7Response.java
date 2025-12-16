package com.avito.android.gig.slot_impl.generated.api.slot_v_7;

import LG.d;
import LG.e;
import LG.f;
import LG.h;
import LG.m;
import LG.n;
import LG.q;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\b\u0007\u0018\u00002\u00020\u0001:\u0001hBë\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b0\u0010/R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u00103R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b:\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\bJ\u00109R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\bN\u00109R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010U\u001a\u0004\bV\u0010WR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010X\u001a\u0004\bY\u0010ZR\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010[\u001a\u0004\b\\\u0010]R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010^\u001a\u0004\b_\u0010`R\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010a\u001a\u0004\bb\u0010cR\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010d\u001a\u0004\be\u0010fR\u001c\u0010*\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010D\u001a\u0004\bg\u0010F¨\u0006i"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7Response;", "", "LLG/n;", "actionButtons", "confirmButtons", "LLG/c;", "documents", "LLG/d;", "duties", "", "gigerEndTime", "gigerStartTime", "LLG/e;", "header", "LLG/f;", "mapView", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3;", NotificationsSettings.Section.SECTION_PAID_SERVICES, "Lcom/avito/android/deep_linking/links/DeepLink;", "paymentBanner", "LLG/h;", "paymentInfo", "requirements", "LLG/q;", "requisitesButton", "route", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail;", "routeDetail", "LLG/m;", "shiftInfo", "", "slotId", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotInfo;", "slotInfo", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotInfoV2;", "slotInfoV2", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7Response$State;", VoiceInfo.STATE, "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4;", "supportButton", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer;", "timer", "uxFeedback", "<init>", "(LLG/n;LLG/n;LLG/c;LLG/d;Ljava/lang/String;Ljava/lang/String;LLG/e;LLG/f;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3;Lcom/avito/android/deep_linking/links/DeepLink;LLG/h;Ljava/lang/String;LLG/q;Ljava/lang/String;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail;LLG/m;JLcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotInfo;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotInfoV2;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7Response$State;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4;Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LLG/n;", "a", "()LLG/n;", "b", "LLG/c;", "c", "()LLG/c;", "LLG/d;", "d", "()LLG/d;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "LLG/e;", "g", "()LLG/e;", "LLG/f;", "h", "()LLG/f;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3;", "i", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotWarningV3;", "Lcom/avito/android/deep_linking/links/DeepLink;", "j", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LLG/h;", "k", "()LLG/h;", "l", "LLG/q;", "m", "()LLG/q;", "n", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail;", "o", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/RouteDetail;", "LLG/m;", "p", "()LLG/m;", "J", "getSlotId", "()J", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotInfo;", "q", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotInfo;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotInfoV2;", "r", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotInfoV2;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7Response$State;", "getState", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7Response$State;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4;", "s", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SupportButtonV4;", "Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer;", "t", "()Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/Timer;", "u", "State", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotV7Response {

    @c("actionButtons")
    @l
    private final n actionButtons;

    @c("confirmButtons")
    @l
    private final n confirmButtons;

    @c("documents")
    @l
    private final LG.c documents;

    @c("duties")
    @l
    private final d duties;

    @c("gigerEndTime")
    @l
    private final String gigerEndTime;

    @c("gigerStartTime")
    @l
    private final String gigerStartTime;

    @c("header")
    @l
    private final e header;

    @c("mapView")
    @l
    private final f mapView;

    @c(NotificationsSettings.Section.SECTION_PAID_SERVICES)
    @l
    private final SlotWarningV3 notification;

    @c("paymentBanner")
    @l
    private final DeepLink paymentBanner;

    @c("paymentInfo")
    @l
    private final h paymentInfo;

    @c("requirements")
    @l
    private final String requirements;

    @c("requisitesButton")
    @l
    private final q requisitesButton;

    @c("route")
    @l
    private final String route;

    @c("routeDetail")
    @l
    private final RouteDetail routeDetail;

    @c("shiftInfo")
    @l
    private final m shiftInfo;

    @c("slotId")
    private final long slotId;

    @c("slotInfo")
    @l
    private final SlotInfo slotInfo;

    @c("slotInfoV2")
    @l
    private final SlotInfoV2 slotInfoV2;

    @c(VoiceInfo.STATE)
    @l
    private final State state;

    @c("supportButton")
    @l
    private final SupportButtonV4 supportButton;

    @c("timer")
    @l
    private final Timer timer;

    @c("uxFeedback")
    @l
    private final DeepLink uxFeedback;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlotV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/slot_impl/generated/api/slot_v_7/SlotV7Response$State;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "OnShift", "AfterShift", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        @c("afterShift")
        public static final State AfterShift;

        @c("onShift")
        public static final State OnShift;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ State[] f159494b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159495c;

        static {
            State state = new State("OnShift", 0, "onShift");
            OnShift = state;
            State state2 = new State("AfterShift", 1, "afterShift");
            AfterShift = state2;
            State[] stateArr = {state, state2};
            f159494b = stateArr;
            f159495c = kotlin.enums.c.a(stateArr);
        }

        private State(String str, int i12, String str2) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f159494b.clone();
        }
    }

    public SlotV7Response(@l n nVar, @l n nVar2, @l LG.c cVar, @l d dVar, @l String str, @l String str2, @l e eVar, @l f fVar, @l SlotWarningV3 slotWarningV3, @l DeepLink deepLink, @l h hVar, @l String str3, @l q qVar, @l String str4, @l RouteDetail routeDetail, @l m mVar, long j12, @l SlotInfo slotInfo, @l SlotInfoV2 slotInfoV2, @l State state, @l SupportButtonV4 supportButtonV4, @l Timer timer, @l DeepLink deepLink2) {
        this.actionButtons = nVar;
        this.confirmButtons = nVar2;
        this.documents = cVar;
        this.duties = dVar;
        this.gigerEndTime = str;
        this.gigerStartTime = str2;
        this.header = eVar;
        this.mapView = fVar;
        this.notification = slotWarningV3;
        this.paymentBanner = deepLink;
        this.paymentInfo = hVar;
        this.requirements = str3;
        this.requisitesButton = qVar;
        this.route = str4;
        this.routeDetail = routeDetail;
        this.shiftInfo = mVar;
        this.slotId = j12;
        this.slotInfo = slotInfo;
        this.slotInfoV2 = slotInfoV2;
        this.state = state;
        this.supportButton = supportButtonV4;
        this.timer = timer;
        this.uxFeedback = deepLink2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final n getActionButtons() {
        return this.actionButtons;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final n getConfirmButtons() {
        return this.confirmButtons;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final LG.c getDocuments() {
        return this.documents;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final d getDuties() {
        return this.duties;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getGigerEndTime() {
        return this.gigerEndTime;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getGigerStartTime() {
        return this.gigerStartTime;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final e getHeader() {
        return this.header;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final f getMapView() {
        return this.mapView;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final SlotWarningV3 getNotification() {
        return this.notification;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final DeepLink getPaymentBanner() {
        return this.paymentBanner;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final h getPaymentInfo() {
        return this.paymentInfo;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final String getRequirements() {
        return this.requirements;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final q getRequisitesButton() {
        return this.requisitesButton;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @l
    /* renamed from: o, reason: from getter */
    public final RouteDetail getRouteDetail() {
        return this.routeDetail;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final m getShiftInfo() {
        return this.shiftInfo;
    }

    @l
    /* renamed from: q, reason: from getter */
    public final SlotInfo getSlotInfo() {
        return this.slotInfo;
    }

    @l
    /* renamed from: r, reason: from getter */
    public final SlotInfoV2 getSlotInfoV2() {
        return this.slotInfoV2;
    }

    @l
    /* renamed from: s, reason: from getter */
    public final SupportButtonV4 getSupportButton() {
        return this.supportButton;
    }

    @l
    /* renamed from: t, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @l
    /* renamed from: u, reason: from getter */
    public final DeepLink getUxFeedback() {
        return this.uxFeedback;
    }
}
