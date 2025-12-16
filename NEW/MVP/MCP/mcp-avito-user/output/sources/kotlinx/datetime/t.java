package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.format.C43323a0;
import kotlinx.datetime.format.W;
import kotlinx.serialization.KSerializer;

/* compiled from: LocalDateTime.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/t;", "", "Companion", "a", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = kotlinx.datetime.serializers.q.class)
/* loaded from: classes8.dex */
public final class t implements Comparable<t> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LocalDateTime f412681b;

    /* compiled from: LocalDateTime.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/t$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/t;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.t$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static t a(Companion companion, CharSequence charSequence) {
            b bVar = b.f412682a;
            bVar.getClass();
            b bVar2 = b.f412682a;
            companion.getClass();
            bVar.getClass();
            try {
                return new t(LocalDateTime.parse(charSequence));
            } catch (DateTimeParseException e12) {
                throw new DateTimeFormatException(e12);
            }
        }

        @Y61.k
        public final KSerializer<t> serializer() {
            return kotlinx.datetime.serializers.q.f412663a;
        }

        public Companion() {
        }
    }

    /* compiled from: LocalDateTime.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/t$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f412682a = new b();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final W f412683b = (W) C43323a0.f412396a.getValue();
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
    }

    public t(@Y61.k LocalDateTime localDateTime) {
        this.f412681b = localDateTime;
    }

    @Y61.k
    public final q a() {
        return new q(this.f412681b.toLocalDate());
    }

    @Y61.k
    public final w b() {
        return new w(this.f412681b.toLocalTime());
    }

    @Override // java.lang.Comparable
    public final int compareTo(t tVar) {
        return this.f412681b.compareTo((ChronoLocalDateTime<?>) tVar.f412681b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                if (L.f(this.f412681b, ((t) obj).f412681b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f412681b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f412681b.toString();
    }

    public /* synthetic */ t(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, C42822w c42822w) {
        this(i12, i13, i14, i15, i16, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? 0 : i18);
    }

    public t(int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        try {
            this(LocalDateTime.of(i12, i13, i14, i15, i16, i17, i18));
        } catch (DateTimeException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public t(@Y61.k q qVar, @Y61.k w wVar) {
        this(LocalDateTime.of(qVar.f412619b, wVar.f412684b));
    }

    public t(int i12, Month month, int i13, int i14, int i15, int i16, int i17, int i18, C42822w c42822w) {
        this(i12, month.ordinal() + 1, i13, i14, i15, (i18 & 32) != 0 ? 0 : i16, (i18 & 64) != 0 ? 0 : i17);
    }
}
