package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class zc4 implements lz5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final vhb i;
    public final wz8 j;
    public final Uri k;
    public final qnc l;
    public final List m;

    public zc4(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, qnc qncVar, vhb vhbVar, wz8 wz8Var, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = qncVar;
        this.i = vhbVar;
        this.k = uri;
        this.j = wz8Var;
        this.m = arrayList;
    }

    @Override // defpackage.lz5
    public final Object a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new hlf());
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((hlf) linkedList.peek()).a != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j2 += jC;
                }
            } else {
                krb krbVarB = b(i);
                List list2 = krbVarB.c;
                hlf hlfVar = (hlf) linkedList.poll();
                int i2 = hlfVar.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = hlfVar.b;
                    w8 w8Var = (w8) list2.get(i3);
                    List list3 = w8Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((xmd) list3.get(hlfVar.c));
                        hlfVar = (hlf) linkedList.poll();
                        if (hlfVar.a != i2) {
                            break;
                        }
                    } while (hlfVar.b == i3);
                    j = j2;
                    arrayList2.add(new w8(w8Var.a, w8Var.b, arrayList3, w8Var.d, w8Var.e, w8Var.f));
                    if (hlfVar.a != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(hlfVar);
                arrayList.add(new krb(krbVarB.a, krbVarB.b - j, arrayList2, krbVarB.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new zc4(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final krb b(int i) {
        return (krb) this.m.get(i);
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
            j2 = ((krb) list.get(i)).b;
        } else {
            j = ((krb) list.get(i + 1)).b;
            j2 = ((krb) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return xxg.B(c(i));
    }
}
