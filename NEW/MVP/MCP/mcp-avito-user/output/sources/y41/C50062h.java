package y41;

import androidx.compose.runtime.C22026a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* compiled from: StackTraceInterface.java */
/* renamed from: y41.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50062h implements InterfaceC50060f {

    /* renamed from: b, reason: collision with root package name */
    public final C50061g[] f442926b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442927c;

    public C50062h(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, io.sentry.jvmti.a[] aVarArr) {
        C50061g[] c50061gArr = new C50061g[stackTraceElementArr.length];
        int i12 = 0;
        int i13 = 0;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Map mapEmptyMap = null;
            if (aVarArr != null) {
                if (i13 < aVarArr.length) {
                    aVarArr[i13].getClass();
                    throw null;
                }
                if (i13 < aVarArr.length) {
                    aVarArr[i13].getClass();
                    mapEmptyMap = Collections.emptyMap();
                }
            }
            c50061gArr[i12] = new C50061g(stackTraceElement.getLineNumber(), stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), mapEmptyMap);
            i12++;
            i13++;
        }
        this.f442926b = c50061gArr;
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2]); length2--) {
            length--;
        }
        this.f442927c = (stackTraceElementArr.length - 1) - length;
    }

    @Override // y41.InterfaceC50060f
    public final String M0() {
        return "sentry.interfaces.Stacktrace";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f442926b, ((C50062h) obj).f442926b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f442926b);
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("StackTraceInterface{stackTrace="), Arrays.toString(this.f442926b), '}');
    }
}
