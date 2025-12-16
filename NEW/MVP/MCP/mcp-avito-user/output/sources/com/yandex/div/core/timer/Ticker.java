package com.yandex.div.core.timer;

import Y41.l;
import com.yandex.div.core.timer.i;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.ranges.s;

/* compiled from: Ticker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/timer/Ticker;", "", "a", "State", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class Ticker {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f367679q = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f367680a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<Long, G0> f367681b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l<Long, G0> f367682c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l<Long, G0> f367683d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l<Long, G0> f367684e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.core.view2.errors.d f367685f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Long f367686g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Long f367687h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Long f367688i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Long f367689j;

    /* renamed from: l, reason: collision with root package name */
    public long f367691l;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Timer f367694o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public c f367695p;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public State f367690k = State.f367696b;

    /* renamed from: m, reason: collision with root package name */
    public long f367692m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f367693n = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Ticker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/timer/Ticker$State;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f367696b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f367697c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f367698d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ State[] f367699e;

        static {
            State state = new State("STOPPED", 0);
            f367696b = state;
            State state2 = new State("WORKING", 1);
            f367697c = state2;
            State state3 = new State("PAUSED", 2);
            f367698d = state3;
            f367699e = new State[]{state, state2, state3};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f367699e.clone();
        }
    }

    /* compiled from: Ticker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/timer/Ticker$a;", "", "<init>", "()V", "", "DEFAULT_VALUE", "J", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Ticker.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[State.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
        }
    }

    /* compiled from: Timer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"S41/d", "Ljava/util/TimerTask;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends TimerTask {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f367700b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.a aVar) {
            this.f367700b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            this.f367700b.invoke();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticker(@Y61.k String str, @Y61.k l<? super Long, G0> lVar, @Y61.k l<? super Long, G0> lVar2, @Y61.k l<? super Long, G0> lVar3, @Y61.k l<? super Long, G0> lVar4, @Y61.l com.yandex.div.core.view2.errors.d dVar) {
        this.f367680a = str;
        this.f367681b = lVar;
        this.f367682c = lVar2;
        this.f367683d = lVar3;
        this.f367684e = lVar4;
        this.f367685f = dVar;
    }

    public final void a() {
        int iOrdinal = this.f367690k.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.f367690k = State.f367696b;
            b();
            this.f367681b.invoke(Long.valueOf(d()));
            f();
        }
    }

    public final void b() {
        c cVar = this.f367695p;
        if (cVar != null) {
            cVar.cancel();
        }
        this.f367695p = null;
    }

    public final void c() {
        Long l12 = this.f367686g;
        l<Long, G0> lVar = this.f367684e;
        if (l12 != null) {
            lVar.invoke(Long.valueOf(s.d(d(), l12.longValue())));
        } else {
            lVar.invoke(Long.valueOf(d()));
        }
    }

    public final long d() {
        return (this.f367692m == -1 ? 0L : System.currentTimeMillis() - this.f367692m) + this.f367691l;
    }

    public final void e(String str) {
        this.f367685f.a(new IllegalArgumentException(str));
    }

    public final void f() {
        this.f367692m = -1L;
        this.f367693n = -1L;
        this.f367691l = 0L;
    }

    public final void g() {
        Long l12 = this.f367689j;
        Long l13 = this.f367688i;
        if (l12 != null && this.f367693n != -1 && System.currentTimeMillis() - this.f367693n > l12.longValue()) {
            c();
        }
        if (l12 == null && l13 != null) {
            long jLongValue = l13.longValue();
            long jD2 = jLongValue - d();
            if (jD2 >= 0) {
                i(jD2, jD2, new d(this, jLongValue));
                return;
            } else {
                ((i.f) this.f367683d).invoke(l13);
                f();
                return;
            }
        }
        if (l12 == null || l13 == null) {
            if (l12 == null || l13 != null) {
                return;
            }
            long jLongValue2 = l12.longValue();
            i(jLongValue2, jLongValue2 - (d() % jLongValue2), new e(this));
            return;
        }
        long jLongValue3 = l13.longValue();
        long jLongValue4 = l12.longValue();
        long jD3 = jLongValue4 - (d() % jLongValue4);
        l0.g gVar = new l0.g();
        gVar.f406841b = (jLongValue3 / jLongValue4) - (d() / jLongValue4);
        i(jLongValue4, jD3, new g(jLongValue3, this, gVar, jLongValue4, new h(gVar, this, jLongValue3)));
    }

    public final void h() {
        if (this.f367692m != -1) {
            this.f367691l += System.currentTimeMillis() - this.f367692m;
            this.f367693n = System.currentTimeMillis();
            this.f367692m = -1L;
        }
        b();
    }

    public final void i(long j12, long j13, @Y61.k Y41.a<G0> aVar) {
        c cVar = this.f367695p;
        if (cVar != null) {
            cVar.cancel();
        }
        this.f367695p = new c(aVar);
        this.f367692m = System.currentTimeMillis();
        Timer timer = this.f367694o;
        if (timer == null) {
            return;
        }
        timer.scheduleAtFixedRate(this.f367695p, j13, j12);
    }

    public final void j() {
        int iOrdinal = this.f367690k.ordinal();
        if (iOrdinal == 0) {
            b();
            this.f367688i = this.f367686g;
            this.f367689j = this.f367687h;
            this.f367690k = State.f367697c;
            this.f367682c.invoke(Long.valueOf(d()));
            g();
            return;
        }
        String str = this.f367680a;
        if (iOrdinal == 1) {
            e("The timer '" + str + "' already working!");
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        e("The timer '" + str + "' paused!");
    }
}
