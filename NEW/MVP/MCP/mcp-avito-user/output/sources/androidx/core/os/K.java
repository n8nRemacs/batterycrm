package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import j.X;

/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44794a = 0;

    /* compiled from: TraceCompat.java */
    @X
    public static class a {
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }
}
