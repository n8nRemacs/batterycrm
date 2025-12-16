package coil.util;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DebugLogger.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/util/o;", "Lcoil/util/w;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f58787a;

    @X41.j
    public o() {
        this(0, 1, null);
    }

    public final void a(int i12, @Y61.k String str, @Y61.l String str2, @Y61.l Throwable th2) {
        if (str2 != null) {
            Log.println(i12, str, str2);
        }
        if (th2 != null) {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            Log.println(i12, str, stringWriter.toString());
        }
    }

    public o(int i12, int i13, C42822w c42822w) {
        i12 = (i13 & 1) != 0 ? 3 : i12;
        this.f58787a = i12;
        if (2 > i12 || i12 >= 8) {
            throw new IllegalArgumentException(AK.c.g(i12, "Invalid log level: ").toString());
        }
    }
}
