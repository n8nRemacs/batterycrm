package ru.ok.android.externcalls.sdk;

import defpackage.h29;
import defpackage.ho7;
import defpackage.jea;
import defpackage.o81;
import defpackage.ti1;
import defpackage.v2a;
import defpackage.wi1;
import defpackage.yi1;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

/* loaded from: classes2.dex */
public class ConversationParticipant {
    private static final String LOG_TAG = "ConversationParticipant";
    private yi1 callParticipant;
    private ParticipantId externalId;
    private ti1 internalId;
    private boolean reported;
    private final LocalParticipantId localParticipantId = LocalParticipantId.nextId();
    private int capabilities = 0;

    private ConversationParticipant() {
    }

    public static ConversationParticipant fromExternal(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setExternalId(participantId);
        ti1 byExternal = idMappingWrapper.getByExternal(participantId);
        if (byExternal != null) {
            conversationParticipant.setInternalId(byExternal);
        }
        return conversationParticipant;
    }

    public static ConversationParticipant fromInternal(ti1 ti1Var, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setInternalId(ti1Var);
        ParticipantId byInternal = idMappingWrapper.getByInternal(ti1Var);
        if (byInternal != null) {
            conversationParticipant.setExternalId(byInternal);
        }
        return conversationParticipant;
    }

    public void deAnonymize(yi1 yi1Var, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        this.externalId = participantId2;
        this.callParticipant = yi1Var;
        localIdMappings.deAnonymizeMapping(participantId, this);
    }

    public long getAcceptCallEpochMs() {
        yi1 yi1Var = this.callParticipant;
        if (yi1Var != null) {
            return yi1Var.n;
        }
        return 0L;
    }

    public String getAcceptedCallClientType() {
        yi1 yi1Var = this.callParticipant;
        if (yi1Var == null) {
            return null;
        }
        return yi1Var.l;
    }

    public String getAcceptedCallPlatform() {
        yi1 yi1Var = this.callParticipant;
        if (yi1Var == null) {
            return null;
        }
        return yi1Var.m;
    }

    public h29 getAudioOptionState() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null ? yi1Var.b.a : h29.a;
    }

    public yi1 getCallParticipant() {
        return this.callParticipant;
    }

    public ClientCapabilities getCapabilities() {
        int i;
        yi1 yi1Var = this.callParticipant;
        int i2 = yi1Var != null ? yi1Var.s : 0;
        if (i2 == 0 && (i = this.capabilities) != 0) {
            i2 = i;
        }
        return ClientCapabilities.from(i2);
    }

    public ParticipantId getExternalId() {
        return this.externalId;
    }

    public ti1 getInternalId() {
        return this.internalId;
    }

    public LocalParticipantId getLocalParticipantId() {
        return this.localParticipantId;
    }

    public List<v2a> getMovies() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var == null ? Collections.EMPTY_LIST : yi1Var.r;
    }

    public jea getNetworkStatus() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var == null ? jea.a : yi1Var.j;
    }

    public h29 getScreenshareOptionState() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null ? yi1Var.b.c : h29.a;
    }

    public h29 getVideoOptionState() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null ? yi1Var.b.b : h29.a;
    }

    public h29 getWatchTogetherOptionState() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null ? yi1Var.b.d : h29.a;
    }

    public boolean hasRegisteredPeers() {
        yi1 yi1Var = this.callParticipant;
        if (yi1Var != null) {
            return (yi1Var.k == null && yi1Var.f.isEmpty()) ? false : true;
        }
        return false;
    }

    public boolean isAdmin() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.e.contains(wi1.b);
    }

    public boolean isAnimojiEnabled() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.c.g;
    }

    public boolean isAudioEnabled() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.c.e;
    }

    public boolean isCallAccepted() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.c();
    }

    public boolean isConnected() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.h;
    }

    public boolean isCreator() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.e.contains(wi1.a);
    }

    public boolean isPrimarySpeaker() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.e();
    }

    public boolean isReported() {
        return this.reported;
    }

    public boolean isScreenCaptureEnabled() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.c.b;
    }

    public boolean isTalking() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.f();
    }

    public boolean isUseable() {
        yi1 yi1Var;
        return (!isReported() || (yi1Var = this.callParticipant) == null || yi1Var.a == null) ? false : true;
    }

    public boolean isVideoEnabled() {
        yi1 yi1Var = this.callParticipant;
        return yi1Var != null && yi1Var.c.f;
    }

    public void setCallParticipant(yi1 yi1Var, LocalIdMappings localIdMappings) {
        this.callParticipant = yi1Var;
        if (yi1Var != null) {
            this.internalId = yi1Var.a;
        }
        localIdMappings.addMappings(this);
    }

    public void setCapabilities(ClientCapabilities clientCapabilities) {
        this.capabilities = clientCapabilities.getValue();
    }

    public void setDeviceIndex(int i, LocalIdMappings localIdMappings) {
        ti1 ti1Var;
        GlobalRTCLogger globalRTCLogger = GlobalRTCLogger.INSTANCE;
        StringBuilder sbM = ho7.m(i, "updateDeviceIndex ", " for ");
        sbM.append(this.externalId);
        GlobalRTCLogger.log(LOG_TAG, sbM.toString());
        if (this.externalId != null) {
            ParticipantId participantId = this.externalId;
            this.externalId = new ParticipantId(participantId.id, participantId.isAnon, i);
        }
        ti1 ti1Var2 = this.internalId;
        if (ti1Var2 != null) {
            this.internalId = new ti1(ti1Var2.b, i, ti1Var2.a);
        }
        yi1 yi1Var = this.callParticipant;
        if (yi1Var != null && (ti1Var = yi1Var.a) != null) {
            yi1Var.a = new ti1(ti1Var.b, i, ti1Var.a);
            o81 o81Var = yi1Var.q;
            if (o81Var != null) {
                yi1Var.q = new o81(o81Var.a, o81Var.b, i);
            }
        }
        localIdMappings.addMappings(this);
    }

    public void setExternalId(ParticipantId participantId) {
        this.externalId = participantId;
    }

    public void setInternalId(ti1 ti1Var) {
        this.internalId = ti1Var;
        yi1 yi1Var = this.callParticipant;
        if (yi1Var != null) {
            yi1Var.a = ti1Var;
        }
    }

    public void setReported(boolean z) {
        this.reported = z;
    }

    public String toString() {
        return this.externalId + "|" + this.internalId + "|" + this.callParticipant;
    }
}
