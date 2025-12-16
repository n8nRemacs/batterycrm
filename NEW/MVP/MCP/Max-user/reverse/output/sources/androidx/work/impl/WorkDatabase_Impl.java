package androidx.work.impl;

import defpackage.ai;
import defpackage.cf4;
import defpackage.crd;
import defpackage.cwg;
import defpackage.ggg;
import defpackage.i5i;
import defpackage.k5i;
import defpackage.olh;
import defpackage.oq7;
import defpackage.prf;
import defpackage.r9b;
import defpackage.s4i;
import defpackage.s5i;
import defpackage.s7c;
import defpackage.u5i;
import defpackage.u73;
import defpackage.v8d;
import defpackage.xt4;
import defpackage.ywf;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile s5i m;
    public volatile xt4 n;
    public volatile u5i o;
    public volatile ywf p;
    public volatile i5i q;
    public volatile k5i r;
    public volatile s7c s;

    @Override // defpackage.lrd
    public final oq7 e() {
        return new oq7(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.lrd
    public final prf f(cf4 cf4Var) {
        return cf4Var.c.a(new u73(cf4Var.a, cf4Var.b, new ggg(cf4Var, new r9b(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e"), false, false));
    }

    @Override // defpackage.lrd
    public final List g() {
        return Arrays.asList(new s4i(13, 14), new s4i());
    }

    @Override // defpackage.lrd
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.lrd
    public final Map i() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(s5i.class, list);
        map.put(xt4.class, list);
        map.put(u5i.class, list);
        map.put(ywf.class, list);
        map.put(i5i.class, list);
        map.put(k5i.class, list);
        map.put(s7c.class, list);
        map.put(v8d.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final xt4 s() {
        xt4 xt4Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new xt4(this);
                }
                xt4Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xt4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s7c t() {
        s7c s7cVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    s7c s7cVar2 = new s7c();
                    s7cVar2.a = this;
                    s7cVar2.b = new ai(this, 17);
                    this.s = s7cVar2;
                }
                s7cVar = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s7cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ywf u() {
        ywf ywfVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    ywf ywfVar2 = new ywf();
                    ywfVar2.a = this;
                    ywfVar2.b = new ai(this, 28);
                    ywfVar2.c = new crd(this, 13);
                    ywfVar2.d = new crd(this, 14);
                    this.p = ywfVar2;
                }
                ywfVar = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ywfVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i5i v() {
        i5i i5iVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    i5i i5iVar2 = new i5i();
                    i5iVar2.a = this;
                    i5iVar2.b = new cwg(this, 3);
                    this.q = i5iVar2;
                }
                i5iVar = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i5iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k5i w() {
        k5i k5iVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new k5i(this);
                }
                k5iVar = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k5iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s5i x() {
        s5i s5iVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new s5i(this);
                }
                s5iVar = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s5iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final u5i y() {
        u5i u5iVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    u5i u5iVar2 = new u5i();
                    u5iVar2.a = this;
                    u5iVar2.b = new cwg(this, 6);
                    u5iVar2.c = new olh(this, 15);
                    this.o = u5iVar2;
                }
                u5iVar = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u5iVar;
    }
}
