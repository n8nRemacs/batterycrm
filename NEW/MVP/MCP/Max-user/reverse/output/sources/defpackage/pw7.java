package defpackage;

import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pw7 implements le5 {
    public static final nw7 X;
    public static final nw7 Y;
    public final HashMap a;
    public final HashMap b;
    public final mw7 c;
    public boolean d;
    public static final mw7 o = new mw7(0);
    public static final ow7 Z = new ow7();

    /* JADX WARN: Type inference failed for: r0v1, types: [nw7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [nw7] */
    static {
        final int i = 0;
        X = new oyg() { // from class: nw7
            @Override // defpackage.ie5
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((pyg) obj2).b((String) obj);
                        break;
                    default:
                        ((pyg) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        Y = new oyg() { // from class: nw7
            @Override // defpackage.ie5
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((pyg) obj2).b((String) obj);
                        break;
                    default:
                        ((pyg) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public pw7() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = o;
        this.d = false;
        map2.put(String.class, X);
        map.remove(String.class);
        map2.put(Boolean.class, Y);
        map.remove(Boolean.class);
        map2.put(Date.class, Z);
        map.remove(Date.class);
    }

    @Override // defpackage.le5
    public final le5 b(Class cls, pqa pqaVar) {
        this.a.put(cls, pqaVar);
        this.b.remove(cls);
        return this;
    }
}
