package ru.ok.android.externcalls.sdk;

import android.content.Context;
import defpackage.y6d;
import kotlin.Metadata;
import org.webrtc.NativeLibraryLoader;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams;", "", "context", "Landroid/content/Context;", "peerConnection", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;)V", "getContext", "()Landroid/content/Context;", "getPeerConnection", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "Builder", "PeerConnection", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConversationFactoryInitParams {
    private final Context context;
    private final PeerConnection peerConnection;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "peerConnection", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "build", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams;", "setPeerConnection", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private final Context context;
        private PeerConnection peerConnection;

        public Builder(Context context) {
            this.context = context;
        }

        public final ConversationFactoryInitParams build() {
            Context context = this.context;
            PeerConnection peerConnectionBuild = this.peerConnection;
            if (peerConnectionBuild == null) {
                peerConnectionBuild = new PeerConnection.Builder().build();
            }
            return new ConversationFactoryInitParams(context, peerConnectionBuild);
        }

        public final Builder setPeerConnection(PeerConnection peerConnection) {
            this.peerConnection = peerConnection;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001'B\u0083\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\r\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u000e\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u000f\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u0010\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u0011\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "", "", "bonusFieldTrials", "", "rttMultCapMs", "", "isREDEnabledP2P", "isREDEnabledServer", "udpMarker", "tcpMarker", "Lorg/webrtc/NativeLibraryLoader;", "libraryLoader", "isEarlyAudioPlayoutEnabled", "isEarlyAudioRecordingEnabled", "isOpusDREDEnabledP2p", "isOpusDREDEnabledServer", "isAudioPipelineOffOnMuteEnabled", "isSharedSocketDisabledForICE", "Ly6d;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Lorg/webrtc/NativeLibraryLoader;ZZZZZZLy6d;)V", "Ljava/lang/String;", "getBonusFieldTrials", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getRttMultCapMs", "()Ljava/lang/Integer;", "Z", "()Z", "getUdpMarker", "getTcpMarker", "Lorg/webrtc/NativeLibraryLoader;", "getLibraryLoader", "()Lorg/webrtc/NativeLibraryLoader;", "Ly6d;", "getLogger", "()Ly6d;", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PeerConnection {
        private final String bonusFieldTrials;
        private final boolean isAudioPipelineOffOnMuteEnabled;
        private final boolean isEarlyAudioPlayoutEnabled;
        private final boolean isEarlyAudioRecordingEnabled;
        private final boolean isOpusDREDEnabledP2p;
        private final boolean isOpusDREDEnabledServer;
        private final boolean isREDEnabledP2P;
        private final boolean isREDEnabledServer;
        private final boolean isSharedSocketDisabledForICE;
        private final NativeLibraryLoader libraryLoader;
        private final y6d logger;
        private final Integer rttMultCapMs;
        private final String tcpMarker;
        private final String udpMarker;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0017J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010\u0017J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010'R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010)\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010-\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010&R\u0018\u0010.\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0016\u00101\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010*R\u0016\u00104\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*R\u0016\u00105\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010*¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "<init>", "()V", "Ly6d;", "log", "setLogger", "(Ly6d;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "Lorg/webrtc/NativeLibraryLoader;", "libraryLoader", "setNativeLibraryLoader", "(Lorg/webrtc/NativeLibraryLoader;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "rttMultCapMs", "setRttMultCapMs", "(Ljava/lang/Integer;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "bonusFieldTrials", "setBonusFieldTrials", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "isEnabled", "setP2PREDEnabled", "(Z)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "setServerREDEnabled", "setOpusDREDEnabledP2p", "setOpusDREDEnabledServer", "marker", "setUdpMarker", "setTcpMarker", "setEarlyAudioPlayoutEnabled", "setEarlyAudioRecordingEnabled", "setAudioPipelineOffOnMuteEnabled", "isDisabled", "setSharedSocketDisabledForICE", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "build", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "Ljava/lang/String;", "Ljava/lang/Integer;", "Lorg/webrtc/NativeLibraryLoader;", "isREDEnabledP2P", "Z", "isREDEnabledServer", "udpMarker", "tcpMarker", "logger", "Ly6d;", "isEarlyAudioPlayoutEnabled", "isEarlyAudioRecordingEnabled", "isOpusDREDEnabledP2p", "isOpusDREDEnabledServer", "isAudioPipelineOffOnMuteEnabled", "isSharedSocketDisabledForICE", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Builder {
            private String bonusFieldTrials;
            private boolean isSharedSocketDisabledForICE;
            private NativeLibraryLoader libraryLoader;
            private y6d logger;
            private Integer rttMultCapMs;
            private String tcpMarker;
            private String udpMarker;
            private boolean isREDEnabledP2P = true;
            private boolean isREDEnabledServer = true;
            private boolean isEarlyAudioPlayoutEnabled = true;
            private boolean isEarlyAudioRecordingEnabled = true;
            private boolean isOpusDREDEnabledP2p = true;
            private boolean isOpusDREDEnabledServer = true;
            private boolean isAudioPipelineOffOnMuteEnabled = true;

            public final PeerConnection build() {
                return new PeerConnection(this.bonusFieldTrials, this.rttMultCapMs, this.isREDEnabledP2P, this.isREDEnabledServer, this.udpMarker, this.tcpMarker, this.libraryLoader, this.isEarlyAudioPlayoutEnabled, this.isEarlyAudioRecordingEnabled, this.isOpusDREDEnabledP2p, this.isOpusDREDEnabledServer, this.isAudioPipelineOffOnMuteEnabled, this.isSharedSocketDisabledForICE, this.logger);
            }

            public final Builder setAudioPipelineOffOnMuteEnabled(boolean isEnabled) {
                this.isAudioPipelineOffOnMuteEnabled = isEnabled;
                return this;
            }

            public final Builder setBonusFieldTrials(String bonusFieldTrials) {
                this.bonusFieldTrials = bonusFieldTrials;
                return this;
            }

            public final Builder setEarlyAudioPlayoutEnabled(boolean isEnabled) {
                this.isEarlyAudioPlayoutEnabled = isEnabled;
                return this;
            }

            public final Builder setEarlyAudioRecordingEnabled(boolean isEnabled) {
                this.isEarlyAudioRecordingEnabled = isEnabled;
                return this;
            }

            public final Builder setLogger(y6d log) {
                this.logger = log;
                return this;
            }

            public final Builder setNativeLibraryLoader(NativeLibraryLoader libraryLoader) {
                this.libraryLoader = libraryLoader;
                return this;
            }

            public final Builder setOpusDREDEnabledP2p(boolean isEnabled) {
                this.isOpusDREDEnabledP2p = isEnabled;
                return this;
            }

            public final Builder setOpusDREDEnabledServer(boolean isEnabled) {
                this.isOpusDREDEnabledServer = isEnabled;
                return this;
            }

            public final Builder setP2PREDEnabled(boolean isEnabled) {
                this.isREDEnabledP2P = isEnabled;
                return this;
            }

            public final Builder setRttMultCapMs(Integer rttMultCapMs) {
                this.rttMultCapMs = rttMultCapMs;
                return this;
            }

            public final Builder setServerREDEnabled(boolean isEnabled) {
                this.isREDEnabledServer = isEnabled;
                return this;
            }

            public final Builder setSharedSocketDisabledForICE(boolean isDisabled) {
                this.isSharedSocketDisabledForICE = isDisabled;
                return this;
            }

            public final Builder setTcpMarker(String marker) {
                this.udpMarker = marker;
                return this;
            }

            public final Builder setUdpMarker(String marker) {
                this.udpMarker = marker;
                return this;
            }
        }

        public PeerConnection(String str, Integer num, boolean z, boolean z2, String str2, String str3, NativeLibraryLoader nativeLibraryLoader, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, y6d y6dVar) {
            this.bonusFieldTrials = str;
            this.rttMultCapMs = num;
            this.isREDEnabledP2P = z;
            this.isREDEnabledServer = z2;
            this.udpMarker = str2;
            this.tcpMarker = str3;
            this.libraryLoader = nativeLibraryLoader;
            this.isEarlyAudioPlayoutEnabled = z3;
            this.isEarlyAudioRecordingEnabled = z4;
            this.isOpusDREDEnabledP2p = z5;
            this.isOpusDREDEnabledServer = z6;
            this.isAudioPipelineOffOnMuteEnabled = z7;
            this.isSharedSocketDisabledForICE = z8;
            this.logger = y6dVar;
        }

        public final String getBonusFieldTrials() {
            return this.bonusFieldTrials;
        }

        public final NativeLibraryLoader getLibraryLoader() {
            return this.libraryLoader;
        }

        public final y6d getLogger() {
            return this.logger;
        }

        public final Integer getRttMultCapMs() {
            return this.rttMultCapMs;
        }

        public final String getTcpMarker() {
            return this.tcpMarker;
        }

        public final String getUdpMarker() {
            return this.udpMarker;
        }

        /* renamed from: isAudioPipelineOffOnMuteEnabled, reason: from getter */
        public final boolean getIsAudioPipelineOffOnMuteEnabled() {
            return this.isAudioPipelineOffOnMuteEnabled;
        }

        /* renamed from: isEarlyAudioPlayoutEnabled, reason: from getter */
        public final boolean getIsEarlyAudioPlayoutEnabled() {
            return this.isEarlyAudioPlayoutEnabled;
        }

        /* renamed from: isEarlyAudioRecordingEnabled, reason: from getter */
        public final boolean getIsEarlyAudioRecordingEnabled() {
            return this.isEarlyAudioRecordingEnabled;
        }

        /* renamed from: isOpusDREDEnabledP2p, reason: from getter */
        public final boolean getIsOpusDREDEnabledP2p() {
            return this.isOpusDREDEnabledP2p;
        }

        /* renamed from: isOpusDREDEnabledServer, reason: from getter */
        public final boolean getIsOpusDREDEnabledServer() {
            return this.isOpusDREDEnabledServer;
        }

        /* renamed from: isREDEnabledP2P, reason: from getter */
        public final boolean getIsREDEnabledP2P() {
            return this.isREDEnabledP2P;
        }

        /* renamed from: isREDEnabledServer, reason: from getter */
        public final boolean getIsREDEnabledServer() {
            return this.isREDEnabledServer;
        }

        /* renamed from: isSharedSocketDisabledForICE, reason: from getter */
        public final boolean getIsSharedSocketDisabledForICE() {
            return this.isSharedSocketDisabledForICE;
        }
    }

    public ConversationFactoryInitParams(Context context, PeerConnection peerConnection) {
        this.context = context;
        this.peerConnection = peerConnection;
    }

    public final Context getContext() {
        return this.context;
    }

    public final PeerConnection getPeerConnection() {
        return this.peerConnection;
    }
}
