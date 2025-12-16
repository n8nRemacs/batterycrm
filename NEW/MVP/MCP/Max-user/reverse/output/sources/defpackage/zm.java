package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public final class zm extends ContextWrapper implements ah, i7g {
    public static zm d;
    public final Application a;
    public final k18 b;
    public final bwf c;

    public zm(Application application, k18 k18Var, bwf bwfVar, eza ezaVar) {
        super(application);
        uvi.a = ezaVar;
        this.b = k18Var;
        this.a = application;
        this.c = bwfVar;
        d = this;
    }

    public static qm3 a() {
        return (qm3) d.c.getValue();
    }

    @Override // defpackage.i7g
    public final q1g f() {
        return ((r1g) ((t1b) a()).getAccessor().c(647)).c();
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return this.a.getBaseContext();
    }
}
