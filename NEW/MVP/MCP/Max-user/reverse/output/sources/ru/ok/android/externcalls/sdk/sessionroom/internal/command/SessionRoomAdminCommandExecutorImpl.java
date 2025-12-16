package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.aje;
import defpackage.cm6;
import defpackage.eje;
import defpackage.em6;
import defpackage.fje;
import defpackage.fr6;
import defpackage.gld;
import defpackage.ktg;
import defpackage.ltg;
import defpackage.lvf;
import defpackage.mtg;
import defpackage.nt;
import defpackage.o7;
import defpackage.pze;
import defpackage.qqg;
import defpackage.ti1;
import defpackage.u08;
import defpackage.we3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJg\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001a\u0010\u0012\u001a\u0016\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u00060\u0010j\u0002`\u00110\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010!\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020 2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J=\u0010$\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020#2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J=\u0010&\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b&\u0010'J=\u0010)\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020(2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b)\u0010*J=\u0010,\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020+2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "participantDataProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;)V", "", "Leje;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addToRooms", "removeFromRooms", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "externalToInternalIdsMap", "Lmtg;", "buildUpdateRoomsParams", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lmtg;", "Lo7;", "params", "Lkotlin/Function0;", "Lqqg;", "onSuccess", "Lkotlin/Function1;", "", "onError", "activateRooms", "(Lo7;Lcm6;Lem6;)V", "Lgld;", "removeRooms", "(Lgld;Lcm6;Lem6;)V", "Llvf;", "switchRoom", "(Llvf;Lcm6;Lem6;)V", "updateRooms", "(Lmtg;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Lcm6;Lem6;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionRoomAdminCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomAdminCommandExecutor {
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;
    private final SignalingProvider signalingProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "id", "Lqqg;", "invoke", "(Lti1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl$moveParticipant$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements em6 {
        final /* synthetic */ em6 $onError;
        final /* synthetic */ cm6 $onSuccess;
        final /* synthetic */ MoveParticipantParams $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MoveParticipantParams moveParticipantParams, cm6 cm6Var, em6 em6Var) {
            super(1);
            this.$params = moveParticipantParams;
            this.$onSuccess = cm6Var;
            this.$onError = em6Var;
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((ti1) obj);
            return qqg.a;
        }

        public final void invoke(ti1 ti1Var) throws JSONException {
            SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl = SessionRoomAdminCommandExecutorImpl.this;
            fje toRoomId = this.$params.getToRoomId();
            if (toRoomId == null) {
                throw new IllegalArgumentException("Session room id is required");
            }
            sessionRoomAdminCommandExecutorImpl.switchRoom(new lvf(ti1Var, toRoomId), this.$onSuccess, this.$onError);
        }
    }

    public SessionRoomAdminCommandExecutorImpl(SignalingProvider signalingProvider, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.signalingProvider = signalingProvider;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    private static final void activateRooms$lambda$0(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    private final mtg buildUpdateRoomsParams(Map<eje, ? extends List<ParticipantId>> addToRooms, Map<eje, ? extends List<ParticipantId>> removeFromRooms, Map<ParticipantId, ti1> externalToInternalIdsMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<eje> linkedHashSet = new LinkedHashSet();
        for (Map.Entry<eje, ? extends List<ParticipantId>> entry : addToRooms.entrySet()) {
            linkedHashSet.add(entry.getKey());
            Iterator<ParticipantId> it = entry.getValue().iterator();
            while (it.hasNext()) {
                ti1 ti1Var = externalToInternalIdsMap.get(it.next());
                if (ti1Var != null) {
                    eje key = entry.getKey();
                    Object arrayList = linkedHashMap.get(key);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(key, arrayList);
                    }
                    ((List) arrayList).add(ti1Var);
                }
            }
        }
        for (Map.Entry<eje, ? extends List<ParticipantId>> entry2 : removeFromRooms.entrySet()) {
            linkedHashSet.add(entry2.getKey());
            Iterator<ParticipantId> it2 = entry2.getValue().iterator();
            while (it2.hasNext()) {
                ti1 ti1Var2 = externalToInternalIdsMap.get(it2.next());
                if (ti1Var2 != null) {
                    eje key2 = entry2.getKey();
                    Object arrayList2 = linkedHashMap2.get(key2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(key2, arrayList2);
                    }
                    ((List) arrayList2).add(ti1Var2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(we3.q(linkedHashSet, 10));
        for (eje ejeVar : linkedHashSet) {
            ktg ktgVar = new ktg();
            ktgVar.a = ejeVar;
            List list = (List) linkedHashMap.get(ejeVar);
            if (list != null) {
                ktgVar.b = list;
            }
            List list2 = (List) linkedHashMap2.get(ejeVar);
            if (list2 != null) {
                ktgVar.c = list2;
            }
            arrayList4.add(ktgVar);
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList(we3.q(arrayList3, 10));
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            ktg ktgVar2 = (ktg) obj;
            arrayList5.add(new ltg(ktgVar2.a, ktgVar2.b, ktgVar2.c));
        }
        return new mtg(arrayList5);
    }

    private static final void removeRooms$lambda$2(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchRoom$lambda$4(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRooms$lambda$6(cm6 cm6Var, JSONObject jSONObject) {
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void activateRooms(o7 params, cm6 onSuccess, em6 onError) {
        throw null;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams params, cm6 onSuccess, em6 onError) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(we3.r(params.getAddParticipantsToRoomsMap().values()));
            linkedHashSet.addAll(we3.r(params.getRemoveParticipantsFromRoomsMap().values()));
            updateRooms(buildUpdateRoomsParams(params.getAddParticipantsToRoomsMap(), params.getRemoveParticipantsFromRoomsMap(), this.participantDataProvider.getInternalIdsByExternal(linkedHashSet)), onSuccess, onError);
        } catch (Throwable th) {
            if (onError != null) {
                onError.invoke(th);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void moveParticipant(MoveParticipantParams params, cm6 onSuccess, em6 onError) throws JSONException {
        ParticipantId participantId = params.getParticipantId();
        if (participantId != null) {
            this.participantDataProvider.resolveInternalIdByExternal(participantId, new AnonymousClass1(params, onSuccess, onError), onError);
            return;
        }
        fje toRoomId = params.getToRoomId();
        if (toRoomId == null) {
            throw new IllegalArgumentException("Session room id is required");
        }
        switchRoom(new lvf(null, toRoomId), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void removeRooms(gld params, cm6 onSuccess, em6 onError) {
        throw null;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void switchRoom(lvf params, cm6 onSuccess, em6 onError) throws JSONException {
        pze pzeVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (pzeVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "switch-room");
        fje fjeVar = params.a;
        if (fjeVar != null && (fjeVar instanceof eje)) {
            jSONObject.put("toRoomId", ((eje) fjeVar).a);
        }
        ti1 ti1Var = params.b;
        if (ti1Var != null) {
            jSONObject.put("participantId", ti1Var.b());
        }
        pzeVar.d(new fr6(jSONObject), false, new nt(8, onSuccess), new aje(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void updateRooms(mtg params, cm6 onSuccess, em6 onError) throws JSONException {
        pze pzeVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (pzeVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-rooms");
        ArrayList arrayList = params.a;
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ltg ltgVar = (ltg) it.next();
            JSONObject jSONObject2 = new JSONObject();
            eje ejeVar = ltgVar.a;
            if (ejeVar != null) {
                jSONObject2.put("id", ejeVar.a);
            }
            Collection collection = ltgVar.b;
            if (collection != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((ti1) it2.next()).b());
                }
                jSONObject2.put("addParticipantIds", jSONArray2);
            }
            Collection collection2 = ltgVar.c;
            if (collection2 != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = collection2.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((ti1) it3.next()).b());
                }
                jSONObject2.put("removeParticipantIds", jSONArray3);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("rooms", jSONArray);
        pzeVar.d(new fr6(jSONObject), false, new nt(9, onSuccess), new aje(this, onError, 1));
    }
}
