package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class ad4 implements mz5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final wib i;
    public final wz8 j;
    public final Uri k;
    public final rnc l;
    public final List m;

    public ad4(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, rnc rncVar, wib wibVar, wz8 wz8Var, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = rncVar;
        this.i = wibVar;
        this.k = uri;
        this.j = wz8Var;
        this.m = arrayList;
    }

    @Override // defpackage.mz5
    public final Object a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new ilf(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((ilf) linkedList.peek()).a != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j2 += jC;
                }
            } else {
                lrb lrbVarB = b(i);
                List list2 = lrbVarB.c;
                ilf ilfVar = (ilf) linkedList.poll();
                int i2 = ilfVar.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = ilfVar.b;
                    x8 x8Var = (x8) list2.get(i3);
                    List list3 = x8Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((ymd) list3.get(ilfVar.c));
                        ilfVar = (ilf) linkedList.poll();
                        if (ilfVar.a != i2) {
                            break;
                        }
                    } while (ilfVar.b == i3);
                    j = j2;
                    arrayList2.add(new x8(x8Var.a, x8Var.b, arrayList3, x8Var.d, x8Var.e, x8Var.f));
                    if (ilfVar.a != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(ilfVar);
                arrayList.add(new lrb(lrbVarB.a, lrbVarB.b - j, arrayList2, lrbVarB.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new ad4(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final lrb b(int i) {
        return (lrb) this.m.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((lrb) list.get(i)).b;
        } else {
            j = ((lrb) list.get(i + 1)).b;
            j2 = ((lrb) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return zxg.U(c(i));
    }
}
