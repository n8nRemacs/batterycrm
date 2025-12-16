package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.util.concurrent.Callable;
import mZ0.C44035b;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes4.dex */
class C implements Callable<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f360882b;

    public C(E e12) {
        this.f360882b = e12;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        try {
            F f12 = this.f360882b.f360892e;
            String str = f12.f360903a;
            C44035b c44035b = f12.f360904b;
            c44035b.getClass();
            boolean zDelete = new File(c44035b.f414584b, str).delete();
            if (!zDelete) {
                dVar.a(5);
            }
            return Boolean.valueOf(zDelete);
        } catch (Exception unused) {
            dVar.b();
            return Boolean.FALSE;
        }
    }
}
