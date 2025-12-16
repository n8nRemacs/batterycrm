package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class k30 implements crf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ k30(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.crf
    public final Object get() {
        ek4 ek4Var;
        dk4 dk4Var;
        switch (this.a) {
            case 0:
                return j40.a(this.b);
            case 1:
                return new ho4(this.b, new pm4());
            case 2:
                return new bp4(this.b);
            case 3:
                return new ho4(this.b, new pm4());
            case 4:
                Context context = this.b;
                new HashMap();
                context.getApplicationContext();
                wha whaVar = new wha(18);
                new HashMap();
                new HashSet();
                new HashMap();
                return whaVar;
            case 5:
                return new ar4(this.b);
            case 6:
                return new zq4(this.b, new u1j(12));
            case 7:
                Context context2 = this.b;
                zjd zjdVar = ek4.p;
                synchronized (ek4.class) {
                    try {
                        if (ek4.v == null) {
                            Context applicationContext = context2 == null ? null : context2.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            ek4.v = new ek4(applicationContext, map);
                        }
                        ek4Var = ek4.v;
                    } finally {
                    }
                }
                return ek4Var;
            default:
                Context context3 = this.b;
                zjd zjdVar2 = dk4.n;
                synchronized (dk4.class) {
                    try {
                        if (dk4.t == null) {
                            qea qeaVar = new qea(context3, 2);
                            dk4.t = new dk4((Context) qeaVar.c, (HashMap) qeaVar.d, qeaVar.b, (kwf) qeaVar.o, qeaVar.a);
                        }
                        dk4Var = dk4.t;
                    } finally {
                    }
                }
                return dk4Var;
        }
    }
}
