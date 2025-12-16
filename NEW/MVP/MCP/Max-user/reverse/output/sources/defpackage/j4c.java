package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j4c implements Handler.Callback {
    public boolean X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ int a;
    public final Handler b;
    public final TreeMap c;
    public boolean d;
    public boolean o;
    public final Object s0;
    public Object t0;

    public j4c(zc4 zc4Var, h08 h08Var, qi4 qi4Var) {
        this.a = 0;
        this.t0 = zc4Var;
        this.Z = h08Var;
        this.Y = qi4Var;
        this.c = new TreeMap();
        this.b = xxg.l(this);
        this.s0 = new aq(1);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    if (message.what == 1) {
                        f4c f4cVar = (f4c) message.obj;
                        long j = f4cVar.a;
                        long j2 = f4cVar.b;
                        Long lValueOf = Long.valueOf(j2);
                        TreeMap treeMap = this.c;
                        Long l = (Long) treeMap.get(lValueOf);
                        if (l != null) {
                            if (l.longValue() > j) {
                                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                                break;
                            }
                        } else {
                            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                            break;
                        }
                    }
                }
                break;
            default:
                if (!this.X) {
                    if (message.what == 1) {
                        g4c g4cVar = (g4c) message.obj;
                        long j3 = g4cVar.a;
                        long j4 = g4cVar.b;
                        Long lValueOf2 = Long.valueOf(j4);
                        TreeMap treeMap2 = this.c;
                        Long l2 = (Long) treeMap2.get(lValueOf2);
                        if (l2 != null) {
                            if (l2.longValue() > j3) {
                                treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                                break;
                            }
                        } else {
                            treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    public j4c(ad4 ad4Var, a3b a3bVar, ri4 ri4Var) {
        this.a = 1;
        this.t0 = ad4Var;
        this.Z = a3bVar;
        this.Y = ri4Var;
        this.c = new TreeMap();
        this.b = zxg.n(this);
        this.s0 = new bq(1);
    }
}
