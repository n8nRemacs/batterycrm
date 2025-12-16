package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ez extends dtf implements sm6 {
    public final /* synthetic */ si9 X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ gz o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(gz gzVar, si9 si9Var, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = gzVar;
        this.X = si9Var;
        this.Y = l;
        this.Z = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ez) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ez(this.o, this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        w10 w10VarO;
        String strA;
        String strA2;
        Object next;
        boolean zA;
        g8j.b(obj);
        gz gzVar = this.o;
        gzVar.getClass();
        k18 k18Var = gzVar.g;
        si9 si9Var = this.X;
        if (si9Var.v()) {
            si9Var = si9Var.A0;
        }
        jdc jdcVar = si9Var.x0;
        if (jdcVar == null || jdcVar.p() <= 0) {
            jdcVar = null;
        }
        boolean z = this.Z;
        if (jdcVar == null) {
            return new bz(null, z ? Integer.valueOf(dvd.d) : null, null);
        }
        Long l = this.Y;
        if (l != null) {
            Iterator it = ((List) jdcVar.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                w10 w10Var = (w10) next;
                s10 s10Var = w10Var.a;
                int i = s10Var == null ? -1 : cz.$EnumSwitchMapping$0[s10Var.ordinal()];
                if (i == 1) {
                    k10 k10Var = w10Var.b;
                    zA = fni.a(k10Var != null ? Long.valueOf(k10Var.Z) : null, l);
                } else if (i == 2) {
                    v10 v10Var = w10Var.d;
                    zA = fni.a(v10Var != null ? Long.valueOf(v10Var.a) : null, l);
                } else if (i == 3) {
                    o10 o10Var = w10Var.g;
                    zA = fni.a(o10Var != null ? Long.valueOf(o10Var.a) : null, l);
                } else if (i == 4) {
                    f10 f10Var = w10Var.j;
                    zA = fni.a(f10Var != null ? Long.valueOf(f10Var.a) : null, l);
                } else {
                    if (i != 5) {
                        throw new IllegalStateException(("Attach with given id = " + l + " not found").toString());
                    }
                    w00 w00Var = w10Var.e;
                    zA = fni.a(w00Var != null ? Long.valueOf(w00Var.a) : null, l);
                }
                if (zA) {
                    break;
                }
            }
            if (next == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            w10VarO = (w10) next;
        } else {
            w10VarO = jdcVar.o(0);
            if (w10VarO == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        f10 f10Var2 = w10VarO.j;
        o10 o10Var2 = w10VarO.g;
        if (w10VarO.f()) {
            k10 k10Var2 = w10VarO.b;
            if (!k10Var2.o || (strA = k10Var2.u0) == null) {
                strA = k10Var2.a();
            }
        } else if (w10VarO.h()) {
            strA = w10VarO.d.d;
        } else {
            r10 r10Var = w10VarO.f;
            if (r10Var != null) {
                strA2 = r10Var.h;
                if (l8g.c(strA2)) {
                    strA2 = r10Var.b;
                }
            } else if (w10VarO.g()) {
                k10 k10Var3 = o10Var2.f;
                strA = (!(k10Var3 != null) || k10Var3 == null) ? null : k10Var3.a();
            } else {
                if (w10VarO.d()) {
                    w10 w10Var2 = f10Var2.d;
                    if (w10Var2 != null) {
                        s10 s10Var2 = w10Var2.a;
                        int i2 = s10Var2 != null ? cz.$EnumSwitchMapping$0[s10Var2.ordinal()] : -1;
                        if (i2 == 1) {
                            k10 k10Var4 = w10Var2.b;
                            boolean z2 = k10Var4.o;
                            String str = k10Var4.a;
                            strA2 = k10Var4.b;
                            if (!z2) {
                                if (strA2 == null || strA2.length() == 0) {
                                    if (str != null && str.length() != 0) {
                                        strA2 = xui.a(str, il0.b, hl0.a);
                                    }
                                }
                            }
                        } else if (i2 == 2) {
                            strA2 = w10Var2.d.d;
                        }
                    }
                } else if (w10VarO.c()) {
                    a10 a10Var = w10VarO.k;
                    strA = ((qu3) k18Var.getValue()).a(((qu3) k18Var.getValue()).b(a10Var), a10Var);
                }
            }
            strA = strA2;
        }
        return new bz(w10VarO.d() ? f10Var2.c : null, w10VarO.m != null ? Integer.valueOf(dvd.b) : w10VarO.d() ? Integer.valueOf(dvd.a) : w10VarO.b() ? Integer.valueOf(dvd.c) : z ? Integer.valueOf(dvd.d) : null, strA);
    }
}
