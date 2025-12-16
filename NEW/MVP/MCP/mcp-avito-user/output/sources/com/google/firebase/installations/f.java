package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallation;
import java.io.IOException;
import java.util.Iterator;
import xZ0.InterfaceC49903a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f361636c;

    public /* synthetic */ f(g gVar, int i12) {
        this.f361635b = i12;
        this.f361636c = gVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.installations.local.c cVarC;
        com.google.firebase.installations.local.c cVarF;
        switch (this.f361635b) {
            case 0:
                g gVar = this.f361636c;
                Object obj = g.f361637m;
                gVar.getClass();
                Object obj2 = g.f361637m;
                synchronized (obj2) {
                    try {
                        com.google.firebase.g gVar2 = gVar.f361638a;
                        gVar2.a();
                        d dVarA = d.a(gVar2.f361595a);
                        try {
                            cVarC = gVar.f361640c.c();
                            if (dVarA != null) {
                                dVarA.b();
                            }
                        } catch (Throwable th2) {
                            if (dVarA != null) {
                                dVarA.b();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    if (cVarC.f() == PersistedInstallation.RegistrationStatus.f361662f) {
                        cVarF = gVar.f(cVarC);
                    } else {
                        if (cVarC.f() == PersistedInstallation.RegistrationStatus.f361660d) {
                            cVarF = gVar.f(cVarC);
                        } else if (!gVar.f361641d.a(cVarC)) {
                            return;
                        } else {
                            cVarF = gVar.b(cVarC);
                        }
                    }
                    synchronized (obj2) {
                        try {
                            com.google.firebase.g gVar3 = gVar.f361638a;
                            gVar3.a();
                            d dVarA2 = d.a(gVar3.f361595a);
                            try {
                                gVar.f361640c.b(cVarF);
                                if (dVarA2 != null) {
                                    dVarA2.b();
                                }
                            } catch (Throwable th3) {
                                if (dVarA2 != null) {
                                    dVarA2.b();
                                }
                                throw th3;
                            }
                        } finally {
                        }
                    }
                    synchronized (gVar) {
                        if (gVar.f361648k.size() != 0 && !TextUtils.equals(cVarC.c(), cVarF.c())) {
                            Iterator it = gVar.f361648k.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC49903a) it.next()).a();
                            }
                        }
                    }
                    if (cVarF.f() == PersistedInstallation.RegistrationStatus.f361661e) {
                        String strC = cVarF.c();
                        synchronized (gVar) {
                            gVar.f361647j = strC;
                        }
                    }
                    if (cVarF.f() == PersistedInstallation.RegistrationStatus.f361662f) {
                        gVar.g(new FirebaseInstallationsException());
                        return;
                    } else if (cVarF.f() == PersistedInstallation.RegistrationStatus.f361659c || cVarF.f() == PersistedInstallation.RegistrationStatus.f361658b) {
                        gVar.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        gVar.h(cVarF);
                        return;
                    }
                } catch (FirebaseInstallationsException e12) {
                    gVar.g(e12);
                    return;
                }
            case 1:
                Object obj3 = g.f361637m;
                this.f361636c.a();
                return;
            default:
                Object obj4 = g.f361637m;
                this.f361636c.a();
                return;
        }
    }
}
