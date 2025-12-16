package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class vx7 extends zx7 {
    public final vx7 c;
    public final zva d;
    public vx7 e;
    public String f;
    public int g;
    public int h;

    public vx7(vx7 vx7Var, zva zvaVar, int i, int i2, int i3) {
        this.c = vx7Var;
        this.d = zvaVar;
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.b = -1;
    }

    @Override // defpackage.zx7
    public final String a() {
        return this.f;
    }

    public final vx7 f(int i, int i2) {
        vx7 vx7Var = this.e;
        if (vx7Var == null) {
            zva zvaVar = this.d;
            vx7 vx7Var2 = new vx7(this, zvaVar != null ? new zva((Closeable) zvaVar.b) : null, 1, i, i2);
            this.e = vx7Var2;
            return vx7Var2;
        }
        vx7Var.a = 1;
        vx7Var.b = -1;
        vx7Var.g = i;
        vx7Var.h = i2;
        vx7Var.f = null;
        zva zvaVar2 = vx7Var.d;
        if (zvaVar2 != null) {
            zvaVar2.o = null;
            zvaVar2.c = null;
            zvaVar2.d = null;
        }
        return vx7Var;
    }

    public final vx7 g(int i, int i2) {
        vx7 vx7Var = this.e;
        if (vx7Var == null) {
            zva zvaVar = this.d;
            vx7 vx7Var2 = new vx7(this, zvaVar != null ? new zva((Closeable) zvaVar.b) : null, 2, i, i2);
            this.e = vx7Var2;
            return vx7Var2;
        }
        vx7Var.a = 2;
        vx7Var.b = -1;
        vx7Var.g = i;
        vx7Var.h = i2;
        vx7Var.f = null;
        zva zvaVar2 = vx7Var.d;
        if (zvaVar2 != null) {
            zvaVar2.o = null;
            zvaVar2.c = null;
            zvaVar2.d = null;
        }
        return vx7Var;
    }

    public final void h(String str) {
        this.f = str;
        zva zvaVar = this.d;
        if (zvaVar == null || !zvaVar.k(str)) {
            return;
        }
        Closeable closeable = (Closeable) zvaVar.b;
        throw new JsonParseException(closeable instanceof px7 ? (px7) closeable : null, ho7.i("Duplicate field '", str, "'"));
    }
}
