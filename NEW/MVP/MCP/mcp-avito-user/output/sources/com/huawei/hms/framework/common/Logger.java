package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static ExtLogger f363462a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f363463b = true;

    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;

        /* renamed from: b, reason: collision with root package name */
        public String f363464b;

        /* renamed from: c, reason: collision with root package name */
        public Throwable f363465c;

        /* renamed from: d, reason: collision with root package name */
        public final Throwable f363466d;

        public ThrowableWrapper(Throwable th2, AnonymousClass1 anonymousClass1) {
            this.f363466d = th2;
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int i12 = ((th2 instanceof IOException) || (th2 instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i12) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i12));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th2.getMessage()));
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th2 = this.f363465c;
            if (th2 == this) {
                return null;
            }
            return th2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f363464b;
        }

        public void setMessage(String str) {
            this.f363464b = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th2 = this.f363466d;
            if (th2 == null) {
                return "";
            }
            String name = th2.getClass().getName();
            if (this.f363464b == null) {
                return name;
            }
            String strConcat = name.concat(": ");
            if (this.f363464b.startsWith(strConcat)) {
                return this.f363464b;
            }
            StringBuilder sbR = H.r(strConcat);
            sbR.append(this.f363464b);
            return sbR.toString();
        }
    }

    public static String a(int i12, String str) {
        if (TextUtils.isEmpty(str)) {
            return b(i12);
        }
        return b(i12) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str;
    }

    public static String b(int i12) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i12) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i12];
        return Thread.currentThread().getName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getFileName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getClassName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getMethodName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + stackTraceElement.getLineNumber();
    }

    public static Throwable c(Throwable th2) {
        if (isLoggable(3)) {
            return th2;
        }
        if (th2 == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th2, null);
        Throwable cause = th2.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause, null);
            throwableWrapper2.f363465c = throwableWrapper3;
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    public static void f(int i12, String str, String str2) {
        if (isAPPLoggable(i12)) {
            String strF = G.f("NetworkSdk_", str);
            String strA = a(7, str2);
            if (i12 == 2) {
                f363462a.v(strF, strA);
            } else if (i12 == 3) {
                f363462a.d(strF, strA);
            } else if (i12 == 4) {
                f363462a.i(strF, strA);
            } else if (i12 == 5) {
                f363462a.w(strF, strA);
            } else if (i12 == 6) {
                f363462a.e(strF, strA);
            }
        }
        if (f363463b) {
            Log.println(i12, G.f("NetworkKit_", str), a(7, str2));
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    public static boolean isAPPLoggable(int i12) {
        if (f363462a != null) {
            return Log.isLoggable("NetworkSdk_", i12);
        }
        return false;
    }

    public static boolean isLoggable(int i12) {
        return Log.isLoggable("NetworkKit_", i12);
    }

    public static void println(int i12, String str, Object obj) {
        if (i12 >= 3 && isLoggable(i12)) {
            f(i12, str, obj == null ? "null" : obj.toString());
        }
    }

    public static void setExtLogger(ExtLogger extLogger, boolean z12) {
        f363462a = extLogger;
        f363463b = z12;
        i("NetworkKit_Logger", "logger = " + extLogger + z12);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    public static void e(String str, String str2, Throwable th2) {
        if (isAPPLoggable(6)) {
            f363462a.e(G.f("NetworkSdk_", str), a(5, str2), c(th2));
        }
        if (f363463b) {
            a(5, str2);
            c(th2);
        }
    }

    public static void println(int i12, String str, String str2, Object... objArr) {
        if (i12 >= 3 && str2 != null) {
            try {
                if (isLoggable(i12)) {
                    f(i12, str, StringUtils.format(str2, objArr));
                }
            } catch (IllegalFormatException e12) {
                w("NetworkKit_Logger", "log format error".concat(str2), e12);
            }
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (isAPPLoggable(5)) {
            f363462a.w(G.f("NetworkSdk_", str), a(5, str2), c(th2));
        }
        if (f363463b) {
            a(5, str2);
            c(th2);
        }
    }
}
