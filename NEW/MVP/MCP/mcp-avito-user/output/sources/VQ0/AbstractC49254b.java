package vQ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.avcalls.android.call.models.CallDirection;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsAnalyticsEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LvQ0/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "LvQ0/b$a;", "LvQ0/b$b;", "LvQ0/b$c;", "LvQ0/b$d;", "LvQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vQ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC49254b {

    /* compiled from: AvCallsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LvQ0/b$a;", "LvQ0/b;", "<init>", "()V", "a", "LvQ0/b$a$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ0.b$a */
    public static abstract class a extends AbstractC49254b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$a$a;", "LvQ0/b$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12772a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440754a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f440755b;

            public C12772a(@k String str, @k String str2) {
                super(null);
                this.f440754a = str;
                this.f440755b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12772a)) {
                    return false;
                }
                C12772a c12772a = (C12772a) obj;
                return L.f(this.f440754a, c12772a.f440754a) && L.f(this.f440755b, c12772a.f440755b);
            }

            public final int hashCode() {
                return this.f440755b.hashCode() + (this.f440754a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("IncomingMessageDrop(callId=");
                sb2.append(this.f440754a);
                sb2.append(", messageType=");
                return C22026a.c(sb2, this.f440755b, ')');
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LvQ0/b$b;", "LvQ0/b;", "<init>", "()V", "a", "b", "c", "d", "e", "LvQ0/b$b$a;", "LvQ0/b$b$b;", "LvQ0/b$b$c;", "LvQ0/b$b$d;", "LvQ0/b$b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ0.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC12773b extends AbstractC49254b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$b$a;", "LvQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$b$a */
        public static final /* data */ class a extends AbstractC12773b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440756a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f440757b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CallDirection f440758c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final CallMetaInfo f440759d;

            public a(@k String str, boolean z12, @k CallDirection callDirection, @k CallMetaInfo callMetaInfo) {
                super(null);
                this.f440756a = str;
                this.f440757b = z12;
                this.f440758c = callDirection;
                this.f440759d = callMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f440756a, aVar.f440756a) && this.f440757b == aVar.f440757b && this.f440758c == aVar.f440758c && L.f(this.f440759d, aVar.f440759d);
            }

            public final int hashCode() {
                return this.f440759d.hashCode() + ((this.f440758c.hashCode() + r.i(this.f440756a.hashCode() * 31, 31, this.f440757b)) * 31);
            }

            @k
            public final String toString() {
                return "CallActiveAndConnected(callId=" + this.f440756a + ", isVideo=" + this.f440757b + ", direction=" + this.f440758c + ", meta=" + this.f440759d + ')';
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$b$b;", "LvQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12774b extends AbstractC12773b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440760a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f440761b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CallMetaInfo f440762c;

            public C12774b(@k String str, boolean z12, @k CallMetaInfo callMetaInfo) {
                super(null);
                this.f440760a = str;
                this.f440761b = z12;
                this.f440762c = callMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12774b)) {
                    return false;
                }
                C12774b c12774b = (C12774b) obj;
                return L.f(this.f440760a, c12774b.f440760a) && this.f440761b == c12774b.f440761b && L.f(this.f440762c, c12774b.f440762c);
            }

            public final int hashCode() {
                return this.f440762c.hashCode() + r.i(this.f440760a.hashCode() * 31, 31, this.f440761b);
            }

            @k
            public final String toString() {
                return "IncomingCallAllocated(callId=" + this.f440760a + ", isVideo=" + this.f440761b + ", meta=" + this.f440762c + ')';
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$b$c;", "LvQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$b$c */
        public static final /* data */ class c extends AbstractC12773b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440763a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f440764b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CallMetaInfo f440765c;

            public c(@k String str, boolean z12, @k CallMetaInfo callMetaInfo) {
                super(null);
                this.f440763a = str;
                this.f440764b = z12;
                this.f440765c = callMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f440763a, cVar.f440763a) && this.f440764b == cVar.f440764b && L.f(this.f440765c, cVar.f440765c);
            }

            public final int hashCode() {
                return this.f440765c.hashCode() + r.i(this.f440763a.hashCode() * 31, 31, this.f440764b);
            }

            @k
            public final String toString() {
                return "IncomingCallRinging(callId=" + this.f440763a + ", isVideo=" + this.f440764b + ", meta=" + this.f440765c + ')';
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$b$d;", "LvQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$b$d */
        public static final /* data */ class d extends AbstractC12773b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440766a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f440767b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CreateCallMetaInfo f440768c;

            public d(@k String str, boolean z12, @k CreateCallMetaInfo createCallMetaInfo) {
                super(null);
                this.f440766a = str;
                this.f440767b = z12;
                this.f440768c = createCallMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f440766a, dVar.f440766a) && this.f440767b == dVar.f440767b && L.f(this.f440768c, dVar.f440768c);
            }

            public final int hashCode() {
                return this.f440768c.hashCode() + r.i(this.f440766a.hashCode() * 31, 31, this.f440767b);
            }

            @k
            public final String toString() {
                return "OutgoingCallAllocating(callId=" + this.f440766a + ", isVideo=" + this.f440767b + ", createCallMeta=" + this.f440768c + ')';
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$b$e;", "LvQ0/b$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$b$e */
        public static final /* data */ class e extends AbstractC12773b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440769a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f440770b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CallMetaInfo f440771c;

            public e(@k String str, boolean z12, @k CallMetaInfo callMetaInfo) {
                super(null);
                this.f440769a = str;
                this.f440770b = z12;
                this.f440771c = callMetaInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f440769a, eVar.f440769a) && this.f440770b == eVar.f440770b && L.f(this.f440771c, eVar.f440771c);
            }

            public final int hashCode() {
                return this.f440771c.hashCode() + r.i(this.f440769a.hashCode() * 31, 31, this.f440770b);
            }

            @k
            public final String toString() {
                return "OutgoingCallRinging(callId=" + this.f440769a + ", isVideo=" + this.f440770b + ", meta=" + this.f440771c + ')';
            }
        }

        public /* synthetic */ AbstractC12773b(C42822w c42822w) {
            this();
        }

        public AbstractC12773b() {
            super(null);
        }
    }

    /* compiled from: AvCallsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LvQ0/b$c;", "LvQ0/b;", "<init>", "()V", "a", "LvQ0/b$c$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ0.b$c */
    public static abstract class c extends AbstractC49254b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$c$a;", "LvQ0/b$c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$c$a */
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440772a;

            public a(@k String str) {
                super(null);
                this.f440772a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f440772a, ((a) obj).f440772a);
            }

            public final int hashCode() {
                return this.f440772a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("IncomingDataMessageEmit(callId="), this.f440772a, ')');
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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LvQ0/b$d;", "LvQ0/b;", "<init>", "()V", "a", "LvQ0/b$d$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ0.b$d */
    public static abstract class d extends AbstractC49254b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$d$a;", "LvQ0/b$d;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$d$a */
        public static final /* data */ class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440773a;

            public a(@k String str) {
                super(null);
                this.f440773a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f440773a, ((a) obj).f440773a);
            }

            public final int hashCode() {
                return this.f440773a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ExceptionOnCancellation(e="), this.f440773a, ')');
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LvQ0/b$e;", "LvQ0/b;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "LvQ0/b$e$a;", "LvQ0/b$e$b;", "LvQ0/b$e$c;", "LvQ0/b$e$d;", "LvQ0/b$e$e;", "LvQ0/b$e$f;", "LvQ0/b$e$g;", "LvQ0/b$e$h;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ0.b$e */
    public static abstract class e extends AbstractC49254b {

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$e$a;", "LvQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$e$a */
        public static final /* data */ class a extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440774a;

            public a(@k String str) {
                super(null);
                this.f440774a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f440774a, ((a) obj).f440774a);
            }

            public final int hashCode() {
                return this.f440774a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("MessageReceived(type="), this.f440774a, ')');
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ0/b$e$b;", "LvQ0/b$e;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$e$b, reason: collision with other inner class name */
        public static final class C12775b extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12775b f440775a = new C12775b();

            public C12775b() {
                super(null);
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ0/b$e$c;", "LvQ0/b$e;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$e$c */
        public static final class c extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f440776a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ0/b$e$d;", "LvQ0/b$e;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$e$d */
        public static final class d extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f440777a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ0/b$e$e;", "LvQ0/b$e;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$e$e, reason: collision with other inner class name */
        public static final class C12776e extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12776e f440778a = new C12776e();

            public C12776e() {
                super(null);
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$e$f;", "LvQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$e$f */
        public static final /* data */ class f extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440779a;

            public f(@k String str) {
                super(null);
                this.f440779a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && L.f(this.f440779a, ((f) obj).f440779a);
            }

            public final int hashCode() {
                return this.f440779a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("MethodCalled(name="), this.f440779a, ')');
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$e$g;", "LvQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$e$g */
        public static final /* data */ class g extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440780a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f440781b;

            /* renamed from: c, reason: collision with root package name */
            public final long f440782c;

            public g(@k String str, @k String str2, long j12) {
                super(null);
                this.f440780a = str;
                this.f440781b = str2;
                this.f440782c = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return L.f(this.f440780a, gVar.f440780a) && L.f(this.f440781b, gVar.f440781b) && this.f440782c == gVar.f440782c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f440782c) + H.d(this.f440780a.hashCode() * 31, 31, this.f440781b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MethodCalledError(name=");
                sb2.append(this.f440780a);
                sb2.append(", code=");
                sb2.append(this.f440781b);
                sb2.append(", time=");
                return r.u(sb2, this.f440782c, ')');
            }
        }

        /* compiled from: AvCallsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvQ0/b$e$h;", "LvQ0/b$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vQ0.b$e$h */
        public static final /* data */ class h extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440783a;

            /* renamed from: b, reason: collision with root package name */
            public final long f440784b;

            public h(@k String str, long j12) {
                super(null);
                this.f440783a = str;
                this.f440784b = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return L.f(this.f440783a, hVar.f440783a) && this.f440784b == hVar.f440784b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f440784b) + (this.f440783a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MethodCalledSuccess(name=");
                sb2.append(this.f440783a);
                sb2.append(", time=");
                return r.u(sb2, this.f440784b, ')');
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC49254b(C42822w c42822w) {
        this();
    }

    public AbstractC49254b() {
    }
}
