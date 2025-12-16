package xQ0;

import com.avito.avcalls.android.signaling.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TerminateReason.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LxQ0/k;", "", "Companion", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LxQ0/k$a;", "LxQ0/k$b;", "LxQ0/k$d;", "LxQ0/k$e;", "LxQ0/k$f;", "LxQ0/k$g;", "LxQ0/k$h;", "LxQ0/k$i;", "LxQ0/k$j;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f442495a;

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/k$a;", "LxQ0/k;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f442496b = new a();

        public a() {
            super("answer_timeout", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1810604883;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/k$b;", "LxQ0/k;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f442497b = new b();

        public b() {
            super("busy", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1027766735;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"LxQ0/k$c;", "", "<init>", "()V", "", "REASON_ANSWER_TIMEOUT", "Ljava/lang/String;", "REASON_BUSY", "REASON_CONNECT_TIMEOUT", "REASON_HANGUP", "REASON_INTERNAL_ERROR", "REASON_NO_MIC_ACCESS", "REASON_REJECT", "REASON_SERVER_ERROR", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xQ0.k$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static k a(@Y61.k t tVar) {
            return tVar.equals(t.b.f332162b) ? true : tVar.equals(t.e.f332164b) ? i.f442503b : tVar.equals(t.a.f332161b) ? f.f442500b : new j(tVar.f332160a);
        }

        public Companion() {
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/k$d;", "LxQ0/k;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f442498b = new d();

        public d() {
            super("connect_timeout", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 755778925;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/k$e;", "LxQ0/k;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final e f442499b = new e();

        public e() {
            super("hangup", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -5503773;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/k$f;", "LxQ0/k;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final f f442500b = new f();

        public f() {
            super("internal_error", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 176034357;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/k$g;", "LxQ0/k;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final g f442501b = new g();

        public g() {
            super("no_mic_access", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -870273740;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/k$h;", "LxQ0/k;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final h f442502b = new h();

        public h() {
            super("reject", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 284360181;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/k$i;", "LxQ0/k;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final i f442503b = new i();

        public i() {
            super("server_error", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1713946641;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxQ0/k$j;", "LxQ0/k;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f442504b;

        public j(@Y61.k String str) {
            super(str, null);
            this.f442504b = str;
        }

        @Override // xQ0.k
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF442495a() {
            return this.f442504b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f442504b, ((j) obj).f442504b);
        }

        public final int hashCode() {
            return this.f442504b.hashCode();
        }
    }

    public k(String str, C42822w c42822w) {
        this.f442495a = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public String getF442495a() {
        return this.f442495a;
    }

    @Y61.k
    public final String toString() {
        return getF442495a();
    }
}
