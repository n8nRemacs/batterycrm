package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* loaded from: classes.dex */
public final class tf1 {
    public final k18 a;

    public tf1(k18 k18Var) {
        this.a = k18Var;
    }

    public final aj1 a(Conversation conversation, ConversationParticipant conversationParticipant, boolean z, boolean z2) {
        zi1 zi1Var;
        int i;
        zi1 zi1VarA = knb.a(conversationParticipant.getExternalId());
        h29 audioOptionState = conversationParticipant.getAudioOptionState();
        h29 videoOptionState = conversationParticipant.getVideoOptionState();
        h29 screenshareOptionState = conversationParticipant.getScreenshareOptionState();
        boolean zIsAudioEnabled = conversationParticipant.isAudioEnabled();
        boolean zBooleanValue = (z && conversationParticipant.isScreenCaptureEnabled()) ? ((Boolean) ((g1e) this.a.getValue()).b.getValue()).booleanValue() : false;
        vch vchVar = new vch(conversationParticipant.isVideoEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(cdh.a).build(), z);
        boolean z3 = zBooleanValue;
        vch vchVar2 = new vch(conversationParticipant.isScreenCaptureEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(cdh.b).build(), false);
        boolean zIsCallAccepted = conversationParticipant.isCallAccepted();
        long acceptCallEpochMs = conversationParticipant.getAcceptCallEpochMs();
        boolean zIsConnected = conversationParticipant.isConnected();
        boolean zIsPrimarySpeaker = conversationParticipant.isPrimarySpeaker();
        boolean zIsTalking = conversationParticipant.isTalking();
        boolean zIsHandRaised = conversation.getParticipantStatesManager().isHandRaised(conversationParticipant.getExternalId());
        boolean zIsCreator = conversationParticipant.isCreator();
        boolean zIsAdmin = conversationParticipant.isAdmin();
        List<v2a> movies = conversationParticipant.getMovies();
        boolean zHasRegisteredPeers = conversationParticipant.hasRegisteredPeers();
        boolean z4 = conversation.getParticipantMediaStat(conversationParticipant) != null;
        int iOrdinal = conversationParticipant.getNetworkStatus().ordinal();
        if (iOrdinal != 0) {
            zi1Var = zi1VarA;
            if (iOrdinal == 1) {
                i = 2;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 3;
            }
        } else {
            zi1Var = zi1VarA;
            i = 1;
        }
        return new aj1(zi1Var, audioOptionState, videoOptionState, screenshareOptionState, zIsAudioEnabled, z3, vchVar, vchVar2, zIsCreator, zIsAdmin, z2, zIsConnected, zIsCallAccepted, acceptCallEpochMs, z, zIsPrimarySpeaker, zIsTalking, zIsHandRaised, zHasRegisteredPeers, z4, movies, i);
    }
}
