package defpackage;

import android.graphics.Color;
import android.opengl.Matrix;
import java.io.IOException;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class pei {
    public static final float[][] a = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};

    public static final void a(Appendable appendable, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            appendable.append("\t");
        }
    }

    public static final void b(Throwable th, Appendable appendable) {
        c(th, appendable, 0, "", th.getStackTrace(), 0, new IdentityHashMap());
    }

    public static final void c(Throwable th, Appendable appendable, int i, String str, StackTraceElement[] stackTraceElementArr, int i2, IdentityHashMap identityHashMap) throws IOException {
        int i3 = 1;
        if (identityHashMap.containsKey(th)) {
            a(appendable, 1);
            appendable.append("[CIRCULAR REFERENCE: ").append(th.toString()).append("]").append('\n');
            return;
        }
        identityHashMap.put(th, qqg.a);
        a(appendable, i);
        appendable.append(str).append(th.toString()).append('\n');
        if (th instanceof StackOverflowError) {
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            int length = stackTraceElementArr.length;
            while (i3 < length) {
                if (fni.a(stackTraceElement, stackTraceElementArr[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            i3 = 0;
        } else {
            i3 = 0;
        }
        int length2 = i3 > 0 ? i3 : stackTraceElementArr.length - i2;
        for (int i4 = 0; i4 < length2; i4++) {
            d(stackTraceElementArr[i4], appendable, i + 1, 4);
        }
        if (i3 > 0) {
            a(appendable, i + 1);
            appendable.append("... ").append(String.valueOf(i3)).append(" calls repeat").append('\n');
        } else if (i2 != 0) {
            a(appendable, i + 1);
            appendable.append("... ").append(String.valueOf(i2)).append(" more").append('\n');
        }
        for (Throwable th2 : th.getSuppressed()) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            c(th2, appendable, i + 1, "Suppressed: ", stackTrace, h(stackTraceElementArr, stackTrace), identityHashMap);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            c(cause, appendable, i, "Caused by: ", stackTrace2, h(stackTraceElementArr, stackTrace2), identityHashMap);
        }
    }

    public static void d(StackTraceElement stackTraceElement, Appendable appendable, int i, int i2) throws IOException {
        String fileName;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        a(appendable, i);
        appendable.append("at ");
        if (stackTraceElement.isNativeMethod()) {
            fileName = "Native Method";
        } else {
            fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "Unknown Source";
            }
        }
        appendable.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(fileName);
        if (stackTraceElement.getLineNumber() >= 0) {
            appendable.append(":").append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        appendable.append(")").append('\n');
    }

    public static float[] e(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        hsi.a("Expecting 4 plane parameters", fArr2.length == 4);
        float f = fArr[0];
        float f2 = fArr3[0];
        float f3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr2[1];
        float f7 = fArr[2];
        float f8 = fArr3[2];
        float f9 = fArr2[2];
        float f10 = ((f7 - f8) * f9) + ((f4 - f5) * f6) + ((f - f2) * f3);
        float f11 = fArr4[0] - f2;
        float f12 = fArr4[1] - f5;
        float f13 = fArr4[2] - f8;
        float f14 = f10 / ((f9 * f13) + ((f6 * f12) + (f3 * f11)));
        return new float[]{(f11 * f14) + f2, (f12 * f14) + f5, (f13 * f14) + f8, 1.0f};
    }

    public static c4f f(List list, int i, int i2) {
        hsi.a("inputWidth must be positive", i > 0);
        hsi.a("inputHeight must be positive", i2 > 0);
        c4f c4fVar = new c4f(i, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            c4fVar = ((fr8) list.get(i3)).e(c4fVar.a, c4fVar.b);
        }
        return c4fVar;
    }

    public static String g(String str) {
        StringBuilder sb = new StringBuilder(u45.f(u45.f(5, str), str));
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    public static final int h(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && fni.a(stackTraceElementArr[length], stackTraceElementArr2[length2]); length2--) {
            length--;
        }
        return (stackTraceElementArr.length - 1) - length;
    }

    public static boolean i(float[] fArr, float[] fArr2) {
        hsi.a("Expecting 4 plane parameters", fArr2.length == 4);
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    public static String j(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        int i2 = xxg.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static zjd k(float[] fArr, wg7 wg7Var) {
        u4j.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < wg7Var.size()) {
            float[] fArr2 = new float[4];
            float[] fArr3 = fArr;
            Matrix.multiplyMV(fArr2, 0, fArr3, 0, (float[]) wg7Var.get(i), 0);
            float f = fArr2[0];
            float f2 = fArr2[3];
            fArr2[0] = f / f2;
            fArr2[1] = fArr2[1] / f2;
            fArr2[2] = fArr2[2] / f2;
            fArr2[3] = 1.0f;
            int i3 = i2 + 1;
            int iH = mg7.h(objArrCopyOf.length, i3);
            if (iH > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
            }
            objArrCopyOf[i2] = fArr2;
            i++;
            i2 = i3;
            fArr = fArr3;
        }
        return wg7.h(i2, objArrCopyOf);
    }
}
