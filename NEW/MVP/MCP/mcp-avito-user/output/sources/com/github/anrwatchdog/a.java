package com.github.anrwatchdog;

import androidx.compose.ui.graphics.colorspace.e;
import java.io.Serializable;

/* compiled from: ANRError.java */
/* loaded from: classes4.dex */
public class a extends Error {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f342853b = 0;
    private static final long serialVersionUID = 1;

    /* compiled from: ANRError.java */
    /* renamed from: com.github.anrwatchdog.a$a, reason: collision with other inner class name */
    public static class C10554a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final String f342854b;

        /* renamed from: c, reason: collision with root package name */
        public final StackTraceElement[] f342855c;

        /* compiled from: ANRError.java */
        /* renamed from: com.github.anrwatchdog.a$a$a, reason: collision with other inner class name */
        public class C10555a extends Throwable {
            public C10555a(C10555a c10555a, b bVar) {
                super(C10554a.this.f342854b, c10555a);
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                setStackTrace(C10554a.this.f342855c);
                return this;
            }
        }

        public C10554a(String str, StackTraceElement[] stackTraceElementArr, b bVar) {
            this.f342854b = str;
            this.f342855c = stackTraceElementArr;
        }
    }

    public a(C10554a.C10555a c10555a, long j12) {
        super(e.i(j12, "Application Not Responding for at least ", " ms."), c10555a);
    }

    public static String a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
