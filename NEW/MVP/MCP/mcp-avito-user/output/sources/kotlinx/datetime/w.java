package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.format.C43325b0;
import kotlinx.datetime.format.C43335g0;
import kotlinx.serialization.KSerializer;

/* compiled from: LocalTime.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/w;", "", "Companion", "a", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = kotlinx.datetime.serializers.s.class)
/* loaded from: classes8.dex */
public final class w implements Comparable<w> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LocalTime f412684b;

    /* compiled from: LocalTime.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/w$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/w;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static w a(Companion companion, CharSequence charSequence) {
            b bVar = b.f412685a;
            bVar.getClass();
            InterfaceC42726C interfaceC42726C = C43335g0.f412406a;
            C43325b0 c43325b0 = (C43325b0) interfaceC42726C.getValue();
            companion.getClass();
            bVar.getClass();
            if (c43325b0 != ((C43325b0) interfaceC42726C.getValue())) {
                return c43325b0.a(charSequence);
            }
            try {
                return new w(LocalTime.parse(charSequence));
            } catch (DateTimeParseException e12) {
                throw new DateTimeFormatException(e12);
            }
        }

        @Y61.k
        public final KSerializer<w> serializer() {
            return kotlinx.datetime.serializers.s.f412668a;
        }

        public Companion() {
        }
    }

    /* compiled from: LocalTime.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/w$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f412685a = new b();
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        LocalTime localTime2 = LocalTime.MAX;
    }

    public w(@Y61.k LocalTime localTime) {
        this.f412684b = localTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(w wVar) {
        return this.f412684b.compareTo(wVar.f412684b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (L.f(this.f412684b, ((w) obj).f412684b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f412684b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f412684b.toString();
    }

    public /* synthetic */ w(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this(i12, i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }

    public w(int i12, int i13, int i14, int i15) {
        try {
            this(LocalTime.of(i12, i13, i14, i15));
        } catch (DateTimeException e12) {
            throw new IllegalArgumentException(e12);
        }
    }
}
