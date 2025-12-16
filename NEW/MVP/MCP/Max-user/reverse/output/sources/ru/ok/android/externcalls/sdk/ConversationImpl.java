package ru.ok.android.externcalls.sdk;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import defpackage.aa9;
import defpackage.aee;
import defpackage.ag5;
import defpackage.ah1;
import defpackage.at;
import defpackage.b7d;
import defpackage.btd;
import defpackage.bwf;
import defpackage.c91;
import defpackage.cb6;
import defpackage.cj;
import defpackage.cj1;
import defpackage.cm6;
import defpackage.cs0;
import defpackage.d12;
import defpackage.d3h;
import defpackage.d91;
import defpackage.d92;
import defpackage.de;
import defpackage.df3;
import defpackage.dj1;
import defpackage.e2f;
import defpackage.e44;
import defpackage.eg1;
import defpackage.ej;
import defpackage.eje;
import defpackage.em6;
import defpackage.f01;
import defpackage.f0f;
import defpackage.f3a;
import defpackage.f54;
import defpackage.fg1;
import defpackage.fje;
import defpackage.fo4;
import defpackage.fr1;
import defpackage.fr6;
import defpackage.g01;
import defpackage.g29;
import defpackage.g32;
import defpackage.gk0;
import defpackage.gu3;
import defpackage.gxe;
import defpackage.h1e;
import defpackage.h29;
import defpackage.h32;
import defpackage.h3a;
import defpackage.h9a;
import defpackage.hc8;
import defpackage.hcf;
import defpackage.hfd;
import defpackage.hk3;
import defpackage.hlb;
import defpackage.hqa;
import defpackage.hu3;
import defpackage.i0;
import defpackage.i01;
import defpackage.i21;
import defpackage.i3a;
import defpackage.i52;
import defpackage.i62;
import defpackage.i9a;
import defpackage.ie8;
import defpackage.j01;
import defpackage.j07;
import defpackage.j0e;
import defpackage.jkc;
import defpackage.k01;
import defpackage.k07;
import defpackage.k50;
import defpackage.kda;
import defpackage.kg0;
import defpackage.kme;
import defpackage.kob;
import defpackage.kua;
import defpackage.l07;
import defpackage.l2e;
import defpackage.l8;
import defpackage.lee;
import defpackage.li;
import defpackage.lqh;
import defpackage.m07;
import defpackage.m0f;
import defpackage.mc5;
import defpackage.mdg;
import defpackage.mjh;
import defpackage.mve;
import defpackage.mw6;
import defpackage.mze;
import defpackage.ng0;
import defpackage.nh2;
import defpackage.nz5;
import defpackage.o64;
import defpackage.o81;
import defpackage.oz5;
import defpackage.oze;
import defpackage.p64;
import defpackage.paj;
import defpackage.pk3;
import defpackage.py4;
import defpackage.pz0;
import defpackage.pze;
import defpackage.q64;
import defpackage.qf1;
import defpackage.qi1;
import defpackage.qqg;
import defpackage.qu1;
import defpackage.qze;
import defpackage.r64;
import defpackage.ra3;
import defpackage.raj;
import defpackage.ri1;
import defpackage.rve;
import defpackage.rz0;
import defpackage.s7c;
import defpackage.sdg;
import defpackage.se0;
import defpackage.sf1;
import defpackage.si1;
import defpackage.t64;
import defpackage.t7c;
import defpackage.t86;
import defpackage.t8j;
import defpackage.ti1;
import defpackage.tvd;
import defpackage.u0e;
import defpackage.u2f;
import defpackage.u61;
import defpackage.us4;
import defpackage.v06;
import defpackage.v17;
import defpackage.v32;
import defpackage.vg1;
import defpackage.vi1;
import defpackage.vk1;
import defpackage.w0a;
import defpackage.wd8;
import defpackage.wi1;
import defpackage.x71;
import defpackage.x81;
import defpackage.xh;
import defpackage.xo8;
import defpackage.xt4;
import defpackage.y6d;
import defpackage.y81;
import defpackage.y8g;
import defpackage.yi1;
import defpackage.yz0;
import defpackage.z6d;
import defpackage.zf5;
import defpackage.zh;
import defpackage.zie;
import defpackage.zl3;
import defpackage.zva;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.EglBase;
import org.webrtc.PeerConnection;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ChatHistoryEntry;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.api.ExternApiException;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.extern.ExternErrorParser;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr.internal.AsrManagerImpl;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.AsrOnlineManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.audio.KeywordSpotterManager;
import ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.audio.internal.KeywordSpotterConfigProviderImpl;
import ru.ok.android.externcalls.sdk.audio.internal.MicrophoneManagerImpl;
import ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.chat.internal.ChatManagerImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManagerImpl;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Action;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.dev.internal.DebugManagerImpl;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.HangupHint;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListenersImpl;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.internal.FeedbackManagerImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.ExternalToInternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.InternalToExternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.MediaMuteManagerImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManagerImpl;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManager;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.net.internal.NetworkConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitorImpl;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerConfigProviderImpl;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.SessionRoomsManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;
import ru.ok.android.externcalls.sdk.stat.topology.ServerTopologyRequestedStat;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.UrlSharingManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;
import ru.ok.android.externcalls.sdk.util.ConversationListenerProxy;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.video.internal.CameraManagerImpl;
import ru.ok.android.externcalls.sdk.video.internal.DisplayLayoutSenderImpl;
import ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl;
import ru.ok.android.externcalls.sdk.video.internal.VideoRenderManagerImpl;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.WatchTogetherPlayerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler;
import ru.ok.android.externcalls.sdk.wt.WTSignaling;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;
import ru.ok.android.webrtc.model.exception.ServiceUnavailableException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
class ConversationImpl implements Conversation {
    private static final float AUDIO_LEVEL_CLAMP_MAX = 10000.0f;
    private static final float AUDIO_LEVEL_MIN = 1000.0f;
    private static final String LOG_TAG = "Conversation";
    private final AddParticipantsCommands addParticipantsCommands;
    private final li animojiDataSupplier;
    private String anonToken;
    private final kua api;
    private final OkApiServiceInternal apiService;
    private final AsrListenerManagerImpl asrListenerManager;
    private final AsrManager asrManager;
    private final AsrOnlineManagerImpl asrOnlineManager;
    private final int audioLevelFrequencyMs;
    private final AudioSampleEnergyCalculator audioSampleEnergyCalculator;
    private boolean audioSampleEnergyCalculatorRegistered;
    private final k01 call;
    private CallInfo callInfo;
    private final si1 callParams;
    private final Runnable callParticipantResolutionRunnable;
    private final CameraManager cameraManager;
    private final ChatListenerManagerImpl chatListenerManager;
    private final ChatManagerImpl chatManager;
    private final ChatStateListener chatStateListener;
    private final o64 cidProvider;
    private final ClientCapabilities clientCapabilities;
    private final ContactCallManagerImpl contactCallManager;
    private final ConversationFeatureListenersImpl conversationFeatureListeners;
    private final ConversationFeatureManagerImpl conversationFeatureManager;
    private ConversationParams conversationParams;
    private final ConversationStart conversationStart;
    private final ConversationStats conversationStats;
    private final ConversationFactory creator;
    private final DebugManager debugManager;
    private final DisplayLayoutSender displayLayoutSender;
    private final zl3 disposable;
    private final MultiEventListener eventListener;
    private final ExecutionTimeInterceptor executionTimeInterceptor;
    private final ExecutorService executorService;
    private boolean expectedChat;
    private final qi1 experiments;
    private final ExternalIdsResolver externalIdsResolver;
    private final FeedbackListenerManagerImpl feedbackListenerManager;
    private final FeedbackManager feedbackManager;
    private boolean forceRelayPolicy;
    private final boolean hotStart;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean inited;
    private final String initialJoinLink;
    private ConversationParticipant initialOpponent;
    private final IdsMapper<ParticipantId, ti1> internalIdsMapper;
    private final InternalIdsResolver internalIdsResolver;
    private final boolean isAnswer;
    private final boolean isCaller;
    private boolean isConcurrent;
    private boolean isConcurrentByApi;
    private final KeywordSpotterManagerImpl keywordSpotterManager;
    private final ListenerImpl listener;
    private final ConversationListenerProxy<ListenerImpl> listenerProxy;
    private final LocalIdMappings localIdMappings;
    private final Locale locale;
    private final y6d log;
    private final z6d logConfiguration;
    private final Handler mainThreadHandler;

    /* renamed from: me, reason: collision with root package name */
    private final ConversationParticipant f172me;
    private final MediaConnectionManagerImpl mediaConnectionManager;
    private final MediaMuteListenerManagerImpl mediaMuteListenerManager;
    private final MediaMuteManagerImpl mediaMuteManager;
    private final MicrophoneManager microphoneManager;
    private final NetworkConnectionManager networkConnectionManager;
    private final NoiseSuppressionManager noiseSuppressionManager;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private final ParticipantsUpdater participantsUpdater;
    private final PeerIdGenerator peerIdGenerator;
    private final t7c preferencesHelper;
    private volatile boolean prepared;
    private final RateManagerImpl rateManager;
    private final RecordManagerImpl recordManager;
    private final RemoteSettingsImpl remoteSettings;
    private final ScreenCaptureManager screenCaptureManager;
    private final SessionRoomsManagerImpl sessionRoomManager;
    private final SessionRoomParticipantStatesHandler sessionRoomParticipantStatesHandler;
    private final SessionRoomWatchTogetherHandler sessionRoomWatchTogetherHandler;
    private oze signalingTransport;
    private final StartCallApiParams startCallApiParams;
    private final ExtLogger stat;
    private final StatMonitor statMonitor;
    private final AtomicReference<Conversation.State> state;
    private final Object stateTransitionLock = new Object();
    private final StereoRoomManagerImpl stereoRoomManager;
    private final ParticipantStore store;
    private final y8g timeProvider;
    private final sdg topologyUpgradeStatEventListener;
    private final UrlSharingListenerManagerImpl urlSharingListenerManager;
    private final UrlSharingManagerImpl urlSharingManager;
    private final String version;
    private final VideoRenderManager videoRenderManager;
    private final us4 videoRendererProvider;
    private final WaitingRoomParticipants waitingRoomParticipants;
    private volatile boolean wantsApiHangup;
    private volatile boolean wasHungUp;
    private final WatchTogetherListenerManagerImpl watchTogetherListenerManager;
    private final WatchTogetherPlayer watchTogetherPlayer;

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$1, reason: invalid class name */
    public class AnonymousClass1 extends AudioSampleEnergyCalculator {
        public AnonymousClass1(Handler handler) {
            super(handler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onSample$0() {
            if (ConversationImpl.this.listener.listener == null || ConversationImpl.this.call.o0.E(mdg.c)) {
                return;
            }
            ConversationImpl.this.updateTalkingParticipants();
        }

        @Override // ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator, defpackage.nz9
        public void onSample(int i, int i2, int i3, hlb hlbVar) {
            super.onSample(i, i2, i3, hlbVar);
            ConversationImpl.this.mainThreadHandler.post(new n(5, this));
        }
    }

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$android$webrtc$CallEvents;

        static {
            int[] iArr = new int[x71.values().length];
            $SwitchMap$ru$ok$android$webrtc$CallEvents = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[13] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[18] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[9] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[0] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[7] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[8] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[19] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[20] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[22] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[23] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[24] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[27] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[25] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[26] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[11] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[16] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[17] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[28] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[32] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[29] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[30] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[31] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[35] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[36] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[37] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[38] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[39] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[40] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[14] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[15] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[21] = 39;
            } catch (NoSuchFieldError unused39) {
            }
        }
    }

    public class ListenerImpl implements g01, f01, c91, vg1, cj1, WaitingRoomParticipants.Listener, gxe {
        private boolean callAcceptedFired;
        private boolean callAcceptedForwarded;
        private ConversationEventsListener listener;

        public ListenerImpl(ConversationEventsListener conversationEventsListener) {
            this.listener = conversationEventsListener;
        }

        private void handleHangup(k01 k01Var, Object obj) {
            this.listener.onCallEnded(ConversationImpl.this.getCallEndInfo(k01Var.K, obj));
            ConversationEventsListener conversationEventsListener = this.listener;
            xt4 xt4Var = k01Var.f1;
            conversationEventsListener.onCallEnded(new ConversationEndInfo(xt4Var.y()));
            ConversationImpl.this.conversationStats.callFinish.onCallFinished(xt4Var.y(), ConversationImpl.this.rateManager.getRateHints(), null, ConversationImpl.this.isCaller);
        }

        private void handleMuteParticipant(i9a i9aVar) {
            if (shouldNotifyLegacyListener(i9aVar)) {
                this.listener.onMuteChanged(i9aVar.a);
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteChanged(i9aVar.a);
        }

        private void handleMuteStateInitialized(i9a i9aVar) {
            boolean z = i9aVar.b;
            h9a h9aVar = i9aVar.a;
            if (!z || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                this.listener.onMuteStateInitialized(h9aVar);
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteStateInitialized(h9aVar);
        }

        private void handleRolesChanged(yi1 yi1Var) {
            o81 o81Var;
            ParticipantId participantIdConvert;
            ti1 ti1Var = yi1Var.a;
            ConversationParticipant byInternal = ti1Var != null ? ConversationImpl.this.store.getByInternal(ti1Var) : null;
            if (byInternal == null && ConversationImpl.this.experiments.j && (o81Var = yi1Var.q) != null && (participantIdConvert = CallExternalIdConverter.convert(o81Var)) != null) {
                byInternal = ConversationImpl.this.store.getParticipantById(participantIdConvert);
            }
            if (byInternal != null) {
                if (byInternal.getCallParticipant() == null) {
                    byInternal.setCallParticipant(yi1Var, ConversationImpl.this.localIdMappings);
                }
                ConversationEventsListener conversationEventsListener = this.listener;
                if (conversationEventsListener != null) {
                    conversationEventsListener.onRolesChanged(byInternal);
                }
                if ((ConversationImpl.this.f172me.getInternalId() == null || !ConversationImpl.this.f172me.getInternalId().equals(yi1Var.a)) && !(ConversationImpl.this.experiments.j && byInternal == ConversationImpl.this.f172me)) {
                    return;
                }
                ConversationImpl.this.waitingRoomParticipants.onIsMeAdminMayHaveChanged(ConversationImpl.this.isMeCreatorOrAdmin());
            }
        }

        private boolean shouldNotifyLegacyListener(i9a i9aVar) {
            if (!i9aVar.b || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                return true;
            }
            h9a h9aVar = i9aVar.a;
            AbstractMap abstractMap = h9aVar.a;
            Iterator it = h9aVar.b.iterator();
            while (it.hasNext()) {
                h29 h29Var = (h29) abstractMap.get((g29) it.next());
                if (h29Var != null && h29Var == h29.a) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.c91
        public void onCallParticipantFingerprint(yi1 yi1Var, long j) {
            yi1 yi1Var2;
            ConversationEventsListener conversationEventsListener;
            if (ConversationImpl.this.call.k0.i().size() == 1) {
                dj1 dj1Var = ConversationImpl.this.call.k0;
                int iQ = dj1Var.q();
                if (iQ == 0) {
                    yi1Var2 = null;
                } else {
                    if (iQ != 1) {
                        throw new RuntimeException("group call");
                    }
                    yi1Var2 = (yi1) dj1Var.i().iterator().next();
                }
                if (yi1Var2 != yi1Var || (conversationEventsListener = this.listener) == null) {
                    return;
                }
                conversationEventsListener.onOpponentFingerprintChanged(j);
            }
        }

        @Override // defpackage.vg1
        public void onCallParticipantNetworkStatusChanged(List<yi1> list) {
            ConversationParticipant byInternal;
            ArrayList arrayList = new ArrayList();
            for (yi1 yi1Var : list) {
                ti1 ti1Var = yi1Var.a;
                if (ti1Var != null && (byInternal = ConversationImpl.this.store.getByInternal(ti1Var)) != null) {
                    if (byInternal.getCallParticipant() == null) {
                        byInternal.setCallParticipant(yi1Var, ConversationImpl.this.localIdMappings);
                    }
                    if (ConversationImpl.this.store.getParticipantRoomId(byInternal) == ConversationImpl.this.store.getActiveRoomId()) {
                        arrayList.add(byInternal);
                    }
                }
            }
            if (this.listener == null || arrayList.isEmpty()) {
                return;
            }
            this.listener.onCallParticipantsNetworkStatusChanged(arrayList);
        }

        @Override // defpackage.f01
        public void onCustomData(ti1 ti1Var, JSONObject jSONObject) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onCustomData(jSONObject);
            }
        }

        @Override // defpackage.g01
        public void onEvent(k01 k01Var, x71 x71Var, Object obj) {
            ConversationImpl.this.log.log(ConversationImpl.LOG_TAG, "EVENT: " + x71Var);
            if (this.listener != null) {
                switch (x71Var.ordinal()) {
                    case 0:
                        ConversationImpl.this.mediaConnectionManager.onIceConnected();
                        ConversationImpl.this.conversationStats.reconnectStat.onConnected();
                        this.listener.onConnected();
                        if (!ConversationImpl.this.audioSampleEnergyCalculatorRegistered) {
                            ConversationImpl.this.audioSampleEnergyCalculatorRegistered = true;
                            k01Var.D(ConversationImpl.this.audioLevelFrequencyMs, ConversationImpl.this.audioSampleEnergyCalculator);
                            break;
                        }
                        break;
                    case 1:
                        ConversationImpl.this.mediaConnectionManager.onIceDisconnected();
                        ConversationImpl.this.conversationStats.reconnectStat.onDisconnected();
                        this.listener.onDisconnected();
                        break;
                    case 2:
                    case 13:
                        handleHangup(k01Var, obj);
                        break;
                    case 3:
                        this.listener.onCallEnded(new ConversationEventsListener.CallEndInfo(m07.o, Collections.EMPTY_SET, null));
                        k01Var.f1.D(ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE);
                        this.listener.onCallEnded(new ConversationEndInfo(k01Var.f1.y()));
                        break;
                    case 4:
                        this.listener.onLocalMediaChanged();
                        break;
                    case 5:
                        this.listener.onOpponentMediaChanged();
                        break;
                    case 6:
                        this.listener.onCameraChanged();
                        break;
                    case 7:
                        this.listener.onDestroyed(ConversationImpl.this.getDestroyReason());
                        this.listener.onDestroyed(new ConversationDestroyedInfo(k01Var.f1.y()));
                        ConversationImpl.this.idMappingWrapper.scheduleWriteCacheToDisk();
                        ConversationImpl.this.conversationStats.callFinish.onCallFinished(k01Var.f1.y(), ConversationImpl.this.rateManager.getRateHints(), null, ConversationImpl.this.isCaller);
                        break;
                    case 8:
                        ConversationImpl.this.resetSignaling();
                        break;
                    case 9:
                        if (!this.callAcceptedForwarded && (!ConversationImpl.this.isCaller || this.callAcceptedFired)) {
                            this.listener.onCallAccepted();
                            this.callAcceptedForwarded = true;
                        }
                        this.callAcceptedFired = true;
                        this.listener.onCallAcceptedForAll();
                        break;
                    case 10:
                        this.listener.onOpponentRegistered();
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        this.listener.onCameraBusy();
                        break;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        if (obj instanceof x81) {
                            ConversationImpl.this.conversationFeatureListeners.onFeatureSetChanged((x81) obj);
                            break;
                        }
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        if (obj instanceof y81) {
                            ConversationImpl.this.conversationFeatureListeners.onFeaturesPerRoleChanged((y81) obj);
                            break;
                        }
                        break;
                    case 16:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatCreated(((Long) obj).longValue());
                            break;
                        }
                        break;
                    case LangUtils.HASH_SEED /* 17 */:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatUpdated(((Long) obj).longValue());
                            break;
                        }
                        break;
                    case 18:
                        this.listener.onMicrophoneForciblyMuted();
                        break;
                    case 19:
                        k01Var.F(true);
                        this.listener.onMicChanged(true);
                        break;
                    case 20:
                        k01Var.F(false);
                        this.listener.onMicChanged(false);
                        break;
                    case 21:
                        if (obj instanceof SignalingErrors$CallIsUnfeasibleError) {
                            this.listener.onCallIsUnfeasibleError((SignalingErrors$CallIsUnfeasibleError) obj);
                            break;
                        }
                        break;
                    case 22:
                        this.listener.onCallSignalingConnected();
                        break;
                    case 23:
                        if (obj instanceof yi1) {
                            handleRolesChanged((yi1) obj);
                            break;
                        }
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        if (obj instanceof Set) {
                            Iterator it = ((Set) obj).iterator();
                            while (it.hasNext()) {
                                handleRolesChanged((yi1) it.next());
                            }
                            break;
                        }
                        break;
                    case 25:
                    case 26:
                        ti1 ti1Var = obj instanceof ti1 ? (ti1) obj : null;
                        this.listener.onPinChanged(ti1Var != null ? ConversationImpl.this.store.getByInternal(ti1Var) : null, x71Var == x71.I0);
                        break;
                    case 27:
                        if (obj instanceof i9a) {
                            handleMuteParticipant((i9a) obj);
                            break;
                        }
                        break;
                    case 28:
                        this.listener.onAnonJoinForbiddenChanged(ConversationImpl.this.isAnonJoinForbidden());
                        break;
                    case 29:
                        this.listener.onRecurringChanged(ConversationImpl.this.isRecurring());
                        break;
                    case 30:
                        ConversationImpl.this.feedbackListenerManager.onFeedbackEnabledChanged(ConversationImpl.this.isFeedbackEnabled());
                        break;
                    case 31:
                        ConversationImpl.this.asrOnlineManager.onAsrAvailableChanged(k01Var.t.contains(i01.X));
                        break;
                    case 32:
                        ConversationImpl.this.waitingRoomParticipants.onWaitingRoomEnabled(ConversationImpl.this.isWaitingRoomEnabled());
                        this.listener.onWaitingRoomEnabledChanged(ConversationImpl.this.isWaitingRoomEnabled());
                        break;
                    case 35:
                        if (obj instanceof i9a) {
                            handleMuteStateInitialized((i9a) obj);
                            break;
                        }
                        break;
                    case 36:
                        this.listener.onMigratedToServerTopology();
                        ConversationImpl.this.asrOnlineManager.onMigratedToServerCallTopology();
                        break;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        if (obj instanceof String) {
                            this.listener.onJoinLinkUpdated((String) obj);
                            break;
                        }
                        break;
                    case 38:
                        if (obj instanceof f3a) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStarted((f3a) obj);
                            break;
                        }
                        break;
                    case 39:
                        if (obj instanceof h3a) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStatesUpdatedChanged((h3a) obj);
                            break;
                        }
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        if (obj instanceof i3a) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStopped((i3a) obj);
                            break;
                        }
                        break;
                }
            }
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onMeInWaitingRoomChanged(boolean z) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onMeInWaitingRoomChanged(z);
            }
        }

        @Override // defpackage.gxe
        public void onRateCall(JSONObject jSONObject) {
            RateCallData rateCallData;
            ConversationParams conversationParams = ConversationImpl.this.conversationParams;
            if (conversationParams == null || (rateCallData = conversationParams.rateCallData) == null) {
                return;
            }
            this.listener.onRateCall(rateCallData);
        }

        @Override // defpackage.cj1
        public void onStateChanged(ti1 ti1Var, vi1 vi1Var) {
            if (this.listener != null) {
                ConversationParticipant byInternal = ConversationImpl.this.store.getByInternal(ti1Var);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(ti1Var, ConversationImpl.this.idMappingWrapper);
                }
                this.listener.onStateChanged(byInternal, vi1Var);
                ConversationImpl.this.participantStatesManager.onStateChanged(ti1Var, vi1Var);
            }
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }

        public void release() {
            this.listener = null;
        }
    }

    public ConversationImpl(ConversationBuilder conversationBuilder) {
        ListenerImpl listenerImpl;
        ParticipantStore participantStore;
        qi1 qi1Var;
        StatMonitorImpl statMonitorImpl;
        ConversationEventsListener conversationEventsListener;
        y8g y8gVar;
        IdMappingWrapper idMappingWrapper;
        ConversationParticipant conversationParticipant;
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        LocalIdMappings localIdMappings = new LocalIdMappings();
        this.localIdMappings = localIdMappings;
        this.peerIdGenerator = new PeerIdGenerator();
        this.callParticipantResolutionRunnable = new n(3, this);
        this.audioSampleEnergyCalculatorRegistered = false;
        AtomicReference<Conversation.State> atomicReference = new AtomicReference<>(Conversation.State.None);
        this.state = atomicReference;
        this.creator = conversationBuilder.creator;
        this.api = conversationBuilder.api;
        this.executorService = conversationBuilder.executorService;
        this.version = conversationBuilder.version;
        boolean z = conversationBuilder.isCaller;
        this.isCaller = z;
        this.isAnswer = conversationBuilder.isAnswer;
        String str = conversationBuilder.cid;
        str = str == null ? "" : str;
        p64 p64Var = new p64();
        p64Var.a = str;
        this.cidProvider = p64Var;
        this.hotStart = conversationBuilder.hotStart;
        this.forceRelayPolicy = conversationBuilder.forceRelayPolicy;
        this.disposable = new zl3();
        ExtLogger extLogger = conversationBuilder.stat;
        this.stat = extLogger;
        t7c t7cVar = new t7c(conversationBuilder.context);
        this.preferencesHelper = t7cVar;
        y6d y6dVar = conversationBuilder.log;
        this.log = y6dVar;
        z6d z6dVar = conversationBuilder.logConfiguration;
        this.logConfiguration = z6dVar;
        IdMappingWrapper idMappingWrapper2 = conversationBuilder.idMappingWrapper;
        this.idMappingWrapper = idMappingWrapper2;
        this.initialJoinLink = conversationBuilder.joinLink;
        this.anonToken = conversationBuilder.anonToken;
        StatMonitorImpl statMonitorImpl2 = new StatMonitorImpl(y6dVar);
        this.statMonitor = statMonitorImpl2;
        ConversationParticipant conversationParticipant2 = conversationBuilder.f171me;
        this.f172me = conversationParticipant2;
        conversationParticipant2.setReported(true);
        ParticipantStore participantStore2 = new ParticipantStore(conversationParticipant2, localIdMappings);
        this.store = participantStore2;
        this.audioLevelFrequencyMs = conversationBuilder.audioLevelFrequencyMs;
        si1 si1VarCreateCallParams = CallUtil.createCallParams(conversationBuilder);
        this.callParams = si1VarCreateCallParams;
        qi1 qi1Var2 = si1VarCreateCallParams.z;
        qi1 qi1Var3 = si1VarCreateCallParams.z;
        this.experiments = qi1Var2;
        StartCallApiParams startCallApiParamsCreateStartCallApiParams = createStartCallApiParams(conversationBuilder);
        this.startCallApiParams = startCallApiParamsCreateStartCallApiParams;
        li liVar = conversationBuilder.animojiRenderProvider;
        this.animojiDataSupplier = liVar;
        yi1 yi1Var = new yi1(conversationParticipant2.getInternalId(), null, null, null);
        conversationParticipant2.setCallParticipant(yi1Var, localIdMappings);
        ConversationParticipant conversationParticipant3 = conversationBuilder.initialOpponent;
        ConversationParticipant conversationParticipant4 = (conversationParticipant3 == null || Objects.equals(conversationParticipant3.getExternalId(), conversationParticipant2.getExternalId())) ? null : conversationBuilder.initialOpponent;
        this.initialOpponent = conversationParticipant4;
        if (conversationParticipant4 != null) {
            participantStore2.addToActiveSessionRoom(conversationParticipant4);
            this.initialOpponent.setReported(true);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        ConversationEventsListener conversationEventsListener2 = conversationBuilder.eventListener;
        if (conversationEventsListener2 != null) {
            copyOnWriteArraySet.add(conversationEventsListener2);
        }
        MultiEventListener multiEventListener = new MultiEventListener(copyOnWriteArraySet);
        this.eventListener = multiEventListener;
        ListenerImpl listenerImpl2 = new ListenerImpl(multiEventListener);
        this.listener = listenerImpl2;
        ConversationListenerProxy<ListenerImpl> conversationListenerProxy = new ConversationListenerProxy<>(listenerImpl2);
        this.listenerProxy = conversationListenerProxy;
        y8g y8gVar2 = conversationBuilder.timeProvider;
        this.timeProvider = y8gVar2;
        this.clientCapabilities = conversationBuilder.clientCapabilities;
        boolean z2 = this.initialOpponent != null;
        boolean zIsVideo = startCallApiParamsCreateStartCallApiParams.getIsVideo();
        boolean z3 = this.forceRelayPolicy;
        ClientCapabilities clientCapabilities = conversationBuilder.clientCapabilities;
        d91 d91Var = new d91(z2, zIsVideo, z3, clientCapabilities != null && clientCapabilities.has(ClientCapabilities.Capability.SESSION_STATE_UPDATES));
        if (qi1Var2.B) {
            Context context = conversationBuilder.context;
            boolean z4 = conversationBuilder.isJoined;
            hqa i52Var = conversationBuilder.cameraCapturerFactory;
            i52Var = i52Var == null ? new i52(y6dVar) : i52Var;
            btd btdVar = conversationBuilder.rotationProvider;
            CallAnalyticsSender callAnalyticsSender = conversationBuilder.analyticsSender;
            h1e h1eVar = conversationBuilder.screenCapturePermissionProvider;
            listenerImpl = listenerImpl2;
            qi1Var = qi1Var2;
            statMonitorImpl = statMonitorImpl2;
            idMappingWrapper = idMappingWrapper2;
            conversationParticipant = conversationParticipant2;
            fg1 fg1Var = new fg1(context, si1VarCreateCallParams, z, z4, yi1Var, p64Var, extLogger, y6dVar, z6dVar, i52Var, btdVar, liVar, y8gVar2, callAnalyticsSender, t7cVar, h1eVar, d91Var);
            conversationEventsListener = multiEventListener;
            bwf bwfVar = new bwf(l8.c);
            cs0 cs0Var = new cs0();
            boolean z5 = si1VarCreateCallParams.i;
            mc5 mc5Var = new mc5(6, y6dVar);
            ng0 ng0Var = si1VarCreateCallParams.y;
            participantStore = participantStore2;
            kg0 kg0Var = new kg0(ng0Var.a != null, ng0Var.c.a);
            v32 v32Var = new v32(2, y6dVar);
            hc8 hc8Var = new hc8(fg1Var.i, y6dVar, y8gVar2, 16);
            fr1 fr1Var = (fr1) fg1Var.m.b.getValue();
            mw6 mw6Var = new mw6(si1VarCreateCallParams, y6dVar, extLogger, fg1Var.h.a);
            jkc jkcVar = new jkc(y6dVar, extLogger);
            EglBase eglBase = fg1Var.n;
            ah1 ah1Var = new ah1(y6dVar, eglBase.getEglBaseContext(), EglBase.CONFIG_PLAIN, null);
            lqh lqhVar = new lqh("pc_created", y6dVar);
            lqh lqhVar2 = new lqh("accepted", y6dVar);
            mve mveVar = new mve();
            rve rveVar = fg1Var.r;
            mveVar.a = rveVar;
            f54 f54Var = fg1Var.t;
            mveVar.b = f54Var;
            mveVar.i = Integer.valueOf(qi1Var3.e);
            mveVar.c = yi1Var.c;
            mveVar.d = context;
            mveVar.e = y6dVar;
            mveVar.j = true;
            mveVar.k = eglBase.getEglBaseContext();
            mveVar.f = si1VarCreateCallParams;
            mveVar.g = new eg1(fg1Var);
            mveVar.l = fg1Var.s;
            mveVar.n = btdVar;
            mveVar.m = y8gVar2;
            mveVar.o = new eg1(fg1Var);
            boolean z6 = si1VarCreateCallParams.f;
            bwf bwfVar2 = new bwf(new se0(fg1Var, 5));
            v17 v17Var = new v17(29, (byte) 0);
            ra3 ra3Var = new ra3();
            ra3Var.a = fg1Var.r;
            ra3Var.b = y6dVar;
            ra3Var.c = fg1Var.j;
            ra3Var.d = liVar;
            ra3Var.e = yi1Var.c;
            ra3Var.f = fg1Var.n;
            dj1 dj1Var = fg1Var.h;
            xo8 xo8Var = fg1Var.g;
            sf1 sf1Var = fg1Var.u;
            qf1 qf1Var = fg1Var.f;
            cb6 cb6Var = new cb6(y6dVar, dj1Var, xo8Var, sf1Var, qf1Var, y8gVar2);
            f0f f0fVar = fg1Var.v;
            t86 t86Var = new t86(dj1Var, f0fVar, qf1Var, y6dVar, si1VarCreateCallParams);
            hfd hfdVar = new hfd(qf1Var);
            bwf bwfVar3 = new bwf(new se0(fg1Var, 3));
            bwf bwfVar4 = new bwf(new se0(fg1Var, 0));
            bwf bwfVar5 = new bwf(new se0(fg1Var, 4));
            v06 v06Var = fg1Var.w;
            k01 k01Var = new k01(context, y8gVar2, fg1Var.f, fg1Var.g, fg1Var.h, si1VarCreateCallParams, bwfVar, z, z4, yi1Var.c, cs0Var, p64Var, extLogger, y6dVar, t7cVar, z5, fg1Var.j, mc5Var, kg0Var, v32Var, hc8Var, fr1Var, fg1Var.k, fg1Var.l, mw6Var, jkcVar, eglBase, ah1Var, fg1Var.o, fg1Var.p, lqhVar, lqhVar2, fg1Var.q, rveVar, fg1Var.s, f54Var, mveVar, z6, bwfVar2, v17Var, ra3Var, liVar, sf1Var, f0fVar, cb6Var, t86Var, hfdVar, bwfVar3, bwfVar4, bwfVar5, v06Var.b, v06Var.c, h1eVar, new fo4(y6dVar, new se0(fg1Var, 2)), new xt4(7, y6dVar), Camera.getNumberOfCameras(), d91Var);
            p64Var = p64Var;
            extLogger = extLogger;
            y6dVar = y6dVar;
            y8gVar = y8gVar2;
            this.call = k01Var;
        } else {
            listenerImpl = listenerImpl2;
            participantStore = participantStore2;
            qi1Var = qi1Var2;
            statMonitorImpl = statMonitorImpl2;
            conversationEventsListener = multiEventListener;
            y8gVar = y8gVar2;
            idMappingWrapper = idMappingWrapper2;
            conversationParticipant = conversationParticipant2;
            Context context2 = conversationBuilder.context;
            boolean z7 = conversationBuilder.isJoined;
            hqa hqaVar = conversationBuilder.cameraCapturerFactory;
            this.call = new k01(context2, si1VarCreateCallParams, z, z7, yi1Var, p64Var, extLogger, y6dVar, z6dVar, hqaVar == null ? new i52(y6dVar) : hqaVar, conversationBuilder.rotationProvider, liVar, y8gVar, conversationBuilder.analyticsSender, t7cVar, conversationBuilder.screenCapturePermissionProvider, d91Var);
        }
        k01 k01Var2 = this.call;
        Objects.requireNonNull(k01Var2);
        int i = 12;
        ApiStats apiStats = new ApiStats(new rz0(k01Var2, i));
        this.call.G.add(conversationListenerProxy);
        ExecutionTimeInterceptor executionTimeInterceptor = conversationBuilder.executionTimeInterceptor;
        this.executionTimeInterceptor = executionTimeInterceptor;
        executionTimeInterceptor.setApiStats(apiStats);
        tvd tvdVarF = conversationBuilder.api.f();
        OkApiService okApiService = conversationBuilder.okApiService;
        k01 k01Var3 = this.call;
        Objects.requireNonNull(k01Var3);
        y6d y6dVar2 = y6dVar;
        OkApiServiceInternal okApiServiceInternal = new OkApiServiceInternal(tvdVarF, okApiService, new ApiStats(new rz0(k01Var3, i)), y6dVar2, y8gVar);
        this.apiService = okApiServiceInternal;
        this.screenCaptureManager = new ScreenCaptureManagerImpl(this.call);
        this.cameraManager = new CameraManagerImpl(this.call, new a(this, 5), new a(this, 6));
        ParticipantStore participantStore3 = participantStore;
        VideoRenderManagerImpl videoRenderManagerImpl = new VideoRenderManagerImpl(new t64(atomicReference, 0), this.call, new ConversationRenderers(), participantStore3);
        this.videoRendererProvider = videoRenderManagerImpl;
        this.videoRenderManager = videoRenderManagerImpl;
        this.microphoneManager = new MicrophoneManagerImpl(this.call, new a(this, 7));
        this.noiseSuppressionManager = new NoiseSuppressionManagerImpl(this.call);
        NetworkConnectionManagerImpl networkConnectionManagerImpl = new NetworkConnectionManagerImpl(this.call);
        this.networkConnectionManager = networkConnectionManagerImpl;
        SignalingProvider signalingProviderCreateSignalingProvider = createSignalingProvider();
        ExtLogger extLogger2 = extLogger;
        p64 p64Var2 = p64Var;
        this.debugManager = new DebugManagerImpl(this.call, extLogger2, p64Var2, y6dVar2, signalingProviderCreateSignalingProvider);
        ParticipantStatesManagerImpl participantStatesManagerImplCreateParticipantStatesManager = createParticipantStatesManager(participantStore3, new ParticipantStateChanger(signalingProviderCreateSignalingProvider), conversationEventsListener);
        this.participantStatesManager = participantStatesManagerImplCreateParticipantStatesManager;
        IdMappingResolver idMappingResolverCreateIdMappingResolver = createIdMappingResolver();
        IdMappingWrapper idMappingWrapper3 = idMappingWrapper;
        this.waitingRoomParticipants = createWaitingRoomParticipants(idMappingWrapper3, idMappingResolverCreateIdMappingResolver, listenerImpl);
        this.stereoRoomManager = createStereoRoomManager(signalingProviderCreateSignalingProvider, idMappingResolverCreateIdMappingResolver);
        IdsMapper<ParticipantId, ti1> externalToInternalIdsMapper = conversationBuilder.internalIdsMapper;
        externalToInternalIdsMapper = externalToInternalIdsMapper == null ? new ExternalToInternalIdsMapper(okApiServiceInternal, conversationBuilder.log) : externalToInternalIdsMapper;
        this.internalIdsMapper = externalToInternalIdsMapper;
        this.internalIdsResolver = createInternalIdsResolver(participantStore3, idMappingWrapper3, externalToInternalIdsMapper);
        this.externalIdsResolver = createExternalIdsResolver(participantStore3, idMappingWrapper3, conversationBuilder.externalIdsMapper);
        this.addParticipantsCommands = new AddParticipantsCommands(signalingProviderCreateSignalingProvider, this.call, idMappingWrapper3, new t64(atomicReference, 0));
        WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl = new WatchTogetherListenerManagerImpl(participantStore3);
        this.watchTogetherListenerManager = watchTogetherListenerManagerImpl;
        SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl = new SessionRoomListenerManagerImpl(participantStore3);
        WatchTogetherPlayer watchTogetherPlayerCreateWatchTogetherPlayer = createWatchTogetherPlayer(watchTogetherListenerManagerImpl, signalingProviderCreateSignalingProvider);
        this.watchTogetherPlayer = watchTogetherPlayerCreateWatchTogetherPlayer;
        FeedbackListenerManagerImpl feedbackListenerManagerImpl = new FeedbackListenerManagerImpl(this, participantStore3, idMappingResolverCreateIdMappingResolver, idMappingWrapper3);
        this.feedbackListenerManager = feedbackListenerManagerImpl;
        this.feedbackManager = createFeedbackManager(feedbackListenerManagerImpl, signalingProviderCreateSignalingProvider);
        AsrListenerManagerImpl asrListenerManagerImpl = new AsrListenerManagerImpl(participantStore3);
        this.asrListenerManager = asrListenerManagerImpl;
        this.asrManager = createAsrManager(asrListenerManagerImpl, participantStore3, signalingProviderCreateSignalingProvider);
        this.contactCallManager = new ContactCallManagerImpl(participantStore3, conversationBuilder.answerAsContact);
        this.asrOnlineManager = createAsrOnlineManager(participantStore3);
        this.chatStateListener = conversationBuilder.chatStateListener;
        this.conversationFeatureListeners = createConversationFeatureListeners();
        this.conversationFeatureManager = createFeatureManager(signalingProviderCreateSignalingProvider);
        this.sessionRoomManager = createSessionRoomManager(sessionRoomListenerManagerImpl, participantStatesManagerImplCreateParticipantStatesManager, idMappingResolverCreateIdMappingResolver, signalingProviderCreateSignalingProvider);
        this.participantsUpdater = createParticipantsUpdater(participantStatesManagerImplCreateParticipantStatesManager);
        this.recordManager = createRecordManager(idMappingResolverCreateIdMappingResolver, idMappingWrapper3, signalingProviderCreateSignalingProvider);
        this.locale = conversationBuilder.locale;
        this.sessionRoomWatchTogetherHandler = new SessionRoomWatchTogetherHandler(participantStore3, watchTogetherPlayerCreateWatchTogetherPlayer);
        this.sessionRoomParticipantStatesHandler = createParticipantStatesHandler(participantStatesManagerImplCreateParticipantStatesManager);
        ConversationStats conversationStatsCreateConversationStats = createConversationStats();
        this.conversationStats = conversationStatsCreateConversationStats;
        this.urlSharingListenerManager = createUrlSharingListenerManager();
        this.urlSharingManager = createUrlSharingManager();
        ChatListenerManagerImpl chatListenerManagerImplCreateChatListenerManager = createChatListenerManager(participantStore3);
        this.chatListenerManager = chatListenerManagerImplCreateChatListenerManager;
        this.chatManager = createChatManager(participantStore3, chatListenerManagerImplCreateChatListenerManager);
        MediaMuteListenerManagerImpl mediaMuteListenerManagerImplCreateMediaMuteListenerManager = createMediaMuteListenerManager();
        this.mediaMuteListenerManager = mediaMuteListenerManagerImplCreateMediaMuteListenerManager;
        this.mediaMuteManager = createMediaMuteManager(signalingProviderCreateSignalingProvider, mediaMuteListenerManagerImplCreateMediaMuteListenerManager);
        this.displayLayoutSender = new DisplayLayoutSenderImpl(new d92(16, participantStore3), new q(this, 1));
        this.conversationStart = new ConversationStart(okApiServiceInternal, conversationBuilder.api.d(), conversationBuilder.api.c(), conversationBuilder.startConversationDelegate, p64Var2, qi1Var.j, participantStore3, conversationParticipant);
        this.audioSampleEnergyCalculator = new AnonymousClass1(handler);
        MediaConnectionManagerImpl mediaConnectionManagerImpl = new MediaConnectionManagerImpl(conversationBuilder.log, new a(this, 4), conversationBuilder.mediaConnectionSettings);
        this.mediaConnectionManager = mediaConnectionManagerImpl;
        networkConnectionManagerImpl.plusAssign(mediaConnectionManagerImpl);
        RemoteSettingsImpl remoteSettingsImpl = new RemoteSettingsImpl(okApiServiceInternal, y6dVar2);
        this.remoteSettings = remoteSettingsImpl;
        this.keywordSpotterManager = new KeywordSpotterManagerImpl(this.call, conversationStatsCreateConversationStats.kwsStat, new KeywordSpotterConfigProviderImpl(remoteSettingsImpl, y6dVar2), y8gVar, y6dVar2);
        RateManagerConfigProviderImpl rateManagerConfigProviderImpl = new RateManagerConfigProviderImpl(remoteSettingsImpl, y6dVar2);
        k01 k01Var4 = this.call;
        Objects.requireNonNull(k01Var4);
        this.rateManager = new RateManagerImpl(y6dVar2, rateManagerConfigProviderImpl, new rz0(k01Var4, 14), statMonitorImpl);
        final ServerTopologyRequestedStat serverTopologyRequestedStat = conversationStatsCreateConversationStats.serverTopologyRequestedStat;
        Objects.requireNonNull(serverTopologyRequestedStat);
        this.topologyUpgradeStatEventListener = new sdg() { // from class: s64
            @Override // defpackage.sdg
            public final void a(odg odgVar) {
                serverTopologyRequestedStat.onServerTopologyRequested(odgVar);
            }
        };
        conversationStatsCreateConversationStats.callInitStat.onCallInitialized();
        if (qi1Var3.D) {
            createMLFeatureManager(conversationBuilder.context).start();
        }
    }

    private void assertInited() {
        if (!this.inited) {
            throw new IllegalStateException("Conversation not initialized");
        }
        if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private void assertPrepared() {
        if (!this.prepared) {
            throw new IllegalStateException("Conversation not ready");
        }
        if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private String configureSignalingCapabilities(ConversationParticipant conversationParticipant) {
        ClientCapabilities clientCapabilities = this.clientCapabilities;
        if (clientCapabilities == null) {
            clientCapabilities = new ClientCapabilities(ClientCapabilities.Capability.SCREEN_TRACK_PRODUCER, ClientCapabilities.Capability.SCREEN_TRACK_CONSUMER, ClientCapabilities.Capability.ADMIN_MUTE_NOTIFY, ClientCapabilities.Capability.WATCH_MOVIE, ClientCapabilities.Capability.CALL_TO_CONTACTS, ClientCapabilities.Capability.ADD_PARTICIPANT);
        }
        ClientCapabilities clientCapabilities2 = clientCapabilities.set(ClientCapabilities.Capability.VIDEO_TRACKS, this.callParams.j > 0).set(ClientCapabilities.Capability.WAITING_HALL, this.callParams.l).set(ClientCapabilities.Capability.FILTER_DEFAULTS, this.callParams.m).set(ClientCapabilities.Capability.SESSION_ROOMS, this.callParams.r);
        ClientCapabilities.Capability capability = ClientCapabilities.Capability.VMOJI;
        this.animojiDataSupplier.getClass();
        ClientCapabilities clientCapabilities3 = clientCapabilities2.set(capability, false).set(ClientCapabilities.Capability.AUDIENCE_MODE, this.callParams.u);
        conversationParticipant.setCapabilities(clientCapabilities3);
        return Integer.toHexString(clientCapabilities3.getValue());
    }

    private AsrManager createAsrManager(AsrListenerManager asrListenerManager, ParticipantStore participantStore, SignalingProvider signalingProvider) {
        return new AsrManagerImpl(new AsrCommandsExecutorImpl(signalingProvider, participantStore), asrListenerManager);
    }

    private AsrOnlineManagerImpl createAsrOnlineManager(ParticipantStore participantStore) {
        return new AsrOnlineManagerImpl(new AsrOnlineCommandsExecutorImpl(new a(this, 2), createSignalingProvider()), new AsrOnlineListenerManagerImpl(participantStore), new a(this, 3));
    }

    private ChatListenerManagerImpl createChatListenerManager(ParticipantStore participantStore) {
        return new ChatListenerManagerImpl(participantStore);
    }

    private ChatManagerImpl createChatManager(ParticipantStore participantStore, ChatListenerManagerImpl chatListenerManagerImpl) {
        return new ChatManagerImpl(new ChatCommandExecutorImpl(createSignalingProvider(), participantStore), chatListenerManagerImpl);
    }

    private ConversationFeatureListenersImpl createConversationFeatureListeners() {
        return new ConversationFeatureListenersImpl();
    }

    private Prepare createConversationPrepare(ConversationParams conversationParams) {
        return new Prepare(this.apiService, this.cidProvider, conversationParams, this.internalIdsResolver, this.externalIdsResolver, this.startCallApiParams, this.peerIdGenerator, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.callParams, this.conversationStart.isFastStartEnabled());
    }

    private ConversationStats createConversationStats() {
        k01 k01Var = this.call;
        Objects.requireNonNull(k01Var);
        return new ConversationStats(new rz0(k01Var, 12), this.stat, this.cidProvider, getCallType(), this.timeProvider, this.anonToken != null);
    }

    private ExternalIdsResolver createExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, IdsMapper<ti1, ParticipantId> idsMapper) {
        MultiEventListener multiEventListener = this.eventListener;
        Objects.requireNonNull(multiEventListener);
        i62 i62Var = new i62(25, multiEventListener);
        df3 df3Var = new df3(13);
        LocalIdMappings localIdMappings = this.localIdMappings;
        if (idsMapper == null) {
            idsMapper = new InternalToExternalIdsMapper(this.apiService, this.log);
        }
        return new ExternalIdsResolver(participantStore, idMappingWrapper, i62Var, df3Var, localIdMappings, idsMapper);
    }

    private ConversationFeatureManagerImpl createFeatureManager(SignalingProvider signalingProvider) {
        return new ConversationFeatureManagerImpl(new ConversationFeatureCommandExecutorImpl(signalingProvider), this.conversationFeatureListeners);
    }

    private FeedbackManager createFeedbackManager(FeedbackListenerManager feedbackListenerManager, SignalingProvider signalingProvider) {
        return new FeedbackManagerImpl(new FeedbackCommandsExecutorImpl(signalingProvider), feedbackListenerManager);
    }

    private IdMappingResolver createIdMappingResolver() {
        return new IdMappingResolver() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.5
            @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
            public void resolveExternalsByInternalsIds(List<ti1> list, Runnable runnable, Runnable runnable2) {
                ConversationImpl.this.resolveExternalsByInternalsIds(list, runnable, runnable2);
            }

            @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
            public void withInternalId(ParticipantId participantId, hu3 hu3Var, Runnable runnable) {
                ConversationImpl.this.withInternalId(participantId, hu3Var, runnable);
            }
        };
    }

    private InternalIdsResolver createInternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, IdsMapper<ParticipantId, ti1> idsMapper) {
        return new InternalIdsResolver(participantStore, idMappingWrapper, new df3(12), this.localIdMappings, idsMapper);
    }

    private MLFeaturesManager createMLFeatureManager(Context context) {
        y6d y6dVar = this.log;
        s7c s7cVar = new s7c();
        s7cVar.a = y6dVar;
        s7cVar.b = context.getSharedPreferences("ml_features", 0);
        return new MLFeaturesManagerImpl(s7cVar, new DownloadService.Impl(this.log), context, this.keywordSpotterManager, this.log, this.remoteSettings, this.conversationStats);
    }

    private MediaMuteListenerManagerImpl createMediaMuteListenerManager() {
        return new MediaMuteListenerManagerImpl();
    }

    private MediaMuteManagerImpl createMediaMuteManager(SignalingProvider signalingProvider, MediaMuteListenerManager mediaMuteListenerManager) {
        a aVar = new a(this, 1);
        q qVar = new q(this, 0);
        ParticipantStore participantStore = this.store;
        Objects.requireNonNull(participantStore);
        return new MediaMuteManagerImpl(new MediaMuteCommandExecutorImpl(signalingProvider, aVar, qVar, new e44(3, participantStore)), mediaMuteListenerManager);
    }

    private SessionRoomParticipantStatesHandler createParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        return new SessionRoomParticipantStatesHandler(participantStatesManagerImpl, new a(this, 0));
    }

    private ParticipantStatesManagerImpl createParticipantStatesManager(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger, ConversationEventsListener conversationEventsListener) {
        return new ParticipantStatesManagerImpl(participantStore, participantStateChanger, conversationEventsListener, this.mainThreadHandler);
    }

    private ParticipantsUpdater createParticipantsUpdater(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        MultiEventListener multiEventListener = this.eventListener;
        ParticipantStore participantStore = this.store;
        IdMappingWrapper idMappingWrapper = this.idMappingWrapper;
        LocalIdMappings localIdMappings = this.localIdMappings;
        ParticipantsUpdater.MappingUpdater mappingUpdater = new ParticipantsUpdater.MappingUpdater() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.2
            @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
            public void reportIfApplicable() {
                ConversationImpl.this.reportIfApplicable();
            }

            @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
            public void triggerMapUpdate() {
                ConversationImpl.this.mainThreadHandler.removeCallbacks(ConversationImpl.this.callParticipantResolutionRunnable);
                ConversationImpl.this.mainThreadHandler.post(ConversationImpl.this.callParticipantResolutionRunnable);
            }
        };
        ConversationParticipant conversationParticipant = this.f172me;
        Objects.requireNonNull(conversationParticipant);
        return new ParticipantsUpdater(multiEventListener, participantStore, participantStatesManagerImpl, idMappingWrapper, localIdMappings, mappingUpdater, new i62(24, conversationParticipant), this.callParams);
    }

    private RecordManagerImpl createRecordManager(IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, SignalingProvider signalingProvider) {
        return new RecordManagerImpl(this.log, this.store, idMappingResolver, idMappingWrapper, signalingProvider, this.eventListener);
    }

    private SessionRoomsManagerImpl createSessionRoomManager(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingResolver idMappingResolver, SignalingProvider signalingProvider) {
        SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl = new SessionRoomCommandExecutorImpl(participantStatesManagerImpl, signalingProvider);
        SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = new SessionRoomParticipantsDataProviderImpl(this.store, sessionRoomListenerManagerImpl, idMappingResolver, this.idMappingWrapper);
        return new SessionRoomsManagerImpl(sessionRoomListenerManagerImpl, sessionRoomCommandExecutorImpl, new SessionRoomAdminCommandExecutorImpl(signalingProvider, sessionRoomParticipantsDataProviderImpl), sessionRoomParticipantsDataProviderImpl);
    }

    private SignalingProvider createSignalingProvider() {
        k01 k01Var = this.call;
        Objects.requireNonNull(k01Var);
        return new pz0(k01Var);
    }

    private StartCallApiParams createStartCallApiParams(ConversationBuilder conversationBuilder) {
        return new StartCallApiParams(conversationBuilder.domainId, conversationBuilder.payload, conversationBuilder.isWatchTogetherEnabledForAll, conversationBuilder.hasVideo, conversationBuilder.clientType, conversationBuilder.multipleDevicesEnabled, conversationBuilder.chatId);
    }

    private StereoRoomManagerImpl createStereoRoomManager(SignalingProvider signalingProvider, IdMappingResolver idMappingResolver) {
        return new StereoRoomManagerImpl(this.log, this.store, idMappingResolver, new o(this), new StereoRoomCommandExecutorImpl(signalingProvider, this.log), this.idMappingWrapper, new StereoRoomListenerManagerImpl(), this.timeProvider);
    }

    private UrlSharingListenerManagerImpl createUrlSharingListenerManager() {
        return new UrlSharingListenerManagerImpl(createIdMappingResolver(), this.idMappingWrapper, this.log);
    }

    private UrlSharingManagerImpl createUrlSharingManager() {
        return new UrlSharingManagerImpl(new UrlSharingCommandsExecutorImpl(createSignalingProvider()), this.urlSharingListenerManager);
    }

    private WaitingRoomParticipants createWaitingRoomParticipants(IdMappingWrapper idMappingWrapper, IdMappingResolver idMappingResolver, final ListenerImpl listenerImpl) {
        return new WaitingRoomParticipants(new WaitingRoomParticipants.Listener() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.3
            @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
            public void onMeInWaitingRoomChanged(boolean z) {
                listenerImpl.onMeInWaitingRoomChanged(z);
            }

            @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
            public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
                listenerImpl.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }, idMappingWrapper, idMappingResolver, this.log);
    }

    private WatchTogetherPlayer createWatchTogetherPlayer(WatchTogetherListenerManager watchTogetherListenerManager, SignalingProvider signalingProvider) {
        k01 k01Var = this.call;
        Objects.requireNonNull(k01Var);
        return new WatchTogetherPlayerImpl(new WatchTogetherCommandExecutorImpl(signalingProvider, new rz0(k01Var, 13)), watchTogetherListenerManager);
    }

    private void doStartCall() {
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    this.log.log(LOG_TAG, "attempted to continue init after release, ignoring");
                    return;
                }
                assertPrepared();
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null && conversationParticipant.getInternalId() != null) {
                    ConversationParticipant conversationParticipant2 = this.initialOpponent;
                    k01 k01Var = this.call;
                    conversationParticipant2.setCallParticipant(k01Var.k0.j(conversationParticipant2.getInternalId()), this.localIdMappings);
                }
                k01 k01Var2 = this.call;
                us4 us4Var = this.videoRendererProvider;
                if (k01Var2.j()) {
                    k01Var2.r0 = us4Var;
                    if (us4Var == null) {
                        k01Var2.o0.p();
                    }
                }
                if (!this.isCaller) {
                    this.call.C();
                }
                this.inited = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private <T> void executeOnBg(cm6 cm6Var, hu3 hu3Var, Runnable runnable) {
        this.disposable.a(CallsThreadUtilsKt.executeOnIoThread(cm6Var, hu3Var, runnable));
    }

    private <P extends ActionParams, R extends ActionResult> e2f executeWithState(Conversation.State state, Conversation.State state2, Action<P, R> action, P p) {
        AtomicReference<Conversation.State> atomicReference = this.state;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                return e2f.f(new IllegalStateException("State " + this.state.get() + " doesn't match wanted state " + state));
            }
        }
        return action.execute(p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConversationEventsListener.CallEndInfo getCallEndInfo(m07 m07Var, Object obj) {
        HashSet hashSet;
        String str;
        if (obj instanceof k07) {
            k07 k07Var = (k07) obj;
            hashSet = new HashSet();
            if (k07Var.a.contains(j07.a)) {
                hashSet.add(HangupHint.SHOULD_RECONNECT);
            }
            str = k07Var.b;
        } else {
            hashSet = null;
            str = null;
        }
        return new ConversationEventsListener.CallEndInfo(m07Var, hashSet, str);
    }

    private yi1 getCallParticipantByExternalId(ParticipantId participantId) {
        ConversationParticipant byExternalWithAnyDevice = this.store.getByExternalWithAnyDevice(participantId);
        if (byExternalWithAnyDevice != null) {
            return byExternalWithAnyDevice.getCallParticipant();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ti1 getCallParticipantId(ParticipantId participantId) {
        ConversationParticipant byExternal;
        yi1 callParticipant;
        if (participantId == null || (byExternal = this.store.getByExternal(participantId)) == null || (callParticipant = byExternal.getCallParticipant()) == null) {
            return null;
        }
        return callParticipant.a;
    }

    @Deprecated
    private ConversationParticipant getParticipantByExternalId(String str) {
        return this.store.getByExternalWithAnyDevice(ParticipantId.authorized(str));
    }

    private boolean hasNoInternalId(Prepare.PrepareResult prepareResult, Boolean bool, hu3 hu3Var) {
        ArrayList arrayList = new ArrayList(prepareResult.getUnresolvedParticipantIds());
        if (!arrayList.isEmpty()) {
            this.eventListener.onCallStartResolutionFailed(arrayList);
        }
        if (!bool.booleanValue()) {
            boolean z = !arrayList.isEmpty();
            Iterator<ConversationParticipant> it = this.store.iterator();
            int i = 0;
            while (it.hasNext()) {
                ConversationParticipant next = it.next();
                boolean zEquals = Objects.equals(next.getExternalId(), this.f172me.getExternalId());
                boolean z2 = next.getInternalId() != null;
                z &= !z2 || zEquals;
                i += (!z2 || zEquals) ? 0 : 1;
            }
            if (z) {
                hu3Var.accept(new CallFailedException("no call targets left"));
                return true;
            }
            if (i == 1) {
                Iterator<ConversationParticipant> it2 = this.store.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ConversationParticipant next2 = it2.next();
                    if (next2.getInternalId() != null && !Objects.equals(next2.getExternalId(), this.f172me.getExternalId())) {
                        this.initialOpponent = next2;
                        break;
                    }
                }
            }
        }
        return false;
    }

    private boolean isWebTransportEnabled() {
        return this.callParams.z.C && WTSignaling.isAvailable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$22(hu3 hu3Var, JSONObject jSONObject) throws JSONException {
        if (hu3Var != null) {
            hu3Var.accept(jSONObject.optString(NegotiationErrorStat.KEY_ERROR, ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$23(Boolean bool, boolean z, hu3 hu3Var, Collection collection) {
        this.call.k((ti1) collection.iterator().next(), bool, Boolean.valueOf(z), new g(hu3Var, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$24(hu3 hu3Var, JSONObject jSONObject) throws JSONException {
        if (hu3Var != null) {
            hu3Var.accept(jSONObject.optString(NegotiationErrorStat.KEY_ERROR, ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$25(boolean z, hu3 hu3Var, GetOkIdByExternalId.Response response) throws Throwable {
        this.call.k(new ti1(1, 0, response.getOkId()), Boolean.valueOf(z), Boolean.FALSE, new g(hu3Var, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$26(Throwable th) throws Throwable {
        this.log.reportException(LOG_TAG, "failed to add participant", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipants$27(Boolean bool, boolean z, em6 em6Var, em6 em6Var2, Collection collection) {
        this.addParticipantsCommands.addParticipants(collection, bool, z, em6Var, em6Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ k01 lambda$createAsrOnlineManager$5() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ k01 lambda$createAsrOnlineManager$6() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ k01 lambda$createMediaMuteManager$4() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$0() {
        return Boolean.valueOf(this.inited);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$1() {
        return Boolean.valueOf(this.prepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$2() {
        return Boolean.valueOf(this.prepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qqg lambda$new$3(List list) {
        k01 k01Var = this.call;
        k01Var.getClass();
        k01Var.P.log("OKRTCCall", "updateDisplayLayout " + list);
        if (k01Var.j()) {
            k01Var.o0.Q(list);
            zh zhVar = k01Var.y0;
            if (zhVar.i) {
                ej ejVar = zhVar.h;
                ejVar.getClass();
                Point point = new Point();
                HashMap map = new HashMap();
                oz5 oz5VarG = lee.g(new at(2, list), new i0(12, ejVar));
                i0 i0Var = new i0(13, point);
                nz5 nz5Var = new nz5(oz5VarG);
                while (nz5Var.hasNext()) {
                    u61 u61Var = (u61) i0Var.invoke(nz5Var.next());
                    ti1 ti1Var = u61Var.a.b;
                    u61 u61Var2 = (u61) map.get(ti1Var);
                    if (u61Var2 != null) {
                        d3h d3hVar = u61Var2.b;
                        d3h d3hVar2 = u61Var.b;
                        if (d3hVar.b * d3hVar.a > d3hVar2.b * d3hVar2.a) {
                            u61Var = u61Var2;
                        }
                    }
                    map.put(ti1Var, u61Var);
                }
                StringBuilder sb = new StringBuilder("layouts: {");
                for (Map.Entry entry : map.entrySet()) {
                    sb.append(((ti1) entry.getKey()).a);
                    sb.append(" -> ");
                    sb.append(((u61) entry.getValue()).b.a);
                    sb.append('x');
                    sb.append(((u61) entry.getValue()).b.b);
                    sb.append(" , ");
                }
                sb.append("}");
                ejVar.n.log("AniRenderDispatch", sb.toString());
                ejVar.g.post(new cj(ejVar, map, point, 1));
            }
            l2e l2eVar = (l2e) k01Var.W0.getValue();
            u0e.a().b(new nh2(l2eVar, list, l2eVar.b.getMsSinceBoot(), 3));
        }
        return qqg.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConfroomJoin$10(ConversationParams conversationParams, hu3 hu3Var, hu3 hu3Var2, JoinConversation.Response response) throws Throwable {
        this.forceRelayPolicy |= response.getP2pForbidden();
        performConnect(response.getEndpoint(), response.getWtEndpoint(), conversationParams, hu3Var, hu3Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$16(String str) {
        this.recordManager.onRecordError(new vk1(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performConnect$17() {
        if (this.listener.listener != null) {
            hangup(new l07(m07.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$18() {
        this.mainThreadHandler.post(new n(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performConnect$19(hu3 hu3Var, k01 k01Var) {
        this.conversationStats.connectedToSignalingStat.onConnectedToSignaling();
        this.isConcurrent = k01Var.L;
        this.state.getAndSet(Conversation.State.Connected);
        this.stat.log(ExtLogger.simpleBuilderAny("callForceRelay").setCustom("vcid", ((p64) this.cidProvider).a).setCustom("param", this.forceRelayPolicy ? "1" : "0").build());
        if (hu3Var != null) {
            hu3Var.accept(this);
        }
        w0a.f();
        k01Var.V = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$7(boolean z, hu3 hu3Var, boolean z2, hu3 hu3Var2, Prepare.PrepareResult prepareResult) throws Throwable {
        if (this.conversationStart.isFastStartEnabled() || !hasNoInternalId(prepareResult, Boolean.valueOf(z), hu3Var)) {
            ConversationParams conversationParams = prepareResult.getConversationParams();
            if (conversationParams == null && !this.isCaller) {
                hu3Var.accept(new NullPointerException("Conversation parameters object MUST not be null for a not calling participant"));
                return;
            }
            if (this.isCaller) {
                runStartConversation(conversationParams, z, z2, hu3Var2, hu3Var);
            } else if (this.expectedChat) {
                performConfroomJoin(conversationParams, hu3Var2, hu3Var);
            } else {
                performConnect(conversationParams.endpoint, conversationParams.wtEndpoint, conversationParams, hu3Var2, hu3Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareJoinByLink$8(hu3 hu3Var, hu3 hu3Var2, Prepare.PrepareResult prepareResult) throws Throwable {
        ConversationParams conversationParams = prepareResult.getConversationParams();
        if (conversationParams == null) {
            hu3Var.accept(new NullPointerException("Conversation parameters object MUST not be null"));
            return;
        }
        this.forceRelayPolicy |= conversationParams.isP2PForbidden;
        performConnect(conversationParams.endpoint, conversationParams.wtEndpoint, conversationParams, hu3Var2, hu3Var);
        this.call.z = this.initialJoinLink;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$promoteParticipant$29(boolean z, ti1 ti1Var) {
        k01 k01Var = this.call;
        k01Var.k.d(paj.o(ti1Var, z), false, new yz0(k01Var, ti1Var, 1), k01Var.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryChatHistory$35(Conversation.ChatHistoryCallback chatHistoryCallback, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messages");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        ChatHistoryEntry[] chatHistoryEntryArr = new ChatHistoryEntry[length];
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                ti1 ti1VarV = paj.v(jSONObjectOptJSONObject);
                ConversationParticipant byInternal = this.store.getByInternal(ti1VarV);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(ti1VarV, this.idMappingWrapper);
                }
                chatHistoryEntryArr[i] = new ChatHistoryEntry(jSONObjectOptJSONObject.optString("message", ""), jSONObjectOptJSONObject.optBoolean("direct", false), byInternal);
            }
        }
        chatHistoryCallback.onResponse(chatHistoryEntryArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshParams$12(Runnable runnable, ConversationParams conversationParams) throws Throwable {
        this.conversationParams = conversationParams;
        this.prepared = true;
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeJoinLink$34(Runnable runnable, hu3 hu3Var, Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            runnable.run();
        } else {
            hu3Var.accept(new AssertionError("unreachable"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$removeParticipant$28(boolean z, ti1 ti1Var) throws JSONException {
        k01 k01Var = this.call;
        k01Var.getClass();
        k01Var.P.log("OKRTCCall", "removeParticipant, participant=" + ti1Var);
        if (k01Var.j()) {
            fr1 fr1Var = k01Var.N0;
            yi1 yi1VarJ = k01Var.k0.j(ti1Var);
            zva zvaVar = fr1Var.g;
            b7d b7dVar = (b7d) ((i21) zvaVar.b).d;
            Long lA = ((kme) zvaVar.o).a();
            if (lA != null) {
                long jLongValue = lA.longValue();
                HashMap map = new HashMap();
                map.put("vcid", b7dVar.conversationId);
                map.put("stat_time_delta", String.valueOf(jLongValue));
                map.put("network_type", w0a.b((ConnectivityManager) zvaVar.c, (TelephonyManager) zvaVar.d));
                zva.j(ti1Var, yi1VarJ, map);
                b7dVar.log(b7d.COLLECTOR_WEBRTC, "callRemoveParticipant", map);
            }
            try {
                if (ti1Var.equals(k01Var.D0)) {
                    k01Var.D0 = null;
                    k01Var.l(x71.H0, null);
                }
                pze pzeVar = k01Var.k;
                JSONObject jSONObject = new JSONObject();
                paj.c(ti1Var, jSONObject, false);
                jSONObject.put("ban", z);
                pzeVar.h(paj.b(jSONObject, "remove-participant"), new yz0(k01Var, ti1Var, 0));
            } catch (JSONException e) {
                throw new RuntimeException("Remove participant command failed", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveExternalsByInternalsIds$36(Runnable runnable, Throwable th) throws Throwable {
        if (runnable != null) {
            runnable.run();
        }
        this.log.reportException(LOG_TAG, "failed to get mapping", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$runStartConversation$14(hu3 hu3Var, ConversationParams conversationParams, hu3 hu3Var2, ConversationStart.Result result) throws Throwable {
        String str;
        CallInfo callInfo = result.getCallInfo();
        this.callInfo = callInfo;
        boolean z = true;
        this.wantsApiHangup = true;
        if (!callInfo.isConcurrent && ((str = callInfo.id) == null || str.equals(((p64) this.cidProvider).a))) {
            z = false;
        }
        this.isConcurrentByApi = z;
        this.forceRelayPolicy |= callInfo.isP2PForbidden;
        String str2 = callInfo.id;
        if (str2 != null) {
            o64 o64Var = this.cidProvider;
            if (o64Var instanceof p64) {
                ((p64) o64Var).a = str2;
            }
        }
        String str3 = callInfo.endpoint;
        String str4 = callInfo.wtEndpoint;
        if (str3 == null && (!isWebTransportEnabled() || str4 == null)) {
            hu3Var.accept(new IllegalStateException("couldn't create call endpoint is null"));
            return;
        }
        if (conversationParams == null) {
            conversationParams = callInfo.toParams();
        }
        performConnect(str3, str4, conversationParams, hu3Var2, hu3Var);
        this.call.z = callInfo.joinLink;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$runStartConversation$15(hu3 hu3Var, Throwable th) throws Throwable {
        StringBuilder sb = new StringBuilder("ok.api.error.");
        sb.append(th.getClass().getSimpleName());
        if (th instanceof ApiInvocationException) {
            ApiInvocationException apiInvocationException = (ApiInvocationException) th;
            int i = apiInvocationException.a;
            if (i == 1104) {
                ExternErrorParser.ErrorDescription errorDescription = new ExternErrorParser(this.log).parse(apiInvocationException);
                if (errorDescription.getErrorCode() != 0) {
                    sb.append('.');
                    sb.append(errorDescription.getErrorCode());
                }
                hu3Var.accept(new ExternApiException("external service failed", apiInvocationException, errorDescription.getErrorCode(), errorDescription.getExtendedError()));
            } else if (i == 2) {
                hu3Var.accept(new ServiceUnavailableException());
            } else {
                hu3Var.accept(th);
            }
        } else {
            hu3Var.accept(th);
        }
        this.conversationStats.callFinish.onCallFinished(new ConversationEndReason.Error(th), this.rateManager.getRateHints(), sb.toString(), this.isCaller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setCallOptionEnabled$20(boolean z, i01 i01Var, hu3 hu3Var, JSONObject jSONObject) throws JSONException {
        if (z) {
            k01 k01Var = this.call;
            k01Var.t.add(i01Var);
            k01Var.c(i01Var);
        } else {
            k01 k01Var2 = this.call;
            k01Var2.t.remove(i01Var);
            k01Var2.c(i01Var);
        }
        if (hu3Var != null) {
            hu3Var.accept(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCallOptionEnabled$21(hu3 hu3Var, JSONObject jSONObject) throws JSONException {
        if (hu3Var != null) {
            hu3Var.accept(jSONObject.optString(NegotiationErrorStat.KEY_ERROR));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setMuteState$37(pze pzeVar, boolean z, ti1 ti1Var) {
        try {
            pzeVar.i(paj.b(new JSONObject().put("eId", ti1Var.b()).put("muteTarget", z), "switch-micro"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalId$30(ParticipantId participantId) {
        return this.internalIdsMapper.map(Collections.singleton(participantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalId$31(ParticipantId participantId, hu3 hu3Var, Map map) {
        ti1 ti1Var = (ti1) map.get(participantId);
        if (ti1Var != null) {
            hu3Var.accept(ti1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalIds$32(ArrayList arrayList) {
        return this.internalIdsMapper.map(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalIds$33(hu3 hu3Var, ArrayList arrayList, Map map) {
        if (hu3Var != null) {
            arrayList.addAll(map.values());
            hu3Var.accept(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSignalingRefresh() {
        oze ozeVar;
        ConversationParams conversationParams;
        if (this.call.u || (ozeVar = this.signalingTransport) == null || (conversationParams = this.conversationParams) == null) {
            return;
        }
        ozeVar.restart(conversationParams.token);
    }

    private void performConfroomJoin(ConversationParams conversationParams, hu3 hu3Var, hu3 hu3Var2) {
        zl3 zl3Var = this.disposable;
        u2f u2fVarI = this.apiService.joinToConversation(((p64) this.cidProvider).a, this.peerIdGenerator.generatePeerId(), this.startCallApiParams).i(de.a());
        qu1 qu1Var = new qu1(new s(this, conversationParams, hu3Var, hu3Var2), 2, new l(hu3Var2, 1));
        u2fVarI.k(qu1Var);
        zl3Var.a(qu1Var);
    }

    private void performConnect(String str, String str2, ConversationParams conversationParams, hu3 hu3Var, hu3 hu3Var2) {
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    return;
                }
                if (conversationParams == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("No conversation parameters in performConnect()");
                    this.log.reportException(LOG_TAG, "An attempt to connect without conversation parameters", illegalStateException);
                    hu3Var2.accept(illegalStateException);
                    return;
                }
                if (this.startCallApiParams.getIsMultipleDevicesEnabled()) {
                    this.f172me.setDeviceIndex(conversationParams.deviceIndex, this.localIdMappings);
                    this.store.updateMe(this.f172me);
                }
                this.conversationParams = conversationParams;
                AtomicReference<Conversation.State> atomicReference = this.state;
                Conversation.State state = Conversation.State.Preparing;
                Conversation.State state2 = Conversation.State.Starting;
                while (!atomicReference.compareAndSet(state, state2)) {
                    if (atomicReference.get() != state) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Wrong state within performConnect(): " + this.state.get() + " expected state is " + Conversation.State.Preparing);
                        this.log.reportException(LOG_TAG, "An attempt to connect while conversation not in preparing state", illegalStateException2);
                        hu3Var2.accept(illegalStateException2);
                        return;
                    }
                }
                this.conversationStats.startedStat.onConversationStarted();
                yi1 callParticipant = this.f172me.getCallParticipant();
                callParticipant.a = this.f172me.getInternalId();
                if (this.isCaller || this.expectedChat) {
                    callParticipant.g(yi1.t);
                }
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null && conversationParticipant.getInternalId() != null) {
                    this.call.H(this.initialOpponent.getInternalId());
                }
                if (this.isConcurrentByApi) {
                    this.call.L = true;
                }
                this.listenerProxy.unlock();
                this.call.s0 = this.listener;
                subscribeCallListeners();
                setupSessionRoomWatchTogetherHandler(this.call);
                setupSessionRoomHandHandler(this.call);
                this.call.Y = new m(this);
                String strValueOf = this.f172me.getInternalId() != null ? String.valueOf(this.f172me.getInternalId().a) : null;
                n nVar = new n(0, this);
                zf5 zf5Var = new zf5();
                zf5Var.a = ((p64) this.cidProvider).a;
                zf5Var.b = conversationParams.token;
                zf5Var.c = strValueOf;
                zf5Var.d = conversationParams.deviceIndex;
                zf5Var.f = this.version;
                zf5Var.g = null;
                zf5Var.h = this.startCallApiParams.getClientType();
                zf5Var.j = configureSignalingCapabilities(this.f172me);
                zf5Var.k = conversationParams.ispAsNo;
                zf5Var.l = conversationParams.ispAsOrg;
                zf5Var.m = conversationParams.locCc;
                zf5Var.n = conversationParams.locReg;
                zf5Var.o = this.locale;
                zf5Var.i = this.startCallApiParams.getIsMultipleDevicesEnabled() ? 6 : 5;
                try {
                    if (isWebTransportEnabled()) {
                        this.log.log(LOG_TAG, "WebTransport is enabled and available, use fallback aware signaling transport adapter");
                        si1 si1Var = this.callParams;
                        ExecutorService executorService = this.executorService;
                        ConversationStats conversationStats = this.conversationStats;
                        ConversationStart conversationStart = this.conversationStart;
                        Objects.requireNonNull(conversationStart);
                        this.signalingTransport = new cb6(new d92(15, new SignalingTransportBuilder(zf5Var, str2, str, si1Var, nVar, executorService, conversationStats, new e44(2, conversationStart), this.logConfiguration, this.log)));
                    } else {
                        zf5Var.e = str;
                        ag5 ag5VarA = zf5Var.a();
                        mjh mjhVar = new mjh();
                        ri1 ri1Var = this.callParams.b;
                        qze logConfiguration = mjhVar.setTimeoutMS(30000).setReconnectTimeoutAction((Runnable) nVar).setSignalingStat((m0f) this.conversationStats.wsSignalingStat).setExecutor(this.executorService).setLog(this.log).setLogConfiguration(this.logConfiguration);
                        ri1 ri1Var2 = this.callParams.b;
                        this.signalingTransport = logConfiguration.setServerPingTimeoutMs(20000L).setFastRecoverEnabled(this.callParams.k).setEndpointParameters(ag5VarA).setIsReplaceParametersInEndpointEnabled(this.conversationStart.isFastStartEnabled()).build();
                    }
                    p pVar = new p(this, hu3Var);
                    j01 j01Var = new j01() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.4
                        @Override // defpackage.j01
                        public void onIceRestart() {
                            ConversationImpl.this.conversationStats.iceRestartStat.onIceRestart();
                        }

                        @Override // defpackage.j01
                        public void onNegotiationError(kda kdaVar) {
                            ConversationImpl.this.conversationStats.negotiationErrorStat.onError(kdaVar);
                        }

                        @Override // defpackage.j01
                        public void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState) {
                            ConversationImpl.this.conversationStats.peerConnectionStateChangedStat.onStateChanged(peerConnectionState);
                        }

                        @Override // defpackage.j01
                        public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
                            ConversationImpl.this.conversationStats.iceCandidatePairChangedStat.onSelectedCandidatePairChanged(candidatePairChangeEvent);
                        }
                    };
                    k01 k01Var = this.call;
                    k01Var.W = j01Var;
                    k01Var.t(this.signalingTransport, conversationParams.stunTurnServers, this.hotStart);
                    this.waitingRoomParticipants.setCall(this.call);
                    this.wantsApiHangup = true;
                    this.prepared = true;
                    this.state.set(Conversation.State.Connecting);
                    k01 k01Var2 = this.call;
                    k01Var2.getClass();
                    w0a.f();
                    if (k01Var2.q) {
                        pVar.a(k01Var2);
                    } else {
                        k01Var2.V = pVar;
                    }
                } catch (Throwable th) {
                    this.log.logException(LOG_TAG, "Can't connect conversation", th);
                    hu3Var2.accept(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private py4 refreshParams(Runnable runnable, hu3 hu3Var) {
        int i = 0;
        u2f u2fVarI = this.apiService.getConversationParams(this.anonToken, false, null).i(de.a());
        qu1 qu1Var = new qu1(new k(this, runnable, i), 2, new l(hu3Var, i));
        u2fVarI.k(qu1Var);
        return qu1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportIfApplicable() {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (!next.isReported() && next.getExternalId() != null && this.listener.listener != null) {
                next.setReported(true);
                arrayList.add(next);
                this.store.addToActiveSessionRoom(next);
            }
        }
        if (this.listener.listener == null || arrayList.isEmpty()) {
            return;
        }
        this.listener.listener.onParticipantsAdded(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetSignaling() {
        this.disposable.a(refreshParams(new n(2, this), new r64()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveExternalsByInternalsIds(List<ti1> list, Runnable runnable, Runnable runnable2) {
        if (list.isEmpty()) {
            runnable.run();
            return;
        }
        hk3 hk3VarResolveIds = this.externalIdsResolver.resolveIds(list);
        j0e j0eVarA = de.a();
        hk3VarResolveIds.getClass();
        Objects.requireNonNull(runnable);
        qu1 qu1Var = new qu1(new k(this, runnable2, 1), 0, new gk0(3, runnable));
        try {
            hk3VarResolveIds.f(new pk3(qu1Var, j0eVarA));
            this.disposable.a(qu1Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            raj.c(th);
            t8j.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveUnknownExternals() {
        resolveExternalsByInternalsIds(this.externalIdsResolver.collectExternalIdResolutionCandidates(), new n(1, this), null);
    }

    private void runStartConversation(ConversationParams conversationParams, boolean z, boolean z2, hu3 hu3Var, hu3 hu3Var2) {
        u2f u2fVarI = this.conversationStart.execute(new ConversationStart.Params(conversationParams, z, this.initialOpponent, this.startCallApiParams)).m(u0e.b()).i(de.a());
        qu1 qu1Var = new qu1(new s(this, hu3Var2, conversationParams, hu3Var), 2, new p(this, hu3Var2));
        u2fVarI.k(qu1Var);
        this.disposable.a(qu1Var);
    }

    private void setupSessionRoomHandHandler(k01 k01Var) {
        k01Var.R0.a(this.sessionRoomParticipantStatesHandler);
        qf1 qf1Var = k01Var.R0;
        qf1Var.a.a.add(this.sessionRoomParticipantStatesHandler);
    }

    private void setupSessionRoomWatchTogetherHandler(k01 k01Var) {
        k01Var.R0.a(this.sessionRoomWatchTogetherHandler);
    }

    private void subscribeCallListeners() {
        qf1 qf1Var = this.call.R0;
        qf1Var.b.a.add(this.listener);
        qf1 qf1Var2 = this.call.R0;
        qf1Var2.e.a.add(this.listener);
        qf1 qf1Var3 = this.call.R0;
        ((CopyOnWriteArraySet) qf1Var3.c.b).add(this.participantsUpdater);
        qf1 qf1Var4 = this.call.R0;
        qf1Var4.a.a.add(this.participantsUpdater);
        this.call.R0.a(this.participantsUpdater);
        this.call.R0.a(this.sessionRoomManager);
        this.call.R0.a(this.recordManager);
        this.call.R0.a(this.asrListenerManager);
        qf1 qf1Var5 = this.call.R0;
        qf1Var5.i.a.add(this.recordManager);
        qf1 qf1Var6 = this.call.R0;
        qf1Var6.j.a.add(this.feedbackListenerManager);
        qf1 qf1Var7 = this.call.R0;
        qf1Var7.m.a.add(this.asrListenerManager);
        qf1 qf1Var8 = this.call.R0;
        qf1Var8.n.a.add(this.listener);
        qf1 qf1Var9 = this.call.R0;
        qf1Var9.o.a.add(this.asrOnlineManager);
        qf1 qf1Var10 = this.call.R0;
        qf1Var10.k.a.add(this.contactCallManager);
        qf1 qf1Var11 = this.call.R0;
        qf1Var11.p.a.add(this.listener);
        qf1 qf1Var12 = this.call.R0;
        qf1Var12.d.a.add(this.waitingRoomParticipants);
        qf1 qf1Var13 = this.call.R0;
        qf1Var13.d.a.add(this.stereoRoomManager);
        qf1 qf1Var14 = this.call.R0;
        qf1Var14.q.a.add(this.urlSharingListenerManager);
        this.call.R0.a(this.urlSharingListenerManager);
        qf1 qf1Var15 = this.call.R0;
        qf1Var15.r.a.add(this.chatListenerManager);
        qf1 qf1Var16 = this.call.R0;
        ((CopyOnWriteArraySet) qf1Var16.s.b).add(this.mediaMuteListenerManager);
        qf1 qf1Var17 = this.call.R0;
        qf1Var17.t.a.add(this.mediaConnectionManager);
        qf1 qf1Var18 = this.call.R0;
        qf1Var18.u.a.add(this.statMonitor);
        qf1 qf1Var19 = this.call.R0;
        qf1Var19.v.a.add(this.topologyUpgradeStatEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTalkingParticipants() {
        k01 k01Var = this.call;
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant conversationParticipant : this.store.getParticipants()) {
            yi1 callParticipant = conversationParticipant.getCallParticipant();
            boolean z = getAdjustedAudioLevel(conversationParticipant) > 0.0f;
            if (callParticipant != null && z) {
                arrayList.add(callParticipant.a);
            }
        }
        k01Var.k0.p(arrayList);
    }

    private void withInternalId(ParticipantId participantId, hu3 hu3Var) {
        withInternalId(participantId, hu3Var, null);
    }

    private void withInternalIds(Collection<ParticipantId> collection, hu3 hu3Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (ParticipantId participantId : collection) {
            ti1 byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal == null) {
                arrayList.add(participantId);
            } else {
                arrayList2.add(byExternal);
            }
        }
        if (!arrayList.isEmpty()) {
            executeOnBg(new d(this, arrayList, 0), new e(hu3Var, arrayList2), null);
        } else if (hu3Var != null) {
            try {
                hu3Var.accept(arrayList2);
            } catch (Exception e) {
                this.log.reportException(LOG_TAG, "unable to use internal id", e);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.add(conversationEventsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipant(ParticipantId participantId, final Boolean bool, final boolean z, final hu3 hu3Var) {
        withInternalIds(Collections.singletonList(participantId), new hu3() { // from class: ru.ok.android.externcalls.sdk.b
            @Override // defpackage.hu3
            public final void accept(Object obj) {
                this.a.lambda$addParticipant$23(bool, z, hu3Var, (Collection) obj);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipantByLink(String str, Runnable runnable, hu3 hu3Var) {
        this.addParticipantsCommands.addParticipantByLink(str, runnable, hu3Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipants(Collection<ParticipantId> collection, final Boolean bool, final boolean z, final em6 em6Var, final em6 em6Var2) {
        if (!this.experiments.m) {
            withInternalIds(collection, new hu3() { // from class: ru.ok.android.externcalls.sdk.r
                @Override // defpackage.hu3
                public final void accept(Object obj) {
                    this.a.lambda$addParticipants$27(bool, z, em6Var, em6Var2, (Collection) obj);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (ParticipantId participantId : collection) {
            arrayList.add(new o81(participantId.id, participantId.isAnon ? 3 : 2, participantId.deviceIndex));
        }
        this.addParticipantsCommands.addParticipantsExtIds(arrayList, bool, z, em6Var, em6Var2);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void changeMyState(Map<String, String> map) {
        changeMyState(map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    @Override // ru.ok.android.externcalls.sdk.Conversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void connect() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.connect():void");
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void createJoinLink(hu3 hu3Var, hu3 hu3Var2) {
        zl3 zl3Var = this.disposable;
        u2f u2fVarI = this.apiService.createJoinLink(((p64) this.cidProvider).a).i(de.a());
        Objects.requireNonNull(hu3Var);
        q64 q64Var = new q64(hu3Var, 1);
        Objects.requireNonNull(hu3Var2);
        qu1 qu1Var = new qu1(q64Var, 2, new q64(hu3Var2, 0));
        u2fVarI.k(qu1Var);
        zl3Var.a(qu1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public float getAdjustedAudioLevel(ConversationParticipant conversationParticipant) {
        k50 audioLevel = getAudioLevel(conversationParticipant);
        if (audioLevel == null) {
            return 0.0f;
        }
        float f = audioLevel.b;
        if (conversationParticipant == this.f172me) {
            f *= 5.0f;
        }
        if (f < AUDIO_LEVEL_MIN) {
            return 0.0f;
        }
        if (f > AUDIO_LEVEL_CLAMP_MAX) {
            return 1.0f;
        }
        return f / 9000.0f;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public xh getAnimojiControl() {
        return this.call.i1;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public AsrManager getAsrManager() {
        return this.asrManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public AsrOnlineManager getAsrOnlineManager() {
        return this.asrOnlineManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public k50 getAudioLevel(ConversationParticipant conversationParticipant) {
        aa9 aa9Var;
        if (this.f172me == conversationParticipant) {
            return this.audioSampleEnergyCalculator.getProcessor();
        }
        k01 k01Var = this.call;
        yi1 callParticipant = conversationParticipant.getCallParticipant();
        if (k01Var.u) {
            aa9Var = null;
        } else {
            mw6 mw6Var = k01Var.e0;
            if (callParticipant != null) {
                aa9Var = (aa9) ((Hashtable) mw6Var.d).get(callParticipant);
            } else {
                mw6Var.getClass();
                aa9Var = null;
            }
        }
        if (aa9Var == null) {
            return null;
        }
        return aa9Var.a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public Conversation.CallType getCallType() {
        return this.isAnswer ? Conversation.CallType.Incoming : this.isCaller ? Conversation.CallType.Outgoing : Conversation.CallType.Join;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public h32 getCameraStatProvider() {
        d12 d12Var;
        ie8 ie8Var = this.call.g0.o;
        if (ie8Var == null || (d12Var = ie8Var.r) == null) {
            return null;
        }
        return (g32) ((kob) d12Var.c.b).b;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ChatManager getChatManager() {
        return this.chatManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ContactCallManager getContactCallManager() {
        return this.contactCallManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getConversationId() {
        return ((p64) this.cidProvider).a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public DebugManager getDebugManager() {
        return this.debugManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getDestroyReason() {
        return this.call.p;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public DisplayLayoutSender getDisplayLayoutSender() {
        return this.displayLayoutSender;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationFeatureManager getFeatureManager() {
        return this.conversationFeatureManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public FeedbackManager getFeedbackManager() {
        return this.feedbackManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getJoinLink() {
        String str = this.call.z;
        if (str != null) {
            return str;
        }
        CallInfo callInfo = this.callInfo;
        return callInfo != null ? callInfo.joinLink : this.initialJoinLink;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public KeywordSpotterManager getKeywordSpotterManager() {
        return this.keywordSpotterManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getMe() {
        return this.f172me;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MediaConnectionManager getMediaConnectionManager() {
        return this.mediaConnectionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MediaMuteManager getMediaMuteManager() {
        return this.mediaMuteManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MicrophoneManager getMicrophoneManager() {
        return this.microphoneManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public NetworkConnectionManager getNetworkConnectionManager() {
        return this.networkConnectionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public NoiseSuppressionManager getNoiseSuppressionManager() {
        return this.noiseSuppressionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getOpponent() {
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next != this.f172me) {
                return next;
            }
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public aa9 getParticipantMediaStat(ConversationParticipant conversationParticipant) {
        k01 k01Var = this.call;
        yi1 callParticipant = conversationParticipant.getCallParticipant();
        if (k01Var.u) {
            return null;
        }
        mw6 mw6Var = k01Var.e0;
        if (callParticipant != null) {
            return (aa9) ((Hashtable) mw6Var.d).get(callParticipant);
        }
        mw6Var.getClass();
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ParticipantStatesManager getParticipantStatesManager() {
        return this.participantStatesManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ParticipantCollection getParticipants() {
        return this.store;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getPinnedParticipant() {
        ti1 ti1Var;
        k01 k01Var = this.call;
        fje fjeVar = k01Var.k0.k;
        if (fjeVar instanceof eje) {
            zie zieVarE = k01Var.S0.E((eje) fjeVar);
            ti1Var = zieVarE == null ? null : zieVarE.f;
        } else {
            ti1Var = k01Var.D0;
        }
        if (ti1Var != null) {
            return this.store.getByInternal(ti1Var);
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public RateManager getRateManager() {
        return this.rateManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public RecordManager getRecordManager() {
        return this.recordManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public m07 getRejectReason() {
        return this.call.K;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ScreenCaptureManager getScreenCaptureManager() {
        return this.screenCaptureManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public SessionRoomsManager getSessionRoomManager() {
        return this.sessionRoomManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public Conversation.State getState() {
        return this.state.get();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public StereoRoomManager getStereoRoomManager() {
        return this.stereoRoomManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public k01 getUnderlyingCall() {
        return this.debugManager.getUnderlyingCall();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public UrlSharingManager getUrlSharingManager() {
        return this.urlSharingManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public VideoRenderManager getVideoRenderManager() {
        return this.videoRenderManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public WatchTogetherPlayer getWatchTogetherPlayer() {
        return this.watchTogetherPlayer;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void grantRoles(ParticipantId participantId, boolean z, wi1... wi1VarArr) {
        ti1 ti1Var;
        yi1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId == null || (ti1Var = callParticipantByExternalId.a) == null) {
            return;
        }
        grantRoles(ti1Var, z, wi1VarArr, null, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void hangup(l07 l07Var) {
        k01 k01Var = this.call;
        k01Var.getClass();
        m07 m07Var = m07.d;
        m07 m07Var2 = l07Var.a;
        if (m07Var2 != null) {
            m07Var = m07Var2;
        } else if (k01Var.v) {
            if (!k01Var.u() && k01Var.h.a) {
                m07Var = m07.o;
            }
        } else if (!k01Var.u()) {
            m07Var = m07.c;
        }
        k01Var.e(m07Var);
        this.wasHungUp = true;
        this.conversationStats.callFinish.onCallFinished(this.call.f1.y(), this.rateManager.getRateHints(), null, this.isCaller);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean hasRegisteredParticipnats() {
        for (yi1 yi1Var : this.call.k0.i()) {
            if (yi1Var.k != null || !yi1Var.f.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void init() {
        this.log.log(LOG_TAG, "init called");
        doStartCall();
        this.call.C();
    }

    public void initAsConfJoin() {
        this.expectedChat = true;
    }

    public void initStore(Collection<ParticipantId> collection) {
        boolean z = collection.size() > 1;
        if (z && this.isCaller) {
            this.stat.log(ExtLogger.simpleBuilder(hcf.callStartMultiparty).setCustom("vcid", ((p64) this.cidProvider).a).build());
        }
        Iterator<ParticipantId> it = collection.iterator();
        while (it.hasNext()) {
            ConversationParticipant conversationParticipantFromExternal = ConversationParticipant.fromExternal(it.next(), this.idMappingWrapper);
            this.store.addToActiveSessionRoom(conversationParticipantFromExternal);
            if (!z) {
                this.initialOpponent = conversationParticipantFromExternal;
                conversationParticipantFromExternal.setReported(true);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAnonJoinForbidden() {
        k01 k01Var = this.call;
        return k01Var.t.contains(i01.a);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAnswered() {
        return this.call.u();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAudioMixEnabled() {
        return this.call.o0.E(mdg.c);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isCaller() {
        return this.isCaller;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isConcurrent() {
        return this.isConcurrent;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isConditionAccepted() {
        return this.call.N.a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isConnected() {
        return this.call.E;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isDestroyed() {
        return this.state.get() == Conversation.State.Finished;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isFeatureAddParticipantEnabled() {
        return this.call.t0;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isFeedbackEnabled() {
        k01 k01Var = this.call;
        return k01Var.t.contains(i01.d);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isGroupCall() {
        return this.call.k0.q() > 1;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isInited() {
        return this.inited;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isInitialVideoEnabled() {
        return this.call.y;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMeCreatorOrAdmin() {
        return k01.v(this.call.k0.a);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMeInWaitingRoom() {
        return this.call.F0;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMuteParticipantsPermitted() {
        return this.call.a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isParticipantAdmin(String str) {
        yi1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId != null && (callParticipant = participantByExternalId.getCallParticipant()) != null) {
            this.call.getClass();
            Iterator it = callParticipant.e.iterator();
            while (it.hasNext()) {
                if (((wi1) it.next()) == wi1.b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isParticipantCreator(String str) {
        yi1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId != null && (callParticipant = participantByExternalId.getCallParticipant()) != null) {
            this.call.getClass();
            Iterator it = callParticipant.e.iterator();
            while (it.hasNext()) {
                if (((wi1) it.next()) == wi1.a) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isParticipantCreatorOrAdmin(String str) {
        yi1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        return k01.v(callParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isPermissionsGranted() {
        wd8 wd8Var = this.call.i0;
        if (wd8Var.d || wd8Var.c) {
            return true;
        }
        if (wd8Var.a()) {
            return wd8Var.d || wd8Var.c;
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isPrepared() {
        return this.prepared;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isRecurring() {
        k01 k01Var = this.call;
        return k01Var.t.contains(i01.c);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isVideoPermissionGranted() {
        k01 k01Var = this.call;
        if (k01Var.i0.d) {
            return true;
        }
        return k01Var.i0.a() && k01Var.i0.d;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isWaitingRoomEnabled() {
        k01 k01Var = this.call;
        return k01Var.t.contains(i01.b);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void muteAll() {
        pze pzeVar = this.call.k;
        if (pzeVar != null) {
            try {
                pzeVar.i(paj.b(new JSONObject().put("all", true).put("muteTarget", true), "switch-micro"));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [vz0] */
    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void pinParticipant(ParticipantId participantId, final boolean z) {
        final ti1 ti1Var;
        yi1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId == null || (ti1Var = callParticipantByExternalId.a) == null) {
            return;
        }
        final k01 k01Var = this.call;
        final fje fjeVar = k01Var.k0.k;
        k01Var.o0.H(ti1Var, fjeVar, z, new mze() { // from class: vz0
            @Override // defpackage.mze
            public final void onResponse(JSONObject jSONObject) {
                k01 k01Var2 = k01Var;
                k01Var2.getClass();
                if (jSONObject.optString(NegotiationErrorStat.KEY_ERROR).isEmpty()) {
                    boolean z2 = z;
                    ti1 ti1Var2 = ti1Var;
                    ti1 ti1Var3 = z2 ? ti1Var2 : null;
                    fje fjeVar2 = fjeVar;
                    if (fjeVar2 instanceof eje) {
                        k01Var2.T0.b(!z2, ti1Var2, (eje) fjeVar2);
                    } else {
                        k01Var2.D0 = ti1Var3;
                    }
                    k01Var2.l(x71.I0, ti1Var3);
                }
            }
        });
    }

    public void prepare(ConversationParams conversationParams, hu3 hu3Var, hu3 hu3Var2) {
        prepare(conversationParams, false, false, hu3Var, hu3Var2);
    }

    public void prepareJoinByLink(final hu3 hu3Var, final hu3 hu3Var2) {
        zl3 zl3Var = this.disposable;
        e2f e2fVarExecuteWithState = executeWithState(Conversation.State.None, Conversation.State.Preparing, createConversationPrepare(null), new Prepare.PrepareParams.PrepareJoin(this.initialJoinLink, this.anonToken));
        gu3 gu3Var = new gu3() { // from class: ru.ok.android.externcalls.sdk.t
            @Override // defpackage.gu3
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$prepareJoinByLink$8(hu3Var2, hu3Var, (Prepare.PrepareResult) obj);
            }
        };
        int i = 2;
        l lVar = new l(hu3Var2, i);
        e2fVarExecuteWithState.getClass();
        qu1 qu1Var = new qu1(gu3Var, i, lVar);
        e2fVarExecuteWithState.k(qu1Var);
        zl3Var.a(qu1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void promoteParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new c(1, this, z));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void queryChatHistory(Integer num, Integer num2, final Conversation.ChatHistoryCallback chatHistoryCallback) throws JSONException {
        pze pzeVar = this.call.k;
        if (pzeVar != null) {
            try {
                fr6 fr6VarB = paj.b(null, "chat-history");
                JSONObject jSONObject = fr6VarB.a;
                jSONObject.put("offset", num.intValue());
                jSONObject.put("count", num2.intValue());
                pzeVar.h(fr6VarB, new mze() { // from class: ru.ok.android.externcalls.sdk.f
                    @Override // defpackage.mze
                    public final void onResponse(JSONObject jSONObject2) throws JSONException {
                        this.a.lambda$queryChatHistory$35(chatHistoryCallback, jSONObject2);
                    }
                });
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void release() {
        SupportedCodecsStatistics.tryToReport(this.apiService, this.preferencesHelper, this.log);
        this.rateManager.logHints();
        this.disposable.d();
        this.waitingRoomParticipants.release();
        this.participantStatesManager.release();
        this.mediaConnectionManager.release();
        this.rateManager.release();
        this.remoteSettings.release();
        this.executionTimeInterceptor.release();
        this.keywordSpotterManager.release();
        synchronized (this.stateTransitionLock) {
            try {
                if (this.wantsApiHangup && this.wasHungUp) {
                    m07 m07Var = this.call.K;
                    if (m07Var == null) {
                        m07Var = m07.o;
                    }
                    this.creator.hangup(m07Var, ((p64) this.cidProvider).a, this.anonToken);
                }
                this.call.s0 = null;
                k01 k01Var = this.call;
                k01Var.Y = null;
                k01Var.G.remove(this.listener);
                k01 k01Var2 = this.call;
                AudioSampleEnergyCalculator audioSampleEnergyCalculator = this.audioSampleEnergyCalculator;
                rve rveVar = k01Var2.f0;
                rveVar.a.execute(new aee(rveVar, 11, audioSampleEnergyCalculator));
                this.call.q(null, "release");
                this.state.set(Conversation.State.Finished);
                this.listener.release();
                this.eventListener.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.remove(conversationEventsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeJoinLink(Runnable runnable, hu3 hu3Var) {
        zl3 zl3Var = this.disposable;
        u2f u2fVarI = this.apiService.removeJoinLink(((p64) this.cidProvider).a).i(de.a());
        k kVar = new k(runnable, hu3Var);
        Objects.requireNonNull(hu3Var);
        qu1 qu1Var = new qu1(kVar, 2, new q64(hu3Var, 0));
        u2fVarI.k(qu1Var);
        zl3Var.a(qu1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeParticipant(ParticipantId participantId) {
        removeParticipant(participantId, false);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void sendData(ConversationParticipant conversationParticipant, JSONObject jSONObject) {
        ti1 ti1Var;
        if (this.call.u || conversationParticipant == null || (ti1Var = conversationParticipant.getCallParticipant().a) == null) {
            return;
        }
        this.call.k.i(paj.g(ti1Var, jSONObject));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAnonJoinForbidden(boolean z) {
        setAnonJoinForbidden(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAudioCaptureEnabled(boolean z) {
        this.screenCaptureManager.setAudioCaptureEnabled(z);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setCallOptionEnabled(final i01 i01Var, final boolean z, final hu3 hu3Var) {
        pze pzeVar = this.call.k;
        if (!isMeCreatorOrAdmin()) {
            if (hu3Var != null) {
                hu3Var.accept("user is not creator or admin");
            }
            this.log.log(LOG_TAG, "user is not creator or admin");
        } else if (pzeVar != null) {
            Set setSingleton = Collections.singleton(i01Var);
            pzeVar.d(z ? paj.e(setSingleton, null) : paj.e(null, setSingleton), false, new mze() { // from class: ru.ok.android.externcalls.sdk.j
                @Override // defpackage.mze
                public final void onResponse(JSONObject jSONObject) throws JSONException {
                    this.a.lambda$setCallOptionEnabled$20(z, i01Var, hu3Var, jSONObject);
                }
            }, new g(hu3Var, 1));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setFeedbackEnabled(boolean z) {
        setFeedbackEnabled(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setMuteState(ParticipantId participantId, boolean z) {
        pze pzeVar = this.call.k;
        if (pzeVar != null) {
            withInternalId(participantId, new c(2, pzeVar, z));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setWaitingRoomEnabled(boolean z) {
        setWaitingRoomEnabled(z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void withInternalId(ParticipantId participantId, hu3 hu3Var, Runnable runnable) {
        ti1 byExternal = this.idMappingWrapper.getByExternal(participantId);
        if (byExternal == null) {
            executeOnBg(new d(this, participantId, 1), new e(participantId, hu3Var), runnable);
            return;
        }
        try {
            hu3Var.accept(byExternal);
        } catch (Exception e) {
            if (runnable != null) {
                runnable.run();
            }
            this.log.reportException(LOG_TAG, "unable to use internal id", e);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public void addParticipant(String str, final boolean z, final hu3 hu3Var) {
        zl3 zl3Var = this.disposable;
        u2f u2fVarI = this.apiService.getOkIdByExternalId(str).i(de.a());
        qu1 qu1Var = new qu1(new gu3() { // from class: ru.ok.android.externcalls.sdk.i
            @Override // defpackage.gu3
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$addParticipant$25(z, hu3Var, (GetOkIdByExternalId.Response) obj);
            }
        }, 2, new o(this));
        u2fVarI.k(qu1Var);
        zl3Var.a(qu1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void changeMyState(Map<String, String> map, mze mzeVar) {
        this.participantStatesManager.updateOwnState(map, mzeVar);
    }

    public void prepare(ConversationParams conversationParams, final boolean z, final boolean z2, final hu3 hu3Var, final hu3 hu3Var2) {
        e2f e2fVarExecuteWithState = executeWithState(Conversation.State.None, Conversation.State.Preparing, createConversationPrepare(conversationParams), Prepare.PrepareParams.C0001Prepare.INSTANCE);
        gu3 gu3Var = new gu3() { // from class: ru.ok.android.externcalls.sdk.h
            @Override // defpackage.gu3
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$prepare$7(z, hu3Var2, z2, hu3Var, (Prepare.PrepareResult) obj);
            }
        };
        Objects.requireNonNull(hu3Var2);
        q64 q64Var = new q64(hu3Var2, 0);
        e2fVarExecuteWithState.getClass();
        qu1 qu1Var = new qu1(gu3Var, 2, q64Var);
        e2fVarExecuteWithState.k(qu1Var);
        this.disposable.a(qu1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new c(0, this, z));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAnonJoinForbidden(boolean z, hu3 hu3Var) {
        setCallOptionEnabled(i01.a, z, hu3Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setFeedbackEnabled(boolean z, hu3 hu3Var) {
        setCallOptionEnabled(i01.d, z, hu3Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setWaitingRoomEnabled(boolean z, hu3 hu3Var) {
        setCallOptionEnabled(i01.b, z, hu3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [uz0] */
    public void grantRoles(final ti1 ti1Var, final boolean z, wi1[] wi1VarArr, final Runnable runnable, final Runnable runnable2) {
        final k01 k01Var = this.call;
        final List listAsList = Arrays.asList(wi1VarArr);
        k01Var.o0.B(ti1Var, listAsList, z, new mze() { // from class: uz0
            @Override // defpackage.mze
            public final void onResponse(JSONObject jSONObject) {
                yi1 yi1Var;
                k01 k01Var2 = k01Var;
                k01Var2.getClass();
                if (!jSONObject.optString(NegotiationErrorStat.KEY_ERROR).isEmpty()) {
                    Runnable runnable3 = runnable2;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
                dj1 dj1Var = k01Var2.k0;
                dj1Var.getClass();
                LinkedHashSet<yi1> linkedHashSet = new LinkedHashSet();
                yi1 yi1Var2 = dj1Var.a;
                ti1 ti1Var2 = yi1Var2.a;
                ti1 ti1Var3 = ti1Var;
                if (ti1Var2 == null || !ti1Var2.equals(ti1Var3)) {
                    Set<ti1> set = (Set) dj1Var.h.get(ti1Var3.a);
                    if (set != null) {
                        for (ti1 ti1Var4 : set) {
                            fje fjeVar = (fje) dj1Var.g.get(ti1Var4);
                            if (fjeVar != null && (yi1Var = (yi1) dj1Var.d(fjeVar).get(ti1Var4)) != null) {
                                linkedHashSet.add(yi1Var);
                            }
                        }
                    }
                } else {
                    linkedHashSet.add(yi1Var2);
                }
                if (!linkedHashSet.isEmpty()) {
                    for (yi1 yi1Var3 : linkedHashSet) {
                        boolean z2 = z;
                        List list = listAsList;
                        if (z2) {
                            yi1Var3.d.removeAll(list);
                        } else {
                            yi1Var3.d.addAll(list);
                        }
                    }
                    k01Var2.l(x71.G0, linkedHashSet);
                }
                Runnable runnable4 = runnable;
                if (runnable4 != null) {
                    runnable4.run();
                }
            }
        });
    }
}
