package ru.ok.android.externcalls.sdk.participant;

import defpackage.dje;
import defpackage.ej1;
import defpackage.fj1;
import defpackage.fje;
import defpackage.fni;
import defpackage.fp1;
import defpackage.gj1;
import defpackage.gp1;
import defpackage.hj1;
import defpackage.hp1;
import defpackage.ij1;
import defpackage.ip1;
import defpackage.jp1;
import defpackage.o81;
import defpackage.p01;
import defpackage.q01;
import defpackage.r01;
import defpackage.s01;
import defpackage.si1;
import defpackage.t01;
import defpackage.ti1;
import defpackage.u01;
import defpackage.uog;
import defpackage.ve3;
import defpackage.yi1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002GHBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010F¨\u0006I"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater;", "Lu01;", "Lij1;", "Ljp1;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "listener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "statesManager", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "localIdMappings", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "mappingUpdater", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "meChanger", "Lsi1;", "callParams", "<init>", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;Lsi1;)V", "Lej1;", "params", "Lqqg;", "onCallParticipantsAdded", "(Lej1;)V", "Lp01;", "onActiveParticipantsAdded", "(Lp01;)V", "Lfj1;", "onCallParticipantsChanged", "(Lfj1;)V", "Lq01;", "onActiveParticipantsChanged", "(Lq01;)V", "Lgj1;", "onCallParticipantsDeAnonimized", "(Lgj1;)V", "Lr01;", "onActiveParticipantsDeAnonimized", "(Lr01;)V", "Lhj1;", "onCallParticipantsRemoved", "(Lhj1;)V", "Ls01;", "onActiveParticipantsRemoved", "(Ls01;)V", "Lt01;", "onActiveParticipantUpdated", "(Lt01;)V", "Lfp1;", "onCurrentParticipantActiveRoomChanged", "(Lfp1;)V", "Lip1;", "onRoomUpdated", "(Lip1;)V", "Lgp1;", "onCurrentParticipantInvitedToRoom", "(Lgp1;)V", "Lhp1;", "onRoomRemoved", "(Lhp1;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "Lsi1;", "MappingUpdater", "MeChanger", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ParticipantsUpdater implements u01, ij1, jp1 {
    private final si1 callParams;
    private final IdMappingWrapper idMappingWrapper;
    private final ConversationEventsListener listener;
    private final LocalIdMappings localIdMappings;
    private final MappingUpdater mappingUpdater;
    private final MeChanger meChanger;
    private final ParticipantStatesManagerImpl statesManager;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "", "Lqqg;", "triggerMapUpdate", "()V", "reportIfApplicable", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MappingUpdater {
        void reportIfApplicable();

        void triggerMapUpdate();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantExternalId", "Lqqg;", "updateMyExternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MeChanger {
        void updateMyExternalId(ParticipantId participantExternalId);
    }

    public ParticipantsUpdater(ConversationEventsListener conversationEventsListener, ParticipantStore participantStore, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingWrapper idMappingWrapper, LocalIdMappings localIdMappings, MappingUpdater mappingUpdater, MeChanger meChanger, si1 si1Var) {
        this.listener = conversationEventsListener;
        this.store = participantStore;
        this.statesManager = participantStatesManagerImpl;
        this.idMappingWrapper = idMappingWrapper;
        this.localIdMappings = localIdMappings;
        this.mappingUpdater = mappingUpdater;
        this.meChanger = meChanger;
        this.callParams = si1Var;
    }

    @Override // defpackage.u01
    public void onActiveParticipantUpdated(t01 params) {
        this.store.setActiveSessionRoom(params.c, params.d);
        this.listener.onParticipantsUpdated(uog.a(params.b));
    }

    @Override // defpackage.u01
    public void onActiveParticipantsAdded(p01 params) {
    }

    @Override // defpackage.u01
    public void onActiveParticipantsChanged(q01 params) {
    }

    @Override // defpackage.u01
    public void onActiveParticipantsDeAnonimized(r01 params) {
    }

    @Override // defpackage.u01
    public void onActiveParticipantsRemoved(s01 params) {
    }

    @Override // defpackage.ij1
    public void onCallParticipantsAdded(ej1 params) {
        List<yi1> list = params.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (yi1 yi1Var : list) {
            ParticipantStore participantStore = this.store;
            ti1 ti1Var = yi1Var.a;
            if (ti1Var != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ti1Var);
                ParticipantId participantIdConvert = CallExternalIdConverter.convert(yi1Var.q);
                if (participantIdConvert != null) {
                    this.idMappingWrapper.addMapping(participantIdConvert, yi1Var.a);
                    if (byInternal == null) {
                        byInternal = this.store.getParticipantById(participantIdConvert);
                    }
                }
                arrayList.add(byInternal);
            }
        }
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            yi1 yi1Var2 = (yi1) obj;
            ConversationParticipant conversationParticipant = (ConversationParticipant) arrayList.get(i);
            if (conversationParticipant == null) {
                ti1 ti1Var2 = yi1Var2.a;
                if (ti1Var2 != null) {
                    ConversationParticipant conversationParticipantCreateConversationParticipantFromInternal = ConversationParticipantExtensionsKt.createConversationParticipantFromInternal(ti1Var2, this.idMappingWrapper);
                    ConversationParticipantExtensionsKt.setCallParticipantExt(conversationParticipantCreateConversationParticipantFromInternal, yi1Var2, this.localIdMappings);
                    this.store.add(conversationParticipantCreateConversationParticipantFromInternal, params.a);
                    z = true;
                }
            } else {
                if (conversationParticipant.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(conversationParticipant, yi1Var2, this.localIdMappings);
                }
                z2 = true;
            }
            i = i2;
        }
        if (z) {
            this.mappingUpdater.triggerMapUpdate();
        }
        if (z2) {
            this.mappingUpdater.reportIfApplicable();
        }
    }

    @Override // defpackage.ij1
    public void onCallParticipantsChanged(fj1 params) {
        ParticipantId participantIdConvert;
        ConversationParticipant participantById;
        ArrayList arrayList = new ArrayList();
        for (yi1 yi1Var : params.a) {
            ParticipantStore participantStore = this.store;
            ti1 ti1Var = yi1Var.a;
            if (ti1Var != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ti1Var);
                if (byInternal != null) {
                    if (byInternal.getCallParticipant() == null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, yi1Var, this.localIdMappings);
                    }
                    if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                        arrayList.add(byInternal);
                    }
                } else if (this.callParams.z.j && (participantIdConvert = CallExternalIdConverter.convert(yi1Var.q)) != null && (participantById = this.store.getParticipantById(participantIdConvert)) != null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(participantById, yi1Var, this.localIdMappings);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.listener.onParticipantsChanged(arrayList);
    }

    @Override // defpackage.ij1
    public void onCallParticipantsDeAnonimized(gj1 params) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (yi1 yi1Var : params.a) {
            ParticipantStore participantStore = this.store;
            ti1 ti1Var = yi1Var.a;
            if (ti1Var != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ti1Var);
                o81 o81Var = yi1Var.q;
                if (byInternal != null && o81Var != null && !fni.a(o81Var.a, byInternal.getExternalId().id)) {
                    ParticipantId externalId = byInternal.getExternalId();
                    ParticipantId participantIdConvert = CallExternalIdConverter.convert(o81Var);
                    if (participantIdConvert != null) {
                        ConversationParticipantExtensionsKt.deAnonymizeExt(byInternal, yi1Var, externalId, participantIdConvert, this.localIdMappings);
                        ti1 ti1Var2 = yi1Var.a;
                        ConversationParticipant me2 = this.store.getMe();
                        if (fni.a(ti1Var2, me2 != null ? me2.getInternalId() : null)) {
                            this.meChanger.updateMyExternalId(participantIdConvert);
                        }
                        if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                            arrayList.add(byInternal);
                            linkedHashMap.put(participantIdConvert, externalId);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.listener.onParticipantsDeAnonymized(arrayList, linkedHashMap);
    }

    @Override // defpackage.ij1
    public void onCallParticipantsRemoved(hj1 params) {
        ConversationParticipant byInternal;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (yi1 yi1Var : params.a) {
            ti1 ti1Var = yi1Var.a;
            if (ti1Var != null && (byInternal = this.store.getByInternal(ti1Var)) != null) {
                if (byInternal.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, yi1Var, this.localIdMappings);
                }
                hashSet.add(ti1Var);
                if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                    arrayList.add(byInternal);
                }
            }
        }
        this.store.removeByInternal(hashSet);
        if (arrayList.isEmpty()) {
            return;
        }
        this.statesManager.onParticipantsRemoved(arrayList);
        this.listener.onParticipantsRemoved(arrayList);
    }

    @Override // defpackage.jp1
    public void onCurrentParticipantActiveRoomChanged(fp1 params) {
        this.store.setActiveSessionRoom(params.a, params.b);
        this.mappingUpdater.reportIfApplicable();
    }

    @Override // defpackage.jp1
    public void onCurrentParticipantInvitedToRoom(gp1 params) {
        this.store.setProposedSessionRoom(params.b, params.c);
    }

    @Override // defpackage.jp1
    public void onRoomRemoved(hp1 params) {
        fje proposedRoomId = this.store.getProposedRoomId();
        fje fjeVar = params.a;
        boolean zA = fni.a(proposedRoomId, fjeVar);
        dje djeVar = dje.a;
        if (zA) {
            this.store.setProposedSessionRoom(djeVar, null);
        }
        if (fni.a(this.store.getActiveRoomId(), fjeVar)) {
            this.store.setActiveSessionRoom(djeVar, null);
        }
    }

    @Override // defpackage.jp1
    public void onRoomUpdated(ip1 params) {
        this.store.maybeUpdateRoom(params.b);
    }
}
