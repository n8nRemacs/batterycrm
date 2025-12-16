package ru.ok.android.externcalls.sdk.rate.internal;

import defpackage.cm6;
import defpackage.de;
import defpackage.en6;
import defpackage.fni;
import defpackage.gu3;
import defpackage.hn6;
import defpackage.mdg;
import defpackage.pdf;
import defpackage.py4;
import defpackage.qu1;
import defpackage.ssa;
import defpackage.u2f;
import defpackage.v08;
import defpackage.xm6;
import defpackage.y6d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.RateManagerConfig;
import ru.ok.android.externcalls.sdk.rate.RateManagerConfigProvider;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u0000 32\u00020\u0001:\u00013B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00150/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RateManagerImpl;", "Lru/ok/android/externcalls/sdk/rate/RateManager;", "Ly6d;", "log", "Lru/ok/android/externcalls/sdk/rate/RateManagerConfigProvider;", "configProvider", "Lkotlin/Function0;", "Lmdg;", "currentTopology", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "statMonitor", "<init>", "(Ly6d;Lru/ok/android/externcalls/sdk/rate/RateManagerConfigProvider;Lcm6;Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;)V", "Lru/ok/android/externcalls/sdk/rate/RateManagerConfig;", "config", "Lqqg;", "onConfigReceived", "(Lru/ok/android/externcalls/sdk/rate/RateManagerConfig;)V", "Lpy4;", "observeStats", "()Lpy4;", "Lru/ok/android/externcalls/sdk/rate/RateHint;", "rateHint", "addRateHint", "(Lru/ok/android/externcalls/sdk/rate/RateHint;)V", "logHints", "()V", "release", "Ly6d;", "Lcm6;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "rttTrigger", "Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger;", "lossTrigger", "Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger;", "Lru/ok/android/externcalls/sdk/rate/internal/CandidateTypeHintTrigger;", "directCandidateTypeTrigger", "Lru/ok/android/externcalls/sdk/rate/internal/CandidateTypeHintTrigger;", "serverCandidateTypeTrigger", "initDisposable", "Lpy4;", "observeDisposable", "", "_rateHints", "Ljava/util/List;", "", "rateHints", "getRateHints", "()Ljava/util/List;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateManagerImpl implements RateManager {
    public static final String LOG_TAG = "RateManager";
    private final List<RateHint> _rateHints;
    private final cm6 currentTopology;
    private CandidateTypeHintTrigger directCandidateTypeTrigger;
    private final py4 initDisposable;
    private final y6d log;
    private LossHintTrigger lossTrigger;
    private py4 observeDisposable;
    private final List<RateHint> rateHints;
    private RttRateHintTrigger rttTrigger;
    private CandidateTypeHintTrigger serverCandidateTypeTrigger;
    private final StatMonitor statMonitor;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$onConfigReceived$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C00551 implements RateHintCollection, en6 {
        public C00551() {
        }

        @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
        public final void addRateHint(RateHint rateHint) {
            RateManagerImpl.this.addRateHint(rateHint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RateHintCollection) && (obj instanceof en6)) {
                return fni.a(getFunctionDelegate(), ((en6) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.en6
        public final xm6 getFunctionDelegate() {
            return new hn6(1, 0, RateManagerImpl.class, RateManagerImpl.this, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$onConfigReceived$2, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C00562 implements RateHintCollection, en6 {
        public C00562() {
        }

        @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
        public final void addRateHint(RateHint rateHint) {
            RateManagerImpl.this.addRateHint(rateHint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RateHintCollection) && (obj instanceof en6)) {
                return fni.a(getFunctionDelegate(), ((en6) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.en6
        public final xm6 getFunctionDelegate() {
            return new hn6(1, 0, RateManagerImpl.class, RateManagerImpl.this, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$onConfigReceived$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 implements RateHintCollection, en6 {
        public AnonymousClass3() {
        }

        @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
        public final void addRateHint(RateHint rateHint) {
            RateManagerImpl.this.addRateHint(rateHint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RateHintCollection) && (obj instanceof en6)) {
                return fni.a(getFunctionDelegate(), ((en6) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.en6
        public final xm6 getFunctionDelegate() {
            return new hn6(1, 0, RateManagerImpl.class, RateManagerImpl.this, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$onConfigReceived$4, reason: invalid class name */
    public /* synthetic */ class AnonymousClass4 implements RateHintCollection, en6 {
        public AnonymousClass4() {
        }

        @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
        public final void addRateHint(RateHint rateHint) {
            RateManagerImpl.this.addRateHint(rateHint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RateHintCollection) && (obj instanceof en6)) {
                return fni.a(getFunctionDelegate(), ((en6) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.en6
        public final xm6 getFunctionDelegate() {
            return new hn6(1, 0, RateManagerImpl.class, RateManagerImpl.this, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public RateManagerImpl(y6d y6dVar, RateManagerConfigProvider rateManagerConfigProvider, cm6 cm6Var, StatMonitor statMonitor) {
        this.log = y6dVar;
        this.currentTopology = cm6Var;
        this.statMonitor = statMonitor;
        ArrayList arrayList = new ArrayList();
        this._rateHints = arrayList;
        this.rateHints = arrayList;
        u2f u2fVarI = rateManagerConfigProvider.getConfig().i(de.a());
        qu1 qu1Var = new qu1(new gu3() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.1
            @Override // defpackage.gu3
            public final void accept(RateManagerConfig rateManagerConfig) {
                RateManagerImpl.this.onConfigReceived(rateManagerConfig);
            }
        }, 2, new gu3() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.2
            @Override // defpackage.gu3
            public final void accept(Throwable th) {
                RateManagerImpl.this.log.reportException("RateManager", "Can't get rate manager config", th);
            }
        });
        u2fVarI.k(qu1Var);
        this.initDisposable = qu1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addRateHint(RateHint rateHint) {
        this._rateHints.add(rateHint);
        this.log.log("RateManager", "addRateHint " + rateHint);
    }

    private final py4 observeStats() {
        ssa ssaVarL = this.statMonitor.observeStat().l(de.a());
        v08 v08Var = new v08(new gu3() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.observeStats.1

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl$observeStats$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[mdg.values().length];
                    try {
                        iArr[1] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[2] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[0] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // defpackage.gu3
            public final void accept(NetworkStat networkStat) {
                CandidateTypeHintTrigger candidateTypeHintTrigger;
                RttRateHintTrigger rttRateHintTrigger = RateManagerImpl.this.rttTrigger;
                if (rttRateHintTrigger != null) {
                    rttRateHintTrigger.onNetworkStat(networkStat);
                }
                LossHintTrigger lossHintTrigger = RateManagerImpl.this.lossTrigger;
                if (lossHintTrigger != null) {
                    lossHintTrigger.onNetworkStat(networkStat);
                }
                int i = WhenMappings.$EnumSwitchMapping$0[((mdg) RateManagerImpl.this.currentTopology.invoke()).ordinal()];
                if (i != 1) {
                    if (i == 2 && (candidateTypeHintTrigger = RateManagerImpl.this.serverCandidateTypeTrigger) != null) {
                        candidateTypeHintTrigger.onNetworkStat(networkStat);
                        return;
                    }
                    return;
                }
                CandidateTypeHintTrigger candidateTypeHintTrigger2 = RateManagerImpl.this.directCandidateTypeTrigger;
                if (candidateTypeHintTrigger2 != null) {
                    candidateTypeHintTrigger2.onNetworkStat(networkStat);
                }
            }
        }, new gu3() { // from class: ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl.observeStats.2
            @Override // defpackage.gu3
            public final void accept(Throwable th) {
                RateManagerImpl.this.log.reportException("RateManager", "Can't get rate manager config", th);
            }
        }, pdf.d);
        ssaVarL.a(v08Var);
        return v08Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfigReceived(RateManagerConfig config) {
        if (config.getRttRateHintConfig().isNotEmpty()) {
            this.rttTrigger = new RttRateHintTrigger(this.log, config.getRttRateHintConfig(), new C00551());
        }
        if (config.getLossHintConfig().isNotEmpty()) {
            this.lossTrigger = new LossHintTrigger(this.log, config.getLossHintConfig(), new C00562());
        }
        if (config.getDirectCandidateTypeHintConfig().isNotEmpty()) {
            this.directCandidateTypeTrigger = new CandidateTypeHintTrigger(this.log, config.getDirectCandidateTypeHintConfig(), new AnonymousClass3(), "");
        }
        if (config.getServerCandidateTypeHintConfig().isNotEmpty()) {
            this.serverCandidateTypeTrigger = new CandidateTypeHintTrigger(this.log, config.getServerCandidateTypeHintConfig(), new AnonymousClass4(), "s");
        }
        this.observeDisposable = observeStats();
    }

    @Override // ru.ok.android.externcalls.sdk.rate.RateManager
    public List<RateHint> getRateHints() {
        return this.rateHints;
    }

    public final void logHints() {
        this.log.log("RateManager", "rateHints = " + getRateHints() + ", shouldRateConversation=" + getShouldRateConversation());
    }

    public final void release() {
        this.initDisposable.dispose();
        py4 py4Var = this.observeDisposable;
        if (py4Var != null) {
            py4Var.dispose();
        }
    }
}
