package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.util.concurrent.Callable;
import mZ0.C44035b;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes4.dex */
class D implements Callable<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f360883b;

    public D(E e12) {
        this.f360883b = e12;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        C37598u c37598u = this.f360883b.f360895h;
        F f12 = c37598u.f361002c;
        String str = f12.f360903a;
        C44035b c44035b = f12.f360904b;
        c44035b.getClass();
        boolean z12 = true;
        if (new File(c44035b.f414584b, str).exists()) {
            com.google.firebase.crashlytics.internal.d.f361031a.a(2);
            String str2 = f12.f360903a;
            c44035b.getClass();
            new File(c44035b.f414584b, str2).delete();
        } else {
            String strF = c37598u.f();
            if (strF == null || !c37598u.f361009j.d(strF)) {
                z12 = false;
            }
        }
        return Boolean.valueOf(z12);
    }
}
