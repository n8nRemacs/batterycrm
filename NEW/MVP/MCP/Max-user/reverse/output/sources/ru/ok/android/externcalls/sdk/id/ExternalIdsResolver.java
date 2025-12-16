package ru.ok.android.externcalls.sdk.id;

import defpackage.fje;
import defpackage.hk3;
import defpackage.kk3;
import defpackage.nk3;
import defpackage.ti1;
import defpackage.u0e;
import defpackage.v64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

/* loaded from: classes2.dex */
public class ExternalIdsResolver {
    private final ExtraResolver extraResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final IdsMapper<ti1, ParticipantId> idsMapper;
    private final LocalIdMappings localIdMappings;
    private final ParticipantPrivateStateModifier participantPrivateStateModifier;
    private final ParticipantStore store;

    public interface ExtraResolver {
        ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant);
    }

    public interface ParticipantPrivateStateModifier {
        void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId);
    }

    public ExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, ExtraResolver extraResolver, ParticipantPrivateStateModifier participantPrivateStateModifier, LocalIdMappings localIdMappings, IdsMapper<ti1, ParticipantId> idsMapper) {
        this.store = participantStore;
        this.idMappingWrapper = idMappingWrapper;
        this.extraResolver = extraResolver;
        this.participantPrivateStateModifier = participantPrivateStateModifier;
        this.localIdMappings = localIdMappings;
        this.idsMapper = idsMapper;
    }

    private void applyExternals(Map<ti1, ParticipantId> map) {
        for (Map.Entry<ti1, ParticipantId> entry : map.entrySet()) {
            ti1 key = entry.getKey();
            ParticipantId value = entry.getValue();
            ConversationParticipant byInternal = this.store.getByInternal(key);
            this.idMappingWrapper.addMapping(value, key);
            if (byInternal != null) {
                this.localIdMappings.addMappings(byInternal);
                this.participantPrivateStateModifier.setExternalId(byInternal, value);
            }
        }
    }

    private void collectExternalIdResolutionCandidatesForSessionRoom(List<ti1> list, Map<LocalParticipantId, ConversationParticipant> map) {
        for (ConversationParticipant conversationParticipant : map.values()) {
            if (conversationParticipant.getExternalId() == null) {
                ParticipantId participantIdOnExternalByInternalResolution = this.extraResolver.onExternalByInternalResolution(conversationParticipant);
                if (participantIdOnExternalByInternalResolution == null) {
                    list.add(ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant));
                } else {
                    this.participantPrivateStateModifier.setExternalId(conversationParticipant, participantIdOnExternalByInternalResolution);
                    this.idMappingWrapper.addMapping(participantIdOnExternalByInternalResolution, ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant));
                    this.localIdMappings.addMappings(conversationParticipant);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveIds$0(List list) throws Throwable {
        applyExternals(this.idsMapper.map(list));
    }

    public List<ti1> collectExternalIdResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        Map<fje, Map<LocalParticipantId, ConversationParticipant>> roomToParticipantsMap = this.store.getRoomToParticipantsMap();
        Iterator<fje> it = roomToParticipantsMap.keySet().iterator();
        while (it.hasNext()) {
            Map<LocalParticipantId, ConversationParticipant> map = roomToParticipantsMap.get(it.next());
            if (map != null) {
                collectExternalIdResolutionCandidatesForSessionRoom(arrayList, map);
            }
        }
        return arrayList;
    }

    public hk3 resolveIds(List<ti1> list) {
        if (list.isEmpty()) {
            return nk3.a;
        }
        int i = 1;
        return new kk3(i, new v64(this, i, list)).h(u0e.b());
    }
}
