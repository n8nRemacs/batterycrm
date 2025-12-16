package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class cj6 implements s07, kyd, ggh {
    public final a a;
    public final fgh b;
    public final gq5 c;
    public dgh d;
    public l48 o = null;
    public vd X = null;

    public cj6(a aVar, fgh fghVar, gq5 gq5Var) {
        this.a = aVar;
        this.b = fghVar;
        this.c = gq5Var;
    }

    public final void a(k38 k38Var) {
        this.o.d(k38Var);
    }

    public final void b() {
        if (this.o == null) {
            this.o = new l48(this);
            vd vdVar = new vd(this);
            this.X = vdVar;
            vdVar.q();
            this.c.run();
        }
    }

    @Override // defpackage.s07
    public final dgh d() {
        Application application;
        a aVar = this.a;
        dgh dghVarD = aVar.d();
        if (!dghVarD.equals(aVar.d1)) {
            this.d = dghVarD;
            return dghVarD;
        }
        if (this.d == null) {
            Context applicationContext = aVar.k0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.d = new lyd(application, aVar, aVar.X);
        }
        return this.d;
    }

    @Override // defpackage.s07
    public final d8a e() {
        Application application;
        a aVar = this.a;
        Context applicationContext = aVar.k0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        d8a d8aVar = new d8a(0);
        if (application != null) {
            d8aVar.a(cgh.d, application);
        }
        d8aVar.a(zfi.a, aVar);
        d8aVar.a(zfi.b, this);
        Bundle bundle = aVar.X;
        if (bundle != null) {
            d8aVar.a(zfi.c, bundle);
        }
        return d8aVar;
    }

    @Override // defpackage.ggh
    public final fgh h() {
        b();
        return this.b;
    }

    @Override // defpackage.kyd
    public final pn l() {
        b();
        return (pn) this.X.d;
    }

    @Override // defpackage.j48
    public final l48 p() {
        b();
        return this.o;
    }
}
