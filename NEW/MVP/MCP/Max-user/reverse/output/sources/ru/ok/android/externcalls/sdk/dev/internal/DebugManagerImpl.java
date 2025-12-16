package ru.ok.android.externcalls.sdk.dev.internal;

import defpackage.cj;
import defpackage.em6;
import defpackage.hcf;
import defpackage.k01;
import defpackage.k32;
import defpackage.o64;
import defpackage.p64;
import defpackage.rl;
import defpackage.rve;
import defpackage.tk4;
import defpackage.udf;
import defpackage.y6d;
import defpackage.y9i;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 62\u00020\u0001:\u00016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010'\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u001a\u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/DebugManagerImpl;", "Lru/ok/android/externcalls/sdk/dev/DebugManager;", "Lk01;", "underlyingCall", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "stat", "Lo64;", "cidProvider", "Ly6d;", "log", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lk01;Lru/ok/android/externcalls/sdk/log/ExtLogger;Lo64;Ly6d;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lhcf;", "operation", "", "param", "Lqqg;", "report", "(Lhcf;Ljava/lang/String;)V", "", NegotiationErrorStat.KEY_ERROR, "reportError", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lk32;", "updater", "updateCameraToggles", "(Lem6;)V", "dumpPath", "enableFullAudioDump", "(Ljava/lang/String;)V", "Ludf;", "listener", "", "period", "Ljava/util/concurrent/TimeUnit;", "unit", "registerStatListener", "(Ludf;ILjava/util/concurrent/TimeUnit;)V", "removeStatListener", "(Ludf;)V", "Lk01;", "getUnderlyingCall", "()Lk01;", "Lru/ok/android/externcalls/sdk/log/ExtLogger;", "Lo64;", "Ly6d;", "Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "mediaDumpManager", "Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "getMediaDumpManager", "()Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugManagerImpl implements DebugManager {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "DebugManager";
    private final o64 cidProvider;
    private final y6d log;
    private final MediaDumpManagerImpl mediaDumpManager;
    private final ExtLogger stat;
    private final k01 underlyingCall;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/DebugManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    public DebugManagerImpl(k01 k01Var, ExtLogger extLogger, o64 o64Var, y6d y6dVar, SignalingProvider signalingProvider) {
        this.underlyingCall = k01Var;
        this.stat = extLogger;
        this.cidProvider = o64Var;
        this.log = y6dVar;
        this.mediaDumpManager = new MediaDumpManagerImpl(getUnderlyingCall(), signalingProvider);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void enableFullAudioDump(String dumpPath) {
        k01 underlyingCall = getUnderlyingCall();
        rve rveVar = underlyingCall.f0;
        if (rveVar == null) {
            return;
        }
        underlyingCall.c.execute(new cj(underlyingCall, rveVar, dumpPath, 6));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public k01 getUnderlyingCall() {
        return this.underlyingCall;
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void registerStatListener(udf listener, int period, TimeUnit unit) {
        ((HashMap) getUnderlyingCall().M0.c).put(listener, new y9i(period, unit));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void removeStatListener(udf listener) {
        ((HashMap) getUnderlyingCall().M0.c).remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void report(hcf operation, String param) {
        this.stat.logSimple(operation, ((p64) this.cidProvider).a, param);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void reportError(Throwable error) {
        this.log.reportException(LOG_TAG, NegotiationErrorStat.KEY_ERROR, error);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void updateCameraToggles(em6 updater) {
        rl rlVar = (rl) getUnderlyingCall().h0.h;
        synchronized (rlVar.b) {
            rlVar.c = (k32) updater.invoke((k32) rlVar.c);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public MediaDumpManagerImpl getMediaDumpManager() {
        return this.mediaDumpManager;
    }
}
