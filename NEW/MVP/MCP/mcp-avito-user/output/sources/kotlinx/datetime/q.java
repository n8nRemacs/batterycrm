package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.format.S;
import kotlinx.serialization.KSerializer;

/* compiled from: LocalDate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/q;", "", "Companion", "a", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = kotlinx.datetime.serializers.o.class)
/* loaded from: classes8.dex */
public final class q implements Comparable<q> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LocalDate f412619b;

    /* compiled from: LocalDate.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/q$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/q;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static q a(Companion companion, CharSequence charSequence) {
            b bVar = b.f412620a;
            bVar.getClass();
            kotlinx.datetime.format.B<q> bA2 = S.a();
            companion.getClass();
            bVar.getClass();
            if (bA2 != S.a()) {
                return bA2.a(charSequence);
            }
            try {
                return new q(LocalDate.parse(charSequence));
            } catch (DateTimeParseException e12) {
                throw new DateTimeFormatException(e12);
            }
        }

        @Y61.k
        public final KSerializer<q> serializer() {
            return kotlinx.datetime.serializers.o.f412658a;
        }

        public Companion() {
        }
    }

    /* compiled from: LocalDate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/q$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f412620a = new b();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final kotlinx.datetime.format.B<q> f412621b = (kotlinx.datetime.format.B) S.f412378b.getValue();
    }

    static {
        LocalDate localDate = LocalDate.MIN;
        LocalDate localDate2 = LocalDate.MAX;
    }

    public q(@Y61.k LocalDate localDate) {
        this.f412619b = localDate;
    }

    @Override // java.lang.Comparable
    public final int compareTo(q qVar) {
        return this.f412619b.compareTo((ChronoLocalDate) qVar.f412619b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                if (L.f(this.f412619b, ((q) obj).f412619b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f412619b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f412619b.toString();
    }

    public q(int i12, int i13, int i14) {
        try {
            this(LocalDate.of(i12, i13, i14));
        } catch (DateTimeException e12) {
            throw new IllegalArgumentException(e12);
        }
    }
}
