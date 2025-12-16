package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zs implements Iterable, my7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(String str) {
        for (u97 u97Var : (u97[]) this.b) {
            if (u97Var.a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new f2(2, (Object[]) this.b);
            case 1:
                return new f2(2, (u97[]) this.b);
            case 2:
                return new z55((Iterator) ((m2) this.b).invoke());
            case 3:
                return ((zde) this.b).iterator();
            default:
                return new f2((xg5) this.b);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "[" + ys.A((u97[]) this.b, ", ", 62) + ']';
            default:
                return super.toString();
        }
    }
}
