package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class nx4 {
    public final int a;
    public final String b;
    public final brf c;
    public final long d;
    public final long e;
    public final long f;
    public final q85 g;
    public final qha h;
    public final rha i;
    public final Context j;

    public nx4(mx4 mx4Var) {
        qha qhaVar;
        rha rhaVar;
        Context context = mx4Var.g;
        this.j = context;
        brf brfVar = mx4Var.b;
        if (!((brfVar == null && context == null) ? false : true)) {
            throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
        }
        if (brfVar == null && context != null) {
            mx4Var.b = new lx4(0, this);
        }
        this.a = 1;
        this.b = mx4Var.a;
        brf brfVar2 = mx4Var.b;
        brfVar2.getClass();
        this.c = brfVar2;
        this.d = mx4Var.c;
        this.e = mx4Var.d;
        this.f = mx4Var.e;
        this.g = mx4Var.f;
        synchronized (qha.class) {
            try {
                if (qha.b == null) {
                    qha.b = new qha(0);
                }
                qhaVar = qha.b;
            } finally {
            }
        }
        this.h = qhaVar;
        synchronized (rha.class) {
            try {
                if (rha.b == null) {
                    rha.b = new rha(0);
                }
                rhaVar = rha.b;
            } finally {
            }
        }
        this.i = rhaVar;
        synchronized (tha.class) {
            if (tha.b == null) {
                tha.b = new tha(0);
            }
        }
    }
}
