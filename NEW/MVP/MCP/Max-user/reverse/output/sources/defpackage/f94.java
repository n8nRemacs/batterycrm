package defpackage;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class f94 implements dbd {
    public final Object a;
    public Object b;
    public volatile Object c;

    public f94(y8g y8gVar) {
        this.a = y8gVar;
        this.c = new yk6(0, 0L);
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        Object obj2 = this.c;
        if (obj2 != null) {
            return obj2;
        }
        Object value = ((bwf) this.a).getValue();
        this.c = value;
        return value;
    }

    @Override // defpackage.dbd
    public void O(Object obj, yy7 yy7Var, Object obj2) {
        Object obj3 = this.c;
        this.c = obj2;
        ((b47) this.b).c.getClass();
    }

    public Logger a() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = (Logger) this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public f94(zva zvaVar) {
        i5i i5iVar = new i5i(zvaVar);
        rl rlVar = new rl(2, zvaVar);
        this.a = i5iVar;
        this.b = rlVar;
    }

    public f94(Class cls) {
        this.a = new Object();
        this.b = cls.getName();
    }

    public f94(bwf bwfVar, b47 b47Var) {
        this.a = bwfVar;
        this.b = b47Var;
    }
}
