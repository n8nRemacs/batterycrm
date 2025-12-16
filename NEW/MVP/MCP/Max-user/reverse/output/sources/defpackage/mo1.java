package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.rx.TamTamObservables$TamObservableException;

/* loaded from: classes.dex */
public final class mo1 extends dtf implements um6 {
    public int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo1(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Z = obj;
        this.s0 = obj2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.o) {
            case 0:
                mo1 mo1Var = new mo1((Continuation) obj3, (k18) this.s0, 0);
                mo1Var.Y = (z26) obj;
                mo1Var.Z = obj2;
                return mo1Var.n(qqg.a);
            case 1:
                mo1 mo1Var2 = new mo1((Continuation) obj3, (va4) this.s0, 1);
                mo1Var2.Y = (z26) obj;
                mo1Var2.Z = obj2;
                return mo1Var2.n(qqg.a);
            case 2:
                mo1 mo1Var3 = new mo1(this.s0, (Continuation) obj3, 2);
                mo1Var3.Y = (z26) obj;
                mo1Var3.Z = obj2;
                return mo1Var3.n(qqg.a);
            case 3:
                mo1 mo1Var4 = new mo1((Continuation) obj3, (wm6) this.s0, 3);
                mo1Var4.Y = (z26) obj;
                mo1Var4.Z = (Object[]) obj2;
                return mo1Var4.n(qqg.a);
            case 4:
                mo1 mo1Var5 = new mo1((um6) this.s0, (Continuation) obj3, 4);
                mo1Var5.Y = (z26) obj;
                mo1Var5.Z = (Object[]) obj2;
                return mo1Var5.n(qqg.a);
            case 5:
                mo1 mo1Var6 = new mo1((s78) this.s0, (Continuation) obj3, 5);
                mo1Var6.Y = (z26) obj;
                mo1Var6.Z = (Throwable) obj2;
                return mo1Var6.n(qqg.a);
            case 6:
                mo1 mo1Var7 = new mo1((ce9) this.s0, (Continuation) obj3, 6);
                mo1Var7.Y = (List) obj;
                mo1Var7.Z = (zc9) obj2;
                return mo1Var7.n(qqg.a);
            case 7:
                mo1 mo1Var8 = new mo1((Continuation) obj3, (ce9) this.s0, 7);
                mo1Var8.Y = (z26) obj;
                mo1Var8.Z = obj2;
                return mo1Var8.n(qqg.a);
            case 8:
                mo1 mo1Var9 = new mo1((Continuation) obj3, (e5f) this.s0, 8);
                mo1Var9.Y = (z26) obj;
                mo1Var9.Z = obj2;
                return mo1Var9.n(qqg.a);
            case 9:
                mo1 mo1Var10 = new mo1((ytf) this.Z, (bug) this.s0, (Continuation) obj3, 9);
                mo1Var10.Y = (Throwable) obj2;
                mo1Var10.n(qqg.a);
                return g84.a;
            case 10:
                mo1 mo1Var11 = new mo1((ytf) this.Z, (ttg) this.s0, (Continuation) obj3, 10);
                mo1Var11.Y = (Throwable) obj2;
                mo1Var11.n(qqg.a);
                return g84.a;
            case 11:
                mo1 mo1Var12 = new mo1((duf) this.Z, (um9) this.s0, (Continuation) obj3, 11);
                mo1Var12.Y = (Throwable) obj2;
                mo1Var12.n(qqg.a);
                return g84.a;
            default:
                mo1 mo1Var13 = new mo1((Continuation) obj3, (uvh) this.s0, 12);
                mo1Var13.Y = (z26) obj;
                mo1Var13.Z = (Object[]) obj2;
                return mo1Var13.n(qqg.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, sm6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        x26 x26VarK;
        z26 z26Var;
        Object objInvoke;
        z26 z26Var2;
        Object objInvoke2;
        z26 z26Var3;
        Object objInvoke3;
        Object objT;
        Throwable th;
        int i = 3;
        Object[] objArr = 0;
        Continuation continuation = null;
        switch (this.o) {
            case 0:
                g84 g84Var = g84.a;
                int i2 = this.X;
                if (i2 == 0) {
                    g8j.b(obj);
                    z26 z26Var4 = (z26) this.Y;
                    n41 n41Var = (n41) this.Z;
                    w63 w63Var = (w63) ((k18) this.s0).getValue();
                    Long l = n41Var.a;
                    if (l == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    hbd hbdVarJ = w63Var.j(l.longValue());
                    this.X = 1;
                    if (gw0.n(this, hbdVarJ, z26Var4) == g84Var) {
                        return g84Var;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            case 1:
                g84 g84Var2 = g84.a;
                int i3 = this.X;
                if (i3 == 0) {
                    g8j.b(obj);
                    z26 z26Var5 = (z26) this.Y;
                    w8a w8aVar = (w8a) this.Z;
                    ArrayList arrayList = new ArrayList(w8aVar.b);
                    Object[] objArr2 = w8aVar.a;
                    int i4 = w8aVar.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        f9a f9aVar = (f9a) ((va4) this.s0).s0.get((String) objArr2[i5]);
                        if (f9aVar != null) {
                            arrayList.add(f9aVar);
                        }
                    }
                    List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    if (listUnmodifiableList.isEmpty()) {
                        x26VarK = new m11(13, hd5.a);
                    } else {
                        ka4 ka4Var = new ka4((x26[]) ue3.d0(listUnmodifiableList).toArray(new x26[0]), objArr == true ? 1 : 0);
                        int i6 = s65.d;
                        x26VarK = gw0.k(ka4Var, s8j.f(v9j.h(100, y65.MILLISECONDS)));
                    }
                    this.X = 1;
                    if (gw0.n(this, x26VarK, z26Var5) == g84Var2) {
                        return g84Var2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            case 2:
                g84 g84Var3 = g84.a;
                int i7 = this.X;
                if (i7 == 0) {
                    g8j.b(obj);
                    z26Var = (z26) this.Y;
                    Object obj2 = this.Z;
                    ?? r6 = this.s0;
                    this.Y = z26Var;
                    this.X = 1;
                    objInvoke = r6.invoke(obj2, this);
                    if (objInvoke == g84Var3) {
                        return g84Var3;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g8j.b(obj);
                        return qqg.a;
                    }
                    z26Var = (z26) this.Y;
                    g8j.b(obj);
                    objInvoke = obj;
                }
                this.Y = null;
                this.X = 2;
                if (z26Var.a(objInvoke, this) == g84Var3) {
                    return g84Var3;
                }
                return qqg.a;
            case 3:
                g84 g84Var4 = g84.a;
                int i8 = this.X;
                if (i8 == 0) {
                    g8j.b(obj);
                    z26Var2 = (z26) this.Y;
                    Object[] objArr3 = (Object[]) this.Z;
                    wm6 wm6Var = (wm6) this.s0;
                    Object obj3 = objArr3[0];
                    Object obj4 = objArr3[1];
                    Object obj5 = objArr3[2];
                    this.Y = z26Var2;
                    this.X = 1;
                    objInvoke2 = wm6Var.invoke(obj3, obj4, obj5, this);
                    if (objInvoke2 == g84Var4) {
                        return g84Var4;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g8j.b(obj);
                        return qqg.a;
                    }
                    z26Var2 = (z26) this.Y;
                    g8j.b(obj);
                    objInvoke2 = obj;
                }
                this.Y = null;
                this.X = 2;
                if (z26Var2.a(objInvoke2, this) == g84Var4) {
                    return g84Var4;
                }
                return qqg.a;
            case 4:
                g84 g84Var5 = g84.a;
                int i9 = this.X;
                if (i9 == 0) {
                    g8j.b(obj);
                    z26Var3 = (z26) this.Y;
                    Object[] objArr4 = (Object[]) this.Z;
                    um6 um6Var = (um6) this.s0;
                    Object obj6 = objArr4[0];
                    Object obj7 = objArr4[1];
                    this.Y = z26Var3;
                    this.X = 1;
                    objInvoke3 = um6Var.invoke(obj6, obj7, this);
                    if (objInvoke3 == g84Var5) {
                        return g84Var5;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g8j.b(obj);
                        return qqg.a;
                    }
                    z26Var3 = (z26) this.Y;
                    g8j.b(obj);
                    objInvoke3 = obj;
                }
                this.Y = null;
                this.X = 2;
                if (z26Var3.a(objInvoke3, this) == g84Var5) {
                    return g84Var5;
                }
                return qqg.a;
            case 5:
                g84 g84Var6 = g84.a;
                int i10 = this.X;
                if (i10 == 0) {
                    g8j.b(obj);
                    z26 z26Var6 = (z26) this.Y;
                    Throwable th2 = (Throwable) this.Z;
                    if (!(th2 instanceof CancellationException)) {
                        wqi.e(((s78) this.s0).s, "fail", th2);
                        b68 b68Var = b68.a;
                        this.Y = null;
                        this.X = 1;
                        if (z26Var6.a(b68Var, this) == g84Var6) {
                            return g84Var6;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            case 6:
                g84 g84Var7 = g84.a;
                int i11 = this.X;
                if (i11 == 0) {
                    g8j.b(obj);
                    List list = (List) this.Y;
                    zc9 zc9Var = (zc9) this.Z;
                    ce9 ce9Var = (ce9) this.s0;
                    this.Y = null;
                    this.X = 1;
                    objT = ce9.t(ce9Var, list, zc9Var, this);
                    if (objT == g84Var7) {
                        return g84Var7;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                    objT = obj;
                }
                return ue3.d0((Iterable) objT);
            case 7:
                ce9 ce9Var2 = (ce9) this.s0;
                g84 g84Var8 = g84.a;
                int i12 = this.X;
                if (i12 == 0) {
                    g8j.b(obj);
                    z26 z26Var7 = (z26) this.Y;
                    List list2 = (List) this.Z;
                    x26 x26VarK2 = gw0.k(new m36(new xd9(list2, null), new z41(list2, new gbd(ce9Var2.X.a), new mo1(ce9Var2, continuation, 6))), 200L);
                    this.X = 1;
                    if (gw0.n(this, x26VarK2, z26Var7) == g84Var8) {
                        return g84Var8;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            case 8:
                g84 g84Var9 = g84.a;
                int i13 = this.X;
                if (i13 == 0) {
                    g8j.b(obj);
                    z26 z26Var8 = (z26) this.Y;
                    ((Number) this.Z).intValue();
                    e5f e5fVar = (e5f) this.s0;
                    x26 x26VarU = gw0.u(gw0.m(new z41(new d53(((w63) e5fVar.e.getValue()).j(e5fVar.a), 12), new d53(((l24) e5fVar.f.getValue()).c(e5fVar.d), 12), new z8e(e5fVar, continuation, i), i)), ((q2b) e5fVar.c).b());
                    this.X = 1;
                    if (gw0.n(this, x26VarU, z26Var8) == g84Var9) {
                        return g84Var9;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            case 9:
                ytf ytfVar = (ytf) this.Z;
                g84 g84Var10 = g84.a;
                int i14 = this.X;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) this.Y;
                    g8j.b(obj);
                    throw th3;
                }
                g8j.b(obj);
                Throwable th4 = (Throwable) this.Y;
                wqi.e(ytfVar.b, "Got error during upload", th4);
                ytfVar.a.c(th4);
                bug bugVar = (bug) this.s0;
                this.Y = th4;
                this.X = 1;
                if (ytfVar.h(bugVar, this) == g84Var10) {
                    return g84Var10;
                }
                throw th4;
            case 10:
                ttg ttgVar = (ttg) this.s0;
                ytf ytfVar2 = (ytf) this.Z;
                g84 g84Var11 = g84.a;
                int i15 = this.X;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th5 = (Throwable) this.Y;
                    g8j.b(obj);
                    throw th5;
                }
                g8j.b(obj);
                Throwable th6 = (Throwable) this.Y;
                if (!(th6 instanceof HttpUrlExpiredException)) {
                    ((pe8) ((pb3) ytfVar2.d.getValue())).getClass();
                    int i16 = s65.d;
                    y65 y65Var = y65.DAYS;
                    if (s65.g(v9j.h(7, y65Var)) <= 0) {
                        throw th6;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - ttgVar.i;
                    ((pe8) ((pb3) ytfVar2.d.getValue())).getClass();
                    if (jCurrentTimeMillis > s65.g(v9j.h(7, y65Var))) {
                        throw new TamTamObservables$TamObservableException("timeout reached", th6);
                    }
                    throw th6;
                }
                this.Y = th6;
                this.X = 1;
                wqi.q(ytfVar2.b, "Url is expired, reset it in repository", new Object[0]);
                stg stgVarB = ttgVar.b();
                stgVarB.d = null;
                stgVarB.e = 0.0f;
                Object objF = ytfVar2.f(new ttg(stgVarB), this);
                if (objF != g84Var11) {
                    objF = qqg.a;
                }
                if (objF == g84Var11) {
                    return g84Var11;
                }
                throw th6;
            case 11:
                duf dufVar = (duf) this.Z;
                g84 g84Var12 = g84.a;
                int i17 = this.X;
                if (i17 == 0) {
                    g8j.b(obj);
                    Throwable th7 = (Throwable) this.Y;
                    if (!(th7 instanceof TamErrorException) || !"invalid.token".equals(((TamErrorException) th7).a.b)) {
                        throw th7;
                    }
                    um9 um9Var = (um9) this.s0;
                    String str = um9Var.f;
                    if (str.length() == 0) {
                        str = um9Var.a.c;
                    }
                    bug bugVar2 = new bug(um9Var.b, um9Var.c, um9Var.d, str);
                    ytf ytfVar3 = (ytf) dufVar.d.getValue();
                    this.Y = th7;
                    this.X = 1;
                    if (ytfVar3.d(bugVar2, this) == g84Var12) {
                        return g84Var12;
                    }
                    th = th7;
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.Y;
                    g8j.b(obj);
                }
                throw th;
            default:
                g84 g84Var13 = g84.a;
                int i18 = this.X;
                if (i18 == 0) {
                    g8j.b(obj);
                    z26 z26Var9 = (z26) this.Y;
                    Object[] objArr5 = (Object[]) this.Z;
                    Object obj8 = objArr5[0];
                    String str2 = obj8 instanceof String ? (String) obj8 : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    Object obj9 = objArr5[1];
                    Boolean bool = obj9 instanceof Boolean ? (Boolean) obj9 : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    Object obj10 = objArr5[2];
                    vvh vvhVar = obj10 instanceof vvh ? (vvh) obj10 : null;
                    if (vvhVar == null) {
                        vvhVar = xvh.a;
                    }
                    vvh vvhVar2 = vvhVar;
                    Object obj11 = objArr5[3];
                    swg swgVar = obj11 instanceof swg ? (swg) obj11 : null;
                    String str4 = swgVar != null ? swgVar.a : null;
                    Object obj12 = objArr5[4];
                    Boolean bool2 = obj12 instanceof Boolean ? (Boolean) obj12 : null;
                    boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                    Object obj13 = objArr5[5];
                    Boolean bool3 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
                    boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                    String str5 = ((uvh) this.s0).F0;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str5, "received new state: " + str3 + ", " + zBooleanValue + ", " + vvhVar2 + ", " + str4 + ", " + zBooleanValue2 + ", " + zBooleanValue3, null);
                        }
                    }
                    zvh zvhVar = new zvh(str3, zBooleanValue, vvhVar2, str4, zBooleanValue2, zBooleanValue3);
                    this.X = 1;
                    if (z26Var9.a(zvhVar, this) == g84Var13) {
                        return g84Var13;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo1(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.s0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo1(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.o = i;
        this.s0 = obj;
    }
}
