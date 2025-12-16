package uQ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.avcalls.call.models.CallDirection;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.avito.avcalls.call.models.CreateCallMetaInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsAnalyticsEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LuQ0/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "LuQ0/b$a;", "LuQ0/b$b;", "LuQ0/b$c;", "LuQ0/b$d;", "LuQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class b {

    /* compiled from: AvCallsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LuQ0/b$a;", "LuQ0/b;", "<init>", "()V", "a", "LuQ0/b$a$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$a$a;", "LuQ0/b$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: uQ0.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12712a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439932a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f439933b;

            public C12712a(@k String str, @k String str2) {
                super(null);
                this.f439932a = str;
                this.f439933b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12712a)) {
                    return false;
                }
                C12712a c12712a = (C12712a) obj;
                return L.f(this.f439932a, c12712a.f439932a) && L.f(this.f439933b, c12712a.f439933b);
            }

            public final int hashCode() {
                return this.f439933b.hashCode() + (this.f439932a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("IncomingMessageDrop(callId=");
                sb2.append(this.f439932a);
                sb2.append(", messageType=");
                return C22026a.c(sb2, this.f439933b, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
            super(null);
        }
    }

    /* compiled from: AvCallsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LuQ0/b$b;", "LuQ0/b;", "<init>", "()V", "a", "b", "c", "d", "e", "LuQ0/b$b$a;", "LuQ0/b$b$b;", "LuQ0/b$b$c;", "LuQ0/b$b$d;", "LuQ0/b$b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uQ0.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC12713b extends b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$b$a;", "LuQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: uQ0.b$b$a */
        public static final /* data */ class a extends AbstractC12713b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439934a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f439935b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CallDirection f439936c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final CallMetaInfo f439937d;

            public a(@k String str, boolean z12, @k CallDirection callDirection, @k CallMetaInfo callMetaInfo) {
                super(null);
                this.f439934a = str;
                this.f439935b = z12;
                this.f439936c = callDirection;
                this.f439937d = callMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f439934a, aVar.f439934a) && this.f439935b == aVar.f439935b && this.f439936c == aVar.f439936c && L.f(this.f439937d, aVar.f439937d);
            }

            public final int hashCode() {
                return this.f439937d.hashCode() + ((this.f439936c.hashCode() + r.i(this.f439934a.hashCode() * 31, 31, this.f439935b)) * 31);
            }

            @k
            public final String toString() {
                return "CallActiveAndConnected(callId=" + this.f439934a + ", isVideo=" + this.f439935b + ", direction=" + this.f439936c + ", meta=" + this.f439937d + ')';
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$b$b;", "LuQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: uQ0.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12714b extends AbstractC12713b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439938a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f439939b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CallMetaInfo f439940c;

            public C12714b(@k String str, boolean z12, @k CallMetaInfo callMetaInfo) {
                super(null);
                this.f439938a = str;
                this.f439939b = z12;
                this.f439940c = callMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12714b)) {
                    return false;
                }
                C12714b c12714b = (C12714b) obj;
                return L.f(this.f439938a, c12714b.f439938a) && this.f439939b == c12714b.f439939b && L.f(this.f439940c, c12714b.f439940c);
            }

            public final int hashCode() {
                return this.f439940c.hashCode() + r.i(this.f439938a.hashCode() * 31, 31, this.f439939b);
            }

            @k
            public final String toString() {
                return "IncomingCallAllocated(callId=" + this.f439938a + ", isVideo=" + this.f439939b + ", meta=" + this.f439940c + ')';
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$b$c;", "LuQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: uQ0.b$b$c */
        public static final /* data */ class c extends AbstractC12713b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439941a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f439942b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CallMetaInfo f439943c;

            public c(@k String str, boolean z12, @k CallMetaInfo callMetaInfo) {
                super(null);
                this.f439941a = str;
                this.f439942b = z12;
                this.f439943c = callMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f439941a, cVar.f439941a) && this.f439942b == cVar.f439942b && L.f(this.f439943c, cVar.f439943c);
            }

            public final int hashCode() {
                return this.f439943c.hashCode() + r.i(this.f439941a.hashCode() * 31, 31, this.f439942b);
            }

            @k
            public final String toString() {
                return "IncomingCallRinging(callId=" + this.f439941a + ", isVideo=" + this.f439942b + ", meta=" + this.f439943c + ')';
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$b$d;", "LuQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: uQ0.b$b$d */
        public static final /* data */ class d extends AbstractC12713b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439944a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f439945b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CreateCallMetaInfo f439946c;

            public d(@k String str, boolean z12, @k CreateCallMetaInfo createCallMetaInfo) {
                super(null);
                this.f439944a = str;
                this.f439945b = z12;
                this.f439946c = createCallMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f439944a, dVar.f439944a) && this.f439945b == dVar.f439945b && L.f(this.f439946c, dVar.f439946c);
            }

            public final int hashCode() {
                return this.f439946c.hashCode() + r.i(this.f439944a.hashCode() * 31, 31, this.f439945b);
            }

            @k
            public final String toString() {
                return "OutgoingCallAllocating(callId=" + this.f439944a + ", isVideo=" + this.f439945b + ", createCallMeta=" + this.f439946c + ')';
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$b$e;", "LuQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: uQ0.b$b$e */
        public static final /* data */ class e extends AbstractC12713b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439947a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f439948b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CallMetaInfo f439949c;

            public e(@k String str, boolean z12, @k CallMetaInfo callMetaInfo) {
                super(null);
                this.f439947a = str;
                this.f439948b = z12;
                this.f439949c = callMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f439947a, eVar.f439947a) && this.f439948b == eVar.f439948b && L.f(this.f439949c, eVar.f439949c);
            }

            public final int hashCode() {
                return this.f439949c.hashCode() + r.i(this.f439947a.hashCode() * 31, 31, this.f439948b);
            }

            @k
            public final String toString() {
                return "OutgoingCallRinging(callId=" + this.f439947a + ", isVideo=" + this.f439948b + ", meta=" + this.f439949c + ')';
            }
        }

        public /* synthetic */ AbstractC12713b(C42822w c42822w) {
            this();
        }

        public AbstractC12713b() {
            super(null);
        }
    }

    /* compiled from: AvCallsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LuQ0/b$c;", "LuQ0/b;", "<init>", "()V", "a", "LuQ0/b$c$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c extends b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$c$a;", "LuQ0/b$c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439950a;

            public a(@k String str) {
                super(null);
                this.f439950a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f439950a, ((a) obj).f439950a);
            }

            public final int hashCode() {
                return this.f439950a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("IncomingDataMessageEmit(callId="), this.f439950a, ')');
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
            super(null);
        }
    }

    /* compiled from: AvCallsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LuQ0/b$d;", "LuQ0/b;", "<init>", "()V", "a", "LuQ0/b$d$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d extends b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$d$a;", "LuQ0/b$d;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439951a;

            public a(@k String str) {
                super(null);
                this.f439951a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f439951a, ((a) obj).f439951a);
            }

            public final int hashCode() {
                return this.f439951a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ExceptionOnCancellation(e="), this.f439951a, ')');
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
            super(null);
        }
    }

    /* compiled from: AvCallsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LuQ0/b$e;", "LuQ0/b;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "LuQ0/b$e$a;", "LuQ0/b$e$b;", "LuQ0/b$e$c;", "LuQ0/b$e$d;", "LuQ0/b$e$e;", "LuQ0/b$e$f;", "LuQ0/b$e$g;", "LuQ0/b$e$h;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e extends b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$e$a;", "LuQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439952a;

            public a(@k String str) {
                super(null);
                this.f439952a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f439952a, ((a) obj).f439952a);
            }

            public final int hashCode() {
                return this.f439952a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("MessageReceived(type="), this.f439952a, ')');
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuQ0/b$e$b;", "LuQ0/b$e;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: uQ0.b$e$b, reason: collision with other inner class name */
        public static final class C12715b extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12715b f439953a = new C12715b();

            public C12715b() {
                super(null);
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuQ0/b$e$c;", "LuQ0/b$e;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f439954a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuQ0/b$e$d;", "LuQ0/b$e;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f439955a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuQ0/b$e$e;", "LuQ0/b$e;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: uQ0.b$e$e, reason: collision with other inner class name */
        public static final class C12716e extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12716e f439956a = new C12716e();

            public C12716e() {
                super(null);
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$e$f;", "LuQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439957a;

            public f(@k String str) {
                super(null);
                this.f439957a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && L.f(this.f439957a, ((f) obj).f439957a);
            }

            public final int hashCode() {
                return this.f439957a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("MethodCalled(name="), this.f439957a, ')');
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$e$g;", "LuQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class g extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439958a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f439959b;

            /* renamed from: c, reason: collision with root package name */
            public final long f439960c;

            public g(@k String str, @k String str2, long j12) {
                super(null);
                this.f439958a = str;
                this.f439959b = str2;
                this.f439960c = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return L.f(this.f439958a, gVar.f439958a) && L.f(this.f439959b, gVar.f439959b) && this.f439960c == gVar.f439960c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f439960c) + H.d(this.f439958a.hashCode() * 31, 31, this.f439959b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MethodCalledError(name=");
                sb2.append(this.f439958a);
                sb2.append(", code=");
                sb2.append(this.f439959b);
                sb2.append(", time=");
                return r.u(sb2, this.f439960c, ')');
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuQ0/b$e$h;", "LuQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class h extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f439961a;

            /* renamed from: b, reason: collision with root package name */
            public final long f439962b;

            public h(@k String str, long j12) {
                super(null);
                this.f439961a = str;
                this.f439962b = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return L.f(this.f439961a, hVar.f439961a) && this.f439962b == hVar.f439962b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f439962b) + (this.f439961a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MethodCalledSuccess(name=");
                sb2.append(this.f439961a);
                sb2.append(", time=");
                return r.u(sb2, this.f439962b, ')');
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
            super(null);
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
