package ru.ok.android.externcalls.sdk;

import android.content.Context;
import defpackage.btd;
import defpackage.h1e;
import defpackage.hqa;
import defpackage.kua;
import defpackage.li;
import defpackage.ng0;
import defpackage.pi1;
import defpackage.qi1;
import defpackage.r52;
import defpackage.ss8;
import defpackage.ti1;
import defpackage.y6d;
import defpackage.y8g;
import defpackage.z6d;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.api.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* loaded from: classes2.dex */
class ConversationBuilder {
    List<String> additionalWhitelistedCodecPrefixes;
    CallAnalyticsSender analyticsSender;
    li animojiRenderProvider;
    String anonToken;
    boolean answerAsContact;
    kua api;
    ng0 badNetworkIndicatorConfig;
    hqa cameraCapturerFactory;
    String cid;
    ClientCapabilities clientCapabilities;
    String clientType;
    Context context;
    ConversationFactory creator;
    boolean dnsResolverEnabled;
    String domainId;
    boolean enableLossRttBadConnectionHandling;
    ConversationEventsListener eventListener;
    ExecutionTimeInterceptor executionTimeInterceptor;
    ExecutorService executorService;
    qi1 experiments;
    IdsMapper<ti1, ParticipantId> externalIdsMapper;
    boolean forceRelayPolicy;
    r52 frameInterceptor;
    ss8 groupCallMediaAdaptationConfig;
    boolean hasVideo;
    boolean hotStart;
    IdMappingWrapper idMappingWrapper;
    ConversationParticipant initialOpponent;
    IdsMapper<ParticipantId, ti1> internalIdsMapper;
    boolean isAnswer;
    boolean isCaller;
    boolean isConsumerUpdateEnabled;
    boolean isDataChannelScreenshareRecvEnabled;
    boolean isDataChannelScreenshareSendEnabled;
    boolean isJoined;
    boolean isOnDemandTracksEnabled;
    boolean isSignalingDefaultValuesFilteringEnabled;
    boolean isWatchTogetherEnabledForAll;
    String joinLink;
    y6d log;
    z6d logConfiguration;

    /* renamed from: me, reason: collision with root package name */
    ConversationParticipant f171me;
    MediaConnectionSettings mediaConnectionSettings;
    long mediaReceivingTimeoutMs;
    boolean multipleDevicesEnabled;
    OkApiService okApiService;
    String payload;
    ss8 ptpCallMediaAdaptationConfig;
    RttRateHintConfig rttRateHintConfig;
    h1e screenCapturePermissionProvider;
    boolean showLocalVideoInOriginalQuality;
    StartConversationDelegate startConversationDelegate;
    ExtLogger stat;
    y8g timeProvider;
    String version;
    int audioLevelFrequencyMs = 250;
    pi1 bitrates = null;
    int videoTracksCount = 0;
    boolean fastRecoverEnabled = false;
    boolean isWaitingRoomActivated = false;
    boolean isWebRTCCodecFilteringEnabled = false;
    String[] audioCodecs = null;
    String[] videoCodecs = null;
    btd rotationProvider = btd.V;
    boolean isSessionRoomsFeatureEnabled = true;
    boolean isFastScreenCaptureEnabled = false;
    boolean isDeviceAudioShareEnabled = false;
    boolean isAsrOnlineEnabled = false;
    boolean isMediaAdaptationFeatureEnabledForP2PCall = true;
    boolean isMediaAdaptationFeatureEnabledForGroupCall = true;
    Locale locale = null;
    boolean isAudienceModeEnabled = false;
    boolean serverTopologySuspendBelowMinBitrate = false;
    ChatStateListener chatStateListener = ChatStateListener.EMPTY;
    Long chatId = null;

    public ConversationBuilder(IdMappingWrapper idMappingWrapper) {
        this.idMappingWrapper = idMappingWrapper;
    }

    public ConversationImpl createConversation() {
        return new ConversationImpl(this);
    }

    public ConversationBuilder setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
        return this;
    }

    public ConversationBuilder setAnalyticsSender(CallAnalyticsSender callAnalyticsSender) {
        this.analyticsSender = callAnalyticsSender;
        return this;
    }

    public ConversationBuilder setAnimojiDataSupplier(li liVar) {
        this.animojiRenderProvider = liVar;
        return this;
    }

    public ConversationBuilder setAnonToken(String str) {
        this.anonToken = str;
        return this;
    }

    public ConversationBuilder setAnswerAsContact(boolean z) {
        this.answerAsContact = z;
        return this;
    }

    public ConversationBuilder setApi(kua kuaVar) {
        this.api = kuaVar;
        return this;
    }

    public ConversationBuilder setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
        return this;
    }

    public ConversationBuilder setAudienceModelEnabled(boolean z) {
        this.isAudienceModeEnabled = z;
        return this;
    }

    public ConversationBuilder setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
        return this;
    }

    public ConversationBuilder setBadNetworkIndicatorConfig(ng0 ng0Var) {
        this.badNetworkIndicatorConfig = ng0Var;
        return this;
    }

    public ConversationBuilder setBitrates(pi1 pi1Var) {
        this.bitrates = pi1Var;
        return this;
    }

    public ConversationBuilder setCameraCapturerFactory(hqa hqaVar) {
        this.cameraCapturerFactory = hqaVar;
        return this;
    }

    public ConversationBuilder setChatId(Long l) {
        this.chatId = l;
        return this;
    }

    public ConversationBuilder setChatStateListener(ChatStateListener chatStateListener) {
        this.chatStateListener = chatStateListener;
        return this;
    }

    public ConversationBuilder setCid(String str) {
        this.cid = str;
        return this;
    }

    public ConversationBuilder setClientCapabilities(ClientCapabilities clientCapabilities) {
        this.clientCapabilities = clientCapabilities;
        return this;
    }

    public ConversationBuilder setClientType(String str) {
        this.clientType = str;
        return this;
    }

    public ConversationBuilder setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
        return this;
    }

    public ConversationBuilder setContext(Context context) {
        this.context = context;
        return this;
    }

    public ConversationBuilder setCreator(ConversationFactory conversationFactory) {
        this.creator = conversationFactory;
        return this;
    }

    public ConversationBuilder setDataChannelScreenshareRecvEnabled(boolean z) {
        this.isDataChannelScreenshareRecvEnabled = z;
        return this;
    }

    public ConversationBuilder setDataChannelScreenshareSendEnabled(boolean z) {
        this.isDataChannelScreenshareSendEnabled = z;
        return this;
    }

    public ConversationBuilder setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
        return this;
    }

    public ConversationBuilder setDnsResolverEnabled(boolean z) {
        this.dnsResolverEnabled = z;
        return this;
    }

    public ConversationBuilder setDomainId(String str) {
        this.domainId = str;
        return this;
    }

    public ConversationBuilder setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
        return this;
    }

    public ConversationBuilder setEventListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener = conversationEventsListener;
        return this;
    }

    public ConversationBuilder setExecutionTimeInterceptor(ExecutionTimeInterceptor executionTimeInterceptor) {
        this.executionTimeInterceptor = executionTimeInterceptor;
        return this;
    }

    public ConversationBuilder setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public ConversationBuilder setExperiments(qi1 qi1Var) {
        this.experiments = qi1Var;
        return this;
    }

    public ConversationBuilder setExternalIdsMapper(IdsMapper<ti1, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
        return this;
    }

    public ConversationBuilder setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
        return this;
    }

    public ConversationBuilder setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
        return this;
    }

    public ConversationBuilder setFieldTrials(String str) {
        this.experiments.r = str;
        return this;
    }

    public ConversationBuilder setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
        return this;
    }

    public ConversationBuilder setFrameInterceptor(r52 r52Var) {
        return this;
    }

    public ConversationBuilder setGroupCallMediaAdaptationConfig(ss8 ss8Var) {
        this.groupCallMediaAdaptationConfig = ss8Var;
        return this;
    }

    public ConversationBuilder setHasVideo(boolean z) {
        this.hasVideo = z;
        return this;
    }

    public ConversationBuilder setHotStart(boolean z) {
        this.hotStart = z;
        return this;
    }

    public ConversationBuilder setInternalIdsMapper(IdsMapper<ParticipantId, ti1> idsMapper) {
        this.internalIdsMapper = idsMapper;
        return this;
    }

    public ConversationBuilder setIsAnswer(boolean z) {
        this.isAnswer = z;
        return this;
    }

    public ConversationBuilder setIsCaller(boolean z) {
        this.isCaller = z;
        return this;
    }

    public ConversationBuilder setIsJoined(boolean z) {
        this.isJoined = z;
        return this;
    }

    public ConversationBuilder setIsWaitingRoomActivated(boolean z) {
        this.isWaitingRoomActivated = z;
        return this;
    }

    public ConversationBuilder setJoinLink(String str) {
        this.joinLink = str;
        return this;
    }

    public ConversationBuilder setLocale(Locale locale) {
        this.locale = locale;
        return this;
    }

    public ConversationBuilder setLog(y6d y6dVar) {
        this.log = y6dVar;
        return this;
    }

    public ConversationBuilder setLogConfiguration(z6d z6dVar) {
        this.logConfiguration = z6dVar;
        return this;
    }

    public ConversationBuilder setMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
        return this;
    }

    public ConversationBuilder setMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
        return this;
    }

    public ConversationBuilder setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings) {
        this.mediaConnectionSettings = mediaConnectionSettings;
        return this;
    }

    public ConversationBuilder setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
        return this;
    }

    public ConversationBuilder setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
        return this;
    }

    public ConversationBuilder setMyId(ParticipantId participantId) {
        this.f171me = ConversationParticipant.fromExternal(participantId, this.idMappingWrapper);
        return this;
    }

    public ConversationBuilder setOkApiService(OkApiService okApiService) {
        this.okApiService = okApiService;
        return this;
    }

    public ConversationBuilder setOnDemandTracksEnabled(boolean z) {
        this.isOnDemandTracksEnabled = z;
        return this;
    }

    public ConversationBuilder setOpponentId(ParticipantId participantId) {
        if (participantId != null) {
            this.initialOpponent = ConversationParticipant.fromExternal(participantId, this.idMappingWrapper);
        }
        return this;
    }

    public ConversationBuilder setP2PCallMediaAdaptationConfig(ss8 ss8Var) {
        this.ptpCallMediaAdaptationConfig = ss8Var;
        return this;
    }

    public ConversationBuilder setPayload(String str) {
        this.payload = str;
        return this;
    }

    public ConversationBuilder setRotationProvider(btd btdVar) {
        this.rotationProvider = btdVar;
        return this;
    }

    public ConversationBuilder setRttRateHintConfig(RttRateHintConfig rttRateHintConfig) {
        this.rttRateHintConfig = rttRateHintConfig;
        return this;
    }

    public ConversationBuilder setScreenCapturePermissionProvider(h1e h1eVar) {
        this.screenCapturePermissionProvider = h1eVar;
        return this;
    }

    public ConversationBuilder setServerTopologySuspendBelowMinBitrate(boolean z) {
        this.serverTopologySuspendBelowMinBitrate = z;
        return this;
    }

    public ConversationBuilder setSessionRoomsEnabled(boolean z) {
        this.isSessionRoomsFeatureEnabled = z;
        return this;
    }

    public ConversationBuilder setSignalingDefaultValuesFilteringEnabled(boolean z) {
        this.isSignalingDefaultValuesFilteringEnabled = z;
        return this;
    }

    public ConversationBuilder setStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.startConversationDelegate = startConversationDelegate;
        return this;
    }

    public ConversationBuilder setStat(ExtLogger extLogger) {
        this.stat = extLogger;
        return this;
    }

    public ConversationBuilder setTimeProvider(y8g y8gVar) {
        this.timeProvider = y8gVar;
        return this;
    }

    public ConversationBuilder setVersion(String str) {
        this.version = str;
        return this;
    }

    public ConversationBuilder setVideoTracksCount(int i) {
        this.videoTracksCount = i;
        return this;
    }

    public ConversationBuilder setWatchTogetherEnabledForAll(boolean z) {
        this.isWatchTogetherEnabledForAll = z;
        return this;
    }

    public ConversationBuilder setWebRTCAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
        return this;
    }

    public ConversationBuilder setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
        return this;
    }

    public ConversationBuilder setWebRTCVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
        return this;
    }

    public ConversationBuilder showLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
        return this;
    }
}
