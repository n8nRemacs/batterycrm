package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.KSerializer;

/* compiled from: Instant.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/l;", "", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = kotlinx.datetime.serializers.m.class)
/* loaded from: classes8.dex */
public final class l implements Comparable<l> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final l f412616c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final l f412617d;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Instant f412618b;

    /* compiled from: Instant.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/l$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/l;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.l$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static l a(int i12, long j12) throws Exception {
            try {
                return new l(Instant.ofEpochSecond(j12, i12));
            } catch (Exception e12) {
                if ((e12 instanceof ArithmeticException) || (e12 instanceof DateTimeException)) {
                    return j12 > 0 ? l.f412617d : l.f412616c;
                }
                throw e12;
            }
        }

        @Y61.k
        public final KSerializer<l> serializer() {
            return kotlinx.datetime.serializers.m.f412653a;
        }

        public Companion() {
        }
    }

    static {
        Instant.ofEpochSecond(-3217862419201L, 999999999L);
        Instant.ofEpochSecond(3093527980800L, 0L);
        f412616c = new l(Instant.MIN);
        f412617d = new l(Instant.MAX);
    }

    public l(@Y61.k Instant instant) {
        this.f412618b = instant;
    }

    public final long a() {
        Instant instant = this.f412618b;
        try {
            return instant.toEpochMilli();
        } catch (ArithmeticException unused) {
            return instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        return this.f412618b.compareTo(lVar.f412618b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                if (L.f(this.f412618b, ((l) obj).f412618b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f412618b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f412618b.toString();
    }
}
