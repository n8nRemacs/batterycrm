package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.serialization.KSerializer;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: DateTimePeriod.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/f;", "", "<init>", "()V", "Companion", "a", "Lkotlinx/datetime/e;", "Lkotlinx/datetime/g;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = kotlinx.datetime.serializers.e.class)
/* renamed from: kotlinx.datetime.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43321f {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: DateTimePeriod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/f$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/f;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:199:0x02bd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:226:0x0162 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x016f  */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlinx.datetime.AbstractC43321f a(@Y61.k java.lang.String r21) {
            /*
                Method dump skipped, instructions count: 706
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.AbstractC43321f.Companion.a(java.lang.String):kotlinx.datetime.f");
        }

        public static final void b(int i12, String str) {
            throw new DateTimeFormatException("Parse error at char " + i12 + ": " + str);
        }

        public static final int c(long j12, int i12, char c12) {
            if (j12 >= -2147483648L && j12 <= 2147483647L) {
                return (int) j12;
            }
            b(i12, "Value " + j12 + " does not fit into an Int, which is required for component '" + c12 + '\'');
            throw null;
        }

        @Y61.k
        public final KSerializer<AbstractC43321f> serializer() {
            return kotlinx.datetime.serializers.e.f412638a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AbstractC43321f(C42822w c42822w) {
        this();
    }

    public abstract int a();

    public int b() {
        return (int) (h() / 3600000000000L);
    }

    public int c() {
        return (int) ((h() % 3600000000000L) / 60000000000L);
    }

    public final int d() {
        return g() % 12;
    }

    public int e() {
        return (int) (h() % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC43321f)) {
            return false;
        }
        AbstractC43321f abstractC43321f = (AbstractC43321f) obj;
        return g() == abstractC43321f.g() && a() == abstractC43321f.a() && h() == abstractC43321f.h();
    }

    public int f() {
        return (int) ((h() % 60000000000L) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    public abstract int g();

    public abstract long h();

    public final int hashCode() {
        return Long.hashCode(h()) + ((a() + (g() * 31)) * 31);
    }

    public final int i() {
        return g() / 12;
    }

    @Y61.k
    public final String toString() {
        int i12;
        StringBuilder sb2 = new StringBuilder();
        if (g() > 0 || a() > 0 || h() > 0 || ((g() | a()) == 0 && h() == 0)) {
            i12 = 1;
        } else {
            sb2.append('-');
            i12 = -1;
        }
        sb2.append('P');
        if (i() != 0) {
            sb2.append(i() * i12);
            sb2.append('Y');
        }
        if (d() != 0) {
            sb2.append(d() * i12);
            sb2.append('M');
        }
        if (a() != 0) {
            sb2.append(a() * i12);
            sb2.append('D');
        }
        String str = "";
        String str2 = "T";
        if (b() != 0) {
            sb2.append("T");
            sb2.append(b() * i12);
            sb2.append('H');
            str2 = "";
        }
        if (c() != 0) {
            sb2.append(str2);
            sb2.append(c() * i12);
            sb2.append('M');
        } else {
            str = str2;
        }
        if ((f() | e()) != 0) {
            sb2.append(str);
            sb2.append(f() != 0 ? Integer.valueOf(f() * i12) : e() * i12 < 0 ? "-0" : "0");
            if (e() != 0) {
                sb2.append('.');
                sb2.append(C43066x.R(9, String.valueOf(Math.abs(e()))));
            }
            sb2.append('S');
        }
        if (sb2.length() == 1) {
            sb2.append("0D");
        }
        return sb2.toString();
    }

    public AbstractC43321f() {
    }
}
