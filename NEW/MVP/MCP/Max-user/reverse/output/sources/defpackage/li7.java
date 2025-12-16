package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class li7 extends dtf implements sm6 {
    public ArrayList X;
    public ArrayList Y;
    public int Z;
    public ArrayList o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ uo6 t0;
    public final /* synthetic */ x1g u0;
    public final /* synthetic */ bj7 v0;
    public final /* synthetic */ int w0;
    public final /* synthetic */ int x0;
    public final /* synthetic */ boolean y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li7(uo6 uo6Var, x1g x1gVar, bj7 bj7Var, int i, int i2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.t0 = uo6Var;
        this.u0 = x1gVar;
        this.v0 = bj7Var;
        this.w0 = i;
        this.x0 = i2;
        this.y0 = z;
    }

    public static final void p(f84 f84Var, bj7 bj7Var, x1g x1gVar, boolean z) {
        x9f x9fVar;
        eoi.d(f84Var.getCoroutineContext());
        if (z && (x9fVar = bj7Var.B0) != null && x9fVar.isActive()) {
            throw new q81("content change", 4);
        }
    }

    public static final boolean q(f84 f84Var, bj7 bj7Var, x1g x1gVar, boolean z) {
        p(f84Var, bj7Var, x1gVar, z);
        if (!z) {
            return d7j.f(f84Var);
        }
        if (!d7j.f(f84Var)) {
            return false;
        }
        x9f x9fVar = bj7Var.B0;
        return x9fVar == null || !x9fVar.isActive();
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((li7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        li7 li7Var = new li7(this.t0, this.u0, this.v0, this.w0, this.x0, this.y0, continuation);
        li7Var.s0 = obj;
        return li7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        f84 f84Var;
        final bj7 bj7Var = this.v0;
        lzf lzfVar = bj7Var.c;
        int i = this.Z;
        boolean z = this.y0;
        int i2 = 1;
        final x1g x1gVar = this.u0;
        if (i == 0) {
            g8j.b(obj);
            final f84 f84Var2 = (f84) this.s0;
            final ArrayList arrayList4 = new ArrayList();
            final ArrayList arrayList5 = new ArrayList();
            final ArrayList arrayList6 = new ArrayList();
            uo6 uo6Var = this.t0;
            Iterator it = uo6Var.d().iterator();
            while (it.hasNext()) {
                final oo6 oo6Var = (oo6) it.next();
                ContentResolver contentResolver = bj7Var.d;
                final boolean z2 = this.y0;
                int i3 = i2;
                em6 em6Var = new em6() { // from class: hi7
                    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
                    @Override // defpackage.em6
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r30) {
                        /*
                            Method dump skipped, instructions count: 480
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi7.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                Uri uriJ = oo6Var.j();
                String[] strArr = oo6Var.c;
                lzf lzfVar2 = lzfVar;
                String strE = uo6Var.e(oo6Var);
                ArrayList arrayList7 = arrayList6;
                String[] strArrA = uo6Var.a(oo6Var);
                uo6 uo6Var2 = uo6Var;
                String strI = az1.i(oo6Var.d(), " DESC");
                Bundle bundle = new Bundle();
                int i4 = this.w0;
                Iterator it2 = it;
                if (i4 != -1) {
                    bundle.putInt("android:query-arg-limit", i4);
                }
                int i5 = this.x0;
                if (i5 != -1) {
                    bundle.putInt("android:query-arg-offset", i5);
                }
                if (strI != null) {
                    bundle.putStringArray("android:query-arg-sort-columns", new String[]{strI});
                }
                if (strE != null) {
                    bundle.putString("android:query-arg-sql-selection", strE);
                }
                if (strArrA != null) {
                    bundle.putStringArray("android:query-arg-sql-selection-args", strArrA);
                }
                Cursor cursorQuery = contentResolver.query(uriJ, strArr, bundle, null);
                if (cursorQuery != null) {
                    try {
                        em6Var.invoke(cursorQuery);
                        cursorQuery.close();
                    } finally {
                    }
                }
                lzfVar = lzfVar2;
                i2 = i3;
                arrayList6 = arrayList7;
                uo6Var = uo6Var2;
                it = it2;
            }
            lzf lzfVar3 = lzfVar;
            ArrayList arrayList8 = arrayList6;
            int i6 = i2;
            if ((arrayList5.isEmpty() && arrayList4.isEmpty()) || !q(f84Var2, bj7Var, x1gVar, z)) {
                hd5 hd5Var = hd5.a;
                return new di7(hd5Var, hd5Var, hd5Var);
            }
            arrayList5.size();
            arrayList4.size();
            ArrayList arrayList9 = !arrayList8.isEmpty() ? arrayList8 : null;
            if (arrayList9 == null) {
                arrayList = new ArrayList(arrayList4.size() + arrayList5.size());
                arrayList.addAll(arrayList5);
                arrayList.addAll(arrayList4);
            } else {
                arrayList = arrayList9;
            }
            x9f x9fVarE = svi.e(f84Var2, ((q2b) lzfVar3).b(), null, new ii7(arrayList, null), 2);
            x9f x9fVarE2 = svi.e(f84Var2, ((q2b) lzfVar3).b(), null, new ji7(arrayList5, null), 2);
            x9f x9fVarE3 = svi.e(f84Var2, ((q2b) lzfVar3).b(), null, new ki7(arrayList4, null), 2);
            qt7[] qt7VarArr = new qt7[3];
            qt7VarArr[0] = x9fVarE;
            qt7VarArr[i6] = x9fVarE2;
            qt7VarArr[2] = x9fVarE3;
            this.s0 = f84Var2;
            this.o = arrayList4;
            this.X = arrayList5;
            this.Y = arrayList;
            this.Z = i6;
            Object objD = hui.d(qt7VarArr, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
            f84Var = f84Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.Y;
            arrayList3 = this.X;
            arrayList2 = this.o;
            f84Var = (f84) this.s0;
            g8j.b(obj);
        }
        p(f84Var, bj7Var, x1gVar, z);
        return new di7(arrayList, arrayList2, arrayList3);
    }
}
