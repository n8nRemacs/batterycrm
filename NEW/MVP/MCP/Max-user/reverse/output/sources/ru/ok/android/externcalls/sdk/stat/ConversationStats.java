package ru.ok.android.externcalls.sdk.stat;

import defpackage.cm6;
import defpackage.o64;
import defpackage.y8g;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;
import ru.ok.android.externcalls.sdk.stat.connect.ConversationConnectedToSignalingStat;
import ru.ok.android.externcalls.sdk.stat.connection.PeerConnectionChangedStat;
import ru.ok.android.externcalls.sdk.stat.finish.CallFinishStat;
import ru.ok.android.externcalls.sdk.stat.icerestart.IceRestartStat;
import ru.ok.android.externcalls.sdk.stat.init.CallInitStat;
import ru.ok.android.externcalls.sdk.stat.kws.ConversationKwsStat;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.externcalls.sdk.stat.reconnect.ConversationReconnectStat;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingTransportStat;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;
import ru.ok.android.externcalls.sdk.stat.topology.ServerTopologyRequestedStat;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "statReporter", "Lo64;", "cidProvider", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Ly8g;", "timeProvider", "", "isAnon", "<init>", "(Lcm6;Lru/ok/android/externcalls/sdk/log/ExtLogger;Lo64;Lru/ok/android/externcalls/sdk/Conversation$CallType;Ly8g;Z)V", "Lru/ok/android/externcalls/sdk/stat/connect/ConversationConnectedToSignalingStat;", "connectedToSignalingStat", "Lru/ok/android/externcalls/sdk/stat/connect/ConversationConnectedToSignalingStat;", "Lru/ok/android/externcalls/sdk/stat/reconnect/ConversationReconnectStat;", "reconnectStat", "Lru/ok/android/externcalls/sdk/stat/reconnect/ConversationReconnectStat;", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "preparedStat", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "startedStat", "Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTransportStat;", "wsSignalingStat", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTransportStat;", "Lru/ok/android/externcalls/sdk/stat/kws/ConversationKwsStat;", "kwsStat", "Lru/ok/android/externcalls/sdk/stat/kws/ConversationKwsStat;", "Lru/ok/android/externcalls/sdk/stat/finish/CallFinishStat;", "callFinish", "Lru/ok/android/externcalls/sdk/stat/finish/CallFinishStat;", "Lru/ok/android/externcalls/sdk/stat/init/CallInitStat;", "callInitStat", "Lru/ok/android/externcalls/sdk/stat/init/CallInitStat;", "Lru/ok/android/externcalls/sdk/stat/candidateschanged/IceCandidatePairChangedStat;", "iceCandidatePairChangedStat", "Lru/ok/android/externcalls/sdk/stat/candidateschanged/IceCandidatePairChangedStat;", "Lru/ok/android/externcalls/sdk/stat/icerestart/IceRestartStat;", "iceRestartStat", "Lru/ok/android/externcalls/sdk/stat/icerestart/IceRestartStat;", "Lru/ok/android/externcalls/sdk/stat/topology/ServerTopologyRequestedStat;", "serverTopologyRequestedStat", "Lru/ok/android/externcalls/sdk/stat/topology/ServerTopologyRequestedStat;", "Lru/ok/android/externcalls/sdk/stat/connection/PeerConnectionChangedStat;", "peerConnectionStateChangedStat", "Lru/ok/android/externcalls/sdk/stat/connection/PeerConnectionChangedStat;", "Lru/ok/android/externcalls/sdk/stat/negotiation/NegotiationErrorStat;", "negotiationErrorStat", "Lru/ok/android/externcalls/sdk/stat/negotiation/NegotiationErrorStat;", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "mlDownloadStat", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConversationStats {
    public final CallFinishStat callFinish;
    public final CallInitStat callInitStat;
    public final ConversationConnectedToSignalingStat connectedToSignalingStat;
    public final IceCandidatePairChangedStat iceCandidatePairChangedStat;
    public final IceRestartStat iceRestartStat;
    public final ConversationKwsStat kwsStat;
    public final MLDownloadStat mlDownloadStat;
    public final NegotiationErrorStat negotiationErrorStat;
    public final PeerConnectionChangedStat peerConnectionStateChangedStat;
    public final ConversationPreparedStat preparedStat;
    public final ConversationReconnectStat reconnectStat;
    public final ServerTopologyRequestedStat serverTopologyRequestedStat;
    public final ConversationStartedStat startedStat;
    public final SignalingTransportStat wsSignalingStat;

    public ConversationStats(cm6 cm6Var, ExtLogger extLogger, o64 o64Var, Conversation.CallType callType, y8g y8gVar, boolean z) {
        this.connectedToSignalingStat = new ConversationConnectedToSignalingStat(y8gVar, cm6Var);
        this.reconnectStat = new ConversationReconnectStat(extLogger, o64Var);
        this.preparedStat = new ConversationPreparedStat(y8gVar, cm6Var);
        this.startedStat = new ConversationStartedStat(callType, y8gVar, cm6Var);
        this.wsSignalingStat = new SignalingTransportStat(cm6Var, y8gVar);
        this.kwsStat = new ConversationKwsStat(cm6Var);
        this.callFinish = new CallFinishStat(cm6Var);
        this.callInitStat = new CallInitStat(callType, z, cm6Var);
        this.iceCandidatePairChangedStat = new IceCandidatePairChangedStat(cm6Var);
        this.iceRestartStat = new IceRestartStat(cm6Var);
        this.serverTopologyRequestedStat = new ServerTopologyRequestedStat(cm6Var, y8gVar);
        this.peerConnectionStateChangedStat = new PeerConnectionChangedStat(cm6Var);
        this.negotiationErrorStat = new NegotiationErrorStat(cm6Var);
        this.mlDownloadStat = new MLDownloadStat(cm6Var);
    }
}
