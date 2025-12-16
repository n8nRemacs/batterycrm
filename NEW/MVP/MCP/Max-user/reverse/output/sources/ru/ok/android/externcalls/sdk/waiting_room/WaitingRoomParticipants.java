package ru.ok.android.externcalls.sdk.waiting_room;

import defpackage.a9h;
import defpackage.c5g;
import defpackage.de;
import defpackage.e01;
import defpackage.e2f;
import defpackage.em6;
import defpackage.eu3;
import defpackage.fr6;
import defpackage.gu3;
import defpackage.i2f;
import defpackage.j0e;
import defpackage.k01;
import defpackage.kn6;
import defpackage.ku1;
import defpackage.l2f;
import defpackage.lqc;
import defpackage.lra;
import defpackage.lu1;
import defpackage.ora;
import defpackage.paj;
import defpackage.pze;
import defpackage.qpb;
import defpackage.r2h;
import defpackage.st1;
import defpackage.ti1;
import defpackage.tjh;
import defpackage.tm6;
import defpackage.tt1;
import defpackage.u0e;
import defpackage.ut1;
import defpackage.vt1;
import defpackage.wk3;
import defpackage.wt1;
import defpackage.wy1;
import defpackage.wz0;
import defpackage.xt1;
import defpackage.y6d;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 b2\u00020\u0001:\u0003bcdB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0003¢\u0006\u0004\b)\u0010'J\u000f\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b+\u0010,J!\u00102\u001a\f\u0012\b\u0012\u000600j\u0002`10/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00103J'\u00107\u001a\b\u0012\u0004\u0012\u0002060/2\u0006\u0010\r\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u0002042\u0006\u00109\u001a\u00020-2\n\u0010:\u001a\u000600j\u0002`1H\u0002¢\u0006\u0004\b;\u0010<JP\u0010D\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u001a\b\u0004\u0010A\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0=\u0012\u0004\u0012\u00020\u000e0@2\u0014\b\u0004\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000e0@H\u0082\b¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\b\u0012\u0004\u0012\u00020-0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\f\u0012\b\u0012\u000600j\u0002`10=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bH\u0010GJ\u001d\u0010I\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000eH\u0002¢\u0006\u0004\bK\u0010'J\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000eH\u0003¢\u0006\u0004\bQ\u0010'J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bR\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\"\u0010Y\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010\u00110\u00110W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010_R\u001e\u0010`\u001a\n X*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants;", "Lku1;", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "listener", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Ly6d;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Ly6d;)V", "Lk01;", "call", "Lqqg;", "setCall", "(Lk01;)V", "", "isMeAdmin", "onIsMeAdminMayHaveChanged", "(Z)V", "isWaitingRoomEnabled", "onWaitingRoomEnabled", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "Lut1;", "event", "onAttendee", "(Lut1;)V", "Lvt1;", "onFeedback", "(Lvt1;)V", "Lxt1;", "onPromotionUpdated", "(Lxt1;)V", "Lwt1;", "onHandUp", "(Lwt1;)V", "release", "()V", "update", "onWaitingRoomParticipantsMayHaveChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "loadWaitingParticipantIds", "()Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "waitingParticipantId", "Le2f;", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "resolveInternalIdSingle", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;)Le2f;", "Ltt1;", "fromId", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "loadWaitingParticipantIdsPageSingle", "(Lk01;Ltt1;)Le2f;", "participantId", "internalId", "fromInternalLong", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;Lti1;)Ltt1;", "", "Lst1;", "waitingParticipants", "Lkotlin/Function1;", "onResult", "", "onError", "resolveInternalIds", "(Ljava/util/List;Lem6;Lem6;)V", "getResolvedWaitingParticipantIds", "(Ljava/util/List;)Ljava/util/List;", "getInternalIdsToResolve", "putIdMappingsToCache", "(Ljava/util/List;)V", "scheduleLoad", "data", "notifyListener", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "shouldSendWaitingList", "()Z", "notifyListenerWithEmptyList", "notifyIfListChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Ly6d;", "Llqc;", "kotlin.jvm.PlatformType", "loadEventSubject", "Llqc;", "Lzl3;", "compositeDisposable", "Lzl3;", "Lk01;", "Z", "lastSentParticipantIds", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Companion", "Listener", "WaitingParticipantsPage", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WaitingRoomParticipants implements ku1 {
    private static final String LOG_TAG = "WaitingRoomParticipants";
    private static final int PAGE_SIZE = 50;
    private volatile k01 call;
    private final zl3 compositeDisposable;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean isMeAdmin;
    private volatile boolean isWaitingRoomEnabled;
    private volatile WaitingRoomParticipantsUpdate lastSentParticipantIds;
    private final Listener listener;
    private final lqc loadEventSubject;
    private final y6d log;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "data", "Lqqg;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom);

        void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate data);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "", "participantIds", "", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "hasMore", "", "(Ljava/util/List;Z)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getParticipantIds", "()Ljava/util/List;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WaitingParticipantsPage {
        private boolean hasMore;
        private final List<ConversationWaitingParticipantId> participantIds;

        public WaitingParticipantsPage(List<ConversationWaitingParticipantId> list, boolean z) {
            this.participantIds = list;
            this.hasMore = z;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final List<ConversationWaitingParticipantId> getParticipantIds() {
            return this.participantIds;
        }

        public final void setHasMore(boolean z) {
            this.hasMore = z;
        }
    }

    public WaitingRoomParticipants(Listener listener, IdMappingWrapper idMappingWrapper, IdMappingResolver idMappingResolver, y6d y6dVar) {
        this.listener = listener;
        this.idMappingWrapper = idMappingWrapper;
        this.idMappingResolver = idMappingResolver;
        this.log = y6dVar;
        lqc lqcVar = new lqc();
        this.loadEventSubject = lqcVar;
        zl3 zl3Var = new zl3();
        this.compositeDisposable = zl3Var;
        WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = WaitingRoomParticipantsUpdate.EMPTY;
        this.lastSentParticipantIds = waitingRoomParticipantsUpdate;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        ora oraVar = new ora(new lra(lqcVar, j0eVarA, 2).l(u0e.b()), new tm6() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadDisposable$1
            @Override // defpackage.tm6
            public final WaitingRoomParticipantsUpdate apply(Boolean bool) {
                return this.this$0.loadWaitingParticipantIds();
            }
        }, 5);
        Objects.requireNonNull(waitingRoomParticipantsUpdate, "item is null");
        zl3Var.a(new ora(oraVar, new kn6(waitingRoomParticipantsUpdate), 6).l(de.a()).n(new gu3() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadDisposable$2
            @Override // defpackage.gu3
            public final void accept(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate2) {
                this.this$0.notifyListener(waitingRoomParticipantsUpdate2);
            }
        }));
    }

    private final tt1 fromInternalLong(ConversationWaitingParticipantId participantId, ti1 internalId) {
        return new tt1(internalId, participantId.addedTs);
    }

    private final List<ti1> getInternalIdsToResolve(List<st1> waitingParticipants) {
        ArrayList arrayList = new ArrayList(waitingParticipants.size());
        Iterator<st1> it = waitingParticipants.iterator();
        while (it.hasNext()) {
            ti1 ti1Var = it.next().a.b;
            if (this.idMappingWrapper.getByInternal(ti1Var) == null) {
                arrayList.add(ti1Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ConversationWaitingParticipantId> getResolvedWaitingParticipantIds(List<st1> waitingParticipants) {
        ArrayList arrayList = new ArrayList(waitingParticipants.size());
        for (st1 st1Var : waitingParticipants) {
            ParticipantId byInternal = this.idMappingWrapper.getByInternal(st1Var.a.b);
            if (byInternal != null) {
                arrayList.add(new ConversationWaitingParticipantId(ParticipantId.withoutDeviceId(byInternal.id, byInternal.isAnon), st1Var.a.a));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WaitingRoomParticipantsUpdate loadWaitingParticipantIds() {
        tt1 tt1VarFromInternalLong;
        boolean z;
        k01 k01Var = this.call;
        if (k01Var == null || !this.isMeAdmin || !this.isWaitingRoomEnabled) {
            return WaitingRoomParticipantsUpdate.EMPTY;
        }
        ArrayList arrayList = new ArrayList();
        ConversationWaitingParticipantId conversationWaitingParticipantId = null;
        do {
            if (conversationWaitingParticipantId != null) {
                try {
                    tt1VarFromInternalLong = fromInternalLong(conversationWaitingParticipantId, (ti1) resolveInternalIdSingle(conversationWaitingParticipantId).e());
                } catch (Throwable th) {
                    this.log.log(LOG_TAG, "can't resolve internal id for " + conversationWaitingParticipantId + ". Error: " + th.getMessage());
                }
            } else {
                tt1VarFromInternalLong = null;
            }
            try {
                WaitingParticipantsPage waitingParticipantsPage = (WaitingParticipantsPage) loadWaitingParticipantIdsPageSingle(k01Var, tt1VarFromInternalLong).e();
                Iterator<ConversationWaitingParticipantId> it = waitingParticipantsPage.getParticipantIds().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getParticipantId());
                }
                z = waitingParticipantsPage.getHasMore() && !waitingParticipantsPage.getParticipantIds().isEmpty();
                if (!waitingParticipantsPage.getParticipantIds().isEmpty()) {
                    conversationWaitingParticipantId = waitingParticipantsPage.getParticipantIds().get(waitingParticipantsPage.getParticipantIds().size() - 1);
                }
            } catch (Throwable th2) {
                a9h.o("can't load next page. Error: ", th2.getMessage(), this.log, LOG_TAG);
            }
        } while (z);
        HashSet hashSet = new HashSet(this.lastSentParticipantIds.participantsIds);
        HashSet hashSet2 = new HashSet(arrayList);
        hashSet.removeAll(arrayList);
        hashSet2.removeAll(this.lastSentParticipantIds.participantsIds);
        this.lastSentParticipantIds = new WaitingRoomParticipantsUpdate(arrayList, !hashSet2.isEmpty(), !hashSet.isEmpty());
        return this.lastSentParticipantIds;
    }

    private final e2f loadWaitingParticipantIdsPageSingle(k01 call, tt1 fromId) {
        return new wk3(2, new r2h(call, fromId, this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6(k01 k01Var, tt1 tt1Var, WaitingRoomParticipants waitingRoomParticipants, l2f l2fVar) throws JSONException {
        qpb qpbVar = new qpb(waitingRoomParticipants, 6, l2fVar);
        tjh tjhVar = new tjh(l2fVar, 0);
        pze pzeVar = k01Var.k;
        try {
            fr6 fr6VarB = paj.b(null, "get-waiting-hall");
            JSONObject jSONObject = fr6VarB.a;
            jSONObject.put("backward", false);
            if (tt1Var != null) {
                jSONObject.put("fromId", new JSONObject().put("id", tt1Var.b.b()).put("addedTs", tt1Var.a));
            }
            fr6VarB.b(PAGE_SIZE, "count");
            pzeVar.d(fr6VarB, false, new wz0(k01Var, qpbVar, tjhVar, 1), new e01(0, tjhVar));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4(final WaitingRoomParticipants waitingRoomParticipants, final l2f l2fVar, final lu1 lu1Var) {
        final ArrayList arrayList = lu1Var.a;
        waitingRoomParticipants.putIdMappingsToCache(arrayList);
        List<ti1> internalIdsToResolve = waitingRoomParticipants.getInternalIdsToResolve(arrayList);
        if (!internalIdsToResolve.isEmpty()) {
            waitingRoomParticipants.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$1
                @Override // java.lang.Runnable
                public final void run() {
                    List resolvedWaitingParticipantIds = this.this$0.getResolvedWaitingParticipantIds(arrayList);
                    try {
                        ((i2f) l2fVar).a(new WaitingRoomParticipants.WaitingParticipantsPage(resolvedWaitingParticipantIds, lu1Var.b));
                    } catch (Exception e) {
                        ((i2f) l2fVar).d(new RuntimeException(wy1.h("Can't resolve internal ids: ", e.getMessage())));
                    }
                }
            }, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$2
                @Override // java.lang.Runnable
                public final void run() {
                    RuntimeException runtimeException = new RuntimeException("Can't resolve extenral ids");
                    ((i2f) l2fVar).d(new RuntimeException(wy1.h("Can't resolve internal ids: ", runtimeException.getMessage())));
                }
            });
        } else {
            ((i2f) l2fVar).a(new WaitingParticipantsPage(waitingRoomParticipants.getResolvedWaitingParticipantIds(arrayList), lu1Var.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(l2f l2fVar) {
        ((i2f) l2fVar).d(new RuntimeException("Can't get waiting room partiicpants"));
    }

    private final void notifyIfListChanged(WaitingRoomParticipantsUpdate data) {
        this.listener.onWaitingRoomParticipantsChanged(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListener(WaitingRoomParticipantsUpdate data) {
        if (shouldSendWaitingList()) {
            notifyIfListChanged(data);
        } else {
            notifyListenerWithEmptyList();
        }
    }

    private final void notifyListenerWithEmptyList() {
        this.lastSentParticipantIds = WaitingRoomParticipantsUpdate.EMPTY;
        notifyIfListChanged(this.lastSentParticipantIds);
    }

    private final void onWaitingRoomParticipantsMayHaveChanged() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        }
    }

    private final void putIdMappingsToCache(List<st1> waitingParticipants) {
        for (st1 st1Var : waitingParticipants) {
            ParticipantId participantIdConvert = CallExternalIdConverter.convert(st1Var.b);
            if (participantIdConvert != null) {
                this.idMappingWrapper.addMapping(participantIdConvert, st1Var.a.b);
            }
        }
    }

    private final e2f resolveInternalIdSingle(ConversationWaitingParticipantId waitingParticipantId) {
        return new wk3(2, new c5g(this, 18, waitingParticipantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$1(WaitingRoomParticipants waitingRoomParticipants, ConversationWaitingParticipantId conversationWaitingParticipantId, l2f l2fVar) {
        waitingRoomParticipants.idMappingResolver.withInternalId(conversationWaitingParticipantId.getParticipantId(), new eu3(5, l2fVar), new tjh(l2fVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$1$lambda$0(l2f l2fVar) {
        ((i2f) l2fVar).onError(new RuntimeException());
    }

    private final void resolveInternalIds(final List<st1> waitingParticipants, final em6 onResult, final em6 onError) {
        putIdMappingsToCache(waitingParticipants);
        List<ti1> internalIdsToResolve = getInternalIdsToResolve(waitingParticipants);
        if (internalIdsToResolve.isEmpty()) {
            onResult.invoke(getResolvedWaitingParticipantIds(waitingParticipants));
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.resolveInternalIds.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        onResult.invoke(WaitingRoomParticipants.this.getResolvedWaitingParticipantIds(waitingParticipants));
                    } catch (Exception e) {
                        onError.invoke(e);
                    }
                }
            }, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.resolveInternalIds.2
                @Override // java.lang.Runnable
                public final void run() {
                    onError.invoke(new RuntimeException("Can't resolve extenral ids"));
                }
            });
        }
    }

    private final void scheduleLoad() {
        this.loadEventSubject.f(Boolean.TRUE);
    }

    private final boolean shouldSendWaitingList() {
        return this.isMeAdmin && this.isWaitingRoomEnabled;
    }

    private final void update() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        } else {
            notifyListenerWithEmptyList();
        }
    }

    @Override // defpackage.ku1
    public void onAttendee(ut1 event) {
        onWaitingRoomParticipantsMayHaveChanged();
    }

    @Override // defpackage.ku1
    public void onFeedback(vt1 event) {
    }

    @Override // defpackage.ku1
    public void onHandUp(wt1 event) {
    }

    public final void onIsMeAdminMayHaveChanged(boolean isMeAdmin) {
        if (this.isMeAdmin != isMeAdmin) {
            this.isMeAdmin = isMeAdmin;
            update();
        }
    }

    @Override // defpackage.ku1
    public void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom) {
        this.listener.onMeInWaitingRoomChanged(isMeInWaitingRoom);
    }

    @Override // defpackage.ku1
    public void onPromotionUpdated(xt1 event) {
    }

    public final void onWaitingRoomEnabled(boolean isWaitingRoomEnabled) {
        if (this.isWaitingRoomEnabled != isWaitingRoomEnabled) {
            this.isWaitingRoomEnabled = isWaitingRoomEnabled;
            update();
        }
    }

    public final void release() {
        this.compositeDisposable.dispose();
    }

    public final void setCall(k01 call) {
        this.call = call;
    }
}
