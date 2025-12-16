package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class ca6 extends xfh {
    public static final /* synthetic */ yy7[] H0 = {new z8a(ca6.class, "addChatsClickJob", "getAddChatsClickJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, ca6.class, "addChatsResultJob", "getAddChatsResultJob()Lkotlinx/coroutines/Job;")};
    public final hbd A0;
    public final ci5 B0;
    public final AtomicReference C0;
    public final AtomicReference D0;
    public volatile f86 E0;
    public final t9f F0;
    public final t9f G0;
    public final ch2 X;
    public final t86 Y;
    public final cb6 Z;
    public final String b;
    public final long c;
    public final lzf d;
    public final va4 o;
    public final w86 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final tcf x0;
    public final hbd y0;
    public final tcf z0;

    public ca6(String str, long j) {
        vb6 vb6Var = vb6.a;
        lzf lzfVar = (lzf) vb6Var.getAccessor().c(8);
        va4 va4Var = (va4) vb6Var.getAccessor().c(149);
        ch2 ch2Var = (ch2) vb6Var.getAccessor().c(223);
        t86 t86VarA = vb6Var.a();
        cb6 cb6VarC = vb6Var.c();
        w86 w86VarB = vb6Var.b();
        bwf bwfVarD = vb6Var.getAccessor().d(454);
        bwf bwfVarD2 = vb6Var.getAccessor().d(HttpStatus.SC_PRECONDITION_FAILED);
        bwf bwfVarD3 = vb6Var.getAccessor().d(109);
        bwf bwfVarD4 = vb6Var.getAccessor().d(HttpStatus.SC_METHOD_FAILURE);
        this.b = str;
        this.c = j;
        this.d = lzfVar;
        this.o = va4Var;
        this.X = ch2Var;
        this.Y = t86VarA;
        this.Z = cb6VarC;
        this.s0 = w86VarB;
        this.t0 = bwfVarD;
        this.u0 = bwfVarD2;
        this.v0 = bwfVarD3;
        this.w0 = bwfVarD4;
        tcf tcfVarA = ucf.a(new l96());
        this.x0 = tcfVarA;
        this.y0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.z0 = tcfVarA2;
        this.A0 = new hbd(tcfVarA2);
        this.B0 = new ci5(0);
        this.C0 = new AtomicReference(new LinkedHashSet());
        this.D0 = new AtomicReference(dk8.a());
        this.F0 = c7j.c();
        this.G0 = c7j.c();
        if (str != null) {
            tcfVarA.m(null, new m96(str, (CharSequence) null, 5));
            xfh.o(this, ((q2b) lzfVar).b(), new o96(this, bwfVarD4, bwfVarD2, null), 2);
            return;
        }
        tcfVarA.m(null, new l96());
        if (j != 0) {
            xfh.o(this, ((q2b) lzfVar).b(), new p96(this, bwfVarD2, null), 2);
        } else {
            tcfVarA2.m(null, ve3.j(new g96(null, true), new ga6(2)));
        }
    }

    /* JADX WARN: Path cross not found for [B:23:0x00b1, B:27:0x00ca], limit reached: 64 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009d -> B:21:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.ca6 r13, java.util.Set r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca6.t(ca6, java.util.Set, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d2  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.coroutines.Continuation, z74] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v19, types: [rd5] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008b -> B:27:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a4 -> B:32:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.ca6 r25, defpackage.q44 r26) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca6.u(ca6, q44):java.lang.Object");
    }

    public static Uri w(pb2 pb2Var) {
        String strI = pb2Var.i(il0.b, hl0.a);
        if (strI != null) {
            if (vmf.F(strI)) {
                strI = null;
            }
            if (strI != null) {
                return tfi.g(strI);
            }
        }
        return null;
    }

    public final void v(long j) {
        Object value;
        ArrayList arrayList;
        Object value2;
        m96 m96Var;
        Set set;
        Set set2 = (Set) this.C0.get();
        if (set2 == null || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (((pb2) it.next()).b.a == j) {
                    set2.removeIf(new a6(3, new c46(j, 1)));
                    break;
                }
            }
            ((n8a) this.D0.get()).a(j);
        } else {
            ((n8a) this.D0.get()).a(j);
        }
        tcf tcfVar = this.z0;
        do {
            value = tcfVar.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (List) value) {
                t98 t98Var = (t98) obj;
                if (!(t98Var instanceof ha6) || ((ha6) t98Var).a != j) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2);
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                t98 t98Var2 = (t98) listIterator.previous();
                if (!(t98Var2 instanceof z86)) {
                    int iLastIndexOf = arrayList.lastIndexOf(t98Var2);
                    int k0 = t98Var2.getK0();
                    if ((1073741824 & k0) != 0 && (t98Var2 instanceof ha6)) {
                        ha6 ha6Var = (ha6) t98Var2;
                        arrayList.set(iLastIndexOf, new ha6(ha6Var.a, ha6Var.b, ha6Var.c, ha6Var.d, ha6Var.o, ha6Var.X, -2147483644));
                    } else if ((k0 & 536870912) != 0 && (t98Var2 instanceof ga6)) {
                        arrayList.set(iLastIndexOf, new ga6(2));
                    }
                }
            }
            throw new NoSuchElementException("List contains no element matching the predicate.");
        } while (!tcfVar.c(value, arrayList));
        f86 f86Var = this.E0;
        boolean z = (f86Var == null || (set = f86Var.o) == null || !set.contains(Long.valueOf(j))) ? false : true;
        if (this.x0.getValue() instanceof m96) {
            tcf tcfVar2 = this.x0;
            do {
                value2 = tcfVar2.getValue();
                m96Var = (m96) ((n96) value2);
            } while (!tcfVar2.c(value2, m96.b(m96Var, null, z || m96Var.c, 3)));
        }
    }

    public final void x() {
        xfh.o(this, ((q2b) this.d).b(), new x96((n96) this.y0.a.getValue(), this, null), 2);
    }
}
