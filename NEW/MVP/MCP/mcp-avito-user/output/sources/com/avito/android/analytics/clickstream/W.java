package com.avito.android.analytics.clickstream;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ErrorParseUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_analytics-clickstream_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final StackTraceElement f89775a = new StackTraceElement("ErrorParseUtilsKt", "findActualData", "ErrorParseUtils.kt", 0);

    @Y61.k
    public static final String a(@Y61.k String str, @Y61.l String str2) {
        int iMin;
        if (str2 == null) {
            return g(str);
        }
        if (str2.length() + str.length() > 1000 && str.length() > (iMin = 999 - Math.min(str2.length(), 100))) {
            str = str.substring(0, iMin);
        }
        return g(str + ' ' + str2);
    }

    public static final T b(Throwable th2, LinkedHashSet linkedHashSet) {
        T tB2;
        StackTraceElement stackTraceElement = f89775a;
        try {
            StackTraceElement stackTraceElementC = c(th2.getStackTrace());
            if (stackTraceElementC != null) {
                return new T(th2, stackTraceElementC);
            }
            Throwable cause = th2.getCause();
            if (cause == null || linkedHashSet.contains(cause)) {
                tB2 = null;
            } else {
                linkedHashSet.add(cause);
                tB2 = b(cause, linkedHashSet);
            }
            return tB2 == null ? new T(th2, th2.getStackTrace().length == 0 ? stackTraceElement : th2.getStackTrace()[0]) : tB2;
        } catch (NullPointerException unused) {
            return new T(th2, stackTraceElement);
        }
    }

    public static final StackTraceElement c(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (C43066x.h0(stackTraceElement.getClassName(), "com.avito.android", false) || C43066x.h0(stackTraceElement.getClassName(), "ru.avito", false)) {
                return stackTraceElement;
            }
        }
        return null;
    }

    @Y61.l
    public static final Throwable d(@Y61.k Throwable th2) {
        if (c(th2.getStackTrace()) != null) {
            return th2;
        }
        Throwable cause = th2.getCause();
        if (cause == null) {
            return null;
        }
        return d(cause);
    }

    @Y61.k
    public static final String e(@Y61.k Throwable th2) {
        T tB2 = b(th2, b1.g(th2));
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement stackTraceElement = tB2.f89771b;
        String fileName = stackTraceElement.getFileName();
        sb2.append(fileName != null ? C43066x.c0(fileName, ".", "") : null);
        sb2.append(stackTraceElement.getMethodName());
        sb2.append(" line ");
        sb2.append(stackTraceElement.getLineNumber());
        sb2.append(' ');
        Throwable th3 = tB2.f89770a;
        sb2.append(th3.getClass().getSimpleName());
        sb2.append(':');
        sb2.append(th3.getLocalizedMessage());
        return sb2.toString();
    }

    @Y61.k
    public static final String f(@Y61.k Throwable th2) {
        Throwable thD = d(th2);
        if (thD != null) {
            th2 = thD;
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String g(String str) {
        return str.length() > 1000 ? str.substring(0, 1000) : str;
    }
}
