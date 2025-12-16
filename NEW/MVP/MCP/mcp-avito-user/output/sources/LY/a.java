package LY;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: MediaDurationFormatter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLY/a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f9975a = new a();

    public static void a(StringBuilder sb2, long j12, boolean z12) {
        String strValueOf = String.valueOf(j12);
        if (strValueOf.length() == 1 && !z12) {
            sb2.append(0);
        }
        sb2.append(strValueOf);
    }

    public static String b(long j12, long j13, long j14) {
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = j12 != 0;
        if (z12) {
            a(sb2, j12, true);
            sb2.append(":");
        }
        a(sb2, j13, !z12);
        sb2.append(":");
        a(sb2, j14, false);
        return sb2.toString();
    }

    @k
    public static String c(long j12) {
        long jRint = (long) Math.rint(j12 / 1000);
        long j13 = 3600;
        long j14 = jRint / j13;
        long j15 = jRint % j13;
        long j16 = 60;
        return b(j14, j15 / j16, j15 % j16);
    }

    @k
    public static String d(long j12) {
        long j13 = 3600;
        long j14 = j12 / j13;
        long j15 = j12 % j13;
        long j16 = 60;
        return b(j14, j15 / j16, j15 % j16);
    }
}
