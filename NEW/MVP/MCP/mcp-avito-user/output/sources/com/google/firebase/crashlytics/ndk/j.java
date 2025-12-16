package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.ndk.i;
import java.io.File;

/* compiled from: SessionFilesProvider.java */
/* loaded from: classes4.dex */
class j implements com.google.firebase.crashlytics.internal.e {

    /* renamed from: a, reason: collision with root package name */
    public final i f361518a;

    public j(i iVar) {
        this.f361518a = iVar;
    }

    @Override // com.google.firebase.crashlytics.internal.e
    public final CrashlyticsReport.a a() {
        i.c cVar = this.f361518a.f361504a;
        if (cVar != null) {
            return cVar.f361517b;
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.e
    public final File b() {
        return this.f361518a.f361504a.f361516a;
    }

    @Override // com.google.firebase.crashlytics.internal.e
    public final File c() {
        return this.f361518a.f361506c;
    }

    @Override // com.google.firebase.crashlytics.internal.e
    public final File d() {
        return this.f361518a.f361505b;
    }

    @Override // com.google.firebase.crashlytics.internal.e
    public final File e() {
        return this.f361518a.f361508e;
    }

    @Override // com.google.firebase.crashlytics.internal.e
    public final File f() {
        return this.f361518a.f361507d;
    }

    @Override // com.google.firebase.crashlytics.internal.e
    public final File g() {
        return this.f361518a.f361509f;
    }
}
