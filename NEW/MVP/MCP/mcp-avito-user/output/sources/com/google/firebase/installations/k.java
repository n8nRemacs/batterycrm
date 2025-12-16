package com.google.firebase.installations;

import com.google.android.gms.tasks.C37028k;
import com.google.firebase.installations.local.PersistedInstallation;

/* compiled from: GetIdListener.java */
/* loaded from: classes6.dex */
class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final C37028k<String> f361655a;

    public k(C37028k<String> c37028k) {
        this.f361655a = c37028k;
    }

    @Override // com.google.firebase.installations.o
    public final boolean a(com.google.firebase.installations.local.c cVar) {
        if (cVar.f() != PersistedInstallation.RegistrationStatus.f361660d && cVar.f() != PersistedInstallation.RegistrationStatus.f361661e && cVar.f() != PersistedInstallation.RegistrationStatus.f361662f) {
            return false;
        }
        this.f361655a.d(cVar.c());
        return true;
    }

    @Override // com.google.firebase.installations.o
    public final boolean b(Exception exc) {
        return false;
    }
}
