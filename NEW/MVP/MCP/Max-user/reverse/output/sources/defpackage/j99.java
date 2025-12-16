package defpackage;

import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class j99 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ j99(WorkDatabase workDatabase, r5i r5iVar, r5i r5iVar2, List list, String str, Set set, boolean z) {
        this.a = 2;
        this.d = workDatabase;
        this.o = r5iVar;
        this.X = r5iVar2;
        this.Y = str;
        this.b = set;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qr4 qr4Var = (qr4) this.d;
                ((m99) this.o).g(qr4Var.a, (c99) qr4Var.c, (tb8) this.X, (g19) this.Y, (IOException) this.b, this.c);
                return;
            case 1:
                v99 v99Var = (v99) this.d;
                Pair pair = (Pair) this.o;
                ((nj4) v99Var.b.k).a(((Integer) pair.first).intValue(), (d99) pair.second, (ub8) this.X, (g19) this.Y, (IOException) this.b, this.c);
                return;
            default:
                WorkDatabase workDatabase = (WorkDatabase) this.d;
                r5i r5iVar = (r5i) this.o;
                r5i r5iVar2 = (r5i) this.X;
                String str = (String) this.Y;
                Set set = (Set) this.b;
                s5i s5iVarX = workDatabase.x();
                u5i u5iVarY = workDatabase.y();
                r5i r5iVarB = r5i.b(r5iVar, null, r5iVar2.b, null, null, r5iVar2.k, r5iVar2.n, r5iVar2.t + 1, 515069);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s5iVarX.a;
                workDatabase_Impl.b();
                workDatabase_Impl.c();
                try {
                    ((am4) s5iVarX.c).A(r5iVarB);
                    workDatabase_Impl.q();
                    workDatabase_Impl.k();
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) u5iVarY.a;
                    workDatabase_Impl2.b();
                    olh olhVar = (olh) u5iVarY.c;
                    vk6 vk6VarA = olhVar.a();
                    vk6VarA.f(1, str);
                    workDatabase_Impl2.c();
                    try {
                        vk6VarA.w();
                        workDatabase_Impl2.q();
                        workDatabase_Impl2.k();
                        olhVar.r(vk6VarA);
                        u5iVarY.k(str, set);
                        if (this.c) {
                            return;
                        }
                        s5iVarX.r(-1L, str);
                        workDatabase.w().b(str);
                        return;
                    } catch (Throwable th) {
                        workDatabase_Impl2.k();
                        olhVar.r(vk6VarA);
                        throw th;
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl.k();
                    throw th2;
                }
        }
    }

    public /* synthetic */ j99(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.o = obj2;
        this.X = obj3;
        this.Y = obj4;
        this.b = iOException;
        this.c = z;
    }
}
