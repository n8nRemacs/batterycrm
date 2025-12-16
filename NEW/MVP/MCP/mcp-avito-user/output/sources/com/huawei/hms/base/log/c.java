package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: LogRecord.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public String f363430b;

    /* renamed from: c, reason: collision with root package name */
    public String f363431c;

    /* renamed from: d, reason: collision with root package name */
    public int f363432d;

    /* renamed from: g, reason: collision with root package name */
    public String f363435g;

    /* renamed from: h, reason: collision with root package name */
    public int f363436h;

    /* renamed from: i, reason: collision with root package name */
    public int f363437i;

    /* renamed from: j, reason: collision with root package name */
    public int f363438j;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f363429a = new StringBuilder();

    /* renamed from: e, reason: collision with root package name */
    public long f363433e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f363434f = 0;

    public c(int i12, String str, int i13, String str2) {
        this.f363431c = "HMS";
        this.f363438j = i12;
        this.f363430b = str;
        this.f363432d = i13;
        if (str2 != null) {
            this.f363431c = str2;
        }
        b();
    }

    public static String a(int i12) {
        return i12 != 3 ? i12 != 4 ? i12 != 5 ? i12 != 6 ? String.valueOf(i12) : "E" : "W" : "I" : "D";
    }

    public final c b() {
        this.f363433e = System.currentTimeMillis();
        Thread threadCurrentThread = Thread.currentThread();
        this.f363434f = threadCurrentThread.getId();
        this.f363436h = Process.myPid();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        int length = stackTrace.length;
        int i12 = this.f363438j;
        if (length > i12) {
            StackTraceElement stackTraceElement = stackTrace[i12];
            this.f363435g = stackTraceElement.getFileName();
            this.f363437i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        a(sb2);
        return sb2.toString();
    }

    public <T> c a(T t12) {
        this.f363429a.append(t12);
        return this;
    }

    public c a(Throwable th2) {
        a((c) '\n').a((c) Log.getStackTraceString(th2));
        return this;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2);
        return sb2.toString();
    }

    public final StringBuilder a(StringBuilder sb2) {
        sb2.append(' ');
        sb2.append(this.f363429a.toString());
        return sb2;
    }

    public final StringBuilder b(StringBuilder sb2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb2.append('[');
        sb2.append(simpleDateFormat.format(Long.valueOf(this.f363433e)));
        String strA = a(this.f363432d);
        sb2.append(' ');
        sb2.append(strA);
        sb2.append('/');
        sb2.append(this.f363431c);
        sb2.append('/');
        sb2.append(this.f363430b);
        sb2.append(' ');
        sb2.append(this.f363436h);
        sb2.append(':');
        sb2.append(this.f363434f);
        sb2.append(' ');
        sb2.append(this.f363435g);
        sb2.append(':');
        sb2.append(this.f363437i);
        sb2.append(']');
        return sb2;
    }
}
