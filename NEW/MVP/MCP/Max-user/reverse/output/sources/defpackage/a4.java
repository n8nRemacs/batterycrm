package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a4 implements f9a {
    public final /* synthetic */ int a = 0;
    public final tcf b = ucf.a(0);
    public final Object c;

    public a4(tv tvVar) {
        this.c = tvVar;
    }

    public static final void f(a4 a4Var, ArrayList arrayList) {
        a4Var.getClass();
        for (int i = ve3.i(arrayList); -1 < i; i--) {
            if (i > 0 && (arrayList.get(i) instanceof i37) && (arrayList.get(i - 1) instanceof i37)) {
                arrayList.remove(i);
            }
        }
    }

    public static final void j(a4 a4Var, ArrayList arrayList, g37 g37Var) {
        boolean z;
        Object next;
        a4Var.getClass();
        long jG = g37Var.g();
        boolean z2 = true;
        if (jG == g37Var.i() || arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j37 j37Var = (j37) it.next();
                if (!(j37Var instanceof i37) && j37Var.getA() == jG) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        j37 j37Var2 = (j37) ue3.I(arrayList);
        if (j37Var2 == null) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (!(((j37) next) instanceof i37)) {
                    break;
                }
            }
        }
        j37 j37Var3 = (j37) next;
        if (j37Var3 == null) {
            z2 = false;
            break;
        }
        List listJ = g37Var.j();
        if (listJ == null || !listJ.isEmpty()) {
            Iterator it3 = listJ.iterator();
            while (it3.hasNext()) {
                if (((d93) it3.next()).b(j37Var3.getC())) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z && (j37Var2 instanceof i37) && !z2) {
            arrayList.remove(0);
        } else {
            if (z || (j37Var2 instanceof i37)) {
                return;
            }
            arrayList.add(0, new i37());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.a4 r8, java.util.ArrayList r9, defpackage.g37 r10) {
        /*
            r8.getClass()
            long r0 = r10.h()
            long r2 = r10.i()
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 0
            r3 = 0
            r4 = 1
            if (r8 == 0) goto L39
            int r8 = r9.size()
            java.util.ListIterator r8 = r9.listIterator(r8)
        L1a:
            boolean r5 = r8.hasPrevious()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r8.previous()
            r6 = r5
            j37 r6 = (defpackage.j37) r6
            boolean r7 = r6 instanceof defpackage.i37
            if (r7 != 0) goto L1a
            long r6 = r6.getA()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L1a
            goto L35
        L34:
            r5 = r2
        L35:
            if (r5 == 0) goto L39
            r8 = r4
            goto L3a
        L39:
            r8 = r3
        L3a:
            java.lang.Object r0 = defpackage.ue3.Q(r9)
            j37 r0 = (defpackage.j37) r0
            if (r0 != 0) goto L43
            goto La8
        L43:
            int r1 = r9.size()
            java.util.ListIterator r1 = r9.listIterator(r1)
        L4b:
            boolean r5 = r1.hasPrevious()
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r1.previous()
            r6 = r5
            j37 r6 = (defpackage.j37) r6
            boolean r6 = r6 instanceof defpackage.i37
            if (r6 != 0) goto L4b
            r2 = r5
        L5d:
            j37 r2 = (defpackage.j37) r2
            if (r2 == 0) goto L8a
            java.util.List r10 = r10.j()
            if (r10 == 0) goto L6e
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L6e
            goto L89
        L6e:
            java.util.Iterator r10 = r10.iterator()
        L72:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r10.next()
            d93 r1 = (defpackage.d93) r1
            long r5 = r2.getC()
            boolean r1 = r1.b(r5)
            if (r1 == 0) goto L72
            goto L8a
        L89:
            r3 = r4
        L8a:
            if (r8 == 0) goto L96
            boolean r10 = r0 instanceof defpackage.i37
            if (r10 == 0) goto L96
            if (r3 != 0) goto L96
            r9.remove(r0)
            return
        L96:
            if (r8 != 0) goto La8
            boolean r8 = r0 instanceof defpackage.i37
            if (r8 != 0) goto La8
            int r8 = r9.size()
            i37 r10 = new i37
            r10.<init>()
            r9.add(r8, r10)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4.k(a4, java.util.ArrayList, g37):void");
    }

    @Override // defpackage.e9a, defpackage.z26
    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                setValue(obj);
                break;
            default:
                this.b.setValue((List) obj);
                break;
        }
        return qqg.a;
    }

    @Override // defpackage.fve
    public final List b() {
        switch (this.a) {
            case 0:
                return Collections.singletonList(m());
            default:
                return this.b.b();
        }
    }

    @Override // defpackage.f9a
    public final boolean c(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!fni.a(m(), obj)) {
                    return false;
                }
                setValue(obj2);
                return true;
            default:
                tcf tcfVar = this.b;
                tcfVar.getClass();
                return tcfVar.m((List) obj, (List) obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // defpackage.x26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.z26 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            tcf r0 = r5.b
            r0.d(r6, r7)
            g84 r6 = defpackage.g84.a
            return r6
        Ld:
            boolean r0 = r7 instanceof defpackage.y3
            if (r0 == 0) goto L20
            r0 = r7
            y3 r0 = (defpackage.y3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L20
            int r1 = r1 - r2
            r0.Y = r1
            goto L25
        L20:
            y3 r0 = new y3
            r0.<init>(r5, r7)
        L25:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            a4 r6 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L34
            goto L87
        L34:
            r7 = move-exception
            goto Laf
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            defpackage.g8j.b(r7)
        L42:
            tcf r7 = r5.b
            java.lang.Object r1 = r7.getValue()
            r3 = r1
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r3 = r3 + r2
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            boolean r7 = r7.c(r1, r4)
            if (r7 == 0) goto L42
            java.lang.Object r7 = r5.c     // Catch: java.lang.Throwable -> Lac
            b4 r7 = (defpackage.b4) r7     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r7 = r7.b     // Catch: java.lang.Throwable -> Lac
            e9a r7 = (defpackage.e9a) r7     // Catch: java.lang.Throwable -> Lac
            z3 r1 = new z3     // Catch: java.lang.Throwable -> La9
            r3 = 0
            r4 = 2
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> La9
            m36 r3 = new m36     // Catch: java.lang.Throwable -> Lac
            r3.<init>(r1, r7)     // Catch: java.lang.Throwable -> Lac
            x3 r7 = new x3     // Catch: java.lang.Throwable -> La9
            r1 = 0
            r7.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> La9
            x26 r7 = defpackage.gw0.m(r7)     // Catch: java.lang.Throwable -> La9
            r0.d = r5     // Catch: java.lang.Throwable -> La9
            r0.Y = r2     // Catch: java.lang.Throwable -> La9
            java.lang.Object r6 = r7.d(r6, r0)     // Catch: java.lang.Throwable -> La9
            g84 r7 = defpackage.g84.a
            if (r6 != r7) goto L86
            return r7
        L86:
            r6 = r5
        L87:
            tcf r6 = r6.b
        L89:
            java.lang.Object r7 = r6.getValue()
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 - r2
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            boolean r7 = r6.c(r7, r1)
            if (r7 != 0) goto La1
            goto L89
        La1:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "StateFlow collection never ends"
            r6.<init>(r7)
            throw r6
        La9:
            r7 = move-exception
        Laa:
            r6 = r5
            goto Laf
        Lac:
            r6 = move-exception
            r7 = r6
            goto Laa
        Laf:
            tcf r6 = r6.b
        Lb1:
            java.lang.Object r0 = r6.getValue()
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 - r2
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            boolean r0 = r6.c(r0, r3)
            if (r0 != 0) goto Lc9
            goto Lb1
        Lc9:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4.d(z26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.e9a
    public final void g() {
        switch (this.a) {
            case 0:
                String str = (String) ((b4) this.c).d;
                l6b l6bVar = wqi.a;
                if (l6bVar == null) {
                    return;
                }
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "resetReplayCache has no effect on prefs wrapper!", null);
                    return;
                }
                return;
            default:
                this.b.g();
                throw null;
        }
    }

    @Override // defpackage.f9a, defpackage.mcf
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return m();
            default:
                return l();
        }
    }

    @Override // defpackage.e9a
    public final boolean h(Object obj) {
        switch (this.a) {
            case 0:
                setValue(obj);
                break;
            default:
                this.b.setValue((List) obj);
                break;
        }
        return true;
    }

    @Override // defpackage.e9a
    public final mcf i() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b.i();
        }
    }

    public List l() {
        return (List) this.b.getValue();
    }

    public Object m() {
        b4 b4Var = (b4) this.c;
        return kaj.b((SharedPreferences) b4Var.a, "app.logging.sensitive", Boolean.FALSE, (ca3) b4Var.c);
    }

    @Override // defpackage.f9a
    public final void setValue(Object obj) {
        switch (this.a) {
            case 0:
                SharedPreferences.Editor editorEdit = ((SharedPreferences) ((b4) this.c).a).edit();
                kaj.c(editorEdit, "app.logging.sensitive", obj);
                editorEdit.apply();
                break;
            default:
                this.b.m(null, (List) obj);
                break;
        }
    }

    public a4(b4 b4Var) {
        this.c = b4Var;
    }
}
