package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ihi extends b3 {
    public final Object b;
    public int c;
    public final /* synthetic */ wi3 d;

    public ihi(wi3 wi3Var, int i) {
        super(false, 1);
        this.d = wi3Var;
        Object obj = wi3.v0;
        this.b = wi3Var.m()[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        wi3 wi3Var = this.d;
        if (i != -1 && i < wi3Var.size()) {
            if (pui.c(obj, wi3Var.m()[this.c])) {
                return;
            }
        }
        Object obj2 = wi3.v0;
        this.c = wi3Var.s(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        wi3 wi3Var = this.d;
        Map mapO = wi3Var.o();
        if (mapO != null) {
            return mapO.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return wi3Var.n()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        wi3 wi3Var = this.d;
        Map mapO = wi3Var.o();
        Object obj2 = this.b;
        if (mapO != null) {
            return mapO.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            wi3Var.put(obj2, obj);
            return null;
        }
        Object obj3 = wi3Var.n()[i];
        wi3Var.n()[this.c] = obj;
        return obj3;
    }
}
