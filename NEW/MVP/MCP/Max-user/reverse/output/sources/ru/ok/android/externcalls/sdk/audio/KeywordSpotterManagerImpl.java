package ru.ok.android.externcalls.sdk.audio;

import android.os.Handler;
import android.os.Looper;
import defpackage.a9h;
import defpackage.cd5;
import defpackage.cj;
import defpackage.de;
import defpackage.gu3;
import defpackage.j0e;
import defpackage.k01;
import defpackage.m08;
import defpackage.nm0;
import defpackage.pdf;
import defpackage.py4;
import defpackage.q3f;
import defpackage.qu1;
import defpackage.qz5;
import defpackage.rve;
import defpackage.sl6;
import defpackage.ssa;
import defpackage.u0e;
import defpackage.u2f;
import defpackage.v08;
import defpackage.y6d;
import defpackage.y8g;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.audio.KeywordSpotterManager;
import ru.ok.android.externcalls.sdk.audio.internal.KeywordSpotterConfigProvider;
import ru.ok.android.externcalls.sdk.stat.kws.ConversationKwsStat;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u000e0\u000e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManagerImpl;", "Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager;", "Lk01;", "call", "Lru/ok/android/externcalls/sdk/stat/kws/ConversationKwsStat;", "stat", "Lru/ok/android/externcalls/sdk/audio/internal/KeywordSpotterConfigProvider;", "configProvider", "Ly8g;", "timeProvider", "Ly6d;", "logger", "<init>", "(Lk01;Lru/ok/android/externcalls/sdk/stat/kws/ConversationKwsStat;Lru/ok/android/externcalls/sdk/audio/internal/KeywordSpotterConfigProvider;Ly8g;Ly6d;)V", "", "timeout", "Lqqg;", "scheduleTurnOff", "(J)V", "Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterParams;", "params", "setKeywordSpotterParams", "(Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterParams;)V", "release", "()V", "Lk01;", "Lru/ok/android/externcalls/sdk/stat/kws/ConversationKwsStat;", "Ly8g;", "Ly6d;", "Lnm0;", "kotlin.jvm.PlatformType", "turnOffInMs", "Lnm0;", "startTimeMs", "J", "Lpy4;", "turnOffDisposable", "Lpy4;", "shutDownDisposable", "initDisposable", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lorg/webrtc/NativeDoubleArrayConsumer$Consumer;", "consumer", "Lorg/webrtc/NativeDoubleArrayConsumer$Consumer;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeywordSpotterManagerImpl implements KeywordSpotterManager {
    public static final String LOG_TAG = "KeywordSpotterManagerImpl";
    private final k01 call;
    private final NativeDoubleArrayConsumer.Consumer consumer;
    private final py4 initDisposable;
    private final y6d logger;
    private final Handler mainHandler;
    private py4 shutDownDisposable;
    private long startTimeMs;
    private final ConversationKwsStat stat;
    private final y8g timeProvider;
    private py4 turnOffDisposable;
    private final nm0 turnOffInMs = new nm0(null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lqqg;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl$scheduleTurnOff$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements gu3 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void accept$lambda$0(Double[] dArr) {
        }

        @Override // defpackage.gu3
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept(((Number) obj).longValue());
        }

        public final void accept(long j) {
            KeywordSpotterManagerImpl.this.logger.log("KeywordSpotterManagerImpl", "Turning wordspotter off");
            k01 k01Var = KeywordSpotterManagerImpl.this.call;
            m08 m08Var = new m08(false, null, new a());
            rve rveVar = k01Var.f0;
            if (rveVar == null) {
                return;
            }
            k01Var.c.execute(new cj(k01Var, rveVar, m08Var, 7));
        }
    }

    public KeywordSpotterManagerImpl(k01 k01Var, ConversationKwsStat conversationKwsStat, KeywordSpotterConfigProvider keywordSpotterConfigProvider, y8g y8gVar, y6d y6dVar) {
        this.call = k01Var;
        this.stat = conversationKwsStat;
        this.timeProvider = y8gVar;
        this.logger = y6dVar;
        cd5 cd5Var = cd5.a;
        this.turnOffDisposable = cd5Var;
        this.shutDownDisposable = cd5Var;
        u2f u2fVarI = keywordSpotterConfigProvider.getConfig().i(de.a());
        qu1 qu1Var = new qu1(new gu3() { // from class: ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl$initDisposable$1
            @Override // defpackage.gu3
            public final void accept(KeywordSpotterManager.KeywordSpotterConfig keywordSpotterConfig) {
                this.this$0.logger.log("KeywordSpotterManagerImpl", "Wordspotter control config ready: " + keywordSpotterConfig);
                if (keywordSpotterConfig.getTurnOffInMs() != null) {
                    this.this$0.turnOffInMs.f(keywordSpotterConfig.getTurnOffInMs());
                }
            }
        }, 2, new gu3() { // from class: ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl$initDisposable$2
            @Override // defpackage.gu3
            public final void accept(Throwable th) {
                this.this$0.logger.logException("KeywordSpotterManagerImpl", "Error getting wordspotter control config", th);
            }
        });
        u2fVarI.k(qu1Var);
        this.initDisposable = qu1Var;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.consumer = new sl6(8, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumer$lambda$2(KeywordSpotterManagerImpl keywordSpotterManagerImpl, Double[] dArr) {
        for (Double d : dArr) {
            keywordSpotterManagerImpl.logger.log("KeywordSpotterManagerImpl", "Keyword detected: ".concat(String.format("%6f", Arrays.copyOf(new Object[]{d}, 1))));
        }
        if (dArr.length == 0) {
            return;
        }
        keywordSpotterManagerImpl.mainHandler.post(new qz5(keywordSpotterManagerImpl, 18, dArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumer$lambda$2$lambda$1(KeywordSpotterManagerImpl keywordSpotterManagerImpl, Double[] dArr) {
        ConversationKwsStat conversationKwsStat = keywordSpotterManagerImpl.stat;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        int i = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, dArr[i].doubleValue());
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        conversationKwsStat.onKeyword((float) dDoubleValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleTurnOff(long timeout) {
        this.logger.log("KeywordSpotterManagerImpl", a9h.d(timeout, "Schedule wordspotter shutdown in ", " ms"));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        u2f u2fVarI = new q3f(timeout, j0eVarA).i(de.a());
        qu1 qu1Var = new qu1(new AnonymousClass1(), 2, new gu3() { // from class: ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl.scheduleTurnOff.2
            @Override // defpackage.gu3
            public final void accept(Throwable th) {
                KeywordSpotterManagerImpl.this.logger.logException("KeywordSpotterManagerImpl", "Error on worspotter shutdown", th);
            }
        });
        u2fVarI.k(qu1Var);
        this.shutDownDisposable = qu1Var;
    }

    public final void release() {
        this.logger.log("KeywordSpotterManagerImpl", "Releasing wordspotter manager");
        this.initDisposable.dispose();
        this.turnOffDisposable.dispose();
        this.shutDownDisposable.dispose();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.KeywordSpotterManager
    public void setKeywordSpotterParams(KeywordSpotterManager.KeywordSpotterParams params) {
        this.logger.log("KeywordSpotterManagerImpl", "Cleaning scheduled actions");
        this.turnOffDisposable.dispose();
        this.shutDownDisposable.dispose();
        this.logger.log("KeywordSpotterManagerImpl", "Updating wordspotter stat with params " + params);
        k01 k01Var = this.call;
        m08 m08Var = new m08(params.isEnabled(), params.getFilePath(), this.consumer);
        rve rveVar = k01Var.f0;
        if (rveVar != null) {
            k01Var.c.execute(new cj(k01Var, rveVar, m08Var, 7));
        }
        if (params.isEnabled()) {
            this.startTimeMs = this.timeProvider.getMsSinceBoot();
            ssa ssaVarL = this.turnOffInMs.l(de.a());
            v08 v08Var = new v08(new gu3() { // from class: ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl.setKeywordSpotterParams.1
                @Override // defpackage.gu3
                public final void accept(Long l) {
                    KeywordSpotterManagerImpl keywordSpotterManagerImpl = KeywordSpotterManagerImpl.this;
                    long jLongValue = l.longValue() - (KeywordSpotterManagerImpl.this.timeProvider.getMsSinceBoot() - KeywordSpotterManagerImpl.this.startTimeMs);
                    if (jLongValue < 0) {
                        jLongValue = 0;
                    }
                    keywordSpotterManagerImpl.scheduleTurnOff(jLongValue);
                }
            }, new gu3() { // from class: ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl.setKeywordSpotterParams.2
                @Override // defpackage.gu3
                public final void accept(Throwable th) {
                    KeywordSpotterManagerImpl.this.logger.logException("KeywordSpotterManagerImpl", "Error on schedule worspotter shutdown", th);
                }
            }, pdf.d);
            ssaVarL.a(v08Var);
            this.turnOffDisposable = v08Var;
        }
    }
}
