package P71;

import java.io.Serializable;
import java.lang.reflect.Method;

/* compiled from: LocationImpl.java */
/* loaded from: classes7.dex */
public class d implements e81.f, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final org.mockito.internal.exceptions.stacktrace.d f12852d = new org.mockito.internal.exceptions.stacktrace.d();
    private static final long serialVersionUID = -9054861157390980624L;

    /* renamed from: b, reason: collision with root package name */
    public final String f12853b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12854c;

    public d() {
        StackTraceElement stackTraceElement;
        Throwable th2 = new Throwable();
        f12852d.getClass();
        F71.a aVar = org.mockito.internal.exceptions.stacktrace.d.f421637b;
        Method method = org.mockito.internal.exceptions.stacktrace.d.f421639d;
        int i12 = 0;
        if (method == null) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i12 >= length) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = stackTrace[i12];
                if (aVar.a(stackTraceElement)) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            int i13 = 0;
            while (true) {
                try {
                    stackTraceElement = (StackTraceElement) method.invoke(org.mockito.internal.exceptions.stacktrace.d.f421638c, th2, Integer.valueOf(i13));
                    if (aVar.a(stackTraceElement)) {
                        break;
                    } else {
                        i13++;
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (stackTraceElement == null) {
            this.f12853b = "-> at <<unknown line>>";
            this.f12854c = "<unknown source file>";
        } else {
            this.f12853b = "-> at " + stackTraceElement;
            this.f12854c = stackTraceElement.getFileName();
        }
    }

    @Override // e81.f
    public final String a() {
        return this.f12854c;
    }

    @Override // e81.f
    public final String toString() {
        return this.f12853b;
    }
}
