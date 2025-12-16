package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class qy8 {
    public final vx8 a;
    public final f3c b;
    public final x19 c;
    public final List d;
    public final CharSequence e;
    public final int f;
    public final int g;
    public final Bundle h;

    public qy8() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Collections.EMPTY_LIST;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = Bundle.EMPTY;
    }

    public qy8(vx8 vx8Var, f3c f3cVar, x19 x19Var, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.a = vx8Var;
        this.b = f3cVar;
        this.c = x19Var;
        list.getClass();
        this.d = list;
        this.e = charSequence;
        this.f = i;
        this.g = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public qy8(qy8 qy8Var) {
        this.a = qy8Var.a;
        this.b = qy8Var.b;
        this.c = qy8Var.c;
        this.d = qy8Var.d;
        this.e = qy8Var.e;
        this.f = qy8Var.f;
        this.g = qy8Var.g;
        this.h = qy8Var.h;
    }
}
