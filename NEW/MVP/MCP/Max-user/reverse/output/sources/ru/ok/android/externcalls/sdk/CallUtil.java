package ru.ok.android.externcalls.sdk;

import defpackage.h79;
import defpackage.os0;
import defpackage.pi1;
import defpackage.qi1;
import defpackage.ri1;
import defpackage.si1;
import defpackage.z6d;

/* loaded from: classes2.dex */
public class CallUtil {
    static final z6d LOG_CONFIGURATION = new z6d() { // from class: ru.ok.android.externcalls.sdk.CallUtil.1
        @Override // defpackage.z6d
        public /* bridge */ /* synthetic */ boolean shouldHideSensitiveInformation() {
            return false;
        }
    };

    public static pi1 createBitrates() {
        return new pi1();
    }

    public static si1 createCallParams(ConversationBuilder conversationBuilder) {
        pi1 pi1VarCreateBitrates = conversationBuilder.bitrates;
        if (pi1VarCreateBitrates == null) {
            pi1VarCreateBitrates = createBitrates();
        }
        pi1 pi1Var = pi1VarCreateBitrates;
        qi1 qi1Var = conversationBuilder.experiments;
        ri1 ri1Var = qi1Var.f;
        if (ri1Var == null) {
            ri1Var = new ri1(conversationBuilder.mediaReceivingTimeoutMs);
        }
        return new si1(pi1Var, ri1Var, conversationBuilder.dnsResolverEnabled, conversationBuilder.isConsumerUpdateEnabled, conversationBuilder.isOnDemandTracksEnabled, conversationBuilder.enableLossRttBadConnectionHandling, conversationBuilder.additionalWhitelistedCodecPrefixes, conversationBuilder.isDataChannelScreenshareRecvEnabled, conversationBuilder.isDataChannelScreenshareSendEnabled, conversationBuilder.videoTracksCount, conversationBuilder.fastRecoverEnabled, conversationBuilder.isWaitingRoomActivated, conversationBuilder.isSignalingDefaultValuesFilteringEnabled, conversationBuilder.isWebRTCCodecFilteringEnabled, conversationBuilder.audioCodecs, conversationBuilder.videoCodecs, conversationBuilder.showLocalVideoInOriginalQuality, conversationBuilder.isSessionRoomsFeatureEnabled, new h79(new os0(conversationBuilder.isMediaAdaptationFeatureEnabledForP2PCall, conversationBuilder.ptpCallMediaAdaptationConfig), 7, new os0(conversationBuilder.isMediaAdaptationFeatureEnabledForGroupCall, conversationBuilder.groupCallMediaAdaptationConfig)), conversationBuilder.isAsrOnlineEnabled, qi1Var, conversationBuilder.isAudienceModeEnabled, conversationBuilder.serverTopologySuspendBelowMinBitrate, conversationBuilder.isFastScreenCaptureEnabled, conversationBuilder.isDeviceAudioShareEnabled, conversationBuilder.badNetworkIndicatorConfig);
    }
}
