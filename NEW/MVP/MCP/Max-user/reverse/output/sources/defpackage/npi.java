package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class npi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ipd] */
    public static void a(View view, yeb yebVar) {
        zde ipdVar;
        int itemDecorationCount;
        zde zdeVar = qd5.a;
        if (view instanceof u6g) {
            ((u6g) view).onThemeChanged(yebVar);
            return;
        }
        if (!(view instanceof RecyclerView)) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                if (text != null) {
                    a8i.b(text, yebVar);
                }
                t2i.c(textView, yebVar);
                return;
            }
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        int itemDecorationCount2 = recyclerView.getItemDecorationCount();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            Collection linkedHashSet = null;
            int i3 = 1;
            if (i2 >= itemDecorationCount2) {
                if (z) {
                    recyclerView.Y();
                }
                try {
                    Field declaredField = RecyclerView.class.getDeclaredField("c");
                    declaredField.setAccessible(true);
                    did didVar = (did) declaredField.get(recyclerView);
                    Field declaredField2 = did.class.getDeclaredField("a");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(didVar);
                    List list = obj instanceof List ? (List) obj : null;
                    List list2 = hd5.a;
                    if (list == null) {
                        list = list2;
                    }
                    Field declaredField3 = did.class.getDeclaredField("c");
                    declaredField3.setAccessible(true);
                    Object obj2 = declaredField3.get(didVar);
                    List list3 = obj2 instanceof List ? (List) obj2 : null;
                    if (list3 != null) {
                        list2 = list3;
                    }
                    phd adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        to7 to7VarH = n7j.h(0, adapter.j());
                        linkedHashSet = new LinkedHashSet();
                        Iterator it = to7VarH.iterator();
                        while (((so7) it).c) {
                            linkedHashSet.add(Integer.valueOf(adapter.l(((so7) it).nextInt())));
                        }
                    }
                    if (linkedHashSet == null) {
                        linkedHashSet = rd5.a;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        mid recycledView = recyclerView.getRecycledViewPool().getRecycledView(iIntValue);
                        af3.u(arrayList, recycledView == null ? zdeVar : new az4(new b0e(2, recycledView), new p8(recyclerView, iIntValue, i)));
                    }
                    ipdVar = new nhg(lee.j(ys.f(new zde[]{lee.j(ys.f(new List[]{list, list2}), zx0.C0), new at(2, arrayList)}), zx0.B0), new n8(i3));
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                if (!(ipdVar instanceof ipd)) {
                    zdeVar = ipdVar;
                }
                lee.e(lee.l(zfi.g(zdeVar, new n8(i), new o8(0, yebVar)), new o8(1, yebVar)));
                return;
            }
            itemDecorationCount = recyclerView.getItemDecorationCount();
            if (i2 < 0 || i2 >= itemDecorationCount) {
                break;
            }
            Object obj3 = (vhd) recyclerView.C0.get(i2);
            u6g u6gVar = obj3 instanceof u6g ? (u6g) obj3 : null;
            if (u6gVar != null) {
                u6gVar.onThemeChanged(yebVar);
                z = true;
            }
            i2++;
            z = z;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public static final String b(v3h v3hVar) {
        String str = v3hVar.a;
        if (str != null) {
            return str;
        }
        return v3hVar.e + "x" + v3hVar.f;
    }

    public static void c(hof hofVar, int i, fu3 fu3Var) {
        long jG = hofVar.g(i);
        List listM = hofVar.m(jG);
        if (listM.isEmpty()) {
            return;
        }
        if (i == hofVar.s() - 1) {
            throw new IllegalStateException();
        }
        long jG2 = hofVar.g(i + 1) - hofVar.g(i);
        if (jG2 > 0) {
            fu3Var.accept(new kb4(jG, jG2, listM));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.hof r12, defpackage.sof r13, defpackage.fu3 r14) {
        /*
            long r0 = r13.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.e(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.s()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.g(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.s()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.m(r0)
            long r2 = r12.g(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            kb4 r6 = new kb4
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.s()
            if (r3 >= r6) goto L5f
            c(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.a
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            c(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            kb4 r6 = new kb4
            java.util.List r11 = r12.m(r0)
            long r7 = r12.g(r4)
            long r12 = r12.g(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npi.d(hof, sof, fu3):void");
    }
}
