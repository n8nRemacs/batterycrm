package androidx.work;

import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WorkInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/WorkInfo;", "", "a", "b", "State", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WorkInfo {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UUID f55407a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final State f55408b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<String> f55409c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C23544h f55410d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C23544h f55411e;

    /* renamed from: f, reason: collision with root package name */
    public final int f55412f;

    /* renamed from: g, reason: collision with root package name */
    public final int f55413g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C23542f f55414h;

    /* renamed from: i, reason: collision with root package name */
    public final long f55415i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final b f55416j;

    /* renamed from: k, reason: collision with root package name */
    public final long f55417k;

    /* renamed from: l, reason: collision with root package name */
    public final int f55418l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/WorkInfo$State;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f55419b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f55420c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f55421d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f55422e;

        /* renamed from: f, reason: collision with root package name */
        public static final State f55423f;

        /* renamed from: g, reason: collision with root package name */
        public static final State f55424g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ State[] f55425h;

        static {
            State state = new State("ENQUEUED", 0);
            f55419b = state;
            State state2 = new State("RUNNING", 1);
            f55420c = state2;
            State state3 = new State("SUCCEEDED", 2);
            f55421d = state3;
            State state4 = new State("FAILED", 3);
            f55422e = state4;
            State state5 = new State("BLOCKED", 4);
            f55423f = state5;
            State state6 = new State("CANCELLED", 5);
            f55424g = state6;
            f55425h = new State[]{state, state2, state3, state4, state5, state6};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f55425h.clone();
        }

        public final boolean a() {
            return this == f55421d || this == f55422e || this == f55424g;
        }
    }

    /* compiled from: WorkInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Landroidx/work/WorkInfo$a;", "", "<init>", "()V", "", "STOP_REASON_APP_STANDBY", "I", "STOP_REASON_BACKGROUND_RESTRICTION", "STOP_REASON_CANCELLED_BY_APP", "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW", "STOP_REASON_CONSTRAINT_CHARGING", "STOP_REASON_CONSTRAINT_CONNECTIVITY", "STOP_REASON_CONSTRAINT_DEVICE_IDLE", "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW", "STOP_REASON_DEVICE_STATE", "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED", "STOP_REASON_FOREGROUND_SERVICE_TIMEOUT", "STOP_REASON_NOT_STOPPED", "STOP_REASON_PREEMPT", "STOP_REASON_QUOTA", "STOP_REASON_SYSTEM_PROCESSING", "STOP_REASON_TIMEOUT", "STOP_REASON_UNKNOWN", "STOP_REASON_USER", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WorkInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/WorkInfo$b;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f55426a;

        /* renamed from: b, reason: collision with root package name */
        public final long f55427b;

        public b(long j12, long j13) {
            this.f55426a = j12;
            this.f55427b = j13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f55426a == this.f55426a && bVar.f55427b == this.f55427b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f55427b) + (Long.hashCode(this.f55426a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb2.append(this.f55426a);
            sb2.append(", flexIntervalMillis=");
            return androidx.appcompat.app.r.u(sb2, this.f55427b, '}');
        }
    }

    static {
        new a(null);
    }

    @X41.j
    public WorkInfo() {
        throw null;
    }

    @X41.j
    public WorkInfo(@Y61.k UUID uuid, @Y61.k State state, @Y61.k Set<String> set, @Y61.k C23544h c23544h, @Y61.k C23544h c23544h2, int i12, int i13, @Y61.k C23542f c23542f, long j12, @Y61.l b bVar, long j13, int i14) {
        this.f55407a = uuid;
        this.f55408b = state;
        this.f55409c = set;
        this.f55410d = c23544h;
        this.f55411e = c23544h2;
        this.f55412f = i12;
        this.f55413g = i13;
        this.f55414h = c23542f;
        this.f55415i = j12;
        this.f55416j = bVar;
        this.f55417k = j13;
        this.f55418l = i14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WorkInfo.class.equals(obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f55412f == workInfo.f55412f && this.f55413g == workInfo.f55413g && kotlin.jvm.internal.L.f(this.f55407a, workInfo.f55407a) && this.f55408b == workInfo.f55408b && kotlin.jvm.internal.L.f(this.f55410d, workInfo.f55410d) && kotlin.jvm.internal.L.f(this.f55414h, workInfo.f55414h) && this.f55415i == workInfo.f55415i && kotlin.jvm.internal.L.f(this.f55416j, workInfo.f55416j) && this.f55417k == workInfo.f55417k && this.f55418l == workInfo.f55418l && kotlin.jvm.internal.L.f(this.f55409c, workInfo.f55409c)) {
            return kotlin.jvm.internal.L.f(this.f55411e, workInfo.f55411e);
        }
        return false;
    }

    public final int hashCode() {
        int iG2 = androidx.appcompat.app.r.g((this.f55414h.hashCode() + ((((((this.f55411e.hashCode() + androidx.media3.exoplayer.analytics.m.g(this.f55409c, (this.f55410d.hashCode() + ((this.f55408b.hashCode() + (this.f55407a.hashCode() * 31)) * 31)) * 31, 31)) * 31) + this.f55412f) * 31) + this.f55413g) * 31)) * 31, 31, this.f55415i);
        b bVar = this.f55416j;
        return Integer.hashCode(this.f55418l) + androidx.appcompat.app.r.g((iG2 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f55417k);
    }

    @Y61.k
    public final String toString() {
        return "WorkInfo{id='" + this.f55407a + "', state=" + this.f55408b + ", outputData=" + this.f55410d + ", tags=" + this.f55409c + ", progress=" + this.f55411e + ", runAttemptCount=" + this.f55412f + ", generation=" + this.f55413g + ", constraints=" + this.f55414h + ", initialDelayMillis=" + this.f55415i + ", periodicityInfo=" + this.f55416j + ", nextScheduleTimeMillis=" + this.f55417k + "}, stopReason=" + this.f55418l;
    }

    public /* synthetic */ WorkInfo(UUID uuid, State state, Set set, C23544h c23544h, C23544h c23544h2, int i12, int i13, C23542f c23542f, long j12, b bVar, long j13, int i14, int i15, C42822w c42822w) {
        this(uuid, state, set, (i15 & 8) != 0 ? C23544h.f55509c : c23544h, (i15 & 16) != 0 ? C23544h.f55509c : c23544h2, (i15 & 32) != 0 ? 0 : i12, (i15 & 64) != 0 ? 0 : i13, (i15 & 128) != 0 ? C23542f.f55486j : c23542f, (i15 & 256) != 0 ? 0L : j12, (i15 & 512) != 0 ? null : bVar, (i15 & 1024) != 0 ? Long.MAX_VALUE : j13, (i15 & 2048) != 0 ? -256 : i14);
    }
}
