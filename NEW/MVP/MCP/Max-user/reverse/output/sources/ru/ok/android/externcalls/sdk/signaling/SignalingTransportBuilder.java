package ru.ok.android.externcalls.sdk.signaling;

import defpackage.cm6;
import defpackage.m0f;
import defpackage.mjh;
import defpackage.oze;
import defpackage.qze;
import defpackage.ri1;
import defpackage.s0f;
import defpackage.si1;
import defpackage.tk4;
import defpackage.y6d;
import defpackage.z6d;
import defpackage.zf5;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.wt.WTSignaling;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/signaling/SignalingTransportBuilder;", "", "Lzf5;", "endpointParametersBuilder", "", "wtEndpointBaseUrl", "wsEndpointBaseUrl", "Lsi1;", "callParams", "Ljava/lang/Runnable;", "reconnectTimeoutAction", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "conversationStats", "Lkotlin/Function0;", "", "isFastStartEnabled", "Lz6d;", "logConfiguration", "Ly6d;", "log", "<init>", "(Lzf5;Ljava/lang/String;Ljava/lang/String;Lsi1;Ljava/lang/Runnable;Ljava/util/concurrent/ExecutorService;Lru/ok/android/externcalls/sdk/stat/ConversationStats;Lcm6;Lz6d;Ly6d;)V", "Ls0f;", "params", "Loze;", "build", "(Ls0f;)Loze;", "Lzf5;", "Ljava/lang/String;", "Lsi1;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/ExecutorService;", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "Lcm6;", "Lz6d;", "Ly6d;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SignalingTransportBuilder {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "SignalingBuilder";
    private final si1 callParams;
    private final ConversationStats conversationStats;
    private final zf5 endpointParametersBuilder;
    private final ExecutorService executorService;
    private final cm6 isFastStartEnabled;
    private final y6d log;
    private final z6d logConfiguration;
    private final Runnable reconnectTimeoutAction;
    private final String wsEndpointBaseUrl;
    private final String wtEndpointBaseUrl;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/signaling/SignalingTransportBuilder$Companion;", "", "()V", "TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    public SignalingTransportBuilder(zf5 zf5Var, String str, String str2, si1 si1Var, Runnable runnable, ExecutorService executorService, ConversationStats conversationStats, cm6 cm6Var, z6d z6dVar, y6d y6dVar) {
        this.endpointParametersBuilder = zf5Var;
        this.wtEndpointBaseUrl = str;
        this.wsEndpointBaseUrl = str2;
        this.callParams = si1Var;
        this.reconnectTimeoutAction = runnable;
        this.executorService = executorService;
        this.conversationStats = conversationStats;
        this.isFastStartEnabled = cm6Var;
        this.logConfiguration = z6dVar;
        this.log = y6dVar;
    }

    public final oze build(s0f params) {
        qze mjhVar;
        String str;
        boolean z = params.a;
        boolean z2 = (z || (str = this.wtEndpointBaseUrl) == null || str.length() == 0) ? false : true;
        this.log.log(TAG, "Build signaling transport. wt=" + z2 + ", prefer_ws=" + z);
        this.endpointParametersBuilder.e = z2 ? this.wtEndpointBaseUrl : this.wsEndpointBaseUrl;
        Long l = params.c;
        if (l != null) {
            this.endpointParametersBuilder.g = Long.valueOf(l.longValue());
        }
        String str2 = params.b;
        if (str2 != null) {
            this.endpointParametersBuilder.a = str2;
        }
        if (z2) {
            this.endpointParametersBuilder.p = WTSignaling.INSTANCE.getDefaultCompression();
            mjhVar = new WTSignaling.Builder().setWtTrafficLoggingEnabled(false);
        } else {
            this.endpointParametersBuilder.p = null;
            mjhVar = new mjh();
        }
        ri1 ri1Var = this.callParams.b;
        qze logConfiguration = mjhVar.setTimeoutMS(30000).setReconnectTimeoutAction(this.reconnectTimeoutAction).setSignalingStat((m0f) this.conversationStats.wsSignalingStat).setExecutor(this.executorService).setLog(this.log).setLogConfiguration(this.logConfiguration);
        ri1 ri1Var2 = this.callParams.b;
        return logConfiguration.setServerPingTimeoutMs(20000L).setFastRecoverEnabled(this.callParams.k).setEndpointParameters(this.endpointParametersBuilder.a()).setIsReplaceParametersInEndpointEnabled(((Boolean) this.isFastStartEnabled.invoke()).booleanValue()).build();
    }
}
