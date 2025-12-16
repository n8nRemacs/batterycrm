package com.google.android.datatransport;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.P;

/* compiled from: Event.java */
@VY0.c
/* loaded from: classes10.dex */
public abstract class d<T> {
    public static <T> d<T> d(T t12) {
        return new a(t12, Priority.f342916b);
    }

    public static <T> d<T> e(T t12) {
        return new a(t12, Priority.f342917c);
    }

    public static d f(CrashlyticsReport crashlyticsReport) {
        return new a(crashlyticsReport, Priority.f342918d);
    }

    @P
    public abstract Integer a();

    public abstract T b();

    public abstract Priority c();
}
