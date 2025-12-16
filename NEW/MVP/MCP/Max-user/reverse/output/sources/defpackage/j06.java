package defpackage;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class j06 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k06 b;

    public /* synthetic */ j06(k06 k06Var, int i) {
        this.a = i;
        this.b = k06Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        ab0 ab0VarO;
        ab0 ab0VarG;
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                this.b.a();
                return;
            default:
                k06 k06Var = this.b;
                Object obj = k06.m;
                synchronized (obj) {
                    try {
                        h06 h06Var = k06Var.a;
                        h06Var.a();
                        xt4 xt4VarI = xt4.i(h06Var.a);
                        try {
                            ab0VarO = k06Var.c.o();
                            if (xt4VarI != null) {
                                xt4VarI.A();
                            }
                        } catch (Throwable th) {
                            if (xt4VarI != null) {
                                xt4VarI.A();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = ab0VarO.b;
                    if (i == 5) {
                        ab0VarG = k06Var.g(ab0VarO);
                    } else {
                        if (i == 3) {
                            ab0VarG = k06Var.g(ab0VarO);
                        } else if (!k06Var.d.a(ab0VarO)) {
                            return;
                        } else {
                            ab0VarG = k06Var.b(ab0VarO);
                        }
                    }
                    synchronized (obj) {
                        try {
                            h06 h06Var2 = k06Var.a;
                            h06Var2.a();
                            xt4 xt4VarI2 = xt4.i(h06Var2.a);
                            try {
                                k06Var.c.n(ab0VarG);
                                if (xt4VarI2 != null) {
                                    xt4VarI2.A();
                                }
                            } catch (Throwable th2) {
                                if (xt4VarI2 != null) {
                                    xt4VarI2.A();
                                }
                                throw th2;
                            }
                        } finally {
                        }
                    }
                    synchronized (k06Var) {
                        try {
                            if (k06Var.k.size() != 0 && !TextUtils.equals(ab0VarO.a, ab0VarG.a)) {
                                Iterator it = k06Var.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (ab0VarG.b == 4) {
                        String str = ab0VarG.a;
                        synchronized (k06Var) {
                            k06Var.j = str;
                        }
                    }
                    int i2 = ab0VarG.b;
                    if (i2 == 5) {
                        k06Var.h(new FirebaseInstallationsException());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        k06Var.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        k06Var.i(ab0VarG);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    k06Var.h(e);
                    return;
                }
        }
    }
}
