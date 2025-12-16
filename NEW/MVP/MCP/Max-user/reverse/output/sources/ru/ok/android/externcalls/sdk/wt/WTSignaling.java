package ru.ok.android.externcalls.sdk.wt;

import android.annotation.TargetApi;
import defpackage.ag5;
import defpackage.e5j;
import defpackage.em6;
import defpackage.jt;
import defpackage.l0f;
import defpackage.m0f;
import defpackage.p0f;
import defpackage.q0f;
import defpackage.qze;
import defpackage.tk4;
import defpackage.v87;
import defpackage.wj0;
import defpackage.xpb;
import defpackage.y6d;
import defpackage.z6d;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;
import ru.ok.android.externcalls.sdk.wt.internal.WebTransportCompressorDecompressor;
import ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u000243Bc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u00020#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020#0&H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020#H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u001cH\u0014¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ok/android/externcalls/sdk/wt/WTSignaling;", "Lq0f;", "Lv87;", "client", "", "timeoutMS", "Ljava/lang/Runnable;", "reconnectTimeoutAction", "Lm0f;", "signalingStat", "Ljava/util/concurrent/ExecutorService;", "executor", "Ly6d;", "log", "Lz6d;", "logConfiguration", "serverPingTimeoutMs", "", "isFastRecoverEnabled", "Lag5;", "endpointParameters", "isReplaceParametersInEndpointEnabled", "<init>", "(Lv87;JLjava/lang/Runnable;Lm0f;Ljava/util/concurrent/ExecutorService;Ly6d;Lz6d;JZLag5;Z)V", "isFallbackSupported", "()Z", "", "code", "", IceCandidatePairChangedStat.KEY_REASON, "safelyCloseSocketWithCodeAndReason", "(ILjava/lang/String;)Z", ApiProtocol.KEY_ENDPOINT, "Lp0f;", "listener", "Lqqg;", "safelyCreateNewSocket", "(Ljava/lang/String;Lp0f;)V", "Lkotlin/Function1;", "action", "safelyDoIfSocketExists", "(Lem6;)V", "safelyResetSocketReference", "()V", "cmd", "safelySendSocketMessage", "(Ljava/lang/String;)Z", "Lv87;", "Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket;", "socket", "Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket;", "Companion", "Builder", "wtsignaling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WTSignaling extends q0f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TRANSPORT_TAG = "WebTransportNetworking";
    private final v87 client;
    private WebTransportSocket socket;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/wt/WTSignaling$Builder;", "Lqze;", "<init>", "()V", "", "isEnabled", "setWtTrafficLoggingEnabled", "(Z)Lru/ok/android/externcalls/sdk/wt/WTSignaling$Builder;", "setDataCompressionEnabled", "Lru/ok/android/externcalls/sdk/wt/WTSignaling;", "build", "()Lru/ok/android/externcalls/sdk/wt/WTSignaling;", "isWtTrafficLoggingEnabled", "Z", "isDataCompressionEnabled", "wtsignaling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @TargetApi(26)
    public static final class Builder extends qze {
        private boolean isDataCompressionEnabled = true;
        private boolean isWtTrafficLoggingEnabled;

        public final Builder setDataCompressionEnabled(boolean isEnabled) {
            this.isDataCompressionEnabled = isEnabled;
            return this;
        }

        public final Builder setWtTrafficLoggingEnabled(boolean isEnabled) {
            this.isWtTrafficLoggingEnabled = isEnabled;
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [ru.ok.android.externcalls.sdk.wt.WTSignaling$Builder$build$logger$1, wj0] */
        @Override // defpackage.qze
        public WTSignaling build() {
            Objects.requireNonNull(getSignalingStat(), "Signaling statistics is required");
            Objects.requireNonNull(getExecutor(), "executor is required");
            Objects.requireNonNull(getLog(), "log is required");
            Objects.requireNonNull(getLogConfiguration(), "log configuration is required");
            Objects.requireNonNull(getEndpointParameters(), "endpoint parameters are required");
            final y6d log = getLog();
            ?? r0 = new wj0() { // from class: ru.ok.android.externcalls.sdk.wt.WTSignaling$Builder$build$logger$1
                @Override // defpackage.wj0
                public void log(String message) {
                    y6d y6dVar = log;
                    if (message == null) {
                        message = "";
                    }
                    y6dVar.log("WebTransportNetworking", message);
                }

                @Override // defpackage.wj0
                public void logWithHexDump(String message, byte[] data, int length) {
                    y6d y6dVar = log;
                    if (message == null) {
                        message = "";
                    }
                    y6dVar.log("WebTransportNetworking", message.concat(" (data omitted)"));
                }

                @Override // defpackage.wj0
                public void log(String message, Throwable ex) {
                    if (ex != null) {
                        y6d y6dVar = log;
                        if (message == null) {
                            message = "";
                        }
                        y6dVar.logException("WebTransportNetworking", message, ex);
                        return;
                    }
                    y6d y6dVar2 = log;
                    if (message == null) {
                        message = "";
                    }
                    y6dVar2.log("WebTransportNetworking", message);
                }

                @Override // defpackage.wj0
                public void logWithHexDump(String message, ByteBuffer data, int offset, int length) {
                    y6d y6dVar = log;
                    if (message == null) {
                        message = "";
                    }
                    y6dVar.log("WebTransportNetworking", message.concat(" (data omitted)"));
                }
            };
            if (this.isWtTrafficLoggingEnabled) {
                r0.logRaw(true);
                r0.logDebug(true);
                r0.logFlowControl(true);
            }
            WTSignaling wTSignaling = new WTSignaling(new v87(Duration.ofSeconds(5L), r0), getTimeoutMS(), getReconnectTimeoutAction(), getSignalingStat(), getExecutor(), log, getLogConfiguration(), getServerPingTimeoutMs(), isFastRecoverEnabled(), getEndpointParameters(), isReplaceParametersInEndpointEnabled(), null);
            wTSignaling.init();
            return wTSignaling;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/wt/WTSignaling$Companion;", "", "()V", "TRANSPORT_TAG", "", "defaultCompression", "getDefaultCompression$annotations", "getDefaultCompression", "()Ljava/lang/String;", "isAvailable", "", "isAvailable$annotations", "()Z", "wtsignaling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        public static /* synthetic */ void getDefaultCompression$annotations() {
        }

        public static /* synthetic */ void isAvailable$annotations() {
        }

        public final String getDefaultCompression() {
            return WebTransportCompressorDecompressor.COMPRESSION_NAME;
        }

        public final boolean isAvailable() {
            return true;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WTSignaling(v87 v87Var, long j, Runnable runnable, m0f m0fVar, ExecutorService executorService, y6d y6dVar, z6d z6dVar, long j2, boolean z, ag5 ag5Var, boolean z2, tk4 tk4Var) {
        this(v87Var, j, runnable, m0fVar, executorService, y6dVar, z6dVar, j2, z, ag5Var, z2);
    }

    public static final String getDefaultCompression() {
        return INSTANCE.getDefaultCompression();
    }

    public static final boolean isAvailable() {
        return INSTANCE.isAvailable();
    }

    @Override // defpackage.q0f
    public boolean isFallbackSupported() {
        return true;
    }

    @Override // defpackage.q0f
    public boolean safelyCloseSocketWithCodeAndReason(int code, String reason) {
        WebTransportSocket webTransportSocket = this.socket;
        this.socket = null;
        if (webTransportSocket == null) {
            return false;
        }
        webTransportSocket.close(code, reason);
        return true;
    }

    @Override // defpackage.q0f
    public void safelyCreateNewSocket(String endpoint, final p0f listener) {
        this.socket = new WebTransportSocket(endpoint, getLog(), this.client, new WebTransportCompressorDecompressor(getLog()), new WebTransportSocket.Listener() { // from class: ru.ok.android.externcalls.sdk.wt.WTSignaling.safelyCreateNewSocket.1
            @Override // ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket.Listener
            public void onClosed(int code, String reason) {
                ((q0f) ((xpb) listener).b).a(reason);
            }

            @Override // ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket.Listener
            public void onFailure(Throwable reason) {
                xpb xpbVar = (xpb) listener;
                q0f.access$handleSocketFailure((q0f) xpbVar.b, ((jt) xpbVar.c).b, reason);
            }

            @Override // ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket.Listener
            public void onMessage(String text) {
                q0f.access$handleSocketMessage((q0f) ((xpb) listener).b, text);
            }

            @Override // ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket.Listener
            public void onOpen() {
                q0f.access$handleSocketOpen((q0f) ((xpb) listener).b);
            }
        });
    }

    @Override // defpackage.q0f
    public void safelyDoIfSocketExists(em6 action) {
        WebTransportSocket webTransportSocket = this.socket;
        if (webTransportSocket != null) {
            action.invoke(webTransportSocket.getEndpoint());
        }
    }

    @Override // defpackage.q0f
    public void safelyResetSocketReference() {
        this.socket = null;
    }

    @Override // defpackage.q0f
    public boolean safelySendSocketMessage(String cmd) {
        WebTransportSocket webTransportSocket = this.socket;
        if (webTransportSocket == null) {
            return false;
        }
        webTransportSocket.send(cmd);
        return true;
    }

    private WTSignaling(v87 v87Var, long j, Runnable runnable, m0f m0fVar, ExecutorService executorService, y6d y6dVar, z6d z6dVar, long j2, boolean z, ag5 ag5Var, boolean z2) {
        super("WT", j, runnable, m0fVar, executorService, y6dVar, z6dVar, j2, z, ag5Var, z2, new l0f("webtransport_restart", "webtransport_connected", "webtransport_reconnected", "webtransport_failed_pings", "webtransport_failed_exception", "webtransport_timeout"));
        this.client = v87Var;
        int i = e5j.a;
        if (i == 0) {
            e5j.a = 2;
        } else if (2 != i) {
            throw new IllegalArgumentException("Once set, platform cannot be changed");
        }
    }
}
