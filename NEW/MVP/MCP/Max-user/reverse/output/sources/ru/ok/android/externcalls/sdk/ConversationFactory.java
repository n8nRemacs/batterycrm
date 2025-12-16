package ru.ok.android.externcalls.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.work.WorkRequest;
import defpackage.a93;
import defpackage.btd;
import defpackage.cm6;
import defpackage.df3;
import defpackage.e2f;
import defpackage.em6;
import defpackage.gm;
import defpackage.h1e;
import defpackage.hd5;
import defpackage.hu3;
import defpackage.i62;
import defpackage.in5;
import defpackage.jda;
import defpackage.jm;
import defpackage.kc3;
import defpackage.kua;
import defpackage.li;
import defpackage.m07;
import defpackage.ng0;
import defpackage.ni1;
import defpackage.nm;
import defpackage.nmf;
import defpackage.oi1;
import defpackage.pi1;
import defpackage.qi1;
import defpackage.qu1;
import defpackage.reg;
import defpackage.ri1;
import defpackage.rm;
import defpackage.rx7;
import defpackage.ss8;
import defpackage.ti1;
import defpackage.tvd;
import defpackage.ue3;
import defpackage.ul0;
import defpackage.um;
import defpackage.vm;
import defpackage.vmf;
import defpackage.w0a;
import defpackage.w6d;
import defpackage.wm;
import defpackage.wo3;
import defpackage.wpb;
import defpackage.x6d;
import defpackage.xpb;
import defpackage.xx7;
import defpackage.y6d;
import defpackage.y8g;
import defpackage.yeg;
import defpackage.ypb;
import defpackage.z6d;
import defpackage.z8g;
import defpackage.zl;
import defpackage.zl3;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationFactoryInitParams;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.internal.ConversationAnalyticsSenderImpl;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.api.log.LoggingApiRequestDebugger;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.api.session.InMemorySessionStore;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.events.AnalyticsEventListener;
import ru.ok.android.externcalls.sdk.events.SharedAnalyticsEvent;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinCallParams;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.factory.internal.RTCLogWrapper;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.log.ItemToLogConverter;
import ru.ok.android.externcalls.sdk.log.stat.ProductStatisticsManagerImpl;
import ru.ok.android.externcalls.sdk.log.stat.StatisticsManager;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductStatItem;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

/* loaded from: classes2.dex */
public class ConversationFactory {
    private static final String DEFAULT_APP_VERSION = "sdk-sdk-125.1.0.73.1";
    private static final String LOG_TAG = "ConversationFactory";
    public static final String SDK_VERSION = "sdk-125.1.0.73.1";
    private List<String> additionalWhitelistedCodecPrefixes;
    private final CallAnalyticsSender.Listener analyticsSenderListener;
    private li animojiDataSupplier;
    private final kua api;
    private String appVersion;
    private String[] audioCodecs;
    private int audioLevelFrequencyMs;
    private ng0 badNetworkIndicatorConfig;
    private pi1 bitrates;
    private final CallAnalyticsSender callAnalyticsSender;
    private ChatStateListener chatStateListener;
    private ClientCapabilities clientCapabilities;
    private final String clientType;
    private final Context context;
    private final ConversationAnalyticsSenderImpl conversationAnalyticsSender;
    private boolean dataChannelScreenshareRecvEnabled;
    private boolean dataChannelScreenshareSendEnabled;
    private final ExtLogger defaultStat;
    private final zl3 disposable;
    private boolean dnsResolverEnabled;
    private String domainId;
    private boolean enableLossRttBadConnectionHandling;
    private ExecutionTimeInterceptor executionTimeInterceptor;
    private final qi1 experiments;
    private final in5 experimentsManager;
    private IdsMapper<ti1, ParticipantId> externalIdsMapper;
    private volatile WeakReference<AnalyticsEventListener> externalListener;
    private boolean fastRecoverEnabled;
    private boolean forceRelayPolicy;
    private ss8 groupCallMediaAdaptationConfig;
    private boolean hotStart;
    private final IdMappingWrapper idMappingWrapper;
    private IdsMapper<ParticipantId, ti1> internalIdsMapper;
    private boolean isAsrOnlineEnabled;
    private boolean isAudienceModeEnabled;
    private boolean isConsumerUpdateEnabled;
    private boolean isDeviceAudioShareEnabled;
    private boolean isFastScreenCaptureEnabled;
    private boolean isMediaAdaptationFeatureEnabledForGroupCall;
    private boolean isMediaAdaptationFeatureEnabledForP2PCall;
    private boolean isSessionRoomsFeatureEnabled;
    private boolean isSignalingDefaultValuesFilteringEnabled;
    private boolean isWaitingRoomActivated;
    private boolean isWebRTCCodecFilteringEnabled;
    private Locale locale;
    private y6d log;
    private z6d logConfiguration;
    private MediaConnectionSettings mediaConnectionSettings;
    private long mediaReceivingTimeoutMs;
    private boolean multipleDevicesEnabled;
    private OkApiService okApiService;
    private boolean onDemandTracksEnabled;
    private ss8 p2pCallMediaAdaptationConfig;
    StartConversationDelegate p2pStartConversationDelegate;
    private final StatisticsManager<ProductStatItem> prodStat;
    private btd rotationProvider;
    private RttRateHintConfig rttRateHintConfig;
    private h1e screenCapturePermissionProvider;
    StartConversationDelegate serverStartConversationDelegate;
    private boolean serverTopologySuspendBelowMinBitrate;
    private boolean showLocalVideoInOriginalQuality;
    private final y8g timeProvider;
    private final reg tracerLiteFacade;
    private String[] videoCodecs;
    private int videoTracksCount;
    private static final ExecutorService WEBRTC_EXECUTOR = Executors.newSingleThreadExecutor();
    private static volatile boolean initDone = false;
    private static boolean isOneLoggerDisabled = false;
    private static boolean isObsoleteStatisticsDisabled = false;

    public ConversationFactory(kua kuaVar, Context context, String str) {
        this(kuaVar, context, str, null);
    }

    public static void disableObsoleteStatistics() {
        isOneLoggerDisabled = true;
        isObsoleteStatisticsDisabled = true;
    }

    public static void disableOneLoggerLogging() {
        isOneLoggerDisabled = true;
    }

    public static String generateConversationId() {
        return UUID.randomUUID().toString();
    }

    private ConversationBuilder getBaseBuilder() {
        ConversationBuilder stat = new ConversationBuilder(this.idMappingWrapper).setCreator(this).setContext(this.context).setApi(this.api).setTimeProvider(this.timeProvider).setExecutionTimeInterceptor(this.executionTimeInterceptor).setExecutorService(WEBRTC_EXECUTOR).setVersion(this.appVersion).setStat(this.defaultStat);
        y6d yegVar = this.log;
        if (!(yegVar instanceof yeg)) {
            yegVar = new yeg(this.tracerLiteFacade, yegVar);
        }
        return stat.setLog(yegVar).setLogConfiguration(this.logConfiguration).setClientType(this.clientType).setHotStart(this.hotStart).setForceRelayPolicy(this.forceRelayPolicy).setAudioLevelFrequencyMs(this.audioLevelFrequencyMs).setDomainId(this.domainId).setConsumerUpdateEnabled(this.isConsumerUpdateEnabled).setOnDemandTracksEnabled(this.onDemandTracksEnabled).setAdditionalWhitelistedCodecPrefixes(this.additionalWhitelistedCodecPrefixes).setBitrates(this.bitrates).setEnableLossRttBadConnectionHandling(this.enableLossRttBadConnectionHandling).setDataChannelScreenshareRecvEnabled(this.dataChannelScreenshareRecvEnabled).setDataChannelScreenshareSendEnabled(this.dataChannelScreenshareSendEnabled).setVideoTracksCount(this.videoTracksCount).setFastRecoverEnabled(this.fastRecoverEnabled).setMediaReceivingTimeoutMs(this.mediaReceivingTimeoutMs).setIsWaitingRoomActivated(this.isWaitingRoomActivated).setSignalingDefaultValuesFilteringEnabled(this.isSignalingDefaultValuesFilteringEnabled).setWebRTCCodecFilteringEnabled(this.isWebRTCCodecFilteringEnabled).setWebRTCAudioCodecs(this.audioCodecs).setWebRTCVideoCodecs(this.videoCodecs).setMultipleDevicesEnabled(this.multipleDevicesEnabled).setRotationProvider(this.rotationProvider).setAnimojiDataSupplier(this.animojiDataSupplier).setRotationProvider(this.rotationProvider).showLocalVideoInOriginalQuality(this.showLocalVideoInOriginalQuality).setSessionRoomsEnabled(this.isSessionRoomsFeatureEnabled).setLocale(this.locale).setInternalIdsMapper(this.internalIdsMapper).setExternalIdsMapper(this.externalIdsMapper).setMediaAdaptationFeatureEnabledForP2PCall(this.isMediaAdaptationFeatureEnabledForP2PCall).setP2PCallMediaAdaptationConfig(this.p2pCallMediaAdaptationConfig).setMediaAdaptationFeatureEnabledForGroupCall(this.isMediaAdaptationFeatureEnabledForGroupCall).setGroupCallMediaAdaptationConfig(this.groupCallMediaAdaptationConfig).setAsrOnlineEnabled(this.isAsrOnlineEnabled).setExperiments(this.experiments).setAudienceModelEnabled(this.isAudienceModeEnabled).setServerTopologySuspendBelowMinBitrate(this.serverTopologySuspendBelowMinBitrate).setFastScreenCaptureEnabled(this.isFastScreenCaptureEnabled).setDeviceAudioShareEnabled(this.isDeviceAudioShareEnabled).setChatStateListener(this.chatStateListener).setOkApiService(this.okApiService).setDnsResolverEnabled(this.dnsResolverEnabled).setBadNetworkIndicatorConfig(this.badNetworkIndicatorConfig).setAnalyticsSender(this.callAnalyticsSender).setScreenCapturePermissionProvider(this.screenCapturePermissionProvider).setMediaConnectionSettings(this.mediaConnectionSettings).setRttRateHintConfig(this.rttRateHintConfig).setClientCapabilities(this.clientCapabilities);
    }

    public static synchronized void init(Context context) {
        init(new ConversationFactoryInitParams.Builder(context).build());
    }

    private static /* synthetic */ rm lambda$answer$5(rm rmVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$answer$6(AnswerCallParams answerCallParams, Conversation conversation) {
        answerCallParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$answer$7(AnswerCallParams answerCallParams, Throwable th) {
        answerCallParams.getOnError().invoke(th);
    }

    private static /* synthetic */ rm lambda$call$2(rm rmVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$call$3(StartCallParams startCallParams, Conversation conversation) {
        startCallParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$call$4(StartCallParams startCallParams, Throwable th) {
        startCallParams.getOnError().invoke(th);
    }

    private static /* synthetic */ rm lambda$createConfRoom$18(rm rmVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createConfRoom$19(CreateConfParams createConfParams, Conversation conversation) {
        createConfParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createConfRoom$20(CreateConfParams createConfParams, Throwable th) {
        createConfParams.getOnError().invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$hangup$21(xx7 xx7Var) throws JsonParseException, IOException {
        xx7Var.v();
        return new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$22(Object obj) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$23(Throwable th) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$join$8(JoinCallParams joinCallParams, Conversation conversation) {
        joinCallParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$join$9(JoinCallParams joinCallParams, Throwable th) {
        joinCallParams.getOnError().invoke(th);
    }

    private static /* synthetic */ rm lambda$joinAnonByLink$13(rm rmVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ um lambda$joinAnonByLink$14(JoinAnonByLinkParams joinAnonByLinkParams) throws IOException {
        return new um(null, joinAnonByLinkParams.getApiEndpoint());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$joinAnonByLink$15() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinAnonByLink$16(JoinAnonByLinkParams joinAnonByLinkParams, Conversation conversation) {
        joinAnonByLinkParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinAnonByLink$17(JoinAnonByLinkParams joinAnonByLinkParams, Throwable th) {
        joinAnonByLinkParams.getOnError().invoke(th);
    }

    private static /* synthetic */ rm lambda$joinByLink$10(rm rmVar) {
        return new InMemorySessionStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinByLink$11(JoinByLinkParams joinByLinkParams, Conversation conversation) {
        joinByLinkParams.getOnPrepared().invoke(conversation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinByLink$12(JoinByLinkParams joinByLinkParams, Throwable th) {
        joinByLinkParams.getOnError().invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6d lambda$new$0() {
        return this.log;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6d lambda$new$1() {
        return this.log;
    }

    public Conversation answer(em6 em6Var) {
        final AnswerCallParams answerCallParams = (AnswerCallParams) em6Var.invoke(new AnswerCallParams.Builder());
        ConversationParams conversationParamsDecode = null;
        ConversationBuilder cameraCapturerFactory = getBaseBuilder().setHasVideo(answerCallParams.getShouldStartWithVideo()).setAnswerAsContact(answerCallParams.getAnswerAsContact()).setIsCaller(false).setIsAnswer(true).setPayload(null).setCid(answerCallParams.getConversationId()).setEventListener(answerCallParams.getEventListener()).setCameraCapturerFactory(answerCallParams.getCameraCapturerFactory());
        answerCallParams.getFrameInterceptor();
        ConversationBuilder fieldTrials = cameraCapturerFactory.setFrameInterceptor(null).setMyId(answerCallParams.getMyId()).setOpponentId(answerCallParams.getOpponentId()).setFieldTrials(answerCallParams.getFieldTrials());
        if (answerCallParams.getTokenProvider() != null) {
            a93 a93VarG = this.api.g();
            a93VarG.a = new SimpleConfigurationStore((wo3) a93VarG.a);
            a93VarG.b = answerCallParams.getTokenProvider();
            fieldTrials.setApi(a93VarG.c());
        }
        if (answerCallParams.getTokenInfoProvider() != null) {
            a93 a93VarG2 = this.api.g();
            a93VarG2.Y = lambda$answer$5((rm) a93VarG2.Y);
            a93VarG2.X = answerCallParams.getTokenInfoProvider();
            fieldTrials.setApi(a93VarG2.c());
        }
        ConversationImpl conversationImplCreateConversation = fieldTrials.createConversation();
        try {
            this.log.log(LOG_TAG, "Try to decode provided conversation params");
            conversationParamsDecode = ConversationParams.decode(answerCallParams.getConversationParams());
        } catch (Throwable unused) {
            this.log.log(LOG_TAG, "Error while trying to decode provided conversation params");
        }
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepare(conversationParamsDecode, new hu3() { // from class: k64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        ConversationFactory.lambda$answer$6(answerCallParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$answer$7(answerCallParams, (Throwable) obj);
                        break;
                }
            }
        }, new hu3() { // from class: k64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        ConversationFactory.lambda$answer$6(answerCallParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$answer$7(answerCallParams, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public Conversation call(em6 em6Var) {
        final StartCallParams startCallParams = (StartCallParams) em6Var.invoke(new StartCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(startCallParams.getShouldStartWithVideo()).setIsCaller(true).setPayload(startCallParams.getPayload()).setCid(generateConversationId()).setEventListener(startCallParams.getEventListener());
        startCallParams.getFrameInterceptor();
        ConversationBuilder startConversationDelegate = eventListener.setFrameInterceptor(null).setWatchTogetherEnabledForAll(startCallParams.getIsWatchTogetherEnabledForAll()).setCameraCapturerFactory(startCallParams.getCameraCapturerFactory()).setMyId(startCallParams.getMyId()).setOpponentId(startCallParams.getOpponentId()).setChatId(startCallParams.getChatId()).setFieldTrials(startCallParams.getFieldTrials()).setStartConversationDelegate(this.p2pStartConversationDelegate);
        if (startCallParams.getTokenProvider() != null) {
            a93 a93VarG = this.api.g();
            a93VarG.a = new SimpleConfigurationStore((wo3) a93VarG.a);
            a93VarG.b = startCallParams.getTokenProvider();
            startConversationDelegate.setApi(a93VarG.c());
        }
        if (startCallParams.getTokenInfoProvider() != null) {
            a93 a93VarG2 = this.api.g();
            a93VarG2.Y = lambda$call$2((rm) a93VarG2.Y);
            a93VarG2.X = startCallParams.getTokenInfoProvider();
            startConversationDelegate.setApi(a93VarG2.c());
        }
        ConversationImpl conversationImplCreateConversation = startConversationDelegate.createConversation();
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepare(null, new hu3() { // from class: g64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        ConversationFactory.lambda$call$3(startCallParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$call$4(startCallParams, (Throwable) obj);
                        break;
                }
            }
        }, new hu3() { // from class: g64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        ConversationFactory.lambda$call$3(startCallParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$call$4(startCallParams, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public void clearApiAuthSession() {
        this.api.e().c();
    }

    public Conversation createConfRoom(em6 em6Var) {
        final CreateConfParams createConfParams = (CreateConfParams) em6Var.invoke(new CreateConfParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(createConfParams.getShouldStartWithVideo()).setIsCaller(true).setPayload(createConfParams.getPayload()).setCid(generateConversationId()).setEventListener(createConfParams.getEventListener());
        createConfParams.getFrameInterceptor();
        ConversationBuilder startConversationDelegate = eventListener.setFrameInterceptor(null).setCameraCapturerFactory(createConfParams.getCameraCapturerFactory()).setWatchTogetherEnabledForAll(createConfParams.getIsWatchTogetherEnabledForAll()).setMyId(createConfParams.getMyId()).setFieldTrials(createConfParams.getFieldTrials()).setStartConversationDelegate(this.serverStartConversationDelegate);
        if (createConfParams.getTokenProvider() != null) {
            a93 a93VarG = this.api.g();
            a93VarG.b = createConfParams.getTokenProvider();
            a93VarG.a = new SimpleConfigurationStore((wo3) a93VarG.a);
            startConversationDelegate.setApi(a93VarG.c());
        }
        if (createConfParams.getTokenInfoProvider() != null) {
            a93 a93VarG2 = this.api.g();
            a93VarG2.Y = lambda$createConfRoom$18((rm) a93VarG2.Y);
            a93VarG2.X = createConfParams.getTokenInfoProvider();
            startConversationDelegate.setApi(a93VarG2.c());
        }
        ConversationImpl conversationImplCreateConversation = startConversationDelegate.createConversation();
        conversationImplCreateConversation.initStore(createConfParams.getInitialIds());
        boolean zIsAnonForbidden = createConfParams.getIsAnonForbidden();
        final int i = 0;
        hu3 hu3Var = new hu3() { // from class: m64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        ConversationFactory.lambda$createConfRoom$19(createConfParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$createConfRoom$20(createConfParams, (Throwable) obj);
                        break;
                }
            }
        };
        final int i2 = 1;
        conversationImplCreateConversation.prepare(null, true, zIsAnonForbidden, hu3Var, new hu3() { // from class: m64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        ConversationFactory.lambda$createConfRoom$19(createConfParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$createConfRoom$20(createConfParams, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public ConversationAnalyticsSender getAnalyticsSender() {
        return this.conversationAnalyticsSender;
    }

    public li getAnimojiDataSupplier() {
        return this.animojiDataSupplier;
    }

    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    public in5 getExperiments() {
        return this.experimentsManager;
    }

    public StatisticsManager<ProductStatItem> getProductStatisticsManager() {
        return this.prodStat;
    }

    public void hangup(m07 m07Var, String str, String str2) {
        Uri uriA = wm.a("vchat.hangupConversation");
        gm gmVar = new gm();
        gmVar.a(new nmf(ApiProtocol.PARAM_CONVERSATION_ID, str));
        gmVar.a(new nmf(IceCandidatePairChangedStat.KEY_REASON, m07Var.toString()));
        gmVar.a(new nmf(ApiProtocol.PARAM_ANONYM_TOKEN, str2));
        ul0 ul0Var = new ul0(uriA, nm.c, gmVar, rx7.a);
        tvd tvdVarF = this.api.f();
        df3 df3Var = new df3(8);
        tvdVarF.getClass();
        e2f e2fVarRetryApiCallForBackgroundWork = RetryKt.retryApiCallForBackgroundWork(tvdVarF.a(new zl(ul0Var, df3Var)), this.log);
        df3 df3Var2 = new df3(9);
        df3 df3Var3 = new df3(10);
        e2fVarRetryApiCallForBackgroundWork.getClass();
        qu1 qu1Var = new qu1(df3Var2, 2, df3Var3);
        e2fVarRetryApiCallForBackgroundWork.k(qu1Var);
        this.disposable.a(qu1Var);
    }

    public boolean isDnsResolverEnabled() {
        return this.dnsResolverEnabled;
    }

    public Conversation join(em6 em6Var) {
        final JoinCallParams joinCallParams = (JoinCallParams) em6Var.invoke(new JoinCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinCallParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setCid(joinCallParams.getConversationId()).setEventListener(joinCallParams.getEventListener());
        joinCallParams.getFrameInterceptor();
        ConversationImpl conversationImplCreateConversation = eventListener.setFrameInterceptor(null).setChatId(joinCallParams.getChatId()).setCameraCapturerFactory(joinCallParams.getCameraCapturerFactory()).setMyId(joinCallParams.getMyId()).setFieldTrials(joinCallParams.getFieldTrials()).createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepare(null, new hu3() { // from class: j64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        ConversationFactory.lambda$join$8(joinCallParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$join$9(joinCallParams, (Throwable) obj);
                        break;
                }
            }
        }, new hu3() { // from class: j64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        ConversationFactory.lambda$join$8(joinCallParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$join$9(joinCallParams, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public Conversation joinAnonByLink(em6 em6Var) {
        final JoinAnonByLinkParams joinAnonByLinkParams = (JoinAnonByLinkParams) em6Var.invoke(new JoinAnonByLinkParams.Builder());
        a93 a93VarG = this.api.g();
        if (((vm) a93VarG.X) == null || joinAnonByLinkParams.getApiEndpoint() == null) {
            a93VarG.a = new SimpleConfigurationStore((wo3) a93VarG.a);
            a93VarG.b = new df3(11);
        } else {
            a93VarG.Y = lambda$joinAnonByLink$13((rm) a93VarG.Y);
            a93VarG.X = new i62(23, joinAnonByLinkParams);
        }
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinAnonByLinkParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setEventListener(joinAnonByLinkParams.getEventListener());
        joinAnonByLinkParams.getFrameInterceptor();
        ConversationImpl conversationImplCreateConversation = eventListener.setFrameInterceptor(null).setJoinLink(joinAnonByLinkParams.getLink()).setApi(a93VarG.c()).setCameraCapturerFactory(joinAnonByLinkParams.getCameraCapturerFactory()).setMyId(joinAnonByLinkParams.getMyId()).setFieldTrials(joinAnonByLinkParams.getFieldTrials()).setAnonToken(joinAnonByLinkParams.getToken()).createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        final int i = 1;
        final int i2 = 0;
        conversationImplCreateConversation.prepareJoinByLink(new hu3() { // from class: h64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        ConversationFactory.lambda$joinAnonByLink$17(joinAnonByLinkParams, (Throwable) obj);
                        break;
                    default:
                        ConversationFactory.lambda$joinAnonByLink$16(joinAnonByLinkParams, (Conversation) obj);
                        break;
                }
            }
        }, new hu3() { // from class: h64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        ConversationFactory.lambda$joinAnonByLink$17(joinAnonByLinkParams, (Throwable) obj);
                        break;
                    default:
                        ConversationFactory.lambda$joinAnonByLink$16(joinAnonByLinkParams, (Conversation) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public Conversation joinByLink(em6 em6Var) {
        final JoinByLinkParams joinByLinkParams = (JoinByLinkParams) em6Var.invoke(new JoinByLinkParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinByLinkParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setEventListener(joinByLinkParams.getEventListener());
        joinByLinkParams.getFrameInterceptor();
        ConversationBuilder fieldTrials = eventListener.setFrameInterceptor(null).setJoinLink(joinByLinkParams.getLink()).setCameraCapturerFactory(joinByLinkParams.getCameraCapturerFactory()).setPayload(joinByLinkParams.getPayload()).setMyId(joinByLinkParams.getMyId()).setFieldTrials(joinByLinkParams.getFieldTrials());
        if (joinByLinkParams.getTokenProvider() != null) {
            a93 a93VarG = this.api.g();
            a93VarG.b = joinByLinkParams.getTokenProvider();
            a93VarG.a = new SimpleConfigurationStore((wo3) a93VarG.a);
            fieldTrials.setApi(a93VarG.c());
        }
        if (joinByLinkParams.getTokenInfoProvider() != null) {
            a93 a93VarG2 = this.api.g();
            a93VarG2.Y = lambda$joinByLink$10((rm) a93VarG2.Y);
            a93VarG2.X = joinByLinkParams.getTokenInfoProvider();
            fieldTrials.setApi(a93VarG2.c());
        }
        ConversationImpl conversationImplCreateConversation = fieldTrials.createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        final int i = 0;
        final int i2 = 1;
        conversationImplCreateConversation.prepareJoinByLink(new hu3() { // from class: i64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        ConversationFactory.lambda$joinByLink$11(joinByLinkParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$joinByLink$12(joinByLinkParams, (Throwable) obj);
                        break;
                }
            }
        }, new hu3() { // from class: i64
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        ConversationFactory.lambda$joinByLink$11(joinByLinkParams, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$joinByLink$12(joinByLinkParams, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public void reset() {
        this.disposable.d();
        this.api.e().c();
        this.idMappingWrapper.clear();
    }

    @Deprecated
    public void setAddParticipantsByExternalIdEnabled(boolean z) {
        this.experimentsManager.a.m = z;
    }

    public void setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
    }

    public void setAnalyticsEventListener(AnalyticsEventListener analyticsEventListener) {
        CallAnalyticsSender.Listener listener;
        if (analyticsEventListener == null) {
            listener = null;
            this.externalListener = null;
        } else {
            CallAnalyticsSender.Listener listener2 = this.analyticsSenderListener;
            this.externalListener = new WeakReference<>(analyticsEventListener);
            listener = listener2;
        }
        this.callAnalyticsSender.setEventListener(listener);
    }

    public void setAnimojiDataSupplier(li liVar) {
        this.animojiDataSupplier = liVar;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
    }

    public void setAudienceModeEnabled(boolean z) {
        this.isAudienceModeEnabled = z;
    }

    @Deprecated
    public void setAudioAdaptationParams(ni1 ni1Var) {
        this.experimentsManager.a.s = ni1Var;
    }

    public void setAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
    }

    @Deprecated
    public void setAudioJitterBufferMaxPackets(Integer num) {
        this.experimentsManager.a.E = num;
    }

    public void setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
    }

    @Deprecated
    public void setAudioRedundancyParams(oi1 oi1Var) {
        this.experimentsManager.a.t = oi1Var;
    }

    @Deprecated
    public void setBackendRenderVmoji(boolean z, String str) throws NoSuchFieldException, SecurityException, NumberFormatException {
        List listSingletonList;
        Collection collectionY;
        int i;
        boolean z2;
        in5 in5Var = this.experimentsManager;
        qi1 qi1Var = in5Var.a;
        boolean z3 = true;
        if (z) {
            qi1Var.l = true;
            GlobalRTCLogger.log("ExperimentsManager", "Vmoji backend render enabled for all");
            return;
        }
        if (str == null) {
            return;
        }
        Context context = in5Var.b;
        boolean z4 = w0a.a;
        int[] iArr = null;
        if (context.getApplicationContext() != null && (context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile") || context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile_lite"))) {
            try {
                Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
                declaredField.setAccessible(true);
                int i2 = declaredField.getInt(null) - 90000;
                if (i2 >= 0) {
                    iArr = new int[]{i2 / 10000, (i2 % 10000) / 100};
                }
            } catch (IllegalAccessException | NoSuchFieldException | SecurityException unused) {
            }
        }
        if (iArr == null || iArr.length != 2) {
            GlobalRTCLogger.log("ExperimentsManager", "Not a OneUi, will not enable backend rendering");
            return;
        }
        Pattern patternCompile = Pattern.compile("\\.");
        boolean z5 = false;
        vmf.P(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listSingletonList = arrayList;
        } else {
            listSingletonList = Collections.singletonList(str.toString());
        }
        if (listSingletonList.isEmpty()) {
            collectionY = hd5.a;
        } else {
            ListIterator listIterator = listSingletonList.listIterator(listSingletonList.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionY = ue3.Y(listSingletonList, listIterator.nextIndex() + 1);
                    break;
                }
            }
            collectionY = hd5.a;
        }
        String[] strArr = (String[]) collectionY.toArray(new String[0]);
        if (strArr.length != 2) {
            GlobalRTCLogger.log("ExperimentsManager", "Unexpected OneUI version format ".concat(str));
            return;
        }
        try {
            int i3 = Integer.parseInt(strArr[0]);
            if (strArr[1].endsWith("+")) {
                String str2 = strArr[1];
                i = Integer.parseInt(str2.substring(0, str2.length() - 1));
                z2 = false;
            } else {
                i = Integer.parseInt(strArr[1]);
                z2 = true;
            }
            if (z2) {
                if (iArr[0] != i3 || iArr[1] != i) {
                    z3 = false;
                }
                qi1Var.l = z3;
                GlobalRTCLogger.log("ExperimentsManager", "Vmoji backend render enabled for OneUi exactly of version " + i3 + "." + i);
                return;
            }
            int i4 = iArr[0];
            if (i4 > i3 || (i4 == i3 && iArr[1] >= i)) {
                z5 = true;
            }
            qi1Var.l = z5;
            GlobalRTCLogger.log("ExperimentsManager", "Vmoji backend render enabled for OneUi of version at least " + i3 + "." + i + ", actual version is " + i4 + "." + iArr[1]);
        } catch (NumberFormatException unused2) {
            GlobalRTCLogger.log("ExperimentsManager", "Unexpected OneUI version format: ".concat(str));
        }
    }

    public void setBadNetworkIndicatorConfig(ng0 ng0Var) {
        if (ng0Var == null) {
            ng0Var = ng0.e;
        }
        this.badNetworkIndicatorConfig = ng0Var;
    }

    public void setBitrates(pi1 pi1Var) {
        this.bitrates = pi1Var;
    }

    @Deprecated
    public void setCallAnalyticsUploadParams(Double d, Double d2) {
        qi1 qi1Var = this.experimentsManager.a;
        qi1Var.p = d;
        qi1Var.q = d2;
    }

    @Deprecated
    public void setCamera2ApiEnabled(boolean z) {
        this.experimentsManager.a.a = z;
    }

    public void setChatStateListener(ChatStateListener chatStateListener) {
        this.chatStateListener = chatStateListener;
    }

    public void setClientCapabilities(ClientCapabilities clientCapabilities) {
        this.clientCapabilities = clientCapabilities;
    }

    public void setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
    }

    public void setDataChannelScreenshareRecvEnabled(boolean z) {
        this.dataChannelScreenshareRecvEnabled = z;
    }

    public void setDataChannelScreenshareSendEnabled(boolean z) {
        this.dataChannelScreenshareSendEnabled = z;
    }

    public void setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
    }

    public void setDomainId(String str) {
        this.domainId = str;
    }

    @Deprecated
    public void setDtxDisabled(boolean z) {
        this.experimentsManager.a.g = z;
    }

    @Deprecated
    public void setDynamicScreenShareSizeUpdateEnabled(boolean z) {
        this.experimentsManager.a.k = z;
    }

    @Deprecated
    public void setEmulatedNegotiationErrorType(jda jdaVar) {
        this.experimentsManager.a.y = jdaVar;
    }

    public void setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
    }

    public void setEnabledDnsResolver(boolean z) {
        this.dnsResolverEnabled = z;
    }

    @Deprecated
    public void setEnqueuedCommandMergeEnabled(boolean z) {
        this.experimentsManager.a.i = z;
    }

    @Deprecated
    public void setExceptionConsumer(w6d w6dVar) {
    }

    public void setExternalIdsMapper(IdsMapper<ti1, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
    }

    public void setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
    }

    public void setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
    }

    @Deprecated
    public void setFilterCallMuteStateInitForAdmins(boolean z) {
        this.experimentsManager.a.n = z;
    }

    public void setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
    }

    public void setGroupCallMediaAdaptationConfig(ss8 ss8Var) {
        this.groupCallMediaAdaptationConfig = ss8Var;
    }

    public void setHotStart(boolean z) {
        this.hotStart = z;
    }

    @Deprecated
    public void setIceTransportType(PeerConnection.IceTransportsType iceTransportsType) {
        this.experimentsManager.a.u = iceTransportsType;
    }

    @Deprecated
    public void setInCallAnalyticsUploadEnabled(boolean z) {
        this.experimentsManager.a.o = z;
    }

    public void setInternalIdsMapper(IdsMapper<ParticipantId, ti1> idsMapper) {
        this.internalIdsMapper = idsMapper;
    }

    @Deprecated
    public void setIsDirectJoinEventEnabled(boolean z) {
        this.experimentsManager.a.w = z;
    }

    public void setIsMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
    }

    public void setIsMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
    }

    @Deprecated
    public void setIsNegotiationErrorStatEnabled(boolean z) {
        this.experimentsManager.a.z = z;
    }

    @Deprecated
    public void setIsNewDiForCallEnabled(boolean z) {
        this.experimentsManager.a.B = z;
    }

    @Deprecated(forRemoval = true, since = "125.1.0.69")
    public void setIsUsingNewStatMonitorEnabled(boolean z) {
    }

    public void setIsWaitingRoomActivated(boolean z) {
        this.isWaitingRoomActivated = z;
    }

    @Deprecated
    public void setIsWebTransportEnabled(boolean z) {
        this.experimentsManager.a.C = z;
    }

    @Deprecated
    public void setLoadKwsBySdkEnabled(boolean z) {
        this.experimentsManager.a.D = z;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setLogConfiguration(z6d z6dVar) {
        this.logConfiguration = z6dVar;
    }

    public void setLogger(y6d y6dVar) {
        if (y6dVar == null) {
            this.api.e().b(jm.a);
            y6dVar = x6d.a;
        } else {
            this.api.e().b(new LoggingApiRequestDebugger(y6dVar, (rm) this.api.g().Y));
        }
        yeg yegVar = new yeg(this.tracerLiteFacade, y6dVar);
        this.log = yegVar;
        GlobalRTCLogger.setLog(yegVar);
    }

    public void setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings) {
        this.mediaConnectionSettings = mediaConnectionSettings;
    }

    public void setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
    }

    public void setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
    }

    @Deprecated
    public void setNonOpusRemovalEnabled(boolean z) {
        this.experimentsManager.a.h = z;
    }

    public void setOkApiService(OkApiService okApiService) {
        this.okApiService = okApiService;
    }

    public void setOnDemandTracksEnabled(boolean z) {
        this.onDemandTracksEnabled = z;
    }

    public void setP2PCallMediaAdaptationConfig(ss8 ss8Var) {
        this.p2pCallMediaAdaptationConfig = ss8Var;
    }

    public void setP2pStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.p2pStartConversationDelegate = startConversationDelegate;
    }

    public void setRotationProvider(btd btdVar) {
        this.rotationProvider = btdVar;
    }

    public void setRttRateHintConfig(RttRateHintConfig rttRateHintConfig) {
        this.rttRateHintConfig = rttRateHintConfig;
    }

    public void setScreenCapturePermissionProvider(h1e h1eVar) {
        this.screenCapturePermissionProvider = h1eVar;
    }

    public void setServerStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.serverStartConversationDelegate = startConversationDelegate;
    }

    public void setServerTopologySuspendBelowMinBitrate(boolean z) {
        this.serverTopologySuspendBelowMinBitrate = z;
    }

    @Deprecated
    public void setSessionIdEnabled(boolean z) {
    }

    public void setSessionRoomsEnabled(boolean z) {
        this.isSessionRoomsFeatureEnabled = z;
    }

    public void setShowLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
    }

    public void setSignalingDefaultValuesFilteringEnabled(boolean z) {
        this.isSignalingDefaultValuesFilteringEnabled = z;
    }

    @Deprecated
    public void setSkipRequestReallocEnabled(boolean z) {
        this.experimentsManager.a.A = z;
    }

    @Deprecated
    public void setStartCallByExternalIdEnabled(boolean z) {
        this.experimentsManager.a.j = z;
    }

    @Deprecated
    public void setTimeouts(ri1 ri1Var) {
        this.experimentsManager.a.f = ri1Var;
    }

    @Deprecated(forRemoval = true)
    public void setVideoCodecSwitchByNetworkStatEnabled(boolean z) {
    }

    public void setVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
    }

    @Deprecated
    public void setVideoDegradationForSoftwareCodec(boolean z, Float f, Float f2) {
        qi1 qi1Var = this.experimentsManager.a;
        qi1Var.b = z;
        if (z && f != null) {
            qi1Var.c = f.floatValue();
        }
        if (!z || f2 == null) {
            return;
        }
        qi1Var.d = f2.floatValue();
    }

    public void setVideoTracksCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Video tracks count must be positive");
        }
        this.videoTracksCount = i;
    }

    @Deprecated
    public void setVpnPreference(PeerConnection.VpnPreference vpnPreference) {
        this.experimentsManager.a.v = vpnPreference;
    }

    public void setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"NewApi"})
    public ConversationFactory(kua kuaVar, Context context, String str, String str2) {
        Clock clockSystemUTC = Clock.systemUTC();
        Objects.requireNonNull(clockSystemUTC);
        this(kuaVar, context, str, str2, new i62(22, clockSystemUTC));
    }

    public static synchronized void init(Context context, NativeLibraryLoader nativeLibraryLoader) {
        init(new ConversationFactoryInitParams.Builder(context).setPeerConnection(new ConversationFactoryInitParams.PeerConnection.Builder().setNativeLibraryLoader(nativeLibraryLoader).build()).build());
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Collection] */
    @Deprecated
    public ConversationFactory(kua kuaVar, Context context, String str, String str2, ExtLogger.TimeProvider timeProvider) {
        this.isWaitingRoomActivated = true;
        this.enableLossRttBadConnectionHandling = false;
        this.hotStart = false;
        this.log = x6d.a;
        this.logConfiguration = CallUtil.LOG_CONFIGURATION;
        this.forceRelayPolicy = false;
        this.audioLevelFrequencyMs = 250;
        this.additionalWhitelistedCodecPrefixes = Arrays.asList("OMX.MTK", "OMX.hisi");
        this.isConsumerUpdateEnabled = true;
        this.onDemandTracksEnabled = true;
        this.dataChannelScreenshareRecvEnabled = true;
        this.dataChannelScreenshareSendEnabled = true;
        this.videoTracksCount = 10;
        this.fastRecoverEnabled = true;
        this.mediaReceivingTimeoutMs = WorkRequest.MIN_BACKOFF_MILLIS;
        this.isSignalingDefaultValuesFilteringEnabled = true;
        this.rotationProvider = btd.V;
        this.appVersion = DEFAULT_APP_VERSION;
        this.isWebRTCCodecFilteringEnabled = false;
        this.audioCodecs = null;
        this.videoCodecs = null;
        this.multipleDevicesEnabled = false;
        this.showLocalVideoInOriginalQuality = false;
        this.isSessionRoomsFeatureEnabled = true;
        this.isFastScreenCaptureEnabled = false;
        this.isDeviceAudioShareEnabled = false;
        this.isAsrOnlineEnabled = false;
        qi1 qi1Var = new qi1();
        this.experiments = qi1Var;
        this.locale = null;
        this.animojiDataSupplier = kc3.b;
        this.isMediaAdaptationFeatureEnabledForP2PCall = true;
        this.isMediaAdaptationFeatureEnabledForGroupCall = true;
        this.chatStateListener = ChatStateListener.EMPTY;
        this.serverTopologySuspendBelowMinBitrate = false;
        this.isAudienceModeEnabled = false;
        this.badNetworkIndicatorConfig = ng0.e;
        CallAnalyticsSender callAnalyticsSender = CallAnalyticsSender.INSTANCE;
        this.callAnalyticsSender = callAnalyticsSender;
        ConversationAnalyticsSenderImpl conversationAnalyticsSenderImpl = new ConversationAnalyticsSenderImpl();
        this.conversationAnalyticsSender = conversationAnalyticsSenderImpl;
        this.mediaConnectionSettings = new MediaConnectionSettings();
        this.rttRateHintConfig = new RttRateHintConfig();
        this.clientCapabilities = null;
        this.analyticsSenderListener = new CallAnalyticsSender.Listener() { // from class: ru.ok.android.externcalls.sdk.ConversationFactory.1
            @Override // ru.ok.android.externcalls.analytics.CallAnalyticsSender.Listener
            public void onNewEvent(CallAnalyticsEvent callAnalyticsEvent) {
                AnalyticsEventListener.AnalyticsEvent eventListenerEvent;
                WeakReference weakReference = ConversationFactory.this.externalListener;
                AnalyticsEventListener analyticsEventListener = weakReference == null ? null : (AnalyticsEventListener) weakReference.get();
                if (analyticsEventListener == null || (eventListenerEvent = SharedAnalyticsEvent.toEventListenerEvent(callAnalyticsEvent)) == null) {
                    return;
                }
                analyticsEventListener.onAnalyticsEvent(eventListenerEvent);
            }
        };
        this.clientType = str;
        this.domainId = str2;
        this.executionTimeInterceptor = new ExecutionTimeInterceptor(null, new z8g());
        a93 a93VarG = kuaVar.g();
        a93VarG.Z = ue3.U(a93VarG.Z, this.executionTimeInterceptor);
        kua kuaVarC = a93VarG.c();
        this.api = kuaVarC;
        this.context = context;
        this.disposable = new zl3();
        z8g z8gVar = new z8g();
        this.timeProvider = z8gVar;
        final int i = 0;
        RTCLogWrapper rTCLogWrapper = new RTCLogWrapper(new cm6(this) { // from class: l64
            public final /* synthetic */ ConversationFactory b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.lambda$new$0();
                    default:
                        return this.b.lambda$new$1();
                }
            }
        });
        IdMappingWrapper idMappingWrapper = IdMappingWrapper.get(context, rTCLogWrapper);
        this.idMappingWrapper = idMappingWrapper;
        ItemToLogConverter itemToLogConverterCreate = ItemToLogConverter.create(context, !isOneLoggerDisabled, true ^ isObsoleteStatisticsDisabled, rTCLogWrapper);
        this.prodStat = new ProductStatisticsManagerImpl(z8gVar, itemToLogConverterCreate);
        this.defaultStat = new ExtLogger(context, timeProvider, itemToLogConverterCreate);
        idMappingWrapper.scheduleReadCacheFromDisk();
        this.experimentsManager = new in5(qi1Var, context);
        this.additionalWhitelistedCodecPrefixes = Collections.EMPTY_LIST;
        this.bitrates = CallUtil.createBitrates();
        this.okApiService = new OkApiService(kuaVarC.f());
        this.tracerLiteFacade = new reg(context);
        final int i2 = 1;
        new CallAnalyticsInitializer().init(callAnalyticsSender, conversationAnalyticsSenderImpl.getConfiguration(), kuaVarC, new cm6(this) { // from class: l64
            public final /* synthetic */ ConversationFactory b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.lambda$new$0();
                    default:
                        return this.b.lambda$new$1();
                }
            }
        });
    }

    public static synchronized void init(ConversationFactoryInitParams conversationFactoryInitParams) {
        if (initDone) {
            return;
        }
        ConversationFactoryInitParams.PeerConnection peerConnection = conversationFactoryInitParams.getPeerConnection();
        Context context = conversationFactoryInitParams.getContext();
        y6d logger = peerConnection.getLogger();
        Integer rttMultCapMs = peerConnection.getRttMultCapMs();
        wpb.C(context, new xpb(new ypb(peerConnection.getIsREDEnabledP2P(), peerConnection.getIsREDEnabledServer(), peerConnection.getUdpMarker(), peerConnection.getTcpMarker(), rttMultCapMs, peerConnection.getIsEarlyAudioPlayoutEnabled(), peerConnection.getIsEarlyAudioRecordingEnabled(), peerConnection.getIsOpusDREDEnabledP2p(), peerConnection.getIsOpusDREDEnabledServer(), peerConnection.getIsAudioPipelineOffOnMuteEnabled(), peerConnection.getIsSharedSocketDisabledForICE(), peerConnection.getBonusFieldTrials()), 0, logger), conversationFactoryInitParams.getPeerConnection().getLibraryLoader());
        initDone = true;
    }

    public void hangup(m07 m07Var, String str) {
        hangup(m07Var, str, null);
    }
}
