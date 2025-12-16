package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ja4 extends dtf implements um6 {
    public int X;
    public /* synthetic */ z26 Y;
    public /* synthetic */ Object[] Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z26 z26Var = (z26) obj;
        Object[] objArr = (Object[]) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                ja4 ja4Var = new ja4(3, continuation, 0);
                ja4Var.Y = z26Var;
                ja4Var.Z = objArr;
                return ja4Var.n(qqg.a);
            case 1:
                ja4 ja4Var2 = new ja4(3, continuation, 1);
                ja4Var2.Y = z26Var;
                ja4Var2.Z = objArr;
                return ja4Var2.n(qqg.a);
            case 2:
                ja4 ja4Var3 = new ja4(3, continuation, 2);
                ja4Var3.Y = z26Var;
                ja4Var3.Z = objArr;
                return ja4Var3.n(qqg.a);
            case 3:
                ja4 ja4Var4 = new ja4(3, continuation, 3);
                ja4Var4.Y = z26Var;
                ja4Var4.Z = objArr;
                return ja4Var4.n(qqg.a);
            default:
                ja4 ja4Var5 = new ja4(3, continuation, 4);
                ja4Var5.Y = z26Var;
                ja4Var5.Z = objArr;
                return ja4Var5.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                int i = this.X;
                if (i == 0) {
                    g8j.b(obj);
                    z26 z26Var = this.Y;
                    List listO = lee.o(lee.h(ys.f((f86[]) this.Z), zx0.E0));
                    this.X = 1;
                    Object objA = z26Var.a(listO, this);
                    g84 g84Var = g84.a;
                    if (objA == g84Var) {
                        return g84Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            case 1:
                int i2 = this.X;
                if (i2 == 0) {
                    g8j.b(obj);
                    z26 z26Var2 = this.Y;
                    List[] listArr = (List[]) this.Z;
                    ArrayList arrayList = new ArrayList();
                    for (List list : listArr) {
                        af3.v(arrayList, list);
                    }
                    this.X = 1;
                    Object objA2 = z26Var2.a(arrayList, this);
                    g84 g84Var2 = g84.a;
                    if (objA2 == g84Var2) {
                        return g84Var2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            case 2:
                int i3 = this.X;
                qqg qqgVar = qqg.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                    return qqgVar;
                }
                g8j.b(obj);
                z26 z26Var3 = this.Y;
                this.X = 1;
                Object objA3 = z26Var3.a(qqgVar, this);
                g84 g84Var3 = g84.a;
                return objA3 == g84Var3 ? g84Var3 : qqgVar;
            case 3:
                int i4 = this.X;
                if (i4 == 0) {
                    g8j.b(obj);
                    z26 z26Var4 = this.Y;
                    z4b[] z4bVarArr = (z4b[]) this.Z;
                    c9a c9aVar = new c9a(z4bVarArr.length);
                    for (z4b z4bVar : z4bVarArr) {
                        c9aVar.m(z4bVar.a, z4bVar.b);
                    }
                    wb6 wb6Var = new wb6(c9aVar);
                    this.X = 1;
                    Object objA4 = z26Var4.a(wb6Var, this);
                    g84 g84Var4 = g84.a;
                    if (objA4 == g84Var4) {
                        return g84Var4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            default:
                int i5 = this.X;
                if (i5 == 0) {
                    g8j.b(obj);
                    z26 z26Var5 = this.Y;
                    kyb[] kybVarArr = (kyb[]) this.Z;
                    int i6 = to8.i(kybVarArr.length);
                    if (i6 < 16) {
                        i6 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                    for (kyb kybVar : kybVarArr) {
                        linkedHashMap.put(new Long(kybVar.a), kybVar);
                    }
                    this.X = 1;
                    Object objA5 = z26Var5.a(linkedHashMap, this);
                    g84 g84Var5 = g84.a;
                    if (objA5 == g84Var5) {
                        return g84Var5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
        }
    }
}
