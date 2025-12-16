package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;
import j.N;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes4.dex */
class f implements InterfaceC37020c<Void, Object> {
    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public final Object then(@N Task<Void> task) {
        if (task.r()) {
            return null;
        }
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        task.m();
        dVar.b();
        return null;
    }
}
