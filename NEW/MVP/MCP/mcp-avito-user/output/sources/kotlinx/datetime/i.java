package kotlinx.datetime;

import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.serializers.C43381a;
import kotlinx.serialization.KSerializer;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: DateTimeUnit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lkotlinx/datetime/i;", "", "<init>", "()V", "Companion", "a", "b", "c", "d", "e", "Lkotlinx/datetime/i$b;", "Lkotlinx/datetime/i$e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = kotlinx.datetime.serializers.f.class)
/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final e f412483a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final e f412484b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final e f412485c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final e f412486d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final e f412487e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final e f412488f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final c f412489g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final d f412490h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final d f412491i;

    /* compiled from: DateTimeUnit.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/i$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/i;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<i> serializer() {
            return kotlinx.datetime.serializers.f.f412640a;
        }

        public Companion() {
        }
    }

    /* compiled from: DateTimeUnit.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b7\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003Z>\b\u0007\u0010\u000e\"\u00020\u00042\u00020\u0004B0\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\"\b\b\u0012\u001e\b\u000bB\u001a\b\t\u0012\f\b\n\u0012\b\b\fJ\u0004\b\b(\u000b\u0012\b\b\f\u0012\u0004\b\b(\rZ>\b\u0007\u0010\u0012\"\u00020\u000f2\u00020\u000fB0\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\"\b\b\u0012\u001e\b\u000bB\u001a\b\t\u0012\f\b\n\u0012\b\b\fJ\u0004\b\b(\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0082\u0001\u0002\u0004\u000f¨\u0006\u0015"}, d2 = {"Lkotlinx/datetime/i$b;", "Lkotlinx/datetime/i;", "<init>", "()V", "Lkotlinx/datetime/i$c;", "Lkotlin/m;", "message", "Use DateTimeUnit.DayBased", "replaceWith", "Lkotlin/Y;", "imports", "kotlinx.datetime.DateTimeUnit", "expression", "DateTimeUnit.DayBased", "DayBased", "Lkotlinx/datetime/i$d;", "Use DateTimeUnit.MonthBased", "DateTimeUnit.MonthBased", "MonthBased", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w(with = C43381a.class)
    public static abstract class b extends i {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: DateTimeUnit.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/i$b$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/i$b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlinx.datetime.i$b$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<b> serializer() {
                return C43381a.f412627a;
            }

            public Companion() {
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
            super(null);
        }
    }

    /* compiled from: DateTimeUnit.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/i$c;", "Lkotlinx/datetime/i$b;", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w(with = kotlinx.datetime.serializers.i.class)
    public static final class c extends b {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: j, reason: collision with root package name */
        public final int f412492j;

        /* compiled from: DateTimeUnit.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/i$c$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/i$c;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlinx.datetime.i$c$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<c> serializer() {
                return kotlinx.datetime.serializers.i.f412644a;
            }

            public Companion() {
            }
        }

        public c(int i12) {
            super(null);
            this.f412492j = i12;
            if (i12 <= 0) {
                throw new IllegalArgumentException(G.e(i12, "Unit duration must be positive, but was ", " days.").toString());
            }
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    if (this.f412492j == ((c) obj).f412492j) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f412492j ^ AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }

        @Y61.k
        public final String toString() {
            int i12 = this.f412492j;
            return i12 % 7 == 0 ? i.a(i12 / 7, "WEEK") : i.a(i12, "DAY");
        }
    }

    /* compiled from: DateTimeUnit.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/i$d;", "Lkotlinx/datetime/i$b;", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w(with = kotlinx.datetime.serializers.u.class)
    public static final class d extends b {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: j, reason: collision with root package name */
        public final int f412493j;

        /* compiled from: DateTimeUnit.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/i$d$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/i$d;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlinx.datetime.i$d$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<d> serializer() {
                return kotlinx.datetime.serializers.u.f412671a;
            }

            public Companion() {
            }
        }

        public d(int i12) {
            super(null);
            this.f412493j = i12;
            if (i12 <= 0) {
                throw new IllegalArgumentException(G.e(i12, "Unit duration must be positive, but was ", " months.").toString());
            }
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    if (this.f412493j == ((d) obj).f412493j) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f412493j ^ 131072;
        }

        @Y61.k
        public final String toString() {
            int i12 = this.f412493j;
            return i12 % 1200 == 0 ? i.a(i12 / 1200, "CENTURY") : i12 % 12 == 0 ? i.a(i12 / 12, "YEAR") : i12 % 3 == 0 ? i.a(i12 / 3, "QUARTER") : i.a(i12, "MONTH");
        }
    }

    /* compiled from: DateTimeUnit.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/i$e;", "Lkotlinx/datetime/i;", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w(with = kotlinx.datetime.serializers.y.class)
    public static final class e extends i {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: j, reason: collision with root package name */
        public final long f412494j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final String f412495k;

        /* renamed from: l, reason: collision with root package name */
        public final long f412496l;

        /* compiled from: DateTimeUnit.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/i$e$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/i$e;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlinx.datetime.i$e$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<e> serializer() {
                return kotlinx.datetime.serializers.y.f412676a;
            }

            public Companion() {
            }
        }

        public e(long j12) {
            super(null);
            this.f412494j = j12;
            if (j12 <= 0) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j12, "Unit duration must be positive, but was ", " ns.").toString());
            }
            if (j12 % 3600000000000L == 0) {
                this.f412495k = "HOUR";
                this.f412496l = j12 / 3600000000000L;
                return;
            }
            if (j12 % 60000000000L == 0) {
                this.f412495k = "MINUTE";
                this.f412496l = j12 / 60000000000L;
                return;
            }
            long j13 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            if (j12 % j13 == 0) {
                this.f412495k = "SECOND";
                this.f412496l = j12 / j13;
                return;
            }
            long j14 = 1000000;
            if (j12 % j14 == 0) {
                this.f412495k = "MILLISECOND";
                this.f412496l = j12 / j14;
                return;
            }
            long j15 = 1000;
            if (j12 % j15 == 0) {
                this.f412495k = "MICROSECOND";
                this.f412496l = j12 / j15;
            } else {
                this.f412495k = "NANOSECOND";
                this.f412496l = j12;
            }
        }

        @Y61.k
        public final e b(int i12) {
            return new e(Math.multiplyExact(this.f412494j, i12));
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                    if (this.f412494j == ((e) obj).f412494j) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j12 = this.f412494j;
            return ((int) (j12 >> 32)) ^ ((int) j12);
        }

        @Y61.k
        public final String toString() {
            long j12 = this.f412496l;
            String str = this.f412495k;
            if (j12 == 1) {
                return str;
            }
            return j12 + '-' + str;
        }
    }

    static {
        e eVar = new e(1L);
        f412483a = eVar;
        e eVarB = eVar.b(1000);
        f412484b = eVarB;
        e eVarB2 = eVarB.b(1000);
        f412485c = eVarB2;
        e eVarB3 = eVarB2.b(1000);
        f412486d = eVarB3;
        e eVarB4 = eVarB3.b(60);
        f412487e = eVarB4;
        f412488f = eVarB4.b(60);
        c cVar = new c(1);
        f412489g = cVar;
        new c(Math.multiplyExact(cVar.f412492j, 7));
        d dVar = new d(1);
        f412490h = dVar;
        int i12 = dVar.f412493j;
        new d(Math.multiplyExact(i12, 3));
        d dVar2 = new d(Math.multiplyExact(i12, 12));
        f412491i = dVar2;
        new d(Math.multiplyExact(dVar2.f412493j, 100));
    }

    public /* synthetic */ i(C42822w c42822w) {
        this();
    }

    @Y61.k
    public static String a(int i12, @Y61.k String str) {
        if (i12 == 1) {
            return str;
        }
        return i12 + '-' + str;
    }

    public i() {
    }
}
