package androidx.tracing;

import android.os.Trace;
import j.InterfaceC42164u;
import j.N;
import j.X;

/* compiled from: TraceApi29Impl.java */
@X
/* loaded from: classes10.dex */
final class d {
    public static void a(int i12, @N String str) {
        Trace.beginAsyncSection(str, i12);
    }

    public static void b(int i12, @N String str) {
        Trace.endAsyncSection(str, i12);
    }

    @InterfaceC42164u
    public static boolean c() {
        return Trace.isEnabled();
    }
}
