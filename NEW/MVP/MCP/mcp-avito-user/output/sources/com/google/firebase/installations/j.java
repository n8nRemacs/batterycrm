package com.google.firebase.installations;

import androidx.appcompat.app.r;
import com.google.android.gms.tasks.C37028k;
import com.google.firebase.installations.a;
import com.google.firebase.installations.local.PersistedInstallation;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes6.dex */
class j implements o {

    /* renamed from: a, reason: collision with root package name */
    public final p f361653a;

    /* renamed from: b, reason: collision with root package name */
    public final C37028k<l> f361654b;

    public j(p pVar, C37028k<l> c37028k) {
        this.f361653a = pVar;
        this.f361654b = c37028k;
    }

    @Override // com.google.firebase.installations.o
    public final boolean a(com.google.firebase.installations.local.c cVar) {
        if (cVar.f() != PersistedInstallation.RegistrationStatus.f361661e || this.f361653a.a(cVar)) {
            return false;
        }
        a.b bVar = new a.b();
        String strA = cVar.a();
        if (strA == null) {
            throw new NullPointerException("Null token");
        }
        bVar.f361628a = strA;
        bVar.f361629b = Long.valueOf(cVar.b());
        bVar.f361630c = Long.valueOf(cVar.g());
        String strQ = bVar.f361628a == null ? " token" : "";
        if (bVar.f361629b == null) {
            strQ = strQ.concat(" tokenExpirationTimestamp");
        }
        if (bVar.f361630c == null) {
            strQ = r.q(strQ, " tokenCreationTimestamp");
        }
        if (!strQ.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }
        this.f361654b.b(new a(bVar.f361628a, bVar.f361629b.longValue(), bVar.f361630c.longValue(), null));
        return true;
    }

    @Override // com.google.firebase.installations.o
    public final boolean b(Exception exc) {
        this.f361654b.c(exc);
        return true;
    }
}
