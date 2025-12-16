package kotlin;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"kotlin/q"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* renamed from: kotlin.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42833p extends C42834q {
    @kotlin.internal.e
    @InterfaceC42733c0
    public static void a(@Y61.k Throwable th2, @Y61.k Throwable th3) {
        if (th2 != th3) {
            kotlin.internal.m.f406763a.a(th2, th3);
        }
    }

    @InterfaceC42733c0
    @Y61.k
    public static String b(@Y61.k Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
