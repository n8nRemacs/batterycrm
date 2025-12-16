package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import defpackage.aee;
import defpackage.aj0;
import defpackage.cm6;
import defpackage.dje;
import defpackage.eje;
import defpackage.em6;
import defpackage.fje;
import defpackage.gje;
import defpackage.hd5;
import defpackage.qqg;
import defpackage.ti1;
import defpackage.u08;
import defpackage.ue3;
import defpackage.uog;
import defpackage.we3;
import defpackage.zie;
import defpackage.zo4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001J\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u0010\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001d\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010*\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130-2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b.\u0010/JE\u00102\u001a\u00020&2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u00020&002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b2\u00103JA\u00104\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u00182\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b4\u00105J?\u00106\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0-\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b6\u0010+JE\u0010:\u001a\u00020&2\n\u00109\u001a\u000607j\u0002`82\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b:\u0010;JG\u0010>\u001a\u00020&2\n\u0010<\u001a\u000607j\u0002`82\u0016\u0010=\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0004\b>\u0010;J3\u0010A\u001a\u0016\u0012\b\u0012\u000607j\u0002`8\u0012\b\u0012\u00060\u0012j\u0002`\u00130@2\u0010\u0010?\u001a\f\u0012\b\u0012\u000607j\u0002`80\u0011¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "listenerManager", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)V", "", "Leje;", "getRoomIds", "()Ljava/util/Set;", "roomId", "", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRoomParticipantIds", "(Leje;)Ljava/util/Collection;", "getAllRoomParticipantIds", "()Ljava/util/Collection;", "Lfje;", "internalIds", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "mapInternalIdsToSessionRoomParticipants", "(Lfje;Ljava/util/Collection;)Ljava/util/Collection;", "internalId", "mapInternalIdToSessionRoomParticipant", "(Lti1;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "mapConversationParticipantToSessionRoomParticipant", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "Lqqg;", "onSuccess", "", "onError", "getMainCallParticipantIds", "(Lem6;Lem6;)V", "participantIds", "", "getUnresolvedExternalIds", "(Ljava/util/Collection;)Ljava/util/List;", "Lkotlin/Function0;", "onResolve", "resolveParticipantIds", "(Ljava/util/Collection;Lcm6;Lem6;)V", "getRoomParticipants", "(Lfje;Lem6;Lem6;)V", "getAllInRoomParticipants", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lem6;Lem6;)V", "externalId", "onIdResolved", "resolveInternalIdByExternal", ApiProtocol.PARAM_EXTERNAL_IDS, "", "getInternalIdsByExternal", "(Ljava/util/Collection;)Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "", "Lzie;", "knownSessionRooms", "Ljava/util/Map;", "ru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1", "roomsListener", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionRoomParticipantsDataProviderImpl implements SessionRoomParticipantsDataProvider {
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final Map<eje, zie> knownSessionRooms = new LinkedHashMap();
    private final SessionRoomParticipantsDataProviderImpl$roomsListener$1 roomsListener;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl$getAllInRoomParticipants$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements cm6 {
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ Set<eje> $roomIds;
        final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set<eje> set, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, em6 em6Var) {
            super(0);
            this.$roomIds = set;
            this.this$0 = sessionRoomParticipantsDataProviderImpl;
            this.$onSuccess = em6Var;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m144invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m144invoke() {
            ArrayList arrayList = new ArrayList();
            for (eje ejeVar : this.$roomIds) {
                SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = this.this$0;
                arrayList.add(new SessionRoomParticipants(ejeVar, sessionRoomParticipantsDataProviderImpl.mapInternalIdsToSessionRoomParticipants(ejeVar, sessionRoomParticipantsDataProviderImpl.getRoomParticipantIds(ejeVar))));
            }
            this.$onSuccess.invoke(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00571 extends u08 implements cm6 {
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ Collection<ti1> $participantIds;
        final /* synthetic */ fje $roomId;
        final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00571(em6 em6Var, fje fjeVar, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, Collection<ti1> collection) {
            super(0);
            this.$onSuccess = em6Var;
            this.$roomId = fjeVar;
            this.this$0 = sessionRoomParticipantsDataProviderImpl;
            this.$participantIds = collection;
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m145invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m145invoke() {
            em6 em6Var = this.$onSuccess;
            fje fjeVar = this.$roomId;
            em6Var.invoke(new SessionRoomParticipants(fjeVar, this.this$0.mapInternalIdsToSessionRoomParticipants(fjeVar, this.$participantIds)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager$OwnRoomsListener, ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl$roomsListener$1] */
    public SessionRoomParticipantsDataProviderImpl(ParticipantStore participantStore, SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper) {
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        ?? r1 = new SessionRoomsManager.OwnRoomsListener() { // from class: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl$roomsListener$1
            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo event) {
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo event) {
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onRoomRemoved(SessionRoomsManager.SessionRoomInfo event) {
                Map map = this.this$0.knownSessionRooms;
                fje roomId = event.getRoomId();
                uog.c(map);
                map.remove(roomId);
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onRoomUpdated(SessionRoomsManager.SessionRoomInfo event) {
                zie room = event.getRoom();
                if (room == null) {
                    return;
                }
                this.this$0.knownSessionRooms.put(room.a, room);
            }
        };
        this.roomsListener = r1;
        sessionRoomListenerManagerImpl.addListener(r1);
    }

    private final Collection<ti1> getAllRoomParticipantIds() {
        Collection<zie> collectionValues = this.knownSessionRooms.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((zie) it.next()).e);
        }
        return we3.r(arrayList);
    }

    private final void getMainCallParticipantIds(em6 onSuccess, em6 onError) {
        Set setH0 = ue3.h0(getAllRoomParticipantIds());
        ParticipantStore participantStore = this.store;
        dje djeVar = dje.a;
        Collection<ConversationParticipant> participants = participantStore.getParticipants(djeVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : participants) {
            ConversationParticipant conversationParticipant = (ConversationParticipant) obj;
            if (!conversationParticipant.isAdmin() && !conversationParticipant.isCreator() && !setH0.contains(conversationParticipant.getInternalId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mapConversationParticipantToSessionRoomParticipant((ConversationParticipant) it.next()));
        }
        onSuccess.invoke(new SessionRoomParticipants(djeVar, arrayList2));
    }

    private final Set<eje> getRoomIds() {
        return ue3.h0(this.knownSessionRooms.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<ti1> getRoomParticipantIds(eje roomId) {
        List list;
        zie zieVar = this.knownSessionRooms.get(roomId);
        return (zieVar == null || (list = zieVar.e) == null) ? hd5.a : ue3.d0(list);
    }

    private final List<ti1> getUnresolvedExternalIds(Collection<ti1> participantIds) {
        ArrayList arrayList = new ArrayList();
        for (ti1 ti1Var : participantIds) {
            if (this.idMappingWrapper.getByInternal(ti1Var) == null) {
                arrayList.add(ti1Var);
            }
        }
        return arrayList;
    }

    private final SessionRoomParticipants.Participant mapConversationParticipantToSessionRoomParticipant(ConversationParticipant participant) {
        return new SessionRoomParticipants.Participant(participant.getExternalId(), this.store.getParticipantRoomId(participant), participant);
    }

    private final SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant(ti1 internalId) {
        ConversationParticipant byInternal = this.store.getByInternal(internalId);
        if (byInternal != null) {
            return mapConversationParticipantToSessionRoomParticipant(byInternal);
        }
        ParticipantId byInternal2 = this.idMappingWrapper.getByInternal(internalId);
        if (byInternal2 != null) {
            return new SessionRoomParticipants.Participant(byInternal2, null, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SessionRoomParticipants.Participant> mapInternalIdsToSessionRoomParticipants(fje roomId, Collection<ti1> internalIds) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = internalIds.iterator();
        while (it.hasNext()) {
            SessionRoomParticipants.Participant participantMapInternalIdToSessionRoomParticipant = mapInternalIdToSessionRoomParticipant((ti1) it.next());
            if (participantMapInternalIdToSessionRoomParticipant != null) {
                linkedHashMap.put(participantMapInternalIdToSessionRoomParticipant.getId(), participantMapInternalIdToSessionRoomParticipant);
            }
        }
        for (ConversationParticipant conversationParticipant : this.store.getParticipants(roomId)) {
            if (!linkedHashMap.containsKey(conversationParticipant.getExternalId()) && (conversationParticipant.isAdmin() || conversationParticipant.isCreator())) {
                linkedHashMap.put(conversationParticipant.getExternalId(), mapConversationParticipantToSessionRoomParticipant(conversationParticipant));
            }
        }
        return linkedHashMap.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$0(em6 em6Var, em6 em6Var2, ParticipantId participantId, ti1 ti1Var) {
        if (ti1Var != null) {
            em6Var.invoke(ti1Var);
        } else if (em6Var2 != null) {
            em6Var2.invoke(new RuntimeException("Requested external id " + participantId + " resolved to null"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$1(em6 em6Var, ParticipantId participantId) {
        if (em6Var != null) {
            em6Var.invoke(new RuntimeException("Requested external id " + participantId + " could not be resolved to internal"));
        }
    }

    private final void resolveParticipantIds(Collection<ti1> participantIds, cm6 onResolve, em6 onError) {
        if (participantIds.isEmpty()) {
            onResolve.invoke();
            return;
        }
        List<ti1> unresolvedExternalIds = getUnresolvedExternalIds(participantIds);
        if (unresolvedExternalIds.isEmpty()) {
            onResolve.invoke();
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(unresolvedExternalIds, new aj0(5, onResolve), new gje(0, onError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveParticipantIds$lambda$9(em6 em6Var) {
        if (em6Var != null) {
            em6Var.invoke(new RuntimeException("Can't resolve external ids"));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getAllInRoomParticipants(em6 onSuccess, em6 onError) {
        Set<eje> roomIds = getRoomIds();
        if (roomIds.isEmpty()) {
            onSuccess.invoke(hd5.a);
        } else {
            resolveParticipantIds(getAllRoomParticipantIds(), new AnonymousClass1(roomIds, this, onSuccess), onError);
        }
    }

    public final Map<ParticipantId, ti1> getInternalIdsByExternal(Collection<ParticipantId> externalIds) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ParticipantId participantId : externalIds) {
            ti1 byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal == null) {
                throw new RuntimeException("Unresolved external participant id " + participantId);
            }
            linkedHashMap.put(participantId, byExternal);
        }
        return linkedHashMap;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getParticipantRoomId(ParticipantId participantId, em6 onSuccess, em6 onError) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        if (byExternal == null) {
            if (onError != null) {
                onError.invoke(new RuntimeException("Participant " + participantId + " not found"));
                return;
            }
            return;
        }
        fje participantRoomId = this.store.getParticipantRoomId(byExternal);
        if (participantRoomId != null) {
            onSuccess.invoke(participantRoomId);
        } else if (onError != null) {
            onError.invoke(new RuntimeException("Can't find room data for participant " + participantId));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getRoomParticipants(fje roomId, em6 onSuccess, em6 onError) {
        if (roomId instanceof dje) {
            getMainCallParticipantIds(onSuccess, onError);
        } else if (roomId instanceof eje) {
            Collection<ti1> roomParticipantIds = getRoomParticipantIds((eje) roomId);
            resolveParticipantIds(roomParticipantIds, new C00571(onSuccess, roomId, this, roomParticipantIds), onError);
        }
    }

    public final void resolveInternalIdByExternal(ParticipantId externalId, em6 onIdResolved, em6 onError) {
        this.idMappingResolver.withInternalId(externalId, new zo4(onIdResolved, onError, externalId, 2), new aee(onError, 7, externalId));
    }
}
