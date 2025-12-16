package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ey extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ey() {
        this.a = 4;
    }

    private final void a(Message message) {
        Set set;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            pl4 pl4Var = (pl4) this.b;
            h79 h79Var = pl4Var.c;
            if (obj == pl4Var.x) {
                if (pl4Var.o == 2 || pl4Var.i()) {
                    pl4Var.x = null;
                    if (obj2 instanceof Exception) {
                        h79Var.F((Exception) obj2, false);
                        return;
                    }
                    try {
                        pl4Var.b.E((byte[]) obj2);
                        h79Var.c = null;
                        HashSet hashSet = (HashSet) h79Var.b;
                        wg7 wg7VarJ = wg7.j(hashSet);
                        hashSet.clear();
                        t76 t76VarListIterator = wg7VarJ.listIterator(0);
                        while (t76VarListIterator.hasNext()) {
                            pl4 pl4Var2 = (pl4) t76VarListIterator.next();
                            if (pl4Var2.l()) {
                                pl4Var2.h(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        h79Var.F(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        pl4 pl4Var3 = (pl4) this.b;
        if (obj == pl4Var3.w && pl4Var3.i()) {
            pl4Var3.w = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                pl4Var3.k((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrB = pl4Var3.b.B(pl4Var3.u, (byte[]) obj2);
                if (pl4Var3.v != null && bArrB != null && bArrB.length != 0) {
                    pl4Var3.v = bArrB;
                }
                pl4Var3.o = 4;
                q74 q74Var = pl4Var3.h;
                synchronized (q74Var.a) {
                    set = q74Var.c;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((d55) it.next()).a();
                }
            } catch (Exception e2) {
                e = e2;
                pl4Var3.k(e, true);
            } catch (NoSuchMethodError e3) {
                e = e3;
                pl4Var3.k(e, true);
            }
        }
    }

    private final void b(Message message) {
        b79 b79Var;
        z69 z69Var;
        ey eyVar;
        z69 z69Var2;
        if (message.what == 1) {
            synchronized (((z69) this.b).a) {
                b79Var = (b79) ((z69) this.b).d.get();
                z69Var = (z69) this.b;
                eyVar = z69Var.e;
            }
            if (b79Var != null) {
                synchronized (b79Var.d) {
                    z69Var2 = b79Var.l;
                }
                if (z69Var != z69Var2 || eyVar == null) {
                    return;
                }
                b79Var.c((b89) message.obj);
                ((z69) this.b).a(b79Var, eyVar);
                b79Var.c(null);
            }
        }
    }

    public void c(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0345 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r13v2, types: [fy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [gy] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [gy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [fy] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r13) throws android.media.MediaCodec.CryptoException {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey.handleMessage(android.os.Message):void");
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 4:
                Bundle data = message.getData();
                ClassLoader classLoader = nv8.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    public /* synthetic */ ey(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(n49 n49Var) {
        super(Looper.getMainLooper());
        this.a = 5;
        this.b = n49Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(Looper looper, fde fdeVar) {
        super(looper);
        this.a = 11;
        this.b = fdeVar;
    }
}
